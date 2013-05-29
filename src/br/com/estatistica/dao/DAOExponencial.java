/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.dao;

import br.com.estatistica.modelo.Exponencial;
import br.com.estatistica.modelo.IModelo;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class DAOExponencial extends DAOGenerico{

    @Override
    public Exponencial consultar(int codigo) {
        return (Exponencial) consultar(codigo);
    }

    @Override
    public Exponencial consultar(int codigo, boolean comInativo) {
        return (Exponencial) super.consultar(Exponencial.class, codigo, comInativo);
    }

    @Override
    public <T extends IModelo> T consultarCodigo(String codigo, boolean comInativo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Exponencial> getLista() {
        return super.getLista("Exponencial.getAll");
    }
    
}
