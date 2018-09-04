/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
class CategoriaTableModel extends DefaultTableModel{

    public CategoriaTableModel() {
        addColumn("Código");
        addColumn("Descrição");
    }
    public boolean isCellEditable(int row, int collum){
        return false;
    }
}
