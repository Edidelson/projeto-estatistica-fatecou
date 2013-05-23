/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.auxiliares.formulas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Random;

/**
 *
 * @author Edidelson
 */
public class Calculo implements IFormulas {

    private int fx;

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
    public BigDecimal densidade(BigDecimal a, BigDecimal b) {
            BigDecimal dens = BigDecimal.ONE.divide(b, MathContext.DECIMAL128); 
            return dens;
    }

    @Override
    public double intervaloUniforme(int a, int b, double x) {
        double inter = (b - a) * fx;
        return inter;
    }

    public static void main(String[] args) {
        Calculo c = new Calculo();
        System.out.println(c.densidade(BigDecimal.ZERO, BigDecimal.valueOf(120))); 
    }
}
