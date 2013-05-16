/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.tela.tablemodel;

import br.com.estatistica.modelo.TabelaDistribuicaoNormal;
import br.com.util.Util;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Edidelson
 */
public class TabelaDistribuicaoNormalTableModel extends RowTableModel {

    {
        columns = new String[]{"Z", "0,00", "0,01", "0,02", "0,03", "0,04",
            "0,05", "0,06", "0,07", "0,08", "0,09"};
    }

    @Override
    public TabelaDistribuicaoNormal getRow(int index) {
        return (TabelaDistribuicaoNormal) cache.get(index);
    }

    @Override
    public List<TabelaDistribuicaoNormal> getData() {
        return cache;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TabelaDistribuicaoNormal tdn = (TabelaDistribuicaoNormal) cache.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tdn.getVerticalZ();
            case 1:
                return Util.NF_VALORES.format(tdn.getDecimalZ1().doubleValue());
            case 2:
                return Util.NF_VALORES.format(tdn.getDecimalZ2().doubleValue());
            case 3:
                return Util.NF_VALORES.format(tdn.getDecimalZ3().doubleValue());
            case 4:
                return Util.NF_VALORES.format(tdn.getDecimalZ4().doubleValue());
            case 5:
                return Util.NF_VALORES.format(tdn.getDecimalZ5().doubleValue());
            case 6:
                return Util.NF_VALORES.format(tdn.getDecimalZ6().doubleValue());
            case 7:
                return Util.NF_VALORES.format(tdn.getDecimalZ7().doubleValue());
            case 8:
                return Util.NF_VALORES.format(tdn.getDecimalZ8().doubleValue());
            case 9:
                return Util.NF_VALORES.format(tdn.getDecimalZ9().doubleValue());
            case 10:
                return Util.NF_VALORES.format(tdn.getDecimalZ10().doubleValue());
            default:
                return "";
        }
    }

    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 0:
                return String.class;
            case 1:
                return BigDecimal.class;
            case 2:
                return BigDecimal.class;
            case 3:
                return BigDecimal.class;
            case 4:
                return BigDecimal.class;
            case 5:
                return BigDecimal.class;
            case 6:
                return BigDecimal.class;
            case 7:
                return BigDecimal.class;
            case 8:
                return BigDecimal.class;
            case 9:
                return BigDecimal.class;
            case 10:
                return BigDecimal.class;
            default:
                return null;
        }
    }
}
