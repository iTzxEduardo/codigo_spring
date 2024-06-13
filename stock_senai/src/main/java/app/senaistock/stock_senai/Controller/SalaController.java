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

import app.senaistock.stock_senai.Model.Responsaveis;
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

    @GetMapping("/{id}")
    public Optional <Salas> getSalasById(@PathVariable Long id) {
        return repository.findById(id);
    }
    
    @PutMapping("/{id}")
    public Salas putSalas(@PathVariable Long id, @RequestBody Salas salas) {
        Optional<Salas> sala2 = repository.findById(id);
        if (sala2.isPresent()) {
            salas.setId_sala(id);
            return repository.save(salas);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public List<Salas> DeleteSala(@PathVariable Long id){
        repository.deleteById(id);
        return (List<Salas>) repository.findAll();
    }
}
