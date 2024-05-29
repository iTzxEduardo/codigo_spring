package app.senaistock.stock_senai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.senaistock.stock_senai.Model.Salas;
import app.senaistock.stock_senai.Repository.SalasRepository;

@RestController
@RequestMapping("/salas")
public class SalaController {
    @Autowired
    private SalasRepository repository;

    @GetMapping
    public List<Salas> getAllAtivos() {
        return (List<Salas>) repository.findAll();
    }

    @PostMapping
    public Salas createAtivo(@RequestBody Salas ativo) {
        return repository.save(ativo);
    }
}
