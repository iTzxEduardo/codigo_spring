package app.senaistock.stock_senai.Model;


import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Salas implements Serializable{
    
    @Id
    private Long id_sala;
    private String nome_sala;
    
    // FOREIGN KEY
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bloco")
    private Blocos id_bloco;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_area")
    private Areas id_area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_responsavel")
    private Responsaveis id_responsavel;

	public Long getId_sala() {
		return id_sala;
	}

	public void setId_sala(Long id_sala) {
		this.id_sala = id_sala;
	}

	public String getNome_sala() {
		return nome_sala;
	}

	public void setNome_sala(String nome_sala) {
		this.nome_sala = nome_sala;
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

	public Responsaveis getId_responsavel() {
		return id_responsavel;
	}

	public void setId_responsavel(Responsaveis id_responsavel) {
		this.id_responsavel = id_responsavel;
	}

    
}