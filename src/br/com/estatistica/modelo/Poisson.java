/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Edidelson
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Poisson.getAll", query = "SELECT e FROM Poisson e")
})
public class Poisson implements Serializable, IModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cp_poisson")
    private int codigo;
    @Column(name = "nu_tentativas")
    private Integer tentativas;
    @Column(name = "tx_condicao")
    @Enumerated(EnumType.STRING)
    private Condicao condicao;
    @Column(name = "vl_media")
    private Double media;
    @Column(name = "vl_resultado")
    private Double resultado;
    @Column(name = "vl_percentual")
    private Double percentual;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Integer getTentativas() {
        return tentativas;
    }

    public void setTentativas(Integer tentativas) {
        this.tentativas = tentativas;
    }

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    @Override
    public Object getCodigo() {
        return codigo;
    }

    @Override
    public boolean isInativo() {
        return false;
    }

    public static enum Condicao {

        MAIOR("Maior"),
        MENOR("Menor"),
        MAIOR_E_IGUAL("Maior e igual"),
        MENOR_E_IGUAL("Menor e igual"),
        IGUAL("Igual");
        private String nome;

        private Condicao() {
        }

        private Condicao(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return nome;
        }
    }
}
