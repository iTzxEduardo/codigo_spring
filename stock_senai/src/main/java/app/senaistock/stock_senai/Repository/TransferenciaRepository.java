package app.senaistock.stock_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Transferencia;

public interface TransferenciaRepository extends CrudRepository<Transferencia, Integer>{
    // Transferencia findById_tranferencia(int id_tranferencia);
    
}



