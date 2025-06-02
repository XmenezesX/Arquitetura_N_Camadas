package br.com.aula.faculdade.Repository.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.faculdade.Domain.model.Endereco.Endereco;

public interface IEnderecoRepository extends JpaRepository<Endereco,Integer>{
}