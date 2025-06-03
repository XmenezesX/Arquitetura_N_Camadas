package br.com.aula.faculdade.Core.Domain.model.Endereco.Estado;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

import br.com.aula.faculdade.Core.Domain.model.Endereco.Cidade.Cidade;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    
    @OneToMany(mappedBy = "estado")
    private Set<Cidade> cidades = new HashSet<>();
    
    public Estado() {
    }
    
    public Estado(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(Set<Cidade> cidades) {
        this.cidades = cidades;
    }
}