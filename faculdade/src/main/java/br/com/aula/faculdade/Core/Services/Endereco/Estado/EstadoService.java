package br.com.aula.faculdade.Core.Services.Endereco.Estado;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.aula.faculdade.Core.Domain.Model.Endereco.Estado.Estado;
import br.com.aula.faculdade.Core.Repository.Endereco.Estado.IEstadoRepository;
import br.com.aula.faculdade.Core.Services.BaseServico;

@Service
public class EstadoService implements BaseServico<Estado>{
    private final IEstadoRepository estadoRepository;

    public EstadoService(IEstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    public void CadastrarAtualizar(Estado estado) {
        estadoRepository.save(estado);
    }

    @Override
    public Optional<Estado> ObterPeloId(Integer id) {
        return estadoRepository.findById(id);
    }

    @Override
    public String DeletarEntidade(Integer id) {
        if (estadoRepository.existsById(id)) {
            estadoRepository.deleteById(id);
            return "Estado deletado com sucesso!";
        }
        return "Nenhum estado encontrado com id: " + id;
    }

    @Override
    public List<Estado> ObterTodasEntidades() {
        return estadoRepository.findAll();
    }
    
}
