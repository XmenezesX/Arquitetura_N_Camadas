package br.com.aula.faculdade.Controllers.Cliente;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.aula.faculdade.Domain.model.Cliente.Cliente;
import br.com.aula.faculdade.Services.Cliente.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;
    
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    
    @PostMapping
    public Integer criar(@RequestBody Cliente cliente) {
        clienteService.Cadastrar(cliente);
        return cliente.getId();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> ObterClienteById(@PathVariable Integer id){
        return clienteService.GetById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}