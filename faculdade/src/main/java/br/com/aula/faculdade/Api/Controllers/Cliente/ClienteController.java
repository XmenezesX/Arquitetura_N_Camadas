package br.com.aula.faculdade.Api.Controllers.Cliente;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.aula.faculdade.Api.Controllers.BaseController;
import br.com.aula.faculdade.Core.Domain.Model.Cliente.Cliente;
import br.com.aula.faculdade.Core.Services.Cliente.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController implements BaseController<Cliente>{

    private final ClienteService clienteService;
    
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Override
    public Integer Create(Cliente cliente) {
        clienteService.CadastrarAtualizar(cliente);
        return cliente.getId();
    }

    @Override
    public Integer Update(Cliente cliente) {
        clienteService.CadastrarAtualizar(cliente);
        return cliente.getId();
    }

    @Override
    public String Delete(Integer id) {
        return clienteService.DeletarEntidade(id);
    }

    @Override
    public ResponseEntity<Cliente> GetEntityById(Integer id) {
        return clienteService.ObterPeloId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public List<Cliente> GetAllEntitys() {
        return clienteService.ObterTodasEntidades();
    }
}