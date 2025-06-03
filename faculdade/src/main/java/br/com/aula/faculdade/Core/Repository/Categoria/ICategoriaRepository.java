package br.com.aula.faculdade.Core.Repository.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.Core.Domain.model.Categoria.Categoria;
@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{}