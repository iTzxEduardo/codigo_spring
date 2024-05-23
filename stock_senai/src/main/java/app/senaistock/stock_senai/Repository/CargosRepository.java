package app.senaistock.stock_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Cargos;

/**
 * CargosRepository
 */
public interface CargosRepository extends CrudRepository<Cargos, Long> {
    // Cargos findById_cargo(Long id_cargo);
            
}