/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.CompraprodutoGab;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class CompraProdutoControle extends AbstractTableModel {
    
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public CompraprodutoGab getBean(int row) {
        return (CompraprodutoGab) lista.get(row);
    }
    
    public  void  addBean (CompraprodutoGab compraProduto){
    lista.add(compraProduto);
    this.fireTableDataChanged();
    }

    public void removeBean (int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }

    public  void  updateBean (int index, CompraprodutoGab compraProduto){
    lista.set(index, compraProduto);
    this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lista != null ? lista.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       CompraprodutoGab compraprodutoGab = (CompraprodutoGab) lista.get(rowIndex);
        if (columnIndex == 0){
            return compraprodutoGab.getIdcompraProdutoGab();
        }
        if (columnIndex == 1){
            return compraprodutoGab.getQuantidadeGab();
        }
        if (columnIndex == 2){
            return compraprodutoGab.getProdutoGab();
        }
        if (columnIndex == 3){
            return compraprodutoGab.getValorUnitario();
        }
        return "";
    }
    @Override
    public String getColumnName (int column){
        if (column == 0){
            return "Id";
        }
        if (column == 1){
            return "Quantidade";
        }
        if (column == 2){
            return "Produto";
        }
        if (column == 3){
            return "Valor Unitario";
        }
         return "";
    } 
}
