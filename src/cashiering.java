
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
public class cashiering extends javax.swing.JFrame {

    /**
     * Creates new form cashiering
     */
    public cashiering() {
        initComponents();
        showDate();
        showTime();
    }
void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd");
        date.setText(s.format(d));
    }
void showTime(){
     
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
        time.setText(s.format(d));
   
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        HOME = new javax.swing.JButton();
        LOGOUT = new javax.swing.JButton();
        MILL = new javax.swing.JButton();
        SELL = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        rrr = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        sell = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_customer = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_product = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lpro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        tots = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        comb_cit = new javax.swing.JComboBox<>();
        comb_qty = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        locat = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        mill = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab_cust_mill = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        m_con = new javax.swing.JTextField();
        m_loc = new javax.swing.JTextField();
        m_nam = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        m_ca = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        m_addc = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        m_dis = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        m_pro = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        m_qua = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab_sched = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sta = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setMaximumSize(new java.awt.Dimension(1062, 90));
        jPanel4.setMinimumSize(new java.awt.Dimension(200, 107));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 107));
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setVerifyInputWhenFocusTarget(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel4.add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 40));

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
        jPanel4.add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 150, 40));

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
        jPanel4.add(MILL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 40));

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
        jPanel4.add(SELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 40));

        time.setForeground(new java.awt.Color(255, 255, 153));
        jPanel4.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 30));

        date.setForeground(new java.awt.Color(255, 255, 153));
        jPanel4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 30));

        jSplitPane1.setLeftComponent(jPanel4);

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

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new java.awt.CardLayout());

        tab_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "First Name", "Last Name", "Location", "City", "Cash", "Additional Type", "Additional Cost", "Total", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab_customer);

        jPanel5.add(jScrollPane1, "card2");

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, "card4");

        sell.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1100, 270));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 570, 250));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Products List");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 170, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Purchase");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 100, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 100, 30));

        sell.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 360));

        jPanel8.setLayout(new java.awt.CardLayout());

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel9.add(lpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Product:");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Quantity:");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50" }));
        jPanel9.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("/Kilos");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 70, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("/Sacks");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 70, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("City:");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 70, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Location:");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Last Nmae:");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cash:");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 50, -1));
        jPanel9.add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, 30));

        tots.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tots.setForeground(new java.awt.Color(255, 255, 255));
        tots.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(tots, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 120, 20));
        jPanel9.add(cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Additional Type:");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 130, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Total:");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 90, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("First Name:");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 40));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery", "Mill" }));
        type.setSelectedIndex(-1);
        jPanel9.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 90, -1));

        comb_cit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comb_cit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Himamaylan", "Kabankalan", "Binalbagan" }));
        comb_cit.setSelectedIndex(-1);
        jPanel9.add(comb_cit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 150, 30));

        comb_qty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comb_qty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        comb_qty.setSelectedIndex(-1);
        jPanel9.add(comb_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 46, 170, 30));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Additional Cost:");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 130, -1));

        ln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnKeyPressed(evt);
            }
        });
        jPanel9.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 150, 30));

        fn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnKeyPressed(evt);
            }
        });
        jPanel9.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 136, 150, 30));
        jPanel9.add(locat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 136, 150, 30));

        jPanel8.add(jPanel9, "card2");

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Additional:");
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Product ID:");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Kilos");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Cash:");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 50, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Total Amount:");
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("ROI:");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 40, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Customer ID:");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("0");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 130, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("New Customer");
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Quantity");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 102));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Quantity");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 102));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Quantity");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 102));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("0");
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 102));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("0");
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 102));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("0");
        jPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 130, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 102));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("0");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 130, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 102));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("0");
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 130, 40));

        jPanel8.add(jPanel10, "card3");

        sell.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 500, 360));

        rrr.add(sell, "card5");

        mill.setBackground(new java.awt.Color(153, 153, 0));
        mill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab_cust_mill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Location", "Contact4", "Product", "Quantity", "Distribution", "Cash", "Additional Cost", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tab_cust_mill);

        jPanel11.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1070, 170));

        mill.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1090, 220));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(m_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, -1));
        jPanel12.add(m_loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 170, -1));
        jPanel12.add(m_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 170, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Name:");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Location:");
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Contact:");
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel12.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 20, 310));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Product:");
        jPanel12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, -1));
        jPanel12.add(m_ca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 120, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Cash:");
        jPanel12.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 90, 30));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Distribution:");
        jPanel12.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 40));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Cost");
        jPanel12.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 110, 20));
        jPanel12.add(m_addc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 120, 30));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Additional:");
        jPanel12.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 110, 30));

        m_dis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel12.add(m_dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 140, 30));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Type");
        jPanel12.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 20));
        jPanel12.add(m_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 170, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Status:");
        jPanel12.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 30));

        m_qua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jPanel12.add(m_qua, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 170, -1));

        tab_sched.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Schedule ID", "Customer ID", "Product", "Quantity", "Date", "Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tab_sched);

        jPanel12.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 710, 290));
        jPanel12.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 730, -1));

        jButton2.setText("Cancel");
        jPanel12.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 120, 30));

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 120, 30));

        sta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel12.add(sta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Quantity:");
        jPanel12.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 90, 30));

        mill.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1090, 430));

        rrr.add(mill, "card6");

        jSplitPane1.setRightComponent(rrr);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cashiering", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
        home();
    }//GEN-LAST:event_HOMEActionPerformed

    private void HOMEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HOMEKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            home();}
    }//GEN-LAST:event_HOMEKeyPressed

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

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
        this.dispose();
        new first().setVisible(true);
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void LOGOUTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LOGOUTKeyPressed
        this.dispose();
        new first ().setVisible(true);
    }//GEN-LAST:event_LOGOUTKeyPressed

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

    private void MILLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MILLActionPerformed
        mill();
    }//GEN-LAST:event_MILLActionPerformed

    private void MILLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MILLKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            mill();
        }
    }//GEN-LAST:event_MILLKeyPressed

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

    private void SELLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELLActionPerformed
        sell();
    }//GEN-LAST:event_SELLActionPerformed

    private void SELLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SELLKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            sell();
        }
    }//GEN-LAST:event_SELLKeyPressed

    private void homeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            home();
        }
    }//GEN-LAST:event_homeKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String fnam =fn.getText();
        String lnam =ln.getText();
        String loct = locat.getText();

        String city = comb_cit.getSelectedItem().toString();
        String ca = cash.getText();
         String co = cost.getText();
         
        String ty =type.getSelectedItem().toString();
       
        int p2 =Integer.parseInt(comb_qty.getSelectedItem().toString());
        String date = time.getText();   
       
        int T1=tab_product.getSelectedRow();

        int p1=Integer.parseInt((String)tab_product.getValueAt(T1,3));
        String ID = tab_product.getValueAt(T1, 0).toString();

        String total = p1*p2+"";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String conURL= "jdbc:mysql://localhost/system?"
            + "user=root&password=";
            Connection connt= (Connection) DriverManager.getConnection(conURL);
            PreparedStatement bebe=(PreparedStatement) connt.prepareStatement("insert into `customers`(`cust_fname`,`cust_lname`"
                + ",`cust_locate`,`cust_city`, `cust_cash`, `add_type`, `add_cost`, `total`, `date`)values('"+fnam+"','"+lnam+"','"+loct+"','"+city+"','"+ca+"','"+ty+"','"+co+"','"+total+ "','"+date+ "');");
            bebe.executeUpdate();

            if(T1!=-1){
                if(JOptionPane.showConfirmDialog(rootPane, "ARE YOU SURE TO PURCHASE THIS PRODUCT?","PURCHASING", JOptionPane.YES_NO_OPTION)==0){
                  
                    String proI=tab_product.getValueAt(T1,0).toString();
                    String qty=tab_product.getValueAt(T1,3).toString();
                    
                    Connection con= DriverManager.getConnection(conURL);
                    ResultSet rose= null;
                    Statement stmt=null;
                    String sql="SELECT * FROM `products` WHERE `pro_id`='"+proI+"';";
                    stmt=con.createStatement();
                    rose=stmt.executeQuery(sql);

                    if(rose.next()){

                        int qty_f = Integer.valueOf(comb_qty.getSelectedItem().toString());
                        int s1, s2;
                        int qty_n = Integer.valueOf(rose.getString("pro_quantity"));

                        if(qty_n < qty_f){
                            JOptionPane.showMessageDialog(rootPane, "Insuficient Stock!!!");

                        }
                        else{
                            s1=qty_n-qty_f;

                         
                            PreparedStatement pro=(PreparedStatement) con.prepareStatement("UPDATE `system`.`products` SET `pro_quantity`='"+s1+"'"
                                    + " WHERE`pro_id`='"+proI+"';");
                            
                            Statement stmt5 = con.createStatement();
                            String declare5 = "SELECT * FROM `products` WHERE pro_id='"+proI+"'";
                            ResultSet rs5 = stmt5.executeQuery(declare5);
                            rs5.next();
                 
                            PreparedStatement pro1=(PreparedStatement) con.prepareStatement("UPDATE `system`.`inventory_sell` SET `total_quant`='"+s1+"'"
                                    + " WHERE`pro_id`='"+proI+"';");
                             pro.executeUpdate();
                             pro1.executeUpdate();
                        
                        } }
                        ln.setText("");
                        locat.setText("");
                        comb_cit.setSelectedItem("");
                        lpro.setText("");
                        comb_qty.setSelectedItem("");
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
                Logger.getLogger(cashiering.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(cashiering.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        ln.setText(" ");
        locat.setText(" ");
        comb_qty.setSelectedItem("");
        comb_cit.setSelectedItem("");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void lproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lproActionPerformed

    private void lproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lproKeyPressed
        products();
    }//GEN-LAST:event_lproKeyPressed

    private void fnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnKeyPressed
       customers();
    }//GEN-LAST:event_fnKeyPressed

    private void lnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnKeyPressed
      customers();
    }//GEN-LAST:event_lnKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       m_customer();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(cashiering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cashiering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cashiering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cashiering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cashiering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HOME;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JButton MILL;
    private javax.swing.JButton SELL;
    private javax.swing.JTextField cash;
    private javax.swing.JComboBox<String> comb_cit;
    private javax.swing.JComboBox<String> comb_qty;
    private javax.swing.JTextField cost;
    private javax.swing.JLabel date;
    private javax.swing.JTextField fn;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField locat;
    private javax.swing.JTextField lpro;
    private javax.swing.JTextField m_addc;
    private javax.swing.JTextField m_ca;
    private javax.swing.JTextField m_con;
    private javax.swing.JComboBox<String> m_dis;
    private javax.swing.JTextField m_loc;
    private javax.swing.JTextField m_nam;
    private javax.swing.JTextField m_pro;
    private javax.swing.JComboBox<String> m_qua;
    private javax.swing.JPanel mill;
    private javax.swing.JPanel rrr;
    private javax.swing.JPanel sell;
    private javax.swing.JComboBox<String> sta;
    private javax.swing.JTable tab_cust_mill;
    private javax.swing.JTable tab_customer;
    private javax.swing.JTable tab_product;
    private javax.swing.JTable tab_sched;
    private javax.swing.JLabel time;
    private javax.swing.JLabel tots;
    private javax.swing.JComboBox<String> type;
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
            String sql1 = "select * from products WHERE true";
          
            if(inName1!=null){
                sql1 = sql1 + " AND (pro_variety like '%"+inName1+"%')";
              }
            System.out.println(sql1);
            ResultSet rs1 = nezir1.executeQuery(sql1);
            DefaultTableModel model= new CProductModel().CProModel;
            int kami=0;
            
            while(rs1.next()){
                model.addRow(new Object[]{});
                model.setValueAt(rs1.getString("pro_id"), kami, 0);
                model.setValueAt(rs1.getString("pro_variety"), kami, 1);
                model.setValueAt(rs1.getString("pro_price"), kami, 2);
                model.setValueAt(rs1.getString("pro_quantity"), kami, 3);
               
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
           
           String lnam = ln.getText();
           String fnam = ln.getText();

            Class.forName("com.mysql.jdbc.Driver");
            String conURL="jdbc:mysql://localhost/system?"
            + "user=root&password=";
            Connection con= DriverManager.getConnection(conURL);

            Statement nezir2= con.createStatement();
            String sql = "SELECT * FROM customers WHERE true"; 
          
             if(lnam!=null){
                sql = sql + " AND (cust_lname LIKE '%"+lnam+"%')";
              }
              if(fnam!=null){
                sql = sql + " AND (cust_lname LIKE '%"+fnam+"%')";
              }
            
             System.out.println(sql);
             ResultSet rs2 = nezir2.executeQuery(sql);
             DefaultTableModel model2 = new CustomerModel().CustModel;

            int abcc=0;

            while(rs2.next()){
                model2.addRow( new Object[]{});
                model2.setValueAt(rs2.getString("cust_id"), abcc, 0);
                model2.setValueAt(rs2.getString("cust_fname"), abcc, 1);
                model2.setValueAt(rs2.getString("cust_lname"), abcc, 2);
                model2.setValueAt(rs2.getString("cust_locate"), abcc, 3);
                model2.setValueAt(rs2.getString("cust_city"), abcc, 4);
                model2.setValueAt(rs2.getString("cust_cash"), abcc, 5);
                model2.setValueAt(rs2.getString("add_type"), abcc, 6);
                model2.setValueAt(rs2.getString("add_cost"), abcc, 7); 
                model2.setValueAt(rs2.getString("total"), abcc, 8); 
                model2.setValueAt(rs2.getString("date"), abcc, 9); 

                abcc++;

            }

            tab_customer.setModel(model2);
           
    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cashiering.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(cashiering.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void m_customer() {

        String n = m_nam.getText();
        String l = m_loc.getText();
        String c = m_con.getText();
        String p = m_pro.getText();
        String q = m_qua.getSelectedItem().toString();
        String d = m_dis.getSelectedItem().toString();
        String c1 = m_ca.getText();
        String ad = m_addc.getText();
        String da = date.getText();
        String ti = time.getText();
        String st = sta.getSelectedItem().toString();
       int t1 = 0;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String conURL="jdbc:mysql://localhost/system?"
            + "user=root&password=";
           Connection con2= DriverManager.getConnection(conURL);
            
            PreparedStatement pro0=(PreparedStatement) con2.prepareStatement("insert into `m_customers`(`m_name`,`m_location`,`m_contact`,`m_pro`,`m_qua`,`m_dis`,`m_cash`,`m_addco`,`m_total`)"
                         + "values ('"+n+"','"+l+"','"+c+"','"+p+"','"+q+"','"+d+"','"+c1+"','"+ad+"','"+t1+"');");
                 pro0.executeUpdate();
                 
                 Statement stmt5 = con2.createStatement();
                 String id = "SELECT * FROM `m_customers` WHERE m_pro='"+p+"'";
                 ResultSet rs5 = stmt5.executeQuery(id);
                 rs5.next();

                 int custID = rs5.getInt("m_cust_id");
            
                PreparedStatement pro1=(PreparedStatement) con2.prepareStatement("insert into `schedule`(`m_cust_id`,`m_pro`,`m_quant`,`Time`,`Date`,`m_status`)"
                         + "values ('"+custID+"','"+p+"','"+q+"','"+ti+"','"+da+"','"+st+"');");
                 pro1.executeUpdate();
            
                 
                 JOptionPane.showMessageDialog(rootPane, "Successfuly Sceduled ");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cashiering.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(cashiering.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     






    }
}

