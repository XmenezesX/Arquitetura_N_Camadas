package br.com.aula.faculdade.Core.Services.Endereco;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.aula.faculdade.Core.Domain.Model.Endereco.Endereco;
import br.com.aula.faculdade.Core.Repository.Endereco.IEnderecoRepository;
import br.com.aula.faculdade.Core.Services.BaseServico;

@Service
public class EnderecoService implements BaseServico<Endereco> {
    private final IEnderecoRepository repository;

    public EnderecoService(IEnderecoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void CadastrarAtualizar(Endereco entity) {
        repository.save(entity);
    }

    @Override
    public Optional<Endereco> ObterPeloId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public String DeletarEntidade(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Endereco deletado com sucesso!";
        }
        return "Nenhum endereco encontrado com id: " + id;
    }

    @Override
    public List<Endereco> ObterTodasEntidades() {
        return repository.findAll();
    }
}
