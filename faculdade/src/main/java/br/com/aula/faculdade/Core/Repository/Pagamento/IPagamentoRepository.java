package br.com.aula.faculdade.Core.Repository.Pagamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.Model.Pagamento.Pagamento;
@Repository
public interface IPagamentoRepository extends JpaRepository<Pagamento, Integer> {
}