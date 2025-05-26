package br.com.aula.faculdade.Domain.model.Enuns.EstadoPagamento;

public enum EstadoPagamento {
    NOVO(0, "Novo"),
    PENDENTE(1, "Pendente"),
    PAGO(2, "Pago"),
    CANCELADO(3, "Cancelado");

    private final Integer codigo;
    private final String descricao;

    EstadoPagamento(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EstadoPagamento toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (EstadoPagamento x : EstadoPagamento.values()) {
            if (codigo.equals(x.getCodigo())) {
                return x;
            }
        }
        
        System.out.println("Código inválido: " + codigo);
        return null;
    }

    public static EstadoPagamento toEnum(String descricao) {
        if (descricao == null || descricao.isEmpty()) {
            return null;
        }

        for (EstadoPagamento x : EstadoPagamento.values()) {
            if (descricao.equalsIgnoreCase(x.getDescricao())) {
                return x;
            }
        }

        System.out.println("Descrição inválida: " + descricao);
        return null;
    }
}
