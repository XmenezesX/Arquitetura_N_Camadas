package br.com.aula.faculdade.Core.Repository.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.Model.Endereco.Endereco;
@Repository
public interface IEnderecoRepository extends JpaRepository<Endereco,Integer>{
}