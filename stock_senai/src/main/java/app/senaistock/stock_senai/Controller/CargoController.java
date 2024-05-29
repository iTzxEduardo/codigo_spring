package app.senaistock.stock_senai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.senaistock.stock_senai.Model.Cargos;
import app.senaistock.stock_senai.Repository.CargosRepository;


@RestController
@RequestMapping("/cargos")
public class CargoController {
    @Autowired
    private CargosRepository repository;

    @GetMapping
    public List<Cargos> getAllAtivos() {
        return (List<Cargos>) repository.findAll();
    }

    @PostMapping
    public Cargos createAtivo(@RequestBody Cargos ativo) {
        return repository.save(ativo);
    }
}
