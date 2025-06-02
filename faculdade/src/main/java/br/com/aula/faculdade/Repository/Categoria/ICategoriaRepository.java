package br.com.aula.faculdade.Repository.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.faculdade.Domain.model.Categoria.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{}