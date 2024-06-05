package app.senaistock.stock_senai.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.senaistock.stock_senai.Model.Responsaveis;
import app.senaistock.stock_senai.Repository.ResponsaveisRepository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/responsaveis")
public class ResponsavelRestController {
    @Autowired
    private ResponsaveisRepository repository;

    @GetMapping
    public List<Responsaveis> getAllResponsaveis() {
        return (List<Responsaveis>) repository.findAll();
    }

    @PostMapping
    public Responsaveis createResponsavel(@RequestBody Responsaveis responsavel) {
        return repository.save(responsavel);
    }

    @GetMapping("/{id}")
    public Optional <Responsaveis> getResponsavelById(@PathVariable Long id) {
        return repository.findById(id);
    }
    
    @PutMapping("/{id}")
    public Responsaveis putResponsavel(@PathVariable Long id, @RequestBody Responsaveis responsavel) {
        Optional<Responsaveis> responsavel2 = repository.findById(id);
        if (responsavel2.isPresent()) {
            responsavel.setId_responsavel(id);
            return repository.save(responsavel);
        } else {
            return null;
        }
    }

    
}