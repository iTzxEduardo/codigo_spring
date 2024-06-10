package app.senaistock.stock_senai.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Responsaveis;
import app.senaistock.stock_senai.Model.Salas;

public interface ResponsaveisRepository extends CrudRepository<Responsaveis, Long> {
    Responsaveis findByEmail(String email);

    boolean existsByEmail(String email);

    List<Responsaveis> findByIdsala(Salas idsala);
}
