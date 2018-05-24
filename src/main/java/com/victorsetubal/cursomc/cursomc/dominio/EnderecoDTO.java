package com.victorsetubal.cursomc.cursomc.dominio;

import java.io.Serializable;

/**
 * Created by victorcardoso on 23/05/18.
 */
public class EnderecoDTO implements Serializable {

    private String nomeCidade;
    private String nomeEstado;
    private String logradouro;


    public EnderecoDTO() {
    }

    public EnderecoDTO(String nomeCidade, String nomeEstado, String logradouro) {
        this.nomeCidade = nomeCidade;
        this.nomeEstado = nomeEstado;
        this.logradouro = logradouro;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
