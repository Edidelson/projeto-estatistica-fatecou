/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.auxiliares.formulas;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Edidelson
 */
public interface IFormulas {

    BigInteger fatorial(int x);
    BigDecimal Px(int x, double k);
    double binomial(int n, int k, double p);
    BigDecimal exponencialMenor(BigDecimal media, BigDecimal x);
    BigDecimal exponencialMaior(BigDecimal media, BigDecimal x);
    BigDecimal exponencialIgual(double media, double x);
    BigDecimal normal(BigDecimal x, BigDecimal media, BigDecimal desvioPadrao);
    BigDecimal densidade(BigDecimal intervalorInicial, BigDecimal intervalorFinal);
    BigDecimal intervaloUniformeMaior(BigDecimal intervalorInicial,BigDecimal intervalorFinal, BigDecimal condicao);
    BigDecimal intervaloUniformeMenor(BigDecimal intervalorInicial, BigDecimal intervalorFinal, BigDecimal condicao);
    BigDecimal intervaloUniformeEntre(BigDecimal intervalorInicial, BigDecimal intervalorFinal, BigDecimal densidade);
    BigDecimal valorTabelaDistribuicaoNormal(double x, double ro, double  media);
    BigDecimal media(BigDecimal inicial, BigDecimal valorFinal);
    BigDecimal variancia(BigDecimal inicial, BigDecimal valorFinal);
    
}
