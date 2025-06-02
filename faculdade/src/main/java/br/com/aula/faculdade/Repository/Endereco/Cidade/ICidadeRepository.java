package br.com.aula.faculdade.Repository.Endereco.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.faculdade.Domain.model.Endereco.Cidade.Cidade;

public interface ICidadeRepository extends JpaRepository<Cidade, Integer>{
}