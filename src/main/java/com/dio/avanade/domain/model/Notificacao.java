package com.dio.avanade.domain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "tb_notificacao")
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String mensagem;

    private Date dataEnvio;

    @OneToOne
    private Usuario usuario;

    private Boolean lido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Boolean getLido() {
        return lido;
    }

    public void setLido(Boolean lido) {
        this.lido = lido;
    }

    @Override
    public String toString() {
        return "Notificacao{" +
                "id=" + id +
                ", mensagem='" + mensagem + '\'' +
                ", dataEnvio=" + dataEnvio +
                ", usuario=" + usuario +
                ", lido=" + lido +
                '}';
    }
}
