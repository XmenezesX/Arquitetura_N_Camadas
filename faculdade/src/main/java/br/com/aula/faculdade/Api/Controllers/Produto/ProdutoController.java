package br.com.aula.faculdade.Api.Controllers.Produto;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula.faculdade.Api.Controllers.BaseController;
import br.com.aula.faculdade.Core.Domain.Model.Produto.Produto;
import br.com.aula.faculdade.Core.Services.Produto.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController implements BaseController<Produto>{
    private final ProdutoService service;
    
    public ProdutoController(ProdutoService service){
        this.service = service;
    }
    
    @Override
    public Integer Create(Produto produto) {
        service.CadastrarAtualizar(produto);
        return produto.getId();
    }

    @Override
    public Integer Update(Produto produto) {
        service.CadastrarAtualizar(produto);
        return produto.getId();
    }

    @Override
    public String Delete(@PathVariable Integer id) {
        return service.DeletarEntidade(id);
    }

    @Override
    public ResponseEntity<Produto> GetEntityById(Integer id) {
        return service.ObterPeloId(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public List<Produto> GetAllEntitys() {
        return service.ObterTodasEntidades();
    }
    
}
