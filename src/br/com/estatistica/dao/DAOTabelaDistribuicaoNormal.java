/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.dao;

import br.com.estatistica.modelo.IModelo;
import br.com.estatistica.modelo.TabelaDistribuicaoNormal;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class DAOTabelaDistribuicaoNormal extends DAOGenerico{

    @Override
    public TabelaDistribuicaoNormal consultar(int codigo) {
        return consultar(codigo,false);
    }

    @Override
    public TabelaDistribuicaoNormal consultar(int codigo, boolean comInativo) {
        return (TabelaDistribuicaoNormal) super.consultar(TabelaDistribuicaoNormal.class, codigo, comInativo);
    }

    @Override
    public <T extends IModelo> T consultarCodigo(String codigo, boolean comInativo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<TabelaDistribuicaoNormal> getLista() {
        return super.getLista("TabelaDistribuicaoNormal.findAll");
    }
}
