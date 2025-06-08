package br.com.aula.faculdade.Core.Repository.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.Model.Cliente.Cliente;



@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Integer>{
}