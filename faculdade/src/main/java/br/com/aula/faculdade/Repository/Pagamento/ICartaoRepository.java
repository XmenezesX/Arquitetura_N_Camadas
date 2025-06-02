package br.com.aula.faculdade.Repository.Pagamento;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.faculdade.Domain.model.Pagamento.Cartao;

public interface ICartaoRepository extends JpaRepository<Cartao, Integer> {
}