package app.senaistock.stock_senai.Model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Categorias implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria;
    private String nome_categoria;

    // metodos
    public Long getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }
    public String getNome_categoria() {
        return nome_categoria;
    }
    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    
}
