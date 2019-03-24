
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
public class CustomerModel {
public DefaultTableModel CustModel= new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Customer ID","First name", "Lasst name", "Location" ,"City","Cash", "Additional Type", "Additional cost", "Total"
    }
){
    boolean[] canEdit = new boolean [] {
        false, false, false, false,false, false, false, false,false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
}; 
}
