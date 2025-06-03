package br.com.aula.faculdade.Core.Repository.Pagamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.model.Pagamento.Boleto;
@Repository
public interface IBoletoRepository extends JpaRepository<Boleto, Integer> {
}