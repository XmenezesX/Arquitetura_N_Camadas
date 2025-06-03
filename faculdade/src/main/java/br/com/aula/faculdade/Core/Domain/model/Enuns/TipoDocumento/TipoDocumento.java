package br.com.aula.faculdade.Core.Domain.model.Enuns.TipoDocumento;

public enum TipoDocumento {
    CPF(2, "Cpf"),
    CNPJ(3, "Cnpj");

    private final Integer codigo;
    private final String descricao;

    TipoDocumento(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoDocumento toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (TipoDocumento x : TipoDocumento.values()) {
            if (codigo.equals(x.getCodigo())) {
                return x;
            }
        }
        
        System.out.println("Código inválido: " + codigo);
        return null;
    }

    public static TipoDocumento toEnum(String descricao) {
        if (descricao == null || descricao.isEmpty()) {
            return null;
        }

        for (TipoDocumento x : TipoDocumento.values()) {
            if (descricao.equalsIgnoreCase(x.getDescricao())) {
                return x;
            }
        }

        System.out.println("Descrição inválida: " + descricao);
        return null;
    }
}

