/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.tela.tablemodel;

import br.com.estatistica.modelo.Binomial;
import br.com.util.Util;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class BinomialTableModel extends RowTableModel {

    {
        columns = new String[]{"Código", "Número de Elementos", "Número de Tentativas",
            "Probabilidade", "Condição", "Resultado"};
    }

    @Override
    public Binomial getRow(int index) {
        return (Binomial) cache.get(index);
    }

    @Override
    public List<Binomial> getData() {
        return cache;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Binomial binomial = (Binomial) cache.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return binomial.getCodigo();
            case 1:
                return binomial.getNuElementos();
            case 2:
                return binomial.getTentativas();
            case 3:
                return binomial.getProbabilidade();
            case 4:
                return binomial.getCondicao();
            case 5:
                return Util.formatarValores(8, new BigDecimal(binomial.getResultado()));
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
                return Integer.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            case 5:
                return Object.class;
            default:
                return null;
        }
    }
}
