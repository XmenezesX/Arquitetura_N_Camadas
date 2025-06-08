package br.com.aula.faculdade.Core.Domain.Model.Pedido;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import br.com.aula.faculdade.Core.Domain.Model.Cliente.Cliente;
import br.com.aula.faculdade.Core.Domain.Model.Endereco.Endereco;
import br.com.aula.faculdade.Core.Domain.Model.Pagamento.Pagamento;
import br.com.aula.faculdade.Core.Domain.Model.Produto.Produto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date data;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pagamento_id", referencedColumnName = "id")
    private Pagamento pagamento;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemPedido> itens = new ArrayList<>();
    
    public Pedido(Integer id, Date data, Endereco endereco, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.endereco = endereco;
        this.cliente = cliente;
    }

    public Pedido(){}

    public void adicionarItem(Produto produto, Integer quantidade, 
                            Double desconto, Double preco) {
        ItemPedido item = new ItemPedido(this, produto, quantidade, desconto, preco);
        itens.add(item);
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
