package app.senaistock.stock_senai.Model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Cargos implements Serializable {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_cargo;
    // sem foreign key

    // metodos
    public Long getId() {
        return id;
    }
    public void setId_cargo(Long id) {
        this.id = id;
    }
    public String getNome_cargo() {
        return nome_cargo;
    }
    public void setNome_cargo(String nome_cargo) {
        this.nome_cargo = nome_cargo;
    }
}
