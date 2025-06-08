package br.com.aula.faculdade.Core.Services.Categoria;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.aula.faculdade.Core.Domain.Model.Categoria.Categoria;
import br.com.aula.faculdade.Core.Domain.Model.Produto.Produto;
import br.com.aula.faculdade.Core.Repository.Categoria.ICategoriaRepository;
import br.com.aula.faculdade.Core.Services.BaseServico;

@Service
public class CategoriaService implements BaseServico<Categoria>{
    private final ICategoriaRepository categoriaRepository;

    public CategoriaService(ICategoriaRepository repository){
        this.categoriaRepository = repository;
    }

    @Override
    public void CadastrarAtualizar(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> ObterPeloId(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public String DeletarEntidade(Integer id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
            return "Categoria deletada com sucesso!";
        }
        return "Categoria não encontrada com id: " + id; 
    }

    @Override
    public List<Categoria> ObterTodasEntidades() {
        return categoriaRepository.findAll();
    }

    public List<Produto> ObtemProdutosPelaCategoriaId(Integer id){
        return categoriaRepository.ObtemProdutosPelaCategoriaId(id);
    }
    
}
