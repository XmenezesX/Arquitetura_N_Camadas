package br.com.aula.faculdade.Core.Services.Cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.aula.faculdade.Core.Domain.model.Cliente.Cliente;
import br.com.aula.faculdade.Core.Repository.Cliente.IClienteRepository;

@Service
public class ClienteService {
    private final IClienteRepository repository;

    public ClienteService(IClienteRepository repository) {
        this.repository = repository;
    }

    public void Cadastrar(Cliente cliente){
        repository.save(cliente);
    }

    public Optional<Cliente> GetById(Integer id){
        return repository.findById(id);
    }

    public String DeletarCliente(Integer id){
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Item deletado com sucesso! Id: " + id;
        }
        return "Item não encontrado!";
    }

    public List<Cliente> GetAllClientes(){
        return repository.findAll();
    }
}