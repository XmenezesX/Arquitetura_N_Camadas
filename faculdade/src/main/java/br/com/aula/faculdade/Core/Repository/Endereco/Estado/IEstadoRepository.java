package br.com.aula.faculdade.Core.Repository.Endereco.Estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.model.Endereco.Estado.Estado;
@Repository
public interface IEstadoRepository extends JpaRepository<Estado, Integer>{
}