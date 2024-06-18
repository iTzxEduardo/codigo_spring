package app.senaistock.stock_senai.Controller;

import app.senaistock.stock_senai.Model.Estoque;
import app.senaistock.stock_senai.Repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estoques") // Define o prefixo para todos os endpoints deste controlador
public class EstoqueController {

    @Autowired
    private EstoqueRepository estoqueRepository; // Injeção do repositório de Estoque usando Spring DI

    // Endpoint para listar todos os itens de estoque
    @GetMapping
    public List<Estoque> getAllEstoques() {
        return (List<Estoque>) estoqueRepository.findAll(); // Utiliza o método findAll() do JpaRepository
    }

    // Endpoint para buscar um item de estoque pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Estoque> getEstoqueById(@PathVariable Long id) {
        Optional<Estoque> estoque = estoqueRepository.findById(id); // Busca um item de estoque pelo ID
        return estoque.map(ResponseEntity::ok) // Retorna 200 OK com o objeto Estoque se encontrado
                .orElseGet(() -> ResponseEntity.notFound().build()); // Retorna 404 Not Found se não encontrado
    }

    // Endpoint para criar um novo item de estoque
    @PostMapping
    public Estoque createEstoque(@RequestBody Estoque estoque) {
        return estoqueRepository.save(estoque); // Salva um novo item de estoque usando o método save() do JpaRepository
    }

    // Endpoint para atualizar um item de estoque existente pelo ID
    @PutMapping("/{id}")
    public ResponseEntity<Estoque> updateEstoque(@PathVariable Long id, @RequestBody Estoque estoqueDetails) {
        Optional<Estoque> optionalEstoque = estoqueRepository.findById(id); // Busca o item de estoque pelo ID
        if (optionalEstoque.isPresent()) { // Verifica se o item de estoque existe
            Estoque estoque = optionalEstoque.get(); // Obtém o objeto Estoque do Optional
            // Atualiza os dados do item de estoque com os dados fornecidos
            estoque.setNome_material(estoqueDetails.getNome_material());
            estoque.setQuantidade(estoqueDetails.getQuantidade());
            estoque.setObservacao(estoqueDetails.getObservacao());
            estoque.setData_registro_material(estoqueDetails.getData_registro_material());
            estoque.setId_categoria(estoqueDetails.getId_categoria());
            estoque.setId_area(estoqueDetails.getId_area());

            Estoque updatedEstoque = estoqueRepository.save(estoque); // Salva as alterações no banco de dados
            return ResponseEntity.ok(updatedEstoque); // Retorna 200 OK com o objeto Estoque atualizado
        } else {
            return ResponseEntity.notFound().build(); // Retorna 404 Not Found se o item de estoque não existir
        }
    }

    // Endpoint para deletar um item de estoque pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstoque(@PathVariable Long id) {
        if (estoqueRepository.existsById(id)) { // Verifica se o item de estoque existe pelo ID
            estoqueRepository.deleteById(id); // Deleta o item de estoque pelo ID
            return ResponseEntity.noContent().build(); // Retorna 204 No Content indicando sucesso na exclusão
        } else {
            return ResponseEntity.notFound().build(); // Retorna 404 Not Found se o item de estoque não existir
        }
    }
}
