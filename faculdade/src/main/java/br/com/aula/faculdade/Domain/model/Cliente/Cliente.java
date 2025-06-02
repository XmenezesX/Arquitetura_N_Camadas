package br.com.aula.faculdade.Domain.model.Cliente;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import br.com.aula.faculdade.Domain.model.Endereco.Endereco;
import br.com.aula.faculdade.Domain.model.Enuns.TipoDocumento.TipoDocumento;
import br.com.aula.faculdade.Domain.model.Pedido.Pedido;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String documento;
    private Set<String> telefones = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedido> pedidos = new ArrayList<>();
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
   
    private List<Endereco> enderecos = new ArrayList<>();
    
    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void AddTelefone(String telefone){
        telefones.add(telefone);
    }

    public Cliente(Integer id, String nome, String email, String documento, TipoDocumento tipoDocumento,
            String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.telefones.add(telefone);
    }
    
    public Cliente(){}

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.setCliente(this);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
        endereco.setCliente(this);
    }
    
    public void removerEndereco(Endereco endereco) {
        enderecos.remove(endereco);
        endereco.setCliente(null);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Set<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(Set<String> telefones) {
        this.telefones = telefones;
    }
}
