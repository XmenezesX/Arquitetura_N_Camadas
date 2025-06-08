package br.com.aula.faculdade.Core.Domain.Model.Pedido;

import java.io.Serializable;

public class ItemPedidoId implements Serializable {
    private Integer pedidoId;
    private Integer produtoId;

    public ItemPedidoId() {}

    public ItemPedidoId(Integer pedidoId, Integer produtoId) {
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }
}