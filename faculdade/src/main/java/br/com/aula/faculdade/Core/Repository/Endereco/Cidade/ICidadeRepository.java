package br.com.aula.faculdade.Core.Repository.Endereco.Cidade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.Model.Endereco.Cidade.Cidade;
@Repository
public interface ICidadeRepository extends JpaRepository<Cidade, Integer>{
    @Query("SELECT e.cidades FROM Estado e WHERE e.id = :estadoId")
    List<Cidade> obtemCidadesPeloIdEstado(@Param("estadoId") Integer estadoId);
}