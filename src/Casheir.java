
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
public class Casheir extends javax.swing.JFrame {

    /**
     * Creates new form Casheir
     */
    public Casheir() {
        initComponents();
        this.setLocationRelativeTo(null);
        showDate();
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        date1.setText(s.format(d));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        HOME = new javax.swing.JButton();
        LOGOUT = new javax.swing.JButton();
        MILL = new javax.swing.JButton();
        SELL = new javax.swing.JButton();
        date1 = new javax.swing.JLabel();
        rrr = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        sell = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_customer = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_product = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lpro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lquant = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        llocat = new javax.swing.JTextField();
        lcity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        mill = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        jLabel17.setText("jLabel17");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1062, 90));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 107));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 107));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOME.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HOME.setText("Home");
        HOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOMEMouseClicked(evt);
            }
        });
        HOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMEActionPerformed(evt);
            }
        });
        HOME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HOMEKeyPressed(evt);
            }
        });
        jPanel1.add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 30));

        LOGOUT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LOGOUT.setText("Log Out");
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });
        LOGOUT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LOGOUTKeyPressed(evt);
            }
        });
        jPanel1.add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 150, 30));

        MILL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MILL.setText("Mill");
        MILL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MILLMouseClicked(evt);
            }
        });
        MILL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MILLActionPerformed(evt);
            }
        });
        MILL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MILLKeyPressed(evt);
            }
        });
        jPanel1.add(MILL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 30));

        SELL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SELL.setText("Sell");
        SELL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SELLMouseClicked(evt);
            }
        });
        SELL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELLActionPerformed(evt);
            }
        });
        SELL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SELLKeyPressed(evt);
            }
        });
        jPanel1.add(SELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 30));

        date1.setForeground(new java.awt.Color(255, 255, 153));
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jSplitPane1.setLeftComponent(jPanel1);

        rrr.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(0, 0, 0));
        home.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                homeKeyPressed(evt);
            }
        });
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AYALA RICE MILL");
        home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HI  !!!");
        home.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("WELCOME");
        home.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TO");
        home.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));
        home.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1060, 30));

        rrr.add(home, "card2");

        sell.setBackground(new java.awt.Color(153, 153, 0));
        sell.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchase ID", "Name", "Location", "City", "Quantity", "Total", "Cash", "Product ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab_customer);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1020, 220));

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Payment History");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        sell.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1040, 270));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Variety", "Price", "Quantiity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tab_product);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 570, 310));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Products List");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, -1));

        sell.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 360));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lproActionPerformed(evt);
            }
        });
        lpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lproKeyPressed(evt);
            }
        });
        jPanel5.add(lpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 170, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Product:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Quantity:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));
        jPanel5.add(lquant, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 170, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50" }));
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("/Kilos");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 120, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("/Sacks");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 120, -1));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnameKeyPressed(evt);
            }
        });
        jPanel5.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 230, -1));
        jPanel5.add(llocat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 230, -1));
        jPanel5.add(lcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 230, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("City:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Location:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Name:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cash:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, -1));
        jPanel5.add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 140, -1));

        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 130, 30));

        jButton5.setText("Purchase");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 130, 30));

        sell.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 440, 360));

        rrr.add(sell, "card5");

        mill.setBackground(new java.awt.Color(0, 0, 0));
        mill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Contact:");
        mill.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 80, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mill.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 900, 280));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Customer Name:");
        mill.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Location:");
        mill.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));
        mill.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 210, -1));
        mill.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 210, -1));
        mill.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 210, -1));

        rrr.add(mill, "card6");

        jSplitPane1.setRightComponent(rrr);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
         home();
    }//GEN-LAST:event_HOMEActionPerformed

    private void HOMEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HOMEKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
      home();}
    }//GEN-LAST:event_HOMEKeyPressed

    private void MILLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MILLKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       mill();
       }
    }//GEN-LAST:event_MILLKeyPressed

    private void LOGOUTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LOGOUTKeyPressed
        this.dispose();
        new first ().setVisible(true);
    }//GEN-LAST:event_LOGOUTKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        lname.setText(" ");
        llocat.setText(" ");
        lcity.setText(" ");
        lquant.setText(" ");
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void SELLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELLActionPerformed
       sell();
    }//GEN-LAST:event_SELLActionPerformed

    private void SELLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SELLKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       sell();
       }
    }//GEN-LAST:event_SELLKeyPressed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
        this.dispose();
        new first().setVisible(true);
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void homeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           home();
       }
    }//GEN-LAST:event_homeKeyPressed

    private void MILLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MILLActionPerformed
        mill();
    }//GEN-LAST:event_MILLActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        String nam =lname.getText();
        String loct = llocat.getText();
        
        String cit = lcity.getText();
        String quant = lquant.getText();
        int p2 =Integer.parseInt(lquant.getText());
        String date = date1.getText();   String Ca = cash.getText();
        int T1=tab_product.getSelectedRow();
        
       
        int p1=Integer.parseInt((String)tab_product.getValueAt(T1,3));
        String ID = tab_product.getValueAt(T1, 0).toString();
        
        String tots = p1*p2+"";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String conURL= "jdbc:mysql://localhost/system?"
               + "user=root&password=";
            Connection connt= (Connection) DriverManager.getConnection(conURL);
            PreparedStatement bebe=(PreparedStatement) connt.prepareStatement("insert into `purchase`(`cust_acc_name`,`cust_acc_location`"
                + ",`cust_acc_city`,`purch_quantity`, `purch_total`, `purch_cash`, `pro_id`)values('"+nam+"','"+loct+"','"+cit+"','"+quant+"','"+tots+"','"+Ca+"','"+ID+ "');");
            bebe.executeUpdate();
            
            if(T1!=-1){
                if(JOptionPane.showConfirmDialog(rootPane, "ARE YOU SURE TO PURCHASE THIS PRODUCT?","PURCHASING", JOptionPane.YES_NO_OPTION)==0){
                        String Vpros=tab_product.getValueAt(T1,1).toString();
                        Connection con= DriverManager.getConnection(conURL);
                        ResultSet rose= null;
                        Statement stmt=null;
                        String sql="SELECT * FROM `products` WHERE `pro_variety`='"+Vpros+"';";
                        stmt=con.createStatement();
                        rose=stmt.executeQuery(sql);
          
                         if(rose.next()){
                                         
                                        
                                        int qty_f = Integer.valueOf(lquant.getText());
                                        int s1, s2;
                                        int qty_n = Integer.valueOf(rose.getString("pro_quantity"));

                                        if(qty_n < qty_f){
                                         JOptionPane.showMessageDialog(rootPane, "Insuficient Stock!!!");
                                         
                                        }
                          else{
                                        s1=qty_n-qty_f;
                                        
                                    
                                        
                                        Statement stmtIns=null;
                                        String sqlIns1="UPDATE `system`.`products` SET `pro_quantity`='"+s1+"'WHERE `pro_variety`='"+Vpros+"';";

                                        stmtIns=con.createStatement();
                                        stmtIns.executeUpdate(sqlIns1);
                                        
                                        
                                         } }
                                         lname.setText("");
                                         llocat.setText("");
                                         lcity.setText("");
                                         lpro.setText("");
                                         lquant.setText("");
                                         cash.setText("");
                                        
                                         customers();
                                         products();
                                JOptionPane.showMessageDialog(rootPane, "SUCCESFULLY PURCHASED!");
                                         
                         }
                        }
            else{
                JOptionPane.showMessageDialog(rootPane,"NO PRODUCT SELECTED!\nCHOOSE PRODUCT FROM TABLE","WARNING!!!",JOptionPane.ERROR_MESSAGE);
            }

            } catch (SQLException ex) {
                Logger.getLogger(Casheir.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Casheir.class.getName()).log(Level.SEVERE, null, ex);
            }

        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void lnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyPressed
       customers();
    }//GEN-LAST:event_lnameKeyPressed

    private void lproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lproKeyPressed
       products();
    }//GEN-LAST:event_lproKeyPressed

    private void lproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lproActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void HOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOMEMouseClicked
        HOME.setBackground(Color.YELLOW);
        HOME.setForeground(Color.WHITE);
        SELL.setBackground(Color.WHITE);
        SELL.setForeground(Color.BLACK);
        MILL.setBackground(Color.WHITE);
        MILL.setForeground(Color.BLACK);
        LOGOUT.setBackground(Color.WHITE);
        LOGOUT.setForeground(Color.BLACK);
    }//GEN-LAST:event_HOMEMouseClicked

    private void SELLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SELLMouseClicked
        HOME.setBackground(Color.WHITE);
        HOME.setForeground(Color.BLACK);
        SELL.setBackground(Color.yellow);
        SELL.setForeground(Color.WHITE);
        MILL.setBackground(Color.WHITE);
        MILL.setForeground(Color.BLACK);
        LOGOUT.setBackground(Color.WHITE);
        LOGOUT.setForeground(Color.BLACK);
    }//GEN-LAST:event_SELLMouseClicked

    private void MILLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MILLMouseClicked
        HOME.setBackground(Color.WHITE);
        HOME.setForeground(Color.BLACK);
        SELL.setBackground(Color.WHITE);
        SELL.setForeground(Color.BLACK);
        MILL.setBackground(Color.YELLOW);
        MILL.setForeground(Color.WHITE);
        LOGOUT.setBackground(Color.WHITE);
        LOGOUT.setForeground(Color.BLACK);
    }//GEN-LAST:event_MILLMouseClicked

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
       HOME.setBackground(Color.WHITE);
        HOME.setForeground(Color.BLACK);
        SELL.setBackground(Color.WHITE);
        SELL.setForeground(Color.BLACK);
        MILL.setBackground(Color.WHITE);
        MILL.setForeground(Color.BLACK);
        LOGOUT.setBackground(Color.YELLOW);
        LOGOUT.setForeground(Color.WHITE);
    }//GEN-LAST:event_LOGOUTMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Casheir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Casheir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Casheir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Casheir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Casheir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HOME;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JButton MILL;
    private javax.swing.JButton SELL;
    private javax.swing.JTextField cash;
    private javax.swing.JLabel date1;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField lcity;
    private javax.swing.JTextField llocat;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField lpro;
    private javax.swing.JTextField lquant;
    private javax.swing.JPanel mill;
    private javax.swing.JPanel rrr;
    private javax.swing.JPanel sell;
    private javax.swing.JTable tab_customer;
    private javax.swing.JTable tab_product;
    // End of variables declaration//GEN-END:variables

    private void products() {

try { 
           String inName1=lpro.getText();
          
            try {
            Class.forName("com.mysql.jdbc.Driver");
            String conURL="jdbc:mysql://localhost/system?"
            + "user=root&password=";
            Connection con1;
            con1=DriverManager.getConnection(conURL);
            Statement nezir1=con1.createStatement();
            String sql1 = "select * from pro_cashier WHERE true";
          
            if(inName1!=null){
                sql1 = sql1 + " AND (c_pro_variety like '%"+inName1+"%')";
              }
            System.out.println(sql1);
            ResultSet rs1 = nezir1.executeQuery(sql1);
            DefaultTableModel model= new CProductModel().CProModel;
            int kami=0;
            
            while(rs1.next()){
                model.addRow(new Object[]{});
                model.setValueAt(rs1.getString("c_pro_id"), kami, 0);
                model.setValueAt(rs1.getString("c_pro_variety"), kami, 1);
                model.setValueAt(rs1.getString("c_pro_price"), kami, 2);
                model.setValueAt(rs1.getString("c_pro_quantity"), kami, 3);
               
                 kami++;
            }
           tab_product.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(administrator.class.getName()).log(Level.SEVERE, null, ex);
            }
             } catch (ClassNotFoundException ex) {
                Logger.getLogger(administrator.class.getName()).log(Level.SEVERE, null, ex);
            }


    }

    private void home() {
       sell.setVisible(false);
       home.setVisible(true);
       mill.setVisible(false);
}

    private void sell() {
        sell.setVisible(true);
        home.setVisible(false);
        mill.setVisible(false);
}

    private void mill() {
         sell.setVisible(false);
        home.setVisible(false);
          mill.setVisible(true);
    }

  

    private void customers() {
       try {
           
           String locat = lname.getText();

            Class.forName("com.mysql.jdbc.Driver");
            String conURL="jdbc:mysql://localhost/system?"
            + "user=root&password=";
            Connection con= DriverManager.getConnection(conURL);

            Statement nezir2= con.createStatement();
            String sql = "SELECT * FROM purchase WHERE true"; 
          
             if(locat!=null){
                sql = sql + " AND (cust_acc_name LIKE '%"+locat+"%')";
              }
            
             System.out.println(sql);
             ResultSet rs2 = nezir2.executeQuery(sql);
             DefaultTableModel model2 = new PurchasedModel().PurchModel;

            int abcc=0;

            while(rs2.next()){
                model2.addRow( new Object[]{});
                model2.setValueAt(rs2.getString("purch_id"), abcc, 0);
                model2.setValueAt(rs2.getString("cust_acc_name"), abcc, 1);
                model2.setValueAt(rs2.getString("cust_acc_location"), abcc, 2);
                model2.setValueAt(rs2.getString("cust_acc_city"), abcc, 3);
                model2.setValueAt(rs2.getString("purch_quantity"), abcc, 4);
                model2.setValueAt(rs2.getString("purch_total"), abcc, 5);
                model2.setValueAt(rs2.getString("purch_cash"), abcc, 6);
                model2.setValueAt(rs2.getString("pro_id"), abcc, 7); 

                
                abcc++;

            }

            tab_customer.setModel(model2);
           
    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Casheir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Casheir.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
