package br.com.aula.faculdade.Domain.model.Pagamento;

import java.sql.Date;

import br.com.aula.faculdade.Domain.model.Enuns.EstadoPagamento.EstadoPagamento;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BOLETO")
public class Boleto extends Pagamento{
    private Date dataVencimento;
    private Date dataPagamento;
    
    public Boleto(Integer id, EstadoPagamento estado, Date dataVencimento, Date dataPagamento) {
        super(id, estado);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }
    public Boleto(){
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public Date getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
