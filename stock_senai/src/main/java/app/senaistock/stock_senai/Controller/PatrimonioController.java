package app.senaistock.stock_senai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.senaistock.stock_senai.Model.Patrimonio;
import app.senaistock.stock_senai.Repository.PatrimonioRepository;

@RestController
@RequestMapping("/patrimonios")
public class PatrimonioController {
    @Autowired
    private PatrimonioRepository repository;

    @GetMapping
    public List<Patrimonio> getAllAtivos() {
        return (List<Patrimonio>) repository.findAll();
    }

    @PostMapping
    public Patrimonio createAtivo(@RequestBody Patrimonio ativo) {
        return repository.save(ativo);
    }
}
