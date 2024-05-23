package app.senaistock.stock_senai.Model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Patrimonio implements Serializable{
    
    // Atibutos
    @Id
    private int id_patrimonio;
    private String status_patrimonio;

    // Foreign key
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sala")
    private Salas id_sala;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bloco")
    private Blocos id_bloco;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_area")
    private Areas id_area;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    private Categorias id_categoria;
    
    //Campo preenchido automaticamente com Hora Local 
    private String data_registro_patrimonio;

    
	public int getId_patrimonio() {
		return id_patrimonio;
	}

	public void setId_patrimonio(int id_patrimonio) {
		this.id_patrimonio = id_patrimonio;
	}

	public String getStatus_patrimonio() {
		return status_patrimonio;
	}

	public void setStatus_patrimonio(String status_patrimonio) {
		this.status_patrimonio = status_patrimonio;
	}

	public Salas getId_sala() {
		return id_sala;
	}

	public void setId_sala(Salas id_sala) {
		this.id_sala = id_sala;
	}

	public Blocos getId_bloco() {
		return id_bloco;
	}

	public void setId_bloco(Blocos id_bloco) {
		this.id_bloco = id_bloco;
	}

	public Areas getId_area() {
		return id_area;
	}

	public void setId_area(Areas id_area) {
		this.id_area = id_area;
	}

	public Categorias getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Categorias id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getData_registro_patrimonio() {
		return data_registro_patrimonio;
	}

	public void setData_registro_patrimonio(String data_registro_patrimonio) {
		this.data_registro_patrimonio = data_registro_patrimonio;
	}



}