package br.com.aula.faculdade.Core.Repository.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.Model.Pedido.Pedido;
@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {
}