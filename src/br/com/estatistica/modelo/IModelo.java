package br.com.estatistica.modelo;

import java.io.Serializable;

/**
 *
 * @author Edidelson
 */
public interface IModelo extends Serializable{

    public Object getCodigo();
    public boolean isInativo();

}