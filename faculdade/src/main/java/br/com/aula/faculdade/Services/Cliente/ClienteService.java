package br.com.aula.faculdade.Services.Cliente;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.aula.faculdade.Domain.model.Cliente.Cliente;
import br.com.aula.faculdade.Repository.Cliente.IClienteRepository;

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
}