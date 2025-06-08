package br.com.aula.faculdade.Core.Repository.Categoria;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.Model.Categoria.Categoria;
import br.com.aula.faculdade.Core.Domain.Model.Produto.Produto;
@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{

    @Query("SELECT c.produtos FROM Categoria c WHERE c.id = :categoriaId")
    List<Produto> ObtemProdutosPelaCategoriaId(@Param("categoriaId") Integer categoriaId);
}