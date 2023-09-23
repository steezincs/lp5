/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.UsuariosGab;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u71665822198
 */
public class UsuariosControle_gab extends AbstractTableModel {
    
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }
    
    public UsuariosGab getBean(int row) {
        return (UsuariosGab) lista.get(row);
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
       UsuariosGab usuariosgab = (UsuariosGab) lista.get(rowIndex);
        if (columnIndex == 0){
            return usuariosgab.getIdUsuariosGab();
        }
        if (columnIndex == 1){
            return usuariosgab.getNomeGab();
        }
        if (columnIndex == 2){
            return usuariosgab.getApelidoGab();
        }
        if (columnIndex == 3){
            return usuariosgab.getCpfGab();
        }
        if (columnIndex == 4){
            return usuariosgab.getSenhaGab();
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
            return "Apelido";
        }
        if (column == 3){
            return "CPF";
        }
        if (column == 4){
            return "Senha";
        }
         return "";
    } 
}
