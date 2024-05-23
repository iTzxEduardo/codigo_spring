package app.senaistock.stock_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Categorias;

/**
 * CategoriasRepository
 */
public interface CategoriasRepository extends CrudRepository<Categorias, Long>{
    
    // Categorias findById_categoria(Long id_categoria);
}

