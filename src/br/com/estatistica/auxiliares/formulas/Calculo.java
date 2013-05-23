/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.auxiliares.formulas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

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
  
}
