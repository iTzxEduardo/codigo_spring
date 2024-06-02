package app.senaistock.stock_senai.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Cargos;

public interface CargosRepository extends CrudRepository<Cargos, Long> {
    Optional<Cargos> findById(long id);
    List<Cargos> findAll();
}