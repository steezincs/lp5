/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.FornecedorGab;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u71665822198
 */
public class FornecedorControle_gab extends AbstractTableModel {
    
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public FornecedorGab getBean(int row) {
        return (FornecedorGab) lista.get(row);
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
       FornecedorGab fornecedorgab = (FornecedorGab) lista.get(rowIndex);
        if (columnIndex == 0){
            return fornecedorgab.getIdFornecedorGab();
        }
        if (columnIndex == 1){
            return fornecedorgab.getNomeGab();
        }
        if (columnIndex == 2){
            return fornecedorgab.getEmailGab();
        }
        if (columnIndex == 3){
            return fornecedorgab.getDataCadastroGab();
        }
        if (columnIndex == 4){
            return fornecedorgab.getTelefoneGab();
        }
        return "";
    }
    @Override
    public String getColumnName (int column){
        if (column == 0){
            return "Id";
        }
        if (column == 1){
            return "Nome";
        }
        if (column == 2){
            return "Email";
        }
        if (column == 3){
            return "Data Cadastro";
        }
        if (column == 4){
            return "Telefone";
        }
         return "";
    } 
}
