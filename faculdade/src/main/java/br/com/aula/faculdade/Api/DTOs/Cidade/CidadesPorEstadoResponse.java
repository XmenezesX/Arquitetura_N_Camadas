package br.com.aula.faculdade.Api.DTOs.Cidade;

import java.util.List;

import br.com.aula.faculdade.Core.Domain.Model.Endereco.Cidade.Cidade;
import br.com.aula.faculdade.Core.Domain.Model.Endereco.Estado.Estado;

public class CidadesPorEstadoResponse {
    private String nomeEstado;
    private List<Cidade> cidades;

    public CidadesPorEstadoResponse(List<Cidade> cidades, Estado estado) {
        this.cidades = cidades;
        this.nomeEstado = estado.getNome();
    }
    
    public List<Cidade> getCidades() {
        return cidades;
    }
    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
    public String getNomeEstado() {
        return nomeEstado;
    }
    public void setEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }
}