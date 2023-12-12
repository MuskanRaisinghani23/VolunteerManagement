/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Business;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Anusha
 */
public class OrganizationSignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseJPanel
     */
    private JPanel homeJPanel;
    Business business;
    public OrganizationSignUpJPanel(JPanel homeJPanel, Business business) {
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
        nametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        statetxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        countrytxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        enterprisejComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 153));
        setMinimumSize(new java.awt.Dimension(1477, 787));
        setPreferredSize(new java.awt.Dimension(1477, 787));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signuplbl.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        signuplbl.setForeground(new java.awt.Color(0, 0, 153));
        signuplbl.setText("ORGANIZATION SIGNUP");
        add(signuplbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 279, 39));

        idlbl.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        idlbl.setForeground(new java.awt.Color(0, 0, 153));
        idlbl.setText("ID:");
        add(idlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 108, 29));

        idtxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 230, 30));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Create Password:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 122, 28));

        createpwd.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        createpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createpwdActionPerformed(evt);
            }
        });
        add(createpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 230, 30));

        jLabel13.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Confirm Password:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 122, 28));

        confirmpwd.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(confirmpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 230, 30));

        accountbtn.setBackground(new java.awt.Color(0, 0, 153));
        accountbtn.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        accountbtn.setForeground(new java.awt.Color(255, 255, 255));
        accountbtn.setText("CREATE ORGANIZATION");
        accountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountbtnActionPerformed(evt);
            }
        });
        add(accountbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, -1, 33));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        nametxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 230, 30));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Address");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, -1));

        addresstxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 230, 30));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("City");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, -1));

        txtCity.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 230, 30));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("State");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, -1));

        statetxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(statetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 230, 30));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Country");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        countrytxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(countrytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 230, 30));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Enterprise Type:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        enterprisejComboBox.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        enterprisejComboBox.setForeground(new java.awt.Color(0, 0, 153));
        enterprisejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterprisejComboBoxActionPerformed(evt);
            }
        });
        add(enterprisejComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 230, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bg2.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createpwdActionPerformed

    private void accountbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountbtnActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(idtxt.getText());
        String Name = nametxt.getText();
        char[] Password = createpwd.getPassword();
        char[] confirmPassword = confirmpwd.getPassword();
        String entType = enterprisejComboBox.getSelectedItem().toString();
        Boolean passwordVerification = passwordVerify(Password, confirmPassword);
        String address = addresstxt.getText();
        String city = txtCity.getText();
        String state = statetxt.getText();
        String country = countrytxt.getText();
        if(passwordVerification){
            JOptionPane.showMessageDialog(null, "Organization" + Name +" created successfully.");
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
     
    private void enterprisejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterprisejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterprisejComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountbtn;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JPasswordField confirmpwd;
    private javax.swing.JTextField countrytxt;
    private javax.swing.JPasswordField createpwd;
    private javax.swing.JComboBox<String> enterprisejComboBox;
    private javax.swing.JLabel idlbl;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel signuplbl;
    private javax.swing.JTextField statetxt;
    private javax.swing.JTextField txtCity;
    // End of variables declaration//GEN-END:variables
}
