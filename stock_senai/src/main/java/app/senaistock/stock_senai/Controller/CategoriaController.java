package app.senaistock.stock_senai.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.senaistock.stock_senai.Model.Cargos;
import app.senaistock.stock_senai.Model.Categorias;
import app.senaistock.stock_senai.Repository.CategoriasRepository;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriasRepository repository;

    @GetMapping
    public List<Categorias> getAllAtivos() {
        return (List<Categorias>) repository.findAll();
    }

    @PostMapping
    public Categorias createAtivo(@RequestBody Categorias ativo) {
        return repository.save(ativo);
    }

            @GetMapping("/{id}")
    public Optional<Categorias> getCategoriasById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping("/{id}")
    public Categorias putCategorias(@PathVariable Long id, @RequestBody Categorias categorias) {
        Optional<Categorias> categorias2 = repository.findById(id);
        if (categorias2.isPresent()) {
            categorias.setId_categoria(id);
            return repository.save(categorias);
        } else {
            return null;
        }
    }

    

}
