/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.CompraGab;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u71665822198
 */
public class CompraControle_gab extends AbstractTableModel {
    
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }
    
    public CompraGab getBean(int row) {
        return (CompraGab) lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       CompraGab compragab = (CompraGab) lista.get(rowIndex);
        if (columnIndex == 0){
            return compragab.getIdCompraGab();
        }
        if (columnIndex == 1){
            return compragab.getNomeProdutoGab();
        }
        if (columnIndex == 2){
            return compragab.getValorGab();
        }
        if (columnIndex == 3){
            return compragab.getDataGab();
        }
        if (columnIndex == 4){
            return compragab.getFornecedorGab();
        }
        return "";
    }
    @Override
    public String getColumnName (int column){
        if (column == 0){
            return "Id";
        }
        if (column == 1){
            return "Nome do Produto";
        }
        if (column == 2){
            return "Valor";
        }
        if (column == 3){
            return "Data";
        }
        if (column == 4){
            return "Fornecedor";
        }
         return "";
    } 
}
