package app.senaistock.stock_senai.Model;

import java.io.Serializable;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Transferencia implements Serializable{
    @Id
    private int id_tranferencia;
    private String data_registro;
    private String status_aprovacao;
    private String sala_remetente;


    @ManyToOne
    @JoinColumn(name = "id_sala", nullable = false)
    private Salas id_sala;
}