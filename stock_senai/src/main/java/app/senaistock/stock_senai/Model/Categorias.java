package app.senaistock.stock_senai.Model;

import jakarta.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Categorias implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria;
    private String nome_categoria; 
}
