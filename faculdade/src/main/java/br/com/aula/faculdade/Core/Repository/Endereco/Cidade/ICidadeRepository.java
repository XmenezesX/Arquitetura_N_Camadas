package br.com.aula.faculdade.Core.Repository.Endereco.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.model.Endereco.Cidade.Cidade;
@Repository
public interface ICidadeRepository extends JpaRepository<Cidade, Integer>{
}