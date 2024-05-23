package app.senaistock.stock_senai.Model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Estoque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estoque;
    private String nome_material;
    private int quantidade;
    private String observacao;
    private String data_registro_material;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    private Categorias id_categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_area")
    private Areas id_area;

    // metodos
    public Long getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(Long id_estoque) {
        this.id_estoque = id_estoque;
    }

    public String getNome_material() {
        return nome_material;
    }

    public void setNome_material(String nome_material) {
        this.nome_material = nome_material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getData_registro_material() {
        return data_registro_material;
    }

    public void setData_registro_material(String data_registro_material) {
        this.data_registro_material = data_registro_material;
    }

    public Categorias getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categorias id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Areas getId_area() {
        return id_area;
    }

    public void setId_area(Areas id_area) {
        this.id_area = id_area;
    }

    
}
