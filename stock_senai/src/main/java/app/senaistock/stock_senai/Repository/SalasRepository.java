package app.senaistock.stock_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Salas;

public interface SalasRepository extends CrudRepository<Salas, Long>{
    // Salas findById_sala(Long id_sala);
}