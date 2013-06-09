/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.modelo;

import br.com.estatistica.tela.calculo.Bernoulli;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
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
 * @author Edidelson
 */
@Entity
@Table(name = "binomial")
@NamedQueries({
    @NamedQuery(name = "Binomial.getAll", query = "SELECT e FROM Binomial e")
})
public class Binomial implements Serializable, IModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cp_binomial")
    private int codigo;
    @Column(name = "vl_elementos")
    private int nuElementos;
    @Column(name = "vl_tentativas")
    private int tentativas;
    @Column(name = "vl_probabilidade")
    private Double probabilidade;
    @Column(name = "tx_condicao")
    @Enumerated(EnumType.STRING)
    private Condicao condicao;
    @Column(name="vl_resultado")
    private Double resultado;
    @Column(name="vl_percentual")
    private Double percentual;
    @Embedded
    private Bernoulli bernoulli;

    public Bernoulli getBernoulli() {
        return bernoulli;
    }

    public void setBernoulli(Bernoulli bernoulli) {
        this.bernoulli = bernoulli;
    }
    
    @Override
    public Object getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNuElementos() {
        return nuElementos;
    }

    public void setNuElementos(int nuElementos) {
        this.nuElementos = nuElementos;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public Double getProbabilidade() {
        return probabilidade;
    }

    public void setProbabilidade(Double probabilidade) {
        this.probabilidade = probabilidade;
    }

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
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
