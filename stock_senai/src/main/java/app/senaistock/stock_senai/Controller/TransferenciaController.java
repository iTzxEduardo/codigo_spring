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
import app.senaistock.stock_senai.Model.Transferencia;
import app.senaistock.stock_senai.Repository.TransferenciaRepository;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {
    @Autowired
    private TransferenciaRepository repository;

    @GetMapping
    public List<Transferencia> getAllAtivos() {
        return (List<Transferencia>) repository.findAll();
    }

    @PostMapping
    public Transferencia createAtivo(@RequestBody Transferencia ativo) {
        return repository.save(ativo);
    }

    @GetMapping("/{id}")
    public Optional<Transferencia> getTransferenciaById(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @PutMapping("/{id}")
    public Transferencia putTransferencia(@PathVariable Integer id, @RequestBody Transferencia transferencia) {
        Optional<Transferencia> transferencia2 = repository.findById(id);
        if (transferencia2.isPresent()) {
            transferencia.setId_tranferencia(id);
            return repository.save(transferencia);
        } else {
            return null;
        }
    }
}
