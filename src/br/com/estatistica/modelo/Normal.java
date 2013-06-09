/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Edidelson
 */
@Entity
@Table(name = "normal")
@NamedQueries({
    @NamedQuery(name = "Normal.getAll", query = "SELECT e FROM Normal e")
})
public class Normal implements Serializable, IModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cp_normal")
    private int codigo;
    @Column(name="vl_desvio_padrao")
    private Double desvioPadrao;
    @Column(name="vl_media")
    private Double media;
    @Column(name="vl_variavelA")
    private Double variavelA;
    @Column(name="vl_variavelB")
    private Double variavelB;
    @Column(name="vl_resultado")
    private BigDecimal resultado;
    @Column(name="condicao")
    @Enumerated(EnumType.STRING)
    private Condicao condicao;

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getVariavelB() {
        return variavelB;
    }

    public void setVariavelB(Double variavelB) {
        this.variavelB = variavelB;
    }

    public Double getDesvioPadrao() {
        return desvioPadrao;
    }

    public void setDesvioPadrao(Double desvioPadrao) {
        this.desvioPadrao = desvioPadrao;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getVariavelA() {
        return variavelA;
    }

    public void setVariavelA(Double veriavel) {
        this.variavelA = veriavel;
    }

    public BigDecimal getResultado() {
        return resultado;
    }

    public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
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
        ENTRE("Entre");
        
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
