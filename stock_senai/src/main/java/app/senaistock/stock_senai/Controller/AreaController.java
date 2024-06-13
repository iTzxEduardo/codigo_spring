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

    @GetMapping("/{id}")
    public Optional<Areas> getAreasById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping("/{id}")
    public Areas putAreas(@PathVariable Long id, @RequestBody Areas areas) {
        Optional<Areas> area2 = repository.findById(id);
        if (area2.isPresent()) {
            areas.setId_area(id);;
            return repository.save(areas);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public List<Areas> deleteArea(@PathVariable Long id) {
        repository.deleteById(id);
        return (List<Areas>) repository.findAll();
    }
}