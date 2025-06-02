package br.com.aula.faculdade.Repository.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.faculdade.Domain.model.Produto.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer>{
}