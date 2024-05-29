package app.senaistock.stock_senai.Model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Transferencia implements Serializable{
    @Id
    private int id_tranferencia;
    private String data_registro;
    private String status_aprovacao;
    private String sala_remetente;


    // // Foreign key
    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "sala_destino")
    // private Salas id_sala;

    @ManyToOne
    @JoinColumn(name = "id_sala", nullable = false)
    private Salas id_sala;


    public int getId_tranferencia() {
        return id_tranferencia;
    }


    public void setId_tranferencia(int id_tranferencia) {
        this.id_tranferencia = id_tranferencia;
    }


    public String getData_registro() {
        return data_registro;
    }


    public void setData_registro(String data_registro) {
        this.data_registro = data_registro;
    }


    public String getStatus_aprovacao() {
        return status_aprovacao;
    }


    public void setStatus_aprovacao(String status_aprovacao) {
        this.status_aprovacao = status_aprovacao;
    }


    public String getSala_remetente() {
        return sala_remetente;
    }


    public void setSala_remetente(String sala_remetente) {
        this.sala_remetente = sala_remetente;
    }


    public Salas getId_sala() {
        return id_sala;
    }


    public void setId_sala(Salas id_sala) {
        this.id_sala = id_sala;
    }
    

}