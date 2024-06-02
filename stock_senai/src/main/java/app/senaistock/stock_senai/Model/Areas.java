package app.senaistock.stock_senai.Model;

import java.io.Serializable;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Areas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_area;
    private String nome_area;
}

    

