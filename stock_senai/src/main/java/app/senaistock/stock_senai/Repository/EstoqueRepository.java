package app.senaistock.stock_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Estoque;

/**
 * EstoqueRepository
 */
public interface EstoqueRepository extends CrudRepository<Estoque, Long>{
    // Estoque findById_estoque(Long id_estoque);
}