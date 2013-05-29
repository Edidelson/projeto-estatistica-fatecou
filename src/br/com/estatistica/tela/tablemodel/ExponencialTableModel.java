/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.tela.tablemodel;

import br.com.estatistica.modelo.Exponencial;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class ExponencialTableModel extends RowTableModel {

    {
        columns = new String[]{"Código", "Média", "A", "B", "Probabilidade", "Condição", "Resultado"};
    }

    @Override
    public Exponencial getRow(int index) {
        return (Exponencial) cache.get(index);
    }

    @Override
    public List<Exponencial> getData() {
        return cache;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Exponencial exponencial = (Exponencial) cache.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return exponencial.getCodigo();
            case 1:
                return exponencial.getMedia().doubleValue();
            case 2:
                return exponencial.getVariavelA().doubleValue();
            case 3:
                return exponencial.getVariavelB().doubleValue();
            case 4:
                return exponencial.getProbabilidade().doubleValue();
            case 5:
                return exponencial.getCondicao();
            case 6:
                return exponencial.getResultado().doubleValue();
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
                return String.class;
            case 6:
                return Double.class;
            default:
                return null;
        }
    }
}
