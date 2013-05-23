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

    double Px(int x, double k);

    double binomial(int n, int k, double p);
    
    BigDecimal densidade (BigDecimal a, BigDecimal b);
    
    double intervaloUniforme (int a, int b, double p);
}
