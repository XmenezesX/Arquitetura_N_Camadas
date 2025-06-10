package br.com.aula.faculdade.Api.Controllers.Endereco.Cidade;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula.faculdade.Api.Controllers.BaseController;
import br.com.aula.faculdade.Api.DTOs.Cidade.CidadesPorEstadoResponse;
import br.com.aula.faculdade.Core.Domain.Model.Endereco.Cidade.Cidade;
import br.com.aula.faculdade.Core.Services.Endereco.Cidade.CidadeService;

@RestController
@RequestMapping("/cidades")
public class CidadeController implements BaseController<Cidade> {
    private final CidadeService service;

    public CidadeController(CidadeService service) {
        this.service = service;
    }

    @Override
    public Integer Create(Cidade entity) {
        service.CadastrarAtualizar(entity);
        return entity.getId();
    }

    @Override
    public Integer Update(Cidade entity) {
        service.CadastrarAtualizar(entity);
        return entity.getId();
    }

    @Override
    public String Delete(Integer id) {
        return service.DeletarEntidade(id);
    }

    @Override
    public ResponseEntity<Cidade> GetEntityById(Integer id) {
       return service.ObterPeloId(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public List<Cidade> GetAllEntitys() {
        return service.ObterTodasEntidades();
    }

    @GetMapping("/estado/{id}")
    public ResponseEntity<?> GetCityByEstateId(@PathVariable Integer id){
        CidadesPorEstadoResponse response = service.ObtemCidadePeloIdEstado(id);
        return ResponseEntity.ok(response);
    }
}
