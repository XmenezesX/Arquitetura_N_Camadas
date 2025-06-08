package br.com.aula.faculdade.Core.Services.Pedidos;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.aula.faculdade.Core.Domain.Model.Pedido.Pedido;
import br.com.aula.faculdade.Core.Repository.Pedido.IPedidoRepository;
import br.com.aula.faculdade.Core.Services.BaseServico;

@Service
public class PedidoService implements BaseServico<Pedido>{
    private final IPedidoRepository repository;

    public PedidoService(IPedidoRepository repository) {
        this.repository = repository;
    }

    public void CadastrarAtualizar(Pedido pedido){
        repository.save(pedido);
    }

    public Optional<Pedido> ObterPeloId(Integer id){
        return repository.findById(id);
    }


    public String DeletarEntidade(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Item deletado com sucesso! Id: " + id;
        }
        return "Item não encontrado!"; 
    }

    public List<Pedido> ObterTodasEntidades() {
        return repository.findAll();
    }
}
