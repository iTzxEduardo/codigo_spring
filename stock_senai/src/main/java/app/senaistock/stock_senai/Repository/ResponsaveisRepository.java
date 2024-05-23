package app.senaistock.stock_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Responsaveis;

public interface ResponsaveisRepository extends CrudRepository<Responsaveis, Long>{
    // Responsaveis findById_responsavel(Long id_responsavel);
    
}