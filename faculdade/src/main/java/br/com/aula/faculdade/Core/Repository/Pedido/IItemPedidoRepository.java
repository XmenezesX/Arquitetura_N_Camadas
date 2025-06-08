package br.com.aula.faculdade.Core.Repository.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.Model.Pedido.ItemPedido;
@Repository
public interface IItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{
}