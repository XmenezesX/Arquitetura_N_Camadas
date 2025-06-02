package br.com.aula.faculdade.Repository.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.faculdade.Domain.model.Pedido.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {
}