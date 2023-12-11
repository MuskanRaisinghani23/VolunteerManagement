/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Business;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Anusha
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    Business business;
    private JPanel homeJPanel;
    
    public LoginJPanel(JPanel homeJPanel, Business business) {
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

        loginlbl = new javax.swing.JLabel();
        useridlbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        passwordpwd = new javax.swing.JPasswordField();
        useridtxt = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        CheckBox = new javax.swing.JCheckBox();
        loginbtn = new javax.swing.JButton();
        useridlbl1 = new javax.swing.JLabel();
        comboSelected = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 1100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginlbl.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        loginlbl.setForeground(new java.awt.Color(0, 0, 153));
        loginlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginlbl.setText("LOGIN TO PROCEED");
        add(loginlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 111, 1488, 40));

        useridlbl.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        useridlbl.setForeground(new java.awt.Color(0, 0, 153));
        useridlbl.setText("ID/Type:");
        add(useridlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 220, 116, 33));

        passwordlbl.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(0, 0, 153));
        passwordlbl.setText("Password:");
        add(passwordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 280, 116, 33));

        passwordpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordpwdActionPerformed(evt);
            }
        });
        add(passwordpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 209, 33));

        useridtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridtxtActionPerformed(evt);
            }
        });
        add(useridtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 209, 33));

        backbtn.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(0, 0, 153));
        backbtn.setText("<< back to Homepage");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 40, -1, 33));

        CheckBox.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        CheckBox.setForeground(new java.awt.Color(0, 0, 153));
        CheckBox.setText(" show password ");
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });
        add(CheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 128, -1));

        loginbtn.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(0, 0, 153));
        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, -1, -1));

        useridlbl1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        useridlbl1.setForeground(new java.awt.Color(0, 0, 153));
        useridlbl1.setText("Login As:");
        add(useridlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 116, 33));

        comboSelected.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        comboSelected.setForeground(new java.awt.Color(0, 0, 153));
        comboSelected.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enterprise", "Organization", "Volunteer" }));
        comboSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectedActionPerformed(evt);
            }
        });
        add(comboSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 209, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bg2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void passwordpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordpwdActionPerformed

    private void useridtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridtxtActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        homeJPanel.remove(this);
        CardLayout layout = (CardLayout) homeJPanel.getLayout();
        layout.previous(homeJPanel);
    }//GEN-LAST:event_backbtnActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        // TODO add your handling code here:

        if(CheckBox.isSelected()){
            passwordpwd.setEchoChar((char)0);
        }
        else{
            passwordpwd.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        String password = new String(passwordpwd.getPassword());
        System.out.println(password);
        // Enterprise option selected
        if(comboSelected.getSelectedItem().toString().equalsIgnoreCase("Enterprise")){
            String Id = useridtxt.getText();
            Enterprise enterprise = business.getEnterprisedirectory().findEnterprise(Id);
            if(enterprise!=null){
                String enterprisePass = String.valueOf(enterprise.getEnterprisePass());
                Boolean checkpassword = (enterprisePass.equals(password)) ? true : false;
                
                if(checkpassword){ // if correct user id and password, go to user panel
                    // Setting current enterprise
                    business.setEnterprise(enterprise);
                    
                    EnterpriseJPanel panel = new EnterpriseJPanel(homeJPanel, business);
                    homeJPanel.add("EnterpriseJPanel" ,panel);
                    CardLayout layout = (CardLayout) homeJPanel.getLayout();
                    layout.next(homeJPanel);
                    
                    useridtxt.setText("");
                    passwordpwd.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Password!","warning", JOptionPane.WARNING_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Student does not exist! Enter valid Student ID");
            }
        }

//        //        Organization option selected
//        if(comboSelected.getSelectedItem().toString().equalsIgnoreCase("Organization")){
//                int Id = Integer.parseInt(useridtxt.getText());
//            Boolean userExist = manageprofessor.searchProfessorIfExist(userId);
//            if(userExist){
//                Boolean checkPassword = manageperson.checkExistingPass(userId, password);
//                if(checkPassword){ // if correct user id and password, go to user panel
//                    manageprofessor.setLoggedProfessorID(userId);
//                    ProfessorJPanel panel = new ProfessorJPanel(homeJPanel, manageprofessor, managecourse, managestudent, manageperson, managegrades);
//                    homeJPanel.add("ProfessorJPanel" ,panel);
//                    CardLayout layout = (CardLayout) homeJPanel.getLayout();
//                    layout.next(homeJPanel);
//                    useridtxt.setText("");
//                    passwordpwd.setText("");
//                }
//                else{
//                    JOptionPane.showMessageDialog(null, "Incorrect Password!","warning", JOptionPane.WARNING_MESSAGE);
//                }
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "Professor does not exist! Enter valid Professor ID");
//            }
//        }
//        if(comboSelected.getSelectedItem().toString().equalsIgnoreCase("Volunteer")){
//              int Id = Integer.parseInt(useridtxt.getText());
//            Boolean userExist = manageprofessor.searchProfessorIfExist(userId);
//            if(userExist){
//                Boolean checkPassword = manageperson.checkExistingPass(userId, password);
//                if(checkPassword){ // if correct user id and password, go to user panel
//                    manageprofessor.setLoggedProfessorID(userId);
//                    ProfessorJPanel panel = new ProfessorJPanel(homeJPanel, manageprofessor, managecourse, managestudent, manageperson, managegrades);
//                    homeJPanel.add("ProfessorJPanel" ,panel);
//                    CardLayout layout = (CardLayout) homeJPanel.getLayout();
//                    layout.next(homeJPanel);
//                    useridtxt.setText("");
//                    passwordpwd.setText("");
//                }
//                else{
//                    JOptionPane.showMessageDialog(null, "Incorrect Password!","warning", JOptionPane.WARNING_MESSAGE);
//                }
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "Professor does not exist! Enter valid Professor ID");
//            }
//        }
//        

    }//GEN-LAST:event_loginbtnActionPerformed

    private void comboSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSelectedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> comboSelected;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel loginlbl;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordpwd;
    private javax.swing.JLabel useridlbl;
    private javax.swing.JLabel useridlbl1;
    private javax.swing.JTextField useridtxt;
    // End of variables declaration//GEN-END:variables
}
