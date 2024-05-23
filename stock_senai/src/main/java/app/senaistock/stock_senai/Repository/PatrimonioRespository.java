package app.senaistock.stock_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Patrimonio;

public interface PatrimonioRespository extends CrudRepository<Patrimonio, Integer>{
    // Patrimonio findById_patrimonio(int id_patrimonio);
}