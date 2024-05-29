package app.senaistock.stock_senai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.senaistock.stock_senai.Model.Blocos;
import app.senaistock.stock_senai.Repository.BlocosRepository;

@RestController
@RequestMapping("/blocos")
public class BlocoController {
    @Autowired
    private BlocosRepository repository;

    @GetMapping
    public List<Blocos> getAllAtivos() {
        return (List<Blocos>) repository.findAll();
    }

    @PostMapping
    public Blocos createAtivo(@RequestBody Blocos ativo) {
        return repository.save(ativo);
    }
}
