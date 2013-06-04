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
import javax.persistence.Table;

/**
 *
 * @author Edidelson
 */
@Entity
@Table(name="exponencial")
@NamedQueries({
    @NamedQuery(name="Exponencial.getAll", query="SELECT e FROM Exponencial e ")
    })
public class Exponencial implements Serializable, IModelo{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="cp_exponencial")
    private int codigo;
    @Column(name="vl_media")
    private Double media;
    @Column(name="vl_variavelA")
    private Double variavelA;
    @Column(name="vl_variavelB")
    private Double variavelB;
    @Column(name="tx_condicao")
    @Enumerated(EnumType.STRING)
    private Condicao condicao;
    @Column(name="vl_resultado")
    private Double resultado;
    @Column(name="vl_variancia")
    private Double variancia;
    @Column(name="vl_percentual")
    private Double percentual;

    public Double getVariancia() {
        return variancia;
    }

    public void setVariancia(Double variancia) {
        this.variancia = variancia;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
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

    public void setVariavelA(Double variavelA) {
        this.variavelA = variavelA;
    }

    public Double getVariavelB() {
        return variavelB;
    }

    public void setVariavelB(Double variavelB) {
        this.variavelB = variavelB;
    }

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
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
