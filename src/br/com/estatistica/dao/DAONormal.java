/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.dao;

import br.com.estatistica.modelo.IModelo;
import br.com.estatistica.modelo.Normal;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class DAONormal extends DAOGenerico{

    @Override
    public Normal consultar(int codigo) {
        return consultar(codigo);
    }

    @Override
    public Normal consultar(int codigo, boolean comInativo) {
        return (Normal) super.consultar(Normal.class, codigo, comInativo);
    }

    @Override
    public <T extends IModelo> T consultarCodigo(String codigo, boolean comInativo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Normal> getLista() {
        return super.getLista("Normal.getAll");
    }
    
}
