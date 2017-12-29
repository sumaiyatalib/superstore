/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hii
 */
public class EmpDataform extends javax.swing.JFrame {

    /**
     * Creates new form EmpDataform
     */
    EmpDatabase e;

    public EmpDataform() throws Exception {
        initComponents();
        e = new EmpDatabase();
    }

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(HIDE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
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

        Formpanel = new javax.swing.JPanel();
        Shift = new javax.swing.JTextField();
        Type = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        quantityl = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        namel = new javax.swing.JLabel();
        Pricel = new javax.swing.JLabel();
        supp = new javax.swing.JLabel();
        Salary = new javax.swing.JTextField();
        attendance = new javax.swing.JTextField();
        Bonus = new javax.swing.JTextField();
        Subtypel = new javax.swing.JLabel();
        Typel = new javax.swing.JLabel();
        Add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Formpanel.setBackground(new java.awt.Color(255, 255, 255));
        Formpanel.setLayout(new java.awt.GridBagLayout());

        Shift.setBackground(new java.awt.Color(102, 0, 102));
        Shift.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Shift.setForeground(new java.awt.Color(255, 255, 255));
        Shift.setCaretColor(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 128;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 0, 0);
        Formpanel.add(Shift, gridBagConstraints);

        Type.setBackground(new java.awt.Color(102, 0, 102));
        Type.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Type.setForeground(new java.awt.Color(255, 255, 255));
        Type.setCaretColor(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        Formpanel.add(Type, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Goudy Stout", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Data Form");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 20, 0, 10);
        Formpanel.add(jLabel1, gridBagConstraints);

        quantityl.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        quantityl.setForeground(new java.awt.Color(102, 0, 102));
        quantityl.setText("Salary");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 159, 0, 0);
        Formpanel.add(quantityl, gridBagConstraints);

        Name.setBackground(new java.awt.Color(102, 0, 102));
        Name.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setCaretColor(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 128;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 4, 0, 0);
        Formpanel.add(Name, gridBagConstraints);

        namel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        namel.setForeground(new java.awt.Color(102, 0, 102));
        namel.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(52, 163, 0, 0);
        Formpanel.add(namel, gridBagConstraints);

        Pricel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Pricel.setForeground(new java.awt.Color(102, 0, 102));
        Pricel.setText("Shift");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 166, 0, 0);
        Formpanel.add(Pricel, gridBagConstraints);

        supp.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        supp.setForeground(new java.awt.Color(102, 0, 102));
        supp.setText("Bonus");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 160, 0, 0);
        Formpanel.add(supp, gridBagConstraints);

        Salary.setBackground(new java.awt.Color(102, 0, 102));
        Salary.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Salary.setForeground(new java.awt.Color(255, 255, 255));
        Salary.setCaretColor(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 4, 0, 0);
        Formpanel.add(Salary, gridBagConstraints);

        attendance.setBackground(new java.awt.Color(102, 0, 102));
        attendance.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        attendance.setForeground(new java.awt.Color(255, 255, 255));
        attendance.setCaretColor(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 127;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        Formpanel.add(attendance, gridBagConstraints);

        Bonus.setBackground(new java.awt.Color(102, 0, 102));
        Bonus.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Bonus.setForeground(new java.awt.Color(255, 255, 255));
        Bonus.setCaretColor(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 4, 14, 0);
        Formpanel.add(Bonus, gridBagConstraints);

        Subtypel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Subtypel.setForeground(new java.awt.Color(102, 0, 102));
        Subtypel.setText("Attendance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 104, 0, 0);
        Formpanel.add(Subtypel, gridBagConstraints);

        Typel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Typel.setForeground(new java.awt.Color(102, 0, 102));
        Typel.setText("Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 170, 0, 0);
        Formpanel.add(Typel, gridBagConstraints);

        Add.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Add.setForeground(new java.awt.Color(102, 0, 102));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 41, 0, 0);
        Formpanel.add(Add, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Formpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Formpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:

        String Nam = Name.getText();
        double Ssalary = Double.valueOf(Salary.getText());
        String type = Type.getText();
        String shift = Shift.getText();
        int att = Integer.parseInt(attendance.getText());
       // double bon = Double.valueOf(Bonus.getText());
        try {
            e.Connect();
            e.insert(new Employee(Nam, shift, type, att, Ssalary, Employee.BonusCalc(Ssalary, att)));
        } catch (SQLException ex) {
            Logger.getLogger(productform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(productform.class.getName()).log(Level.SEVERE, null, ex);
        }
        Name.setText("");
        Shift.setText("");
        Type.setText("");
        Salary.setText("");
        attendance.setText("");
        Bonus.setText("");

    }//GEN-LAST:event_AddActionPerformed

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
            java.util.logging.Logger.getLogger(EmpDataform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpDataform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpDataform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpDataform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EmpDataform().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(EmpDataform.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    void updateemp() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton Add;
    javax.swing.JTextField Bonus;
    private javax.swing.JPanel Formpanel;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Pricel;
    private javax.swing.JTextField Salary;
    private javax.swing.JTextField Shift;
    private javax.swing.JLabel Subtypel;
    private javax.swing.JTextField Type;
    private javax.swing.JLabel Typel;
    private javax.swing.JTextField attendance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel namel;
    private javax.swing.JLabel quantityl;
    javax.swing.JLabel supp;
    // End of variables declaration//GEN-END:variables

    void getemp(Employee s) {

        Name.setText(s.name);
        Bonus.setText(Double.toString(s.bonus));
        Salary.setText(Double.toString(s.salary));
        Type.setText(s.type);
        Shift.setText(s.Shift);
        attendance.setText(Integer.toString(s.Attendance));
        Bonus.setText(Double.toString(s.bonus));
        Name.setFocusable(false);
        Bonus.setFocusable(false);
        Salary.setFocusable(false);
        Type.setFocusable(false);
        Shift.setFocusable(false);
        attendance.setFocusable(false);
        Bonus.setFocusable(false);
    }
}
