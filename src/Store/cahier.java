/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hii
 */
public class cahier extends javax.swing.JFrame {

    /**
     * Creates new form cahier
     */
    String name;
    custbill cust;
    DefaultTableModel model;
    double dis, pay;
    custDatabase cd;
    fileCust fil;
    Calendar cal = Calendar.getInstance();

    public cahier(String name) {
        initComponents();
        setTitle("ASM super Store");
        setIconImage(new ImageIcon("Cash_Register.png").getImage());
        nam.setText(name);
        setMinimumSize(new Dimension(880, 570));
        Update.setEnabled(false);
        ok.setEnabled(false);
        model = (DefaultTableModel) prolist.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nam = new javax.swing.JLabel();
        NewBill = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        data = new javax.swing.JPanel();
        Return = new javax.swing.JTextField();
        Dicount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Paid = new javax.swing.JTextField();
        CustomerID = new javax.swing.JTextField();
        Type = new javax.swing.JTextField();
        Amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prolist = new javax.swing.JTable();
        ok = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nam.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        nam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nam.setText("Cashier");
        nam.setToolTipText("");
        nam.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 18, 320, -1));

        NewBill.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        NewBill.setText("New Bill   ");
        NewBill.setToolTipText("");
        NewBill.setFocusable(false);
        NewBill.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewBill.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBillActionPerformed(evt);
            }
        });
        jPanel2.add(NewBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 156, -1));

        Update.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 25, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 37, 0, 0);
        jPanel1.add(jPanel2, gridBagConstraints);

        data.setBackground(new java.awt.Color(255, 255, 255));
        data.setLayout(new java.awt.GridBagLayout());

        Return.setBackground(new java.awt.Color(102, 0, 102));
        Return.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Return.setForeground(new java.awt.Color(255, 255, 255));
        Return.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Return.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        data.add(Return, gridBagConstraints);

        Dicount.setBackground(new java.awt.Color(102, 0, 102));
        Dicount.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Dicount.setForeground(new java.awt.Color(255, 255, 255));
        Dicount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Dicount.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 4, 0, 0);
        data.add(Dicount, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Amount Return:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 292, 0, 0);
        data.add(jLabel6, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Customer ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        data.add(jLabel1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Discount:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        data.add(jLabel3, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Amount Bill:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 67;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        data.add(jLabel2, gridBagConstraints);

        Paid.setBackground(new java.awt.Color(102, 0, 102));
        Paid.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Paid.setForeground(new java.awt.Color(255, 255, 255));
        Paid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Paid.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 10, 0, 10);
        data.add(Paid, gridBagConstraints);

        CustomerID.setBackground(new java.awt.Color(102, 0, 102));
        CustomerID.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CustomerID.setForeground(new java.awt.Color(255, 255, 255));
        CustomerID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerID.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        data.add(CustomerID, gridBagConstraints);

        Type.setBackground(new java.awt.Color(102, 0, 102));
        Type.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Type.setForeground(new java.awt.Color(255, 255, 255));
        Type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Type.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        data.add(Type, gridBagConstraints);

        Amount.setBackground(new java.awt.Color(102, 0, 102));
        Amount.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Amount.setForeground(new java.awt.Color(255, 255, 255));
        Amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Amount.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        data.add(Amount, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Amount Paid:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 320, 0, 0);
        data.add(jLabel5, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Customer Type:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 291, 0, 0);
        data.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 47, 0, 0);
        jPanel1.add(data, gridBagConstraints);

        prolist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Price", "Quatity", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(prolist);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 807;
        gridBagConstraints.ipady = 326;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 2, 0);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        ok.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(295, 28, 0, 0);
        jPanel1.add(ok, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 289;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 11, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        cust.b.c.discount(cust.b.c.t_amount);
        dis = cust.b.c.discount;
        pay = cust.b.c.t_amount - dis;
        Amount.setText(String.valueOf(cust.b.c.t_amount));
        Dicount.setText(String.valueOf(dis));
        Paid.setText(String.valueOf(pay));
        Return.setText(String.valueOf(cust.b.p - pay));
        Type.setText(cust.b.c.type);
        ok.setEnabled(true);
        tableUpdate();
    }//GEN-LAST:event_UpdateActionPerformed

    private void NewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBillActionPerformed
        try {

            cust = new custbill();

        } catch (Exception ex) {
            Logger.getLogger(cahier.class.getName()).log(Level.SEVERE, null, ex);
        }
        cust.setVisible(true);
        NewBill.setEnabled(false);
        Update.setEnabled(true);
    }//GEN-LAST:event_NewBillActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        try {
            // TODO add your handling code here:
            updateRev();
            saveCust();
            updatestck(cust.buyPro);
            clearTable();
            ok.setEnabled(false);
            Update.setEnabled(false);
            NewBill.setEnabled(true);
        } catch (Exception ex) {
            Logger.getLogger(cahier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_okActionPerformed
     public void setDefaultCloseOperation(int operation) {

        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

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
            java.util.logging.Logger.getLogger(cahier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cahier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cahier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cahier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cahier c = new cahier("1234");
                c.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JTextField CustomerID;
    private javax.swing.JTextField Dicount;
    private javax.swing.JButton NewBill;
    private javax.swing.JTextField Paid;
    private javax.swing.JTextField Return;
    private javax.swing.JTextField Type;
    private javax.swing.JButton Update;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JPanel data;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel nam;
    javax.swing.JButton ok;
    private javax.swing.JTable prolist;
    // End of variables declaration//GEN-END:variables

    private void tableUpdate() {

        for (int i = 0; i < cust.buyPro.size(); i++) {

            Object[] row = {cust.buyPro.get(i).getId(), cust.buyPro.get(i).getName(), cust.buyPro.get(i).getPrice(), cust.buyPro.get(i).getStock(), cust.buyPro.get(i).getPrice() * cust.buyPro.get(i).getStock()};

            model.addRow(row);

        }
        model.fireTableDataChanged();
    }

    void clearTable() {

        model.setRowCount(0);

    }

    void saveCust() throws Exception {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        customer c = cust.b.c;
        c.setDiscount(dis);
        c.setTime(sdf.format(cal.getTime()));
        c.t_amount = pay;
        cd = new custDatabase();
        cd.Connect();
        cd.insert(c);

        fil = new fileCust();
        fil.addFile(cust.buyPro, cd.getLastID());

    }

    void updatestck(ArrayList<Product> e) throws Exception {

        try {
            proddatabase p = new proddatabase();
            p.Connect();
            ArrayList<Product> a = p.getProdata();
            for (int i = 0; i < e.size(); i++) {
                for (int j = 0; j < a.size(); j++) {
                    if (a.get(j).getId() == e.get(i).getId()) {
                        p.editQuan(a.get(j).getStock() - e.get(i).getStock(), e.get(i).getId());
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(cahier.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void updateRev() throws Exception {
        MainRev.revenue += pay;
        revDatabase rev = new revDatabase();
        rev.Connect();
        ArrayList<MainRev> revlist = rev.getRevdata();
        rev.editSell(revlist.get(cal.getTime().getMonth()).t_sell + pay, cal.getTime().getMonth() + 1);

    }
}
