package app.senaistock.stock_senai.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.senaistock.stock_senai.Model.Responsaveis;
import app.senaistock.stock_senai.Repository.ResponsaveisRepository;


@RestController
@RequestMapping("/responsaveis")
public class ResponsavelRestController {
    @Autowired
    private ResponsaveisRepository repository;

    @GetMapping
    public List<Responsaveis> getAllAtivos() {
        return (List<Responsaveis>) repository.findAll();
    }

    @PostMapping
    public Responsaveis createAtivo(@RequestBody Responsaveis ativo) {
        return repository.save(ativo);
    }
}