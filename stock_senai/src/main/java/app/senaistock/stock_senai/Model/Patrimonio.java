package app.senaistock.stock_senai.Model;

import java.io.Serializable;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Patrimonio implements Serializable{
    // Atibutos
    @Id
    private int id_patrimonio;
    private String status_patrimonio;
    private String nome_patrimonio;

	@ManyToOne
    @JoinColumn(name = "idsala", nullable = false)
    private Salas idsala;

	@ManyToOne
    @JoinColumn(name = "id_bloco", nullable = false)
    private Blocos id_bloco;

	@ManyToOne
    @JoinColumn(name = "id_area", nullable = false)
    private Areas id_area;

	@ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categorias id_categoria;
    
    private String data_registro_patrimonio;
}