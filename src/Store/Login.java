
package Store;

import Store.Employee;
import Store.EmpDatabase;
import Store.frame ;
import java.awt.Frame;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    String name ;
    public boolean check = false ; 
    public boolean c_ch = false ;
    
    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(HIDE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Login() {
        initComponents();
        setIconImage( new ImageIcon("wal.jpg").getImage());
        Enter.setMnemonic(KeyEvent.VK_ENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Ttile = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        use = new javax.swing.JTextField();
        paas = new javax.swing.JPasswordField();
        Pass = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        Enter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        Ttile.setBackground(new java.awt.Color(255, 255, 102));
        Ttile.setFont(new java.awt.Font("Pristina", 0, 48)); // NOI18N
        Ttile.setForeground(new java.awt.Color(102, 0, 102));
        Ttile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ttile.setLabelFor(Ttile);
        Ttile.setText("ASM SUPER STORE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 10, 0, 10);
        jPanel1.add(Ttile, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        use.setBackground(new java.awt.Color(102, 0, 102));
        use.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        use.setForeground(new java.awt.Color(255, 255, 255));
        use.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 174;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 10, 0, 128);
        jPanel2.add(use, gridBagConstraints);

        paas.setBackground(new java.awt.Color(102, 0, 102));
        paas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        paas.setForeground(new java.awt.Color(255, 255, 255));
        paas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 174;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 42, 128);
        jPanel2.add(paas, gridBagConstraints);

        Pass.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Pass.setForeground(new java.awt.Color(102, 0, 102));
        Pass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Pass.setLabelFor(paas);
        Pass.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 42, 0);
        jPanel2.add(Pass, gridBagConstraints);

        User.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        User.setForeground(new java.awt.Color(102, 0, 102));
        User.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        User.setLabelFor(use);
        User.setText("User:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 104;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPanel2.add(User, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 86, 0, 10);
        jPanel1.add(jPanel2, gridBagConstraints);

        Enter.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        Enter.setForeground(new java.awt.Color(102, 0, 102));
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 225, 9, 0);
        jPanel1.add(Enter, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
      
        if (use.getText().compareTo("Manager") == 0 && paas.getText().compareTo("987654321") == 0) {
                   check = true ; 
                   setVisible(false);
                   use.setText("");
                   paas.setText("");
        }
        else try {
            if( checkof(use.getText()) && paas.getText().compareTo("12345") == 0)
            {
               
                c_ch = true ;
                setVisible(false);
                name = use.getText();
                System.out.println(name);
                use.setText("");
                paas.setText("");
                
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Wrong UserName or password");
            }
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EnterActionPerformed
    
    
    
    
    boolean checkof(String name) throws Exception
            
    {
        
    EmpDatabase e = new EmpDatabase();
    e.Connect();
    ArrayList<Employee> c = e.getEmpdata() ;
    
    for(int i =0 ; i < c.size() ; i++)
    {
        if(c.get(i).type.compareToIgnoreCase("Cashier")==0 && c.get(i).name.compareToIgnoreCase(name)==0)
        {
            return true ; 
        }
    }
    
    
    return false ;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    public javax.swing.JLabel Pass;
    private javax.swing.JLabel Ttile;
    public javax.swing.JLabel User;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField paas;
    private javax.swing.JTextField use;
    // End of variables declaration//GEN-END:variables
}
