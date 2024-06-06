package app.senaistock.stock_senai.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Blocos;

public interface BlocosRepository extends CrudRepository<Blocos, Long>{
    List<Blocos> findAll(); 
}