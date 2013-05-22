/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.tela.tablemodel;

import br.com.estatistica.modelo.Poisson;
import br.com.util.Util;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class PoissonTableModel extends RowTableModel {

    {
        columns = new String[]{"Código", "Tentativas", "Média", "Condição", "Resultado"};
    }

    @Override
    public Poisson getRow(int index) {
        return (Poisson) cache.get(index);
    }

    @Override
    public List<Poisson> getData() {
        return cache;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Poisson poisson = (Poisson) cache.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return poisson.getCodigo();
            case 1:
                return poisson.getTentativas();
            case 2:
                return poisson.getMedia();
            case 3:
                return poisson.getCondicao();
            case 4:
                return Util.formatarValores(8, new BigDecimal(poisson.getResultado()));
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
                return Integer.class;
            case 2:
                return Double.class;
            case 3:
                return String.class;
            case 4:
                return Object.class;
            default:
                return null;
        }
    }
}
