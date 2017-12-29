/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import Store.Employee;
import Store.EmpDatabase;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hii
 */
public class emprev extends javax.swing.JPanel {

    /**
     * Creates new form emprev
     */
    Employee s;

    DefaultTableModel model;
    EmpDatabase e;
    ArrayList<Employee> a = new ArrayList<Employee>();
    ArrayList<Employee> t = new ArrayList<Employee>();

    public emprev() throws Exception {
        initComponents();
        model = (DefaultTableModel) EmpTable.getModel();
        e = new EmpDatabase();
        e.Connect();

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        search1 = new javax.swing.JTextField();
        Search1 = new javax.swing.JLabel();
        name = new javax.swing.JRadioButton();
        typeofpr = new javax.swing.JRadioButton();
        Delete = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type", "Attendance", "Salary", "Bonus", "Shift"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmpTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1143;
        gridBagConstraints.ipady = 679;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 46, 1, 0);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Data");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 385;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 105, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        Search.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Search.setForeground(new java.awt.Color(102, 0, 102));
        Search.setText("Search");
        Search.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 25, 0, 0);
        jPanel1.add(Search, gridBagConstraints);

        Update.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Update.setForeground(new java.awt.Color(102, 0, 102));
        Update.setText("Update");
        Update.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 25, 0, 0);
        jPanel1.add(Update, gridBagConstraints);

        Refresh.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Refresh.setForeground(new java.awt.Color(102, 0, 102));
        Refresh.setText("Refresh");
        Refresh.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 25, 0, 0);
        jPanel1.add(Refresh, gridBagConstraints);

        search1.setBackground(new java.awt.Color(102, 0, 102));
        search1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        search1.setForeground(new java.awt.Color(255, 255, 255));
        search1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search1.setCaretColor(new java.awt.Color(255, 255, 255));
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel1.add(search1, gridBagConstraints);

        Search1.setFont(new java.awt.Font("Felix Titling", 0, 36)); // NOI18N
        Search1.setForeground(new java.awt.Color(51, 0, 51));
        Search1.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 10, 0, 0);
        jPanel1.add(Search1, gridBagConstraints);

        name.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(name);
        name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(51, 0, 51));
        name.setText("By Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 35, 0, 0);
        jPanel1.add(name, gridBagConstraints);

        typeofpr.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(typeofpr);
        typeofpr.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        typeofpr.setForeground(new java.awt.Color(51, 0, 51));
        typeofpr.setText("By Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 35, 0, 0);
        jPanel1.add(typeofpr, gridBagConstraints);

        Delete.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Delete.setForeground(new java.awt.Color(102, 0, 102));
        Delete.setText("Delete");
        Delete.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 25, 0, 0);
        jPanel1.add(Delete, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1445, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        EmpDataform p = null;
        try {
            p = new EmpDataform();
            p.Bonus.setVisible(false);
            p.supp.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(emprev.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setVisible(true);


    }//GEN-LAST:event_UpdateActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:

        try {
            // TODO add your handling code here:
            a.clear();
            a = e.getEmpdata();
            model.setRowCount(0);

            for (int i = 0; i < a.size(); i++) {

                Object[] row = {a.get(i).id, a.get(i).name, a.get(i).type, a.get(i).Attendance, a.get(i).salary, a.get(i).bonus, a.get(i).Shift};

                model.addRow(row);

            }
            model.fireTableDataChanged();
            //  e.disconnect();
            model.setRowCount(a.size());
        } catch (Exception ex) {
            Logger.getLogger(stockrev.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_RefreshActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
       a.clear();
        boolean flag = false;
        try {
            // TODO add your handling code here:
        
            a = e.getEmpdata();
            if (name.isSelected()) {
                for (int count = 0; count < a.size(); count++) {
                    if (search1.getText().compareToIgnoreCase(a.get(count).name) == 0) {
                        s = a.get(count).Clone();
                        flag = true;
                        break;
                    }

                }
                if (flag == true) {
                    EmpDataform pf = new EmpDataform();
                    pf.setVisible(true);
                    pf.getemp(s);
             
                    pf.Add.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(this, "Employee not found in Data");
                }
            } else if (typeofpr.isSelected()) {
                t.clear();

                for (int count = 0; count < a.size(); count++) {

                    if (search1.getText().compareToIgnoreCase(a.get(count).type) == 0) {
                        t.add(a.get(count).Clone());

                    }
                }
                model.setRowCount(0);
                for (int i = 0; i < t.size(); i++) {

                    Object[] row = {t.get(i).id, t.get(i).name, t.get(i).type, t.get(i).Attendance, t.get(i).salary, t.get(i).bonus, t.get(i).Shift};

                    model.addRow(row);

                }
                model.fireTableDataChanged();

            }
        } catch (Exception ex) {
            Logger.getLogger(stockrev.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SearchActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try {
            // TODO add your handling code here:
            EmpDataform p = new EmpDataform();
            p.setVisible(true);
            p.delEmpform();
            
        } catch (Exception ex) {
            Logger.getLogger(emprev.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTable EmpTable;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Search;
    private javax.swing.JLabel Search1;
    private javax.swing.JButton Update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton name;
    private javax.swing.JTextField search1;
    private javax.swing.JRadioButton typeofpr;
    // End of variables declaration//GEN-END:variables

}
