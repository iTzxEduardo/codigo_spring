package app.senaistock.stock_senai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Responsaveis;
import app.senaistock.stock_senai.Model.Salas;

public interface ResponsaveisRepository extends CrudRepository<Responsaveis, Long> {
    Responsaveis findByEmail(String email);

    boolean existsByEmail(String email);

    List<Responsaveis> findByIdsala(Salas idsala);

    @Query(value = "SELECT COALESCE(MAX(id_responsavel), 0) + 1 FROM Responsaveis", nativeQuery = true)
    Long findProximoId();
}