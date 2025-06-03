package br.com.aula.faculdade.Core.Repository.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.model.Produto.Produto;
@Repository
public interface IProdutoRepository extends JpaRepository<Produto, Integer>{
}