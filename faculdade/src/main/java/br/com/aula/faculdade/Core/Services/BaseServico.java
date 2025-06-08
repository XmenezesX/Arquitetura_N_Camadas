package br.com.aula.faculdade.Core.Services;

import java.util.List;
import java.util.Optional;

public interface BaseServico<T> {
    public void CadastrarAtualizar(T entity);

    public Optional<T> ObterPeloId(Integer id);

    public String DeletarEntidade(Integer id);

    public List<T> ObterTodasEntidades();
}