package app.senaistock.stock_senai.Repository;

import org.springframework.data.repository.CrudRepository;

import app.senaistock.stock_senai.Model.Areas;

public interface AreasRepository extends CrudRepository<Areas, Long> {

    AreasRepository findByIdArea(Long id_area);
}