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
    BigDecimal exponencialMenor(double media, double x);
    BigDecimal exponencialMaior(double media, double x);
    BigDecimal exponencialIgual(double media, double x);
    BigDecimal normal(BigDecimal x, BigDecimal media, BigDecimal desvioPadrao);
    BigDecimal densidade(BigDecimal intervalorInicial, BigDecimal intervalorFinal);
    double intervaloUniformeMaior(BigDecimal intervalorInicial, BigDecimal intervalorFinal, BigDecimal condicao);
    double intervaloUniformeMenor(BigDecimal intervalorInicial, BigDecimal intervalorFinal, BigDecimal condicao);
    double intervaloUniformeEntre(BigDecimal intervalorInicial, BigDecimal intervalorFinal, BigDecimal condicao, BigDecimal densidade);
    BigDecimal valorTabelaDistribuicaoNormal(double x, double ro, double  media);
}
