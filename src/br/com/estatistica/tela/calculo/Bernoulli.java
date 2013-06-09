/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.tela.calculo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Edidelson
 */
@Embeddable
public class Bernoulli implements Serializable{
    
    @Column(name="vl_prob_bernoulli")
    private Double probBernoulli;
    @Column(name="vl_res_bernoulli")
    private Double resBernoulli;
    @Column(name="vl_va_bernoulli")
    private Double vaBernoulli;
    @Column(name="vl_variavelX")
    private Double variavelX;
    @Column(name="vl_variavelQ")
    private Double variavelQ;

    public Double getProbBernoulli() {
        return probBernoulli;
    }

    public void setProbBernoulli(Double probBernoulli) {
        this.probBernoulli = probBernoulli;
    }

    public Double getResBernoulli() {
        return resBernoulli;
    }

    public void setResBernoulli(Double resBernoulli) {
        this.resBernoulli = resBernoulli;
    }

    public Double getVaBernoulli() {
        return vaBernoulli;
    }

    public void setVaBernoulli(Double vaBernoulli) {
        this.vaBernoulli = vaBernoulli;
    }

    public Double getVariavelX() {
        return variavelX;
    }

    public void setVariavelX(Double variavelX) {
        this.variavelX = variavelX;
    }

    public Double getVariavelQ() {
        return variavelQ;
    }

    public void setVariavelQ(Double variavelQ) {
        this.variavelQ = variavelQ;
    }
}
