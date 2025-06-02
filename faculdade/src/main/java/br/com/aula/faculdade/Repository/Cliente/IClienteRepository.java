package br.com.aula.faculdade.Repository.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.faculdade.Domain.model.Cliente.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer>{
}