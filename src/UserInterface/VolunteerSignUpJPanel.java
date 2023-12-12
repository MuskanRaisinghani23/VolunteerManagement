/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Business;
import Business.ConfigureABusiness;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Anusha
 */
public class VolunteerSignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseJPanel
     */
     private JPanel homeJPanel;
     Business business;
    public VolunteerSignUpJPanel(JPanel homeJPanel, Business business) {
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
        addtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        citytxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        statetxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        countrytxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genderjComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 153));
        setMinimumSize(new java.awt.Dimension(1477, 787));
        setPreferredSize(new java.awt.Dimension(1477, 787));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signuplbl.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        signuplbl.setForeground(new java.awt.Color(0, 0, 153));
        signuplbl.setText("VOLUNTEER SIGNUP");
        add(signuplbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 279, 39));

        idlbl.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        idlbl.setForeground(new java.awt.Color(0, 0, 153));
        idlbl.setText("ID:");
        add(idlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 108, 29));

        idtxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 219, 29));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Create Password:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 122, 28));

        createpwd.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        createpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createpwdActionPerformed(evt);
            }
        });
        add(createpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 219, 30));

        jLabel13.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Confirm Password:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 122, 28));

        confirmpwd.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        add(confirmpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 219, 28));

        accountbtn.setBackground(new java.awt.Color(0, 0, 153));
        accountbtn.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        accountbtn.setForeground(new java.awt.Color(255, 255, 255));
        accountbtn.setText("CREATE VOLUNTEER");
        accountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountbtnActionPerformed(evt);
            }
        });
        add(accountbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 430, -1, 33));

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        nametxt.setPreferredSize(new java.awt.Dimension(64, 23));
        add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 219, 29));

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Address");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));
        add(addtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, 220, 30));

        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("City");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, -1, -1));
        add(citytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 220, 30));

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("State");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, -1, -1));
        add(statetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, 219, 30));

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Country");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, -1, -1));
        add(countrytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, 220, 30));

        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Gender");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Age");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        agetxt.setPreferredSize(new java.awt.Dimension(64, 23));
        agetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agetxtActionPerformed(evt);
            }
        });
        add(agetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 219, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bg2.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        genderjComboBox.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        genderjComboBox.setForeground(new java.awt.Color(0, 0, 153));
        genderjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        add(genderjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, 220, 30));
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
        int age = Integer.parseInt(agetxt.getText());
        String genderType = genderjComboBox.getSelectedItem().toString();
        Boolean passwordVerification = passwordVerify(Password, confirmPassword);
        String address = addtxt.getText();
        String city = citytxt.getText();
        String state = statetxt.getText();
        String country = countrytxt.getText();
        if(passwordVerification){
            JOptionPane.showMessageDialog(null, "Volunteer" + Name +" created successfully.");
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
    
    private void agetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agetxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountbtn;
    private javax.swing.JTextField addtxt;
    private javax.swing.JTextField agetxt;
    private javax.swing.JTextField citytxt;
    private javax.swing.JPasswordField confirmpwd;
    private javax.swing.JTextField countrytxt;
    private javax.swing.JPasswordField createpwd;
    private javax.swing.JComboBox<String> genderjComboBox;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel signuplbl;
    private javax.swing.JTextField statetxt;
    // End of variables declaration//GEN-END:variables
}
