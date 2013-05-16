/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.dao;

import br.com.estatistica.modelo.Binomial;
import br.com.estatistica.modelo.IModelo;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class DAOBinomial extends DAOGenerico{

    @Override
    public Binomial consultar(int codigo) {
        return consultar(codigo);
    }

    @Override
    public Binomial consultar(int codigo, boolean comInativo) {
        return (Binomial) super.consultar(Binomial.class, codigo, comInativo);
    }

    @Override
    public <T extends IModelo> T consultarCodigo(String codigo, boolean comInativo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Binomial> getLista() {
        return super.getLista("Binomial.getAll");
    }
    
}
