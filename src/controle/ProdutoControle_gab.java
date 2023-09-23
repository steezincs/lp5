/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.ProdutoGab;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
     */
public class ProdutoControle_gab extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public ProdutoGab getBean(int row) {
        return (ProdutoGab) lista.get(row);
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
        ProdutoGab produtogab = (ProdutoGab) lista.get(row);
        if (column == 0) {
           return produtogab.getIdProdutoGab();
        } 
        if (column == 1) {
           return produtogab.getNomeGab();
        } 
        if (column == 2) {
           return produtogab.getValorGab();
        }
        if (column == 3) {
           return produtogab.getTamanhoGab();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Valor";
        }
        if (column == 3) {
            return "Tamanho";
        }
        return "";
    }
}
