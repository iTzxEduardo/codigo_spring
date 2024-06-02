package app.senaistock.stock_senai.Model;

import java.io.Serializable;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Blocos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_bloco;
    private String nome_bloco;   
}
