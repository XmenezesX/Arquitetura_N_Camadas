package br.com.aula.faculdade.Api.Controllers.Categoria;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula.faculdade.Api.Controllers.BaseController;
import br.com.aula.faculdade.Core.Domain.Model.Categoria.Categoria;
import br.com.aula.faculdade.Core.Domain.Model.Produto.Produto;
import br.com.aula.faculdade.Core.Services.Categoria.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController implements BaseController<Categoria>{
    private final CategoriaService categoriaService;
    
    public CategoriaController(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @Override
    public Integer Create(Categoria categoria) {
        categoriaService.CadastrarAtualizar(categoria);
        return categoria.getId();
    }

    @Override
    public Integer Update(Categoria categoria) {
        categoriaService.CadastrarAtualizar(categoria);
        return categoria.getId();
    }

    @Override
    public String Delete(Integer id) {
        return categoriaService.DeletarEntidade(id);
    }

    @Override
    public ResponseEntity<Categoria> GetEntityById(Integer id) {
        return categoriaService.ObterPeloId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public List<Categoria> GetAllEntitys() {
        return categoriaService.ObterTodasEntidades();
    }

    @GetMapping("/{id}/produtos")
    public List<Produto> GetProdutosByCategoriaId(@PathVariable Integer id){
        return categoriaService.ObtemProdutosPelaCategoriaId(id);
    }
}
