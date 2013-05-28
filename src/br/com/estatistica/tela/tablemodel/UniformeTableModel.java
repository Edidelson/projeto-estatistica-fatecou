/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.tela.tablemodel;

import br.com.estatistica.modelo.Uniforme;
import br.com.util.Util;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class UniformeTableModel extends RowTableModel {

    {
        columns = new String[]{"Código", "A", "B", "Tentativas", "Condição", "Resultado", "Percentual"};
    }

    @Override
    public Uniforme getRow(int index) {
        return (Uniforme) cache.get(index);
    }

    @Override
    public List<Uniforme> getData() {
        return cache;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Uniforme uniforme = (Uniforme) cache.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return uniforme.getCodigo();
            case 1:
                return uniforme.getConstanteA();
            case 2:
                return uniforme.getConstanteB();
            case 3:
                return uniforme.getTentativa();
            case 4:
                return uniforme.getCondicao();
            case 5:
                return Util.formatarValores(8, new BigDecimal(uniforme.getResultado()));
            case 6:
                return uniforme.getPercentual() != null ? uniforme.getPercentual().doubleValue() : BigDecimal.ZERO.doubleValue();
            default:
                return "";
        }
    }

    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 0:
                return Integer.class;
            case 1:
                return Double.class;
            case 2:
                return Double.class;
            case 3:
                return Integer.class;
            case 4:
                return String.class;
            case 5:
                return Object.class;
            case 6:
                return Double.class;
            default:
                return null;
        }
    }
}
