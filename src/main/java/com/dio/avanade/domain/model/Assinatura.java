package com.dio.avanade.domain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "tb_assinatura")
public class Assinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tipo;

    private Date dataInicio;

    private Date dataFim;

    @OneToOne
    private Usuario usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Assinatura{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", usuario=" + usuario +
                '}';
    }
}
