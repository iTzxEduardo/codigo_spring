package app.senaistock.stock_senai.Model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Responsaveis implements Serializable {
    // atributos
    @Id
    private Long id_responsavel;
    private String email_responsavel;
    private String nome_responsavel;
    private String senha_responsavel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cargo_responsavel")
    private Cargos id_cargo;

    // metodos
    public String getEmail_responsavel() {
        return email_responsavel;
    }

    public void setEmail_responsavel(String email_responsavel) {
        this.email_responsavel = email_responsavel;
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

	public String getSenha_responsavel() {
		return senha_responsavel;
	}

	public void setSenha_responsavel(String senha_responsavel) {
		this.senha_responsavel = senha_responsavel;
	}
    
    
}


