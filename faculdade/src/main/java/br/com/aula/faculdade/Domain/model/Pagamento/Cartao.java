package br.com.aula.faculdade.Domain.model.Pagamento;

import br.com.aula.faculdade.Domain.model.Enuns.EstadoPagamento.EstadoPagamento;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CARTAO")
public class Cartao extends Pagamento{
    private Integer numeroParcelas;

    public Cartao(Integer id, EstadoPagamento estado, Integer numeroParcelas) {
        super(id, estado);
        this.numeroParcelas = numeroParcelas;
    }

    public Cartao() {
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
}
