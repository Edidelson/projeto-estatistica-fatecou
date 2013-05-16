/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.tela.generico;

import br.com.estatistica.dao.IDAOGenerico;
import com.zap.arca.JATable;

/**
 *
 * @author Edidelson
 */
public interface IFuncionalidades {
    
    public void exibirDados(IDAOGenerico dao, JATable table);
}
