package app.senaistock.stock_senai.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.senaistock.stock_senai.Model.Areas;
import app.senaistock.stock_senai.Model.Estoque;
import app.senaistock.stock_senai.Repository.EstoqueRepository;

@RestController
@RequestMapping("/estoques")
public class EstoqueController {
    @Autowired
    private EstoqueRepository repository;

    @GetMapping
    public List<Estoque> getAllAtivos() {
        return (List<Estoque>) repository.findAll();
    }

    @PostMapping
    public Estoque createAtivo(@RequestBody Estoque ativo) {
        return repository.save(ativo);
    }

        @GetMapping("/{id}")
    public Optional<Estoque> getEstoqueById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping("/{id}")
    public Estoque putEstoque(@PathVariable Long id, @RequestBody Estoque estoque) {
        Optional<Estoque> estoque2 = repository.findById(id);
        if (estoque2.isPresent()) {
            estoque.setId_estoque(id);
            return repository.save(estoque);
        } else {
            return null;
        }
    }
}