package app.senaistock.stock_senai.Model;


import java.io.Serializable;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Salas implements Serializable{
    @Id
    private Long id_sala;
    private String nome_sala;
    
	@ManyToOne
    @JoinColumn(name = "id_bloco", nullable = false)
    private Blocos id_bloco;

	@ManyToOne
    @JoinColumn(name = "id_area", nullable = false)
    private Areas id_area;

	@ManyToOne
    @JoinColumn(name = "id_responsavel", nullable = false)
    private Responsaveis id_responsavel;
}