package app.senaistock.stock_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Blocos;

public interface BlocosRepository extends CrudRepository<Blocos, Long>{
    // Blocos findById_bloco(Long id_bloco);
}