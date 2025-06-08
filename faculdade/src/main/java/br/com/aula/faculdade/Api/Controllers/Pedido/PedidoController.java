package br.com.aula.faculdade.Api.Controllers.Pedido;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula.faculdade.Api.Controllers.BaseController;
import br.com.aula.faculdade.Core.Domain.Model.Pedido.Pedido;
import br.com.aula.faculdade.Core.Services.Pedidos.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController implements BaseController<Pedido> {
    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @Override
    public Integer Create(Pedido pedido) {
        service.CadastrarAtualizar(pedido);
        return pedido.getId();
    }

    @Override
    public Integer Update(Pedido pedido) {
        service.CadastrarAtualizar(pedido);
        return pedido.getId();
    }

    @Override
    public String Delete(@PathVariable Integer id) {
        return service.DeletarEntidade(id);
    }

    @Override
    public ResponseEntity<Pedido> GetEntityById(Integer id) {
        return service.ObterPeloId(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public List<Pedido> GetAllEntitys() {
        return service.ObterTodasEntidades();
    }
}
