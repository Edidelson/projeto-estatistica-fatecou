/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.dao;

import br.com.estatistica.modelo.IModelo;
import br.com.estatistica.modelo.Uniforme;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class DAOUniforme extends DAOGenerico{

    @Override
    public Uniforme consultar(int codigo) {
        return consultar(codigo);
    }

    @Override
    public Uniforme consultar(int codigo, boolean comInativo) {
        return (Uniforme) super.consultar(Uniforme.class, codigo, comInativo);
    }

    @Override
    public <T extends IModelo> T consultarCodigo(String codigo, boolean comInativo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Uniforme> getLista() {
        return super.getLista("Uniforme.getAll");
    }
    
}
