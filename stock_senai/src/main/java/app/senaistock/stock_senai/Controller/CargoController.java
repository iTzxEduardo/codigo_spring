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

        @GetMapping("/{id}")
    public Optional<Cargos> getCargosById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping("/{id}")
    public Cargos putCargos(@PathVariable Long id, @RequestBody Cargos cargos) {
        Optional<Cargos> cargo2 = repository.findById(id);
        if (cargo2.isPresent()) {
            cargos.setId(id);
            return repository.save(cargos);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public List<Cargos> deleteCargo(@PathVariable Long id) {
        repository.deleteById(id);
        return (List<Cargos>) repository.findAll();
    }
}
