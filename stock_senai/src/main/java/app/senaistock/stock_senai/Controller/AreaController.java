package app.senaistock.stock_senai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.senaistock.stock_senai.Model.Areas;
import app.senaistock.stock_senai.Repository.AreasRepository;

@RestController
@RequestMapping("/areas")
public class AreaController {
    @Autowired
    private AreasRepository repository;

    @GetMapping
    public List<Areas> getAllAtivos() {
        return (List<Areas>) repository.findAll();
    }

    @PostMapping
    public Areas createAtivo(@RequestBody Areas ativo) {
        return repository.save(ativo);
    }
}