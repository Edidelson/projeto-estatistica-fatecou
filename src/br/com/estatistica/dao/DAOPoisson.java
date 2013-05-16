/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.dao;

import br.com.estatistica.modelo.IModelo;
import br.com.estatistica.modelo.Poisson;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class DAOPoisson extends DAOGenerico {

    @Override
    public Poisson consultar(int codigo) {
        return consultar(codigo);
    }

    @Override
    public <T extends IModelo> T consultar(int codigo, boolean comInativo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T extends IModelo> T consultarCodigo(String codigo, boolean comInativo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Poisson> getLista() {
        return super.getLista("Poisson.getAll");
    }
}
