package app.senaistock.stock_senai.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Patrimonio;
import app.senaistock.stock_senai.Model.Salas;

public interface PatrimonioRepository extends CrudRepository<Patrimonio, Long>{
   List<Patrimonio> findAll();
   List<Patrimonio> findByIdsala(Salas idsala);
   Optional<Patrimonio> findById(Long id);
}