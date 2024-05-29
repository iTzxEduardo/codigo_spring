package app.senaistock.stock_senai.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.senaistock.stock_senai.Model.Areas;
import app.senaistock.stock_senai.Repository.AreasRepository;

//Criação de 
@RequestMapping("/areas")
public class AreasController {

    @Autowired
    private AreasRepository repository;

    //Criação do Get para 
    @GetMapping
    public List<Areas> getAllAreas(){
        return (List<Areas>) repository.findAll();
    }

}
