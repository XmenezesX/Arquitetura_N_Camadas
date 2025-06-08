package br.com.aula.faculdade.Core.Services.Cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.aula.faculdade.Core.Domain.Model.Cliente.Cliente;
import br.com.aula.faculdade.Core.Repository.Cliente.IClienteRepository;
import br.com.aula.faculdade.Core.Services.BaseServico;

@Service
public class ClienteService implements BaseServico<Cliente>{
    private final IClienteRepository repository;

    public ClienteService(IClienteRepository repository) {
        this.repository = repository;
    }

    public void CadastrarAtualizar(Cliente cliente){
        repository.save(cliente);
    }

    public Optional<Cliente> ObterPeloId(Integer id){
        return repository.findById(id);
    }

    public String DeletarEntidade(Integer id){
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Item deletado com sucesso! Id: " + id;
        }
        return "Item não encontrado!";
    }

    public List<Cliente> ObterTodasEntidades(){
        return repository.findAll();
    }
}