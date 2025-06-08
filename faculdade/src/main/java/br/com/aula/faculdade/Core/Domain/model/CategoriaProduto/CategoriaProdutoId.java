package br.com.aula.faculdade.Core.Domain.Model.CategoriaProduto;

import java.io.Serializable;

public class CategoriaProdutoId implements Serializable {
    private Integer categoriaId;
    private Integer produtoId;
    
    public CategoriaProdutoId() {
    }

    public CategoriaProdutoId(Integer categoriaId, Integer produtoId) {
        this.categoriaId = categoriaId;
        this.produtoId = produtoId;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    
}
