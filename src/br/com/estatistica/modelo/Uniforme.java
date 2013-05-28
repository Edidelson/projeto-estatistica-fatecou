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
 * @author Rodrigo
 */
@Entity
@Table(name = "uniforme")
@NamedQueries({
    @NamedQuery(name = "Uniforme.getAll", query = "SELECT e FROM Uniforme e")
})
public class Uniforme implements Serializable, IModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cp_uniforme")
    private int codigo;
    @Column(name = "vl_constanteA")
    private double constanteA;
    @Column(name = "vl_constanteB")
    private double constanteB;
    @Column(name = "vl_tentativa")
    private int tentativa;
    @Column(name = "tx_condicao")
    @Enumerated(EnumType.STRING)
    private Condicao condicao;
    @Column(name = "vl_resultado")
    private Double resultado;
    @Column(name = "vl_percentual")
    private Double percentual;
    @Column(name="vl_subA")
    private Double subA;
    @Column(name="vl_subB")
    private Double subB;
    @Column(name="vl_media")
    private Double media;
    @Column(name="vl_desvio_padrao")
    private Double desvioPadrao;
    @Column(name="vl_variancia")
    private Double variancia;
    @Column(name="vl_coeficiente_var")
    private Double coeficienteVar;

    public Double getSubA() {
        return subA;
    }

    public void setSubA(Double subA) {
        this.subA = subA;
    }

    public Double getSubB() {
        return subB;
    }

    public void setSubB(Double subB) {
        this.subB = subB;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getDesvioPadrao() {
        return desvioPadrao;
    }

    public void setDesvioPadrao(Double desvioPadrao) {
        this.desvioPadrao = desvioPadrao;
    }

    public Double getVariancia() {
        return variancia;
    }

    public void setVariancia(Double variancia) {
        this.variancia = variancia;
    }

    public Double getCoeficienteVar() {
        return coeficienteVar;
    }

    public void setCoeficienteVar(Double coeficienteVar) {
        this.coeficienteVar = coeficienteVar;
    }
    
    @Override
    public Object getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getConstanteA() {
        return constanteA;
    }

    public void setConstanteA(double constanteA) {
        this.constanteA = constanteA;
    }

    public double getConstanteB() {
        return constanteB;
    }

    public void setConstanteB(double constanteB) {
        this.constanteB = constanteB;
    }

    public int getTentativa() {
        return tentativa;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }

    @Override
    public boolean isInativo() {
        return false;
    }

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
    }

    public static enum Condicao {

        MAIOR("Maior"),
        MENOR("Menor"),
        MAIOR_E_IGUAL("Maior e igual"),
        MENOR_E_IGUAL("Menor e igual"),
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
}
