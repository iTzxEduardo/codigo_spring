package app.senaistock.stock_senai.Model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Responsaveis implements Serializable {
    // atributos
    @Id
    private Long id_responsavel;
    private String email;
    private String nome_responsavel;
    private String senha;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "cargo_responsavel")
    // private Cargos id_cargo;

    @ManyToOne
    @JoinColumn(name = "id_cargo", nullable = false)
    private Cargos id_cargo;

    // metodos
    public String getEmail_responsavel() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public Cargos getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(Cargos id_cargo) {
        this.id_cargo = id_cargo;
    }

	public Long getId_responsavel() {
		return id_responsavel;
	}

	public void setId_responsavel(Long id_responsavel) {
		this.id_responsavel = id_responsavel;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
    
    
}


