package br.com.aula.faculdade.Core.Domain.Model.Pagamento;

import br.com.aula.faculdade.Core.Domain.Model.Enuns.EstadoPagamento.EstadoPagamento;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_pagamento")
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private EstadoPagamento estado;
    
    public Pagamento(Integer id, EstadoPagamento estado) {
        this.id = id;
        this.estado = estado;
    }

    public Pagamento() {
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public EstadoPagamento getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoPagamento estado) {
        this.estado = estado;
    }
}
