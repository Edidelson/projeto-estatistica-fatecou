/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.tela.tablemodel;

import br.com.estatistica.modelo.Normal;
import br.com.util.Util;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class NormalTableModel extends RowTableModel {

    {
        columns = new String[]{"Código", "A", "B", "Média", "Desvio Padrão", "Resultado", "Condição"};
    }

    @Override
    public Normal getRow(int index) {
        return (Normal) getRow(index);
    }

    @Override
    public List<Normal> getData() {
        return cache;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Normal normal = (Normal) cache.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return normal.getCodigo();
            case 1:
                return normal.getVariavelA().doubleValue();
            case 2:
                return normal.getVariavelB() != null ? normal.getVariavelB().doubleValue() : BigDecimal.ZERO;
            case 3:
                return normal.getMedia().doubleValue();
            case 4:
                return normal.getDesvioPadrao().doubleValue();
            case 5:
                return  Util.formatarValores(8, normal.getResultado());
            case 6:
                return normal.getCondicao();
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
                return Double.class;
            case 4:
                return Double.class;
            case 5:
                return Object.class;
            case 6:
                return String.class;
            default:
                return null;

        }
    }
}
