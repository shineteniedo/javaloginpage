
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rose ann bahala
 */
public class first extends javax.swing.JFrame {

    /**
     * Creates new form first
     */
    public first() {
        initComponents();
         this.setLocationRelativeTo(null);
        showDate();
        showTime();
       
    }
 void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
        date.setText(s.format(d));
    }
 void showTime() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm");
        time.setText(s.format(d));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        check_C = new javax.swing.JCheckBox();
        check_A = new javax.swing.JCheckBox();
        tname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PWpass = new javax.swing.JPasswordField();
        log = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In Page");
        setIconImages(getIconImages());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 420, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter  Username and Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 330, 30));

        buttonGroup1.add(check_C);
        check_C.setForeground(new java.awt.Color(255, 255, 255));
        check_C.setText("Cashier");
        check_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_CActionPerformed(evt);
            }
        });
        check_C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                check_CKeyPressed(evt);
            }
        });
        jPanel1.add(check_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        buttonGroup1.add(check_A);
        check_A.setForeground(new java.awt.Color(255, 255, 255));
        check_A.setText("Administrator");
        check_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_AActionPerformed(evt);
            }
        });
        check_A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                check_AKeyPressed(evt);
            }
        });
        jPanel1.add(check_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        tname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tnameKeyPressed(evt);
            }
        });
        jPanel1.add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 210, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Cashier Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        PWpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PWpassKeyPressed(evt);
            }
        });
        jPanel1.add(PWpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 210, -1));

        log.setText("Log In");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        log.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logKeyPressed(evt);
            }
        });
        jPanel1.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 80, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Choose Account");

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(153, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(153, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_AActionPerformed

    private void tnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnameKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            LogIn();
        }
    }//GEN-LAST:event_tnameKeyPressed

    private void PWpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PWpassKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            LogIn();
        }
    }//GEN-LAST:event_PWpassKeyPressed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        log.setBackground(Color.WHITE);
        log.setForeground(Color.blue);
        LogIn();
    }//GEN-LAST:event_logActionPerformed

    private void logKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            log.setBackground(Color.yellow);
             log.setForeground(Color.black);
            LogIn();
        }
    }//GEN-LAST:event_logKeyPressed

    private void check_CKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_check_CKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            check_C.isSelected();
        }
    }//GEN-LAST:event_check_CKeyPressed

    private void check_AKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_check_AKeyPressed
        
    }//GEN-LAST:event_check_AKeyPressed

    private void check_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_CActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.WHITE);
    }//GEN-LAST:event_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new first().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PWpass;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JCheckBox check_A;
    private javax.swing.JCheckBox check_C;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton log;
    private javax.swing.JLabel time;
    private javax.swing.JTextField tname;
    // End of variables declaration//GEN-END:variables

    private void LogIn() {
          try {
            String u=tname.getText();
            String p= new String(PWpass.getPassword());
         
            Class.forName("com.mysql.jdbc.Driver");
            String conURL= "jdbc:mysql://localhost/system?"
            + "user=root&password=";
            Connection cont= (Connection) DriverManager.getConnection(conURL);
            
                
             
                                        if(check_C.isSelected()){
                                                  PreparedStatement prep;
                                                  prep = cont.prepareStatement("select * from `casher` where"
                                                        + "`username`=? and `userpass`=?;");

                                                           prep.setString(1,u );
                                                           prep.setString(2,p);
                                                           ResultSet rl= prep.executeQuery();

                                                           if(rl.next()){
                                                              tname.setText("");
                                                              PWpass.setText("");
                                                               this.dispose();
                                                               new Casheir().setVisible(true);
                                                           }
                                                           else{
                                                               JOptionPane.showMessageDialog(rootPane,"USERNAME AND PASSWORD DON'T MATCH!,"
                                                                   ,"LOG IN FAILED",JOptionPane.ERROR_MESSAGE);
                                                               }
                                                               }
                                       
                                          else{
                                            if(check_A.isSelected()){
                                                PreparedStatement prep;
                                                  prep = cont.prepareStatement("select * from `admin` where"
                                                        + "`username`=? and `userpass`=?;");

                                                           prep.setString(1,u );
                                                           prep.setString(2,p);
                                                           ResultSet rl= prep.executeQuery();

                                                           if(rl.next()){
                                                              tname.setText("");
                                                              PWpass.setText("");
                                                               this.dispose();
                                                               new administrator().setVisible(true);
                                                           }
                                                           else{
                                                               JOptionPane.showMessageDialog(rootPane,"USERNAME AND PASSWORD DON'T MATCH!,"
                                                                   ,"LOG IN FAILED",JOptionPane.ERROR_MESSAGE);
                                                               }
                                                               }
                                             else{
                                                        JOptionPane.showMessageDialog(rootPane,"No Account is Selected!,"
                                                                                                           ,"LOG IN FAILED",JOptionPane.ERROR_MESSAGE);
                                                    }
                                            }
          
            
           
            
            } catch (SQLException ex) {
            Logger.getLogger(first.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(first.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            // TODO add your handling code here:
      
        
    }
}
