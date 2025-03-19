package com.dio.avanade.domain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "tb_pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Float valor;

    private Date dataPagamento;

    @ManyToOne
    private Usuario usuario;

    private Boolean pago;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", valor=" + valor +
                ", dataPagamento=" + dataPagamento +
                ", usuario=" + usuario +
                ", pago=" + pago +
                '}';
    }
}
