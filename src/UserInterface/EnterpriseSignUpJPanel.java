/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Business;
import Business.Enterprise.Enterprise;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Anusha
 */
public class EnterpriseSignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseJPanel
     */
    private JPanel homeJPanel;
    
    Business business;
    public EnterpriseSignUpJPanel(JPanel homeJPanel, Business business) {
        initComponents();
        this.homeJPanel = homeJPanel;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signuplbl = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        createpwd = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        confirmpwd = new javax.swing.JPasswordField();
        accountbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signuplbl.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        signuplbl.setForeground(new java.awt.Color(0, 0, 153));
        signuplbl.setText("ENTERPRISE SIGNUP");
        add(signuplbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 240, 39));

        idlbl.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        idlbl.setForeground(new java.awt.Color(0, 0, 153));
        idlbl.setText("Type:");
        add(idlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 108, 29));

        idtxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 219, 29));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Create Password:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 122, 28));

        createpwd.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(createpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 219, 28));

        jLabel13.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Confirm Password:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 122, 28));

        confirmpwd.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(confirmpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 219, 28));

        accountbtn.setBackground(new java.awt.Color(0, 0, 153));
        accountbtn.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        accountbtn.setForeground(new java.awt.Color(255, 255, 255));
        accountbtn.setText("CREATE ENTERPRISE");
        accountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountbtnActionPerformed(evt);
            }
        });
        add(accountbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bg2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void accountbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountbtnActionPerformed
        // TODO add your handling code here:
        String Type = idtxt.getText();
        char[] Password = createpwd.getPassword();
        char[] confirmPassword = confirmpwd.getPassword();
        Boolean passwordVerification = passwordVerify(Password, confirmPassword);
        
        Enterprise ent = business.getEnterprisedirectory().newEnterprise(Type, Password);
        
        if(passwordVerification){
            JOptionPane.showMessageDialog(null, "Enterprise" + Type +" account created successfully.");
            
        }
    }//GEN-LAST:event_accountbtnActionPerformed

     private Boolean passwordVerify(char[] newPassword, char[] confirmPassword) {
        Boolean flag = true;
        String password = new String(newPassword);
        if(((password.matches("[a-zA-Z0-9@._-]{3,}") == false))){
            JOptionPane.showMessageDialog(null, "Incorrect Password Format");
            flag = false;
        }
        String confirmpassword = new String(confirmPassword);
        if(password.equals(confirmpassword)==false){
            JOptionPane.showMessageDialog(null, "Confirm password doesnot match with set Password");
            flag = false;
        }
        return flag;        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountbtn;
    private javax.swing.JPasswordField confirmpwd;
    private javax.swing.JPasswordField createpwd;
    private javax.swing.JLabel idlbl;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel signuplbl;
    // End of variables declaration//GEN-END:variables
}
