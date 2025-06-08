package br.com.aula.faculdade.Core.Services.Produto;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.aula.faculdade.Core.Domain.Model.Produto.Produto;
import br.com.aula.faculdade.Core.Repository.Produto.IProdutoRepository;
import br.com.aula.faculdade.Core.Services.BaseServico;

@Service
public class ProdutoService implements BaseServico<Produto>{
    private final IProdutoRepository repository;

    public ProdutoService(IProdutoRepository repository){
        this.repository = repository;
    }
    
    @Override
    public void CadastrarAtualizar(Produto produto) {
        repository.save(produto);
    }

    @Override
    public Optional<Produto> ObterPeloId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public String DeletarEntidade(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Produto deletado com sucesso!";
        }
        return "Nenhum produto encontrado com id: " + id;
    }

    @Override
    public List<Produto> ObterTodasEntidades() {
       return repository.findAll();
    }
    
}
