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
    
}
