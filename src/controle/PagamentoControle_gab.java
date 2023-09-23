/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.PagamentoGab;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
     */
public class PagamentoControle_gab extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public PagamentoGab getBean(int row) {
        return (PagamentoGab) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        PagamentoGab pagamentoGab = (PagamentoGab) lista.get(row);
        if (column == 0) {
           return pagamentoGab.getIdPagamentoGab();
        } 
        if (column == 1) {
           return pagamentoGab.getParcelasGab();
        }
        if (column == 2) {
           return pagamentoGab.getValorGab();
        }
        if (column == 3) {
           return pagamentoGab.getFormaPagamento();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Parcelas";
        }
        if (column == 2) {
            return "Valor";
        }
        if (column == 3) {
            return "Forma de Pagamento";
        }
        return "";
    }
}
