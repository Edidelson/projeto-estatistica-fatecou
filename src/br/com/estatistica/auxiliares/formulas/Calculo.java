/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.auxiliares.formulas;

/**
 *
 * @author Edidelson
 */
public class Calculo implements IFormulas {

    @Override
    public int fatorial(int x) {
        int fat = 1;
        for (int i = 1; i <= x; i++) {
            fat *= i;
        }
        return fat;
    }
    
    @Override
    public double Px(int x, double k) {
        double e = 2.718281828459045235360287;

        double px = (Math.pow(e, -k) * Math.pow(k, x)) / fatorial(x);
        return px;
    }
    
    @Override
    public double binomial (int n, int x, int k, double p){
        
        double bin = (double) (((fatorial(n)/ fatorial(k)) * fatorial(n-k))*(Math.pow(p,k) * Math.pow(1-p,n-k)));
        return bin;
    }
    
}

