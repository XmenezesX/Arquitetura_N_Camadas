package br.com.aula.faculdade.Core.Domain.Model.CategoriaProduto;

import br.com.aula.faculdade.Core.Domain.Model.Categoria.Categoria;
import br.com.aula.faculdade.Core.Domain.Model.Produto.Produto;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria_produto")
public class CategoriaProduto {
    @EmbeddedId
    private CategoriaProdutoId id;

    @ManyToOne
    @MapsId("categoriaId")
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    
    @ManyToOne
    @MapsId("produtoId")
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public CategoriaProdutoId getId() {
        return id;
    }

    public void setId(CategoriaProdutoId id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
