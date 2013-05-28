/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.tela.tablemodel;

import br.com.estatistica.modelo.IModelo;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class TableModel extends RowTableModel{

    @Override
    public IModelo getRow(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<?> getData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Class getColumnClass(int col) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
