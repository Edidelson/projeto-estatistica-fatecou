/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.auxiliares.formulas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 *
 * @author Edidelson
 */
public class Calculo implements IFormulas {

    double e = StrictMath.E;
    double pi = StrictMath.PI;

    @Override
    public BigInteger fatorial(int num) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    @Override
    public BigDecimal Px(int x, double media) {
        BigDecimal fatorial = new BigDecimal(fatorial(x), MathContext.DECIMAL128);
        BigDecimal px = new BigDecimal(Math.pow(e, -media) * Math.pow(media, x)).divide(fatorial, MathContext.DECIMAL128);
        return px;
    }

    @Override
    public double binomial(int n, int k, double p) {
        BigDecimal combinacao = new BigDecimal((fatorial(n).divide((fatorial(k)).multiply(fatorial(n - k)))));
        BigDecimal calc = new BigDecimal(Math.pow(p, k) * Math.pow(1 - p, n - k));
        double bin = combinacao.multiply(calc).doubleValue();
        return bin;
    }

    @Override
    public BigDecimal densidade(BigDecimal intervalorInicial, BigDecimal intervalorFinal) {
        BigDecimal dens = BigDecimal.ONE.divide(intervalorFinal.subtract(intervalorInicial), MathContext.DECIMAL128);
        return dens;
    }

    @Override
    public BigDecimal intervaloUniformeMaior(BigDecimal intervalorInicial, BigDecimal intervalorFinal, BigDecimal condicao) {
        BigDecimal inter = intervalorFinal.subtract(condicao)
                .multiply(densidade(intervalorInicial, intervalorFinal), MathContext.DECIMAL64);
        return inter;
    }

    @Override
    public BigDecimal intervaloUniformeMenor(BigDecimal intervalorInicial, BigDecimal intervalorFinal, BigDecimal condicao) {
        BigDecimal inter = condicao.subtract(intervalorInicial)
                .multiply(densidade(intervalorInicial, intervalorFinal), MathContext.DECIMAL64);
        return inter;
    }

    @Override
    public BigDecimal intervaloUniformeEntre(BigDecimal intervalorInicial, BigDecimal intervalorFinal, BigDecimal densidade) {
        BigDecimal inter = intervalorFinal.subtract(intervalorInicial)
                .multiply(densidade, MathContext.DECIMAL64);
        return inter;
    }

    @Override
    public BigDecimal exponencialMenor(double media, double x) {
        double valor = Math.pow(e, -(x / media));
        return BigDecimal.ONE.subtract(new BigDecimal(valor), MathContext.DECIMAL128);
    }

    @Override
    public BigDecimal exponencialMaior(double media, double x) {
        double valor = Math.pow(e, -(x / media));
        return new BigDecimal(valor, MathContext.DECIMAL128);
    }

    @Override
    public BigDecimal exponencialIgual(double media, double x) {
        double valor = Math.pow(e, -(x / media));
        return BigDecimal.ONE
                .divide(new BigDecimal(media, MathContext.DECIMAL128))
                .multiply(new BigDecimal(valor, MathContext.DECIMAL128));
    }

    @Override
    public BigDecimal normal(BigDecimal x, BigDecimal media, BigDecimal desvioPadrao) {
        return x.subtract(media, MathContext.DECIMAL128).divide(desvioPadrao, MathContext.DECIMAL128);
    }

    @Override
    public BigDecimal valorTabelaDistribuicaoNormal(double x, double ro, double media) {
        double primeiraParte = 1 / Math.sqrt(2 * pi * Math.pow(ro, 2));
        double resultado = Math.pow(primeiraParte, -(1 / 2 * Math.pow(ro, 2)) * Math.pow(x - media, 2));
        return new BigDecimal(resultado);
    }
    
    @Override
    public BigDecimal media(BigDecimal inicial, BigDecimal valorFinal){
        return inicial.add(valorFinal).divide(new BigDecimal(2), MathContext.DECIMAL64);
    }

    @Override
    public BigDecimal variancia(BigDecimal inicial, BigDecimal valorFinal) {
        BigDecimal var = valorFinal.subtract(inicial);
        return var.pow(2).divide(new BigDecimal(12), MathContext.DECIMAL64); 
    }
}