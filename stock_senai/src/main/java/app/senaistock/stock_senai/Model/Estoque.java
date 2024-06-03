package app.senaistock.stock_senai.Model;

import java.io.Serializable;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Estoque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estoque;
    private String nome_material;
    private int quantidade;
    private String observacao;
    private String data_registro_material;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categorias id_categoria;

    @ManyToOne
    @JoinColumn(name = "id_area", nullable = false)
    private Areas id_area;   
}
