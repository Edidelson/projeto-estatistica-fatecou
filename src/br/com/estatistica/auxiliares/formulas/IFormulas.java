/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.auxiliares.formulas;

/**
 *
 * @author Edidelson
 */
public interface IFormulas {
 
    int fatorial(int x);
    
    double Px(int x, double k);
    
    double binomial (int n, int x, int k, double p);
}
