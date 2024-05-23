package app.senaistock.stock_senai.Model;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
public class Blocos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_bloco;
    private String nome_bloco;

    
    public Long getId_bloco() {
        return id_bloco;
    }
    public void setId_bloco(Long id_bloco) {
        this.id_bloco = id_bloco;
    }
    public String getNome_bloco() {
        return nome_bloco;
    }
    public void setNome_bloco(String nome_bloco) {
        this.nome_bloco = nome_bloco;
    }

    
}
