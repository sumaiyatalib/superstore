/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hii
 */
public class stockrev extends javax.swing.JPanel {

    /**
     * Creates new form stockrev
     */
    Product s = null;
    ArrayList<Product> t = new ArrayList<>();
    ArrayList<Product> a = new ArrayList<Product>();
    DefaultTableModel model;
    proddatabase p;

    public stockrev() throws Exception {
        initComponents();
        p = new proddatabase();
        p.Connect();

        model = (DefaultTableModel) jTable1.getModel();
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
        Search = new javax.swing.JLabel();
        name = new javax.swing.JRadioButton();
        typeofpr = new javax.swing.JRadioButton();
        update = new javax.swing.JButton();
        searchbut = new javax.swing.JButton();
        search1 = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        existing = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setAutoscrolls(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 519));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        Search.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Search.setForeground(new java.awt.Color(51, 0, 51));
        Search.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 88, 0, 0);
        jPanel1.add(Search, gridBagConstraints);

        buttonGroup1.add(name);
        name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(51, 0, 51));
        name.setText("By Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 64, 0, 0);
        jPanel1.add(name, gridBagConstraints);

        buttonGroup1.add(typeofpr);
        typeofpr.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        typeofpr.setForeground(new java.awt.Color(51, 0, 51));
        typeofpr.setText("By Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 64, 0, 0);
        jPanel1.add(typeofpr, gridBagConstraints);

        update.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        update.setForeground(new java.awt.Color(102, 0, 102));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 54, 0, 0);
        jPanel1.add(update, gridBagConstraints);

        searchbut.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        searchbut.setForeground(new java.awt.Color(102, 0, 102));
        searchbut.setText("Search");
        searchbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 54, 0, 0);
        jPanel1.add(searchbut, gridBagConstraints);

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
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 54, 0, 0);
        jPanel1.add(search1, gridBagConstraints);

        refresh.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        refresh.setForeground(new java.awt.Color(102, 0, 102));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 54, 0, 0);
        jPanel1.add(refresh, gridBagConstraints);

        existing.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        existing.setForeground(new java.awt.Color(102, 0, 102));
        existing.setText("Update Existing");
        existing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existingActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 26, 137, 39);
        jPanel1.add(existing, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 11, 0);
        add(jPanel1, gridBagConstraints);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 0, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Type", "Price", "Sub Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(255, 255, 240));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 633;
        gridBagConstraints.ipady = 418;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 10);
        add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("TT Masters DEMO Birds Regular", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of product");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 272;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 86, 0, 0);
        add(jLabel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        productform f = null;
        try {
            f = new productform();
        } catch (Exception ex) {
            Logger.getLogger(stockrev.class.getName()).log(Level.SEVERE, null, ex);
        }
        f.setVisible(true);
        f.Update.setVisible(false);
        f.Add.setVisible(true);

    }//GEN-LAST:event_updateActionPerformed

    private void searchbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbutActionPerformed
        boolean flag = false;
        a.clear();
        try {
            // TODO add your handling code here:
            a = p.getProdata();
            if (name.isSelected()) {
                for (int count = 0; count < a.size(); count++) {
                    if (search1.getText().compareToIgnoreCase(a.get(count).getName()) == 0) {
                        s = a.get(count).Clone();
                        flag = true;
                        break;
                    }

                }
                if (flag == true) {
                    productform pf = new productform();
                    pf.setVisible(true);
                    pf.getPro(s);
                    //pf.Update.setVisible(false);

                    System.out.println(s);
                } else {

                    JOptionPane.showMessageDialog(this, "Product not found in Data");

                }
            } else if (typeofpr.isSelected()) {

                for (int count = 0; count < a.size(); count++) {

                    if (search1.getText().compareToIgnoreCase(a.get(count).getType()) == 0) {
                        t.add(a.get(count).Clone());

                    }
                }
                model.setRowCount(0);
                for (Product t1 : t) {
                    Object[] row = {t1.getId(), t1.getName(), t1.getStock(), t1.getType(), t1.getPrice(), t1.getSubtype()};
                    model.addRow(row);
                }
                model.fireTableDataChanged();

            }
        } catch (Exception ex) {
            Logger.getLogger(stockrev.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_searchbutActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        try {
            a.clear();
            a = p.getProdata();
        } catch (SQLException ex) {
            Logger.getLogger(stockrev.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.setRowCount(0);

        for (int i = 0; i < a.size(); i++) {

            Object[] row = {a.get(i).getId(), a.get(i).getName(), a.get(i).getStock(), a.get(i).getType(), a.get(i).getPrice(), a.get(i).getSubtype()};

            model.addRow(row);

        }
        model.fireTableDataChanged();


    }//GEN-LAST:event_refreshActionPerformed

    private void existingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existingActionPerformed
        // TODO add your handling code here
        a.clear();
        productform f = null;
        try {
            f = new productform();
        } catch (Exception ex) {
            Logger.getLogger(stockrev.class.getName()).log(Level.SEVERE, null, ex);
        }
        f.setVisible(true);
        f.id.setVisible(true);
        f.jLabel2.setVisible(true);
        f.setPrce.setVisible(true);
        f.setstock.setVisible(true);
    }//GEN-LAST:event_existingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Search;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton existing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton name;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField search1;
    private javax.swing.JButton searchbut;
    private javax.swing.JRadioButton typeofpr;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
