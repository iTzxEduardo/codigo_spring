package app.senaistock.stock_senai.Model;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
public class Areas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_area;
    private String nome_area;


    // metodos
    public Long getId_area() {
        return id_area;
    }
    public void setId_area(Long id_area) {
        this.id_area = id_area;
    }
    public String getNome_area() {
        return nome_area;
    }
    public void setNome_area(String nome_area) {
        this.nome_area = nome_area;
    }

}

    

