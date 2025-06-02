package br.com.aula.faculdade.Repository.Endereco.Estado;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.faculdade.Domain.model.Endereco.Estado.Estado;

public interface IEstadoRepository extends JpaRepository<Estado, Integer>{
}