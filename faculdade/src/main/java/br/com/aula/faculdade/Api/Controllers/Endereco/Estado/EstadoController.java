package br.com.aula.faculdade.Api.Controllers.Endereco.Estado;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula.faculdade.Api.Controllers.BaseController;
import br.com.aula.faculdade.Core.Domain.Model.Endereco.Estado.Estado;
import br.com.aula.faculdade.Core.Services.Endereco.Estado.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController implements BaseController<Estado>{
    private final EstadoService service;

    public EstadoController(EstadoService service) {
        this.service = service;
    }

    @Override
    public Integer Create(Estado entity) {
        service.CadastrarAtualizar(entity);
        return entity.getId();
    }

    @Override
    public Integer Update(Estado entity) {
        service.CadastrarAtualizar(entity);
        return entity.getId();
    }

    @Override
    public String Delete(Integer id) {
        return service.DeletarEntidade(id);
    }

    @Override
    public ResponseEntity<Estado> GetEntityById(Integer id) {
        return service.ObterPeloId(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public List<Estado> GetAllEntitys() {
        return service.ObterTodasEntidades();
    }
    
}
