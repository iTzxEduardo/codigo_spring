package app.senaistock.stock_senai.Model;

import java.io.Serializable;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Responsaveis implements Serializable {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_responsavel;
    private String email;
    private String nome_responsavel;
    private String senha;
    private String foto;

    @ManyToOne
    @JoinColumn(name = "id_cargo", nullable = false)
    private Cargos id_cargo;

    @ManyToOne
    @JoinColumn(name = "idsala", nullable = false)
    private Salas idsala;
}


