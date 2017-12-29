/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hii
 */
public class frame extends javax.swing.JFrame {

    boolean login_check;
    revview r = new revview();
    stockrev st;
    emprev e = new emprev();
    cahier c = new cahier("No");
    fBill bil;
    revDatabase rev;
    suppview sup;

    /**
     * Creates new form frame
     *
     * @throws java.lang.Exception
     */
    public frame() throws Exception {
        this.st = new stockrev();
        initComponents();
        setTitle("ASM super Store");
        setIconImage(new ImageIcon("wal.jpg").getImage());
        setMinimumSize(new Dimension(600, 600));
        bil = new fBill();
        logout.setEnabled(login_check);
        sup = new suppview();

    }
    Login l = new Login();
    //static boolean f = false ; 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mainpanel = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Finance = new javax.swing.JMenu();
        Revenue = new javax.swing.JMenuItem();
        Bills = new javax.swing.JMenuItem();
        Records = new javax.swing.JMenu();
        Employee = new javax.swing.JMenuItem();
        Stocks = new javax.swing.JMenuItem();
        Supplier = new javax.swing.JMenuItem();
        Login = new javax.swing.JMenu();
        MyAccount = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));
        mainpanel.setMinimumSize(new java.awt.Dimension(500, 500));
        mainpanel.setLayout(new java.awt.GridBagLayout());

        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/wal.jpg"))); // NOI18N
        mainpanel.add(pic, new java.awt.GridBagConstraints());

        getContentPane().add(mainpanel, java.awt.BorderLayout.CENTER);

        Finance.setText("Finance");
        Finance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinanceActionPerformed(evt);
            }
        });

        Revenue.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        Revenue.setText("Revenue");
        Revenue.setEnabled(false);
        Revenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevenueActionPerformed(evt);
            }
        });
        Finance.add(Revenue);

        Bills.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Bills.setText("Bills");
        Bills.setEnabled(false);
        Bills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillsActionPerformed(evt);
            }
        });
        Finance.add(Bills);

        jMenuBar1.add(Finance);

        Records.setText("Records");
        Records.setBorderPainted(true);

        Employee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Employee.setText("Employee");
        Employee.setEnabled(false);
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });
        Records.add(Employee);

        Stocks.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Stocks.setText("Stocks");
        Stocks.setEnabled(false);
        Stocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StocksActionPerformed(evt);
            }
        });
        Records.add(Stocks);

        Supplier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        Supplier.setText("Supplier");
        Supplier.setEnabled(false);
        Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierActionPerformed(evt);
            }
        });
        Records.add(Supplier);

        jMenuBar1.add(Records);

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        MyAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MyAccount.setText("Accounts");
        MyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccountActionPerformed(evt);
            }
        });
        Login.add(MyAccount);

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        Login.add(Open);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        Login.add(logout);

        jMenuBar1.add(Login);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
        // TODO add your handling code here:
        hideall();
        repaint();
        add(e);
        // setBounds(e.bounds());
        e.show();
        e.setVisible(true);


    }//GEN-LAST:event_EmployeeActionPerformed

    private void StocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StocksActionPerformed
        // TODO add your handling code here:
        // remove(mainpanel);
        hideall();
        repaint();
        add(st);
        st.setBounds(mainpanel.bounds());
        st.show();
        st.setVisible(true);
        //  setBounds(st.bounds());
    }//GEN-LAST:event_StocksActionPerformed

    private void RevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevenueActionPerformed
        // TODO add your handling code here:
        // mainpanel.hide();
        hideall();
        repaint();
        add(r);
        r.setBounds(mainpanel.bounds());
        r.setVisible(true);
        // setBounds(r.bounds());

    }//GEN-LAST:event_RevenueActionPerformed

    private void MyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccountActionPerformed
        // TODO add your handling code here:
        l.setVisible(true);

    }//GEN-LAST:event_MyAccountActionPerformed

    private void BillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillsActionPerformed

        hideall();
        repaint();
        add(bil);
        bil.setBounds(mainpanel.bounds());
        bil.setVisible(true);
    }//GEN-LAST:event_BillsActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_LoginActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
        if (l.check == true) {
            login_check = true;
            logout.setEnabled(login_check);
            enablea();
            MyAccount.setEnabled(false);
        } else if (l.c_ch == true) {

            c.nam.setText(l.name);
            System.out.println(c.name +" " +l.name);
            c.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        login_check = false;
        disablee();
        l.check = false;
        MyAccount.setEnabled(true);
        hideall();
        mainpanel.setVisible(true);
        mainpanel.show();
        logout.setEnabled(login_check);

    }//GEN-LAST:event_logoutActionPerformed

    private void FinanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinanceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_FinanceActionPerformed

    private void SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierActionPerformed
        // TODO add your handling code here:
        hideall();
        repaint();
        add(sup);
        sup.setBounds(mainpanel.bounds());
        sup.setVisible(true);

    }//GEN-LAST:event_SupplierActionPerformed

    void enablea() {
        Bills.setEnabled(true);
        Employee.setEnabled(true);
        Revenue.setEnabled(true);
        Stocks.setEnabled(true);
        Supplier.setEnabled(true);

    }

    void disablee() {
        Bills.setEnabled(false);
        Employee.setEnabled(false);
        Revenue.setEnabled(false);
        Stocks.setEnabled(false);
        Supplier.setEnabled(false);
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
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame f;
                try {
                    f = new frame();
                    f.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(frame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Bills;
    javax.swing.JMenuItem Employee;
    javax.swing.JMenu Finance;
    private javax.swing.JMenu Login;
    private javax.swing.JMenuItem MyAccount;
    private javax.swing.JMenuItem Open;
    javax.swing.JMenu Records;
    javax.swing.JMenuItem Revenue;
    private javax.swing.JMenuItem Stocks;
    private javax.swing.JMenuItem Supplier;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem logout;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables

    private void hideall() {
        mainpanel.setVisible(false);
        r.setVisible(false);
        st.setVisible(false);
        e.setVisible(false);
        bil.setVisible(false);
        sup.setVisible(false);
    }
}