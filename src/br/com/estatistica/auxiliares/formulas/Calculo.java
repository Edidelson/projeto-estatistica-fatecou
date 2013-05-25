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

    @Override
    public BigInteger fatorial(int x) {
        long fat = 1;
        for (int i = 1; i <= x; i++) {
            fat *= i;
        }
        return BigInteger.valueOf(fat);
    }

    @Override
    public double Px(int x, double k) {
        double e = StrictMath.E;
        double fatorial = fatorial(x).doubleValue();
        double px = (Math.pow(e, -k) * Math.pow(k, x)) / fatorial;
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
    public double intervaloUniformeMaior(BigDecimal intervalorInicial,BigDecimal intervalorFinal, BigDecimal condicao) {
        BigDecimal inter = intervalorFinal.subtract(condicao) 
                .multiply(densidade(intervalorFinal, intervalorInicial), MathContext.DECIMAL64);
        return inter.doubleValue();
    }

    @Override
    public double intervaloUniformeMenor(BigDecimal intervalorInicial, BigDecimal intervalorFinal, BigDecimal condicao) {
        BigDecimal inter = condicao.subtract(intervalorInicial) 
                .multiply(densidade(intervalorFinal, intervalorInicial), MathContext.DECIMAL64);
        return inter.doubleValue();
    }

    @Override
    public double intervaloUniformeEntre(BigDecimal intervalorInicial, BigDecimal intervalorFinal, BigDecimal condicao,BigDecimal  densidade) {
        BigDecimal inter = intervalorFinal.subtract(intervalorInicial) 
                .multiply(densidade, MathContext.DECIMAL64); 
        return inter.doubleValue();
    }
    
}
