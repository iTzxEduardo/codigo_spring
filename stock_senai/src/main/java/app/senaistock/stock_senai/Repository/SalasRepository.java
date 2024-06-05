package app.senaistock.stock_senai.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Salas;

public interface SalasRepository extends CrudRepository<Salas, Long>{
    Optional<Salas> findById(long id);
    List<Salas> findAll();
}