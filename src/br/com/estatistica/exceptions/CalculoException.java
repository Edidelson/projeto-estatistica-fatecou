/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.exceptions;

/**
 *
 * @author Edidelson
 */
public class CalculoException extends NumberFormatException{
    
    String MENSAGEM = "Ouve um erro no cálculo, verifique o valores correspondentes.";

    @Override
    public String getMessage() {
        return MENSAGEM;
    }
}
