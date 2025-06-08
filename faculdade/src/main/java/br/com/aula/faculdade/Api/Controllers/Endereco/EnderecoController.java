package br.com.aula.faculdade.Api.Controllers.Endereco;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula.faculdade.Api.Controllers.BaseController;
import br.com.aula.faculdade.Core.Domain.Model.Endereco.Endereco;
import br.com.aula.faculdade.Core.Services.Endereco.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController implements BaseController<Endereco>{
    private final EnderecoService service;

    public EnderecoController(EnderecoService service) {
        this.service = service;
    }

    @Override
    public Integer Create(Endereco entity) {
        service.CadastrarAtualizar(entity);
        return entity.getId();
    }

    @Override
    public Integer Update(Endereco entity) {
        service.CadastrarAtualizar(entity);
        return entity.getId();
    }

    @Override
    public String Delete(Integer id) {
        return service.DeletarEntidade(id);
    }

    @Override
    public ResponseEntity<Endereco> GetEntityById(Integer id) {
        return service.ObterPeloId(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public List<Endereco> GetAllEntitys() {
        return service.ObterTodasEntidades();
    }
}