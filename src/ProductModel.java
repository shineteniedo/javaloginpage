
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rose ann bahala
 */
public class ProductModel {
public DefaultTableModel ProModel= new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Product ID","Variety", "Regular Price", "Fixed Price", "Total ROI", "Quantity Purchased", "Total Quantity"
    }
){
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
}; 
}
