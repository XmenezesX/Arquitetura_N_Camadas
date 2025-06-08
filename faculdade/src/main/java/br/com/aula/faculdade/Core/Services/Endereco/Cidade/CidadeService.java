package br.com.aula.faculdade.Core.Services.Endereco.Cidade;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.aula.faculdade.Core.Domain.Model.Endereco.Cidade.Cidade;
import br.com.aula.faculdade.Core.Repository.Endereco.Cidade.ICidadeRepository;
import br.com.aula.faculdade.Core.Services.BaseServico;

@Service
public class CidadeService implements BaseServico<Cidade>{
    private final ICidadeRepository cidadeRepository;

    public CidadeService(ICidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    @Override
    public void CadastrarAtualizar(Cidade entity) {
        cidadeRepository.save(entity);
    }

    @Override
    public Optional<Cidade> ObterPeloId(Integer id) {
        return cidadeRepository.findById(id);
    }

    @Override
    public String DeletarEntidade(Integer id) {
        if (cidadeRepository.existsById(id)) {
            cidadeRepository.deleteById(id);
            return "Cidade deletada com sucesso!";
        }
        return "Nenhuma cidade encontrada com id: " + id;
    }

    @Override
    public List<Cidade> ObterTodasEntidades() {
        return cidadeRepository.findAll();
    }

    
}
