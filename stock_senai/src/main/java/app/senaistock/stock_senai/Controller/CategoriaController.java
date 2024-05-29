package app.senaistock.stock_senai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
