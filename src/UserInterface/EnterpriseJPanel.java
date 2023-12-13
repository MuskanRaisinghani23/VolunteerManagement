/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Volunteer.Volunteer;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Anusha
 */
public class EnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseJPanel
     */
    
    Business business;
    private JPanel homeJPanel;
    
    public EnterpriseJPanel(JPanel homeJPanel, Business business) {
        initComponents();
        this.homeJPanel = homeJPanel;
        this.business = business;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        headinglbl = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        cclogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageOrg = new javax.swing.JTable();
        idlbl = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        citytxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        needvoltxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        statetxt = new javax.swing.JTextField();
        countrytxt = new javax.swing.JTextField();
        updatedetailsbtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        orgAnalyticsBtn = new javax.swing.JButton();
        volAnalyticsBtn = new javax.swing.JButton();
        volAnalyticsBtn1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1597, 978));
        setPreferredSize(new java.awt.Dimension(1597, 978));

        jSplitPane1.setDividerLocation(130);
        jSplitPane1.setDividerSize(2);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        headinglbl.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        headinglbl.setForeground(new java.awt.Color(0, 0, 153));
        headinglbl.setText("ENTERPRISE : ");

        logoutBtn.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(0, 0, 153));
        logoutBtn.setText("LOGOUT");
        logoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        cclogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cclogo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 459, Short.MAX_VALUE)
                .addComponent(headinglbl)
                .addGap(544, 544, 544)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(headinglbl)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cclogo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 153));
        jTabbedPane2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("Welcome to WE VOLUNTEER'S Enterprise Panel");

        jLabel16.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setText("<html>Enterprises play a crucial role in fostering community engagement. At WEVolunteer, your participation makes a significant difference. <br>Sign up to connect with volunteers, NGOs, and aid requesters.<br> Seamlessly integrate your enterprise into initiatives that align with your values.<br> Together, we can build a prosperous, loving, and globally connected community. Join us in making a positive impact!<html>\n");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ent home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(551, 551, 551)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel15)
                .addGap(26, 26, 26)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Home", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        manageOrg.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        manageOrg.setForeground(new java.awt.Color(0, 0, 153));
        manageOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Organization Id", "Name", "City", "State", "Country", "NeedVolunteerCount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        manageOrg.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(manageOrg);
        if (manageOrg.getColumnModel().getColumnCount() > 0) {
            manageOrg.getColumnModel().getColumn(0).setResizable(false);
            manageOrg.getColumnModel().getColumn(1).setResizable(false);
            manageOrg.getColumnModel().getColumn(1).setPreferredWidth(200);
            manageOrg.getColumnModel().getColumn(2).setResizable(false);
            manageOrg.getColumnModel().getColumn(3).setResizable(false);
            manageOrg.getColumnModel().getColumn(4).setResizable(false);
            manageOrg.getColumnModel().getColumn(5).setResizable(false);
        }

        idlbl.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        idlbl.setForeground(new java.awt.Color(0, 0, 153));
        idlbl.setText("ID:");

        idtxt.setEditable(false);
        idtxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Name");

        nametxt.setEditable(false);
        nametxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("City");

        citytxt.setEditable(false);
        citytxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("Need Volunteer Count");

        needvoltxt.setEditable(false);
        needvoltxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("State");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Country");

        statetxt.setEditable(false);
        statetxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        countrytxt.setEditable(false);
        countrytxt.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        updatedetailsbtn.setBackground(new java.awt.Color(0, 0, 153));
        updatedetailsbtn.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        updatedetailsbtn.setForeground(new java.awt.Color(255, 255, 255));
        updatedetailsbtn.setText("View");
        updatedetailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedetailsbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(updatedetailsbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(needvoltxt)
                            .addComponent(idtxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nametxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(citytxt, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(statetxt)
                            .addComponent(countrytxt))))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updatedetailsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(statetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(countrytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(citytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel2))
                                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(needvoltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6)))))
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Manage Organizations", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        orgAnalyticsBtn.setBackground(new java.awt.Color(0, 0, 153));
        orgAnalyticsBtn.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        orgAnalyticsBtn.setForeground(new java.awt.Color(255, 255, 255));
        orgAnalyticsBtn.setText("Organization Volunteer Requirements");
        orgAnalyticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAnalyticsBtnActionPerformed(evt);
            }
        });

        volAnalyticsBtn.setBackground(new java.awt.Color(0, 0, 153));
        volAnalyticsBtn.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        volAnalyticsBtn.setForeground(new java.awt.Color(255, 255, 255));
        volAnalyticsBtn.setText("Volunteer Gender Distribution");
        volAnalyticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volAnalyticsBtnActionPerformed(evt);
            }
        });

        volAnalyticsBtn1.setBackground(new java.awt.Color(0, 0, 153));
        volAnalyticsBtn1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        volAnalyticsBtn1.setForeground(new java.awt.Color(255, 255, 255));
        volAnalyticsBtn1.setText("Volunteer Age Distribution");
        volAnalyticsBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volAnalyticsBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(orgAnalyticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(volAnalyticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(volAnalyticsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(volAnalyticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(volAnalyticsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(orgAnalyticsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(655, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Analytics", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updatedetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedetailsbtnActionPerformed
        int selectedRowIndex = manageOrg.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
        }
        else{
            DefaultTableModel model = (DefaultTableModel) manageOrg.getModel();
            idtxt.setText(String.valueOf(model.getValueAt(selectedRowIndex, 0)));
            nametxt.setText(String.valueOf(model.getValueAt(selectedRowIndex, 1)));
            citytxt.setText(String.valueOf(model.getValueAt(selectedRowIndex, 2)));
            statetxt.setText(String.valueOf(model.getValueAt(selectedRowIndex, 3)));
            countrytxt.setText(String.valueOf(model.getValueAt(selectedRowIndex, 4)));
            needvoltxt.setText(String.valueOf(model.getValueAt(selectedRowIndex, 5)));
            
        }
    }//GEN-LAST:event_updatedetailsbtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        homeJPanel.remove(this);
        CardLayout layout = (CardLayout) homeJPanel.getLayout();
        layout.previous(homeJPanel);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void orgAnalyticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAnalyticsBtnActionPerformed
        CategoryDataset dataset = createOrgDataset();

        // Create chart based on the dataset
        JFreeChart chart = ChartFactory.createBarChart(
                "Organization's Volunteer Requirement Distribution",     // Chart title
                "Organizations",             // X-axis label
                "Number of volunteers required",    // Y-axis label
                dataset);
        customizeBarChart(chart);
        
        ChartFrame frame = new ChartFrame("Results", chart);
        frame.pack();
        frame.setVisible(true);

    }//GEN-LAST:event_orgAnalyticsBtnActionPerformed

    private void volAnalyticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volAnalyticsBtnActionPerformed
        PieDataset dataset = createVolunteerDataset();
        
        JFreeChart chart = ChartFactory.createPieChart(
                "Volunteer Distribution with gender",
                dataset
        );
        ChartFrame frame = new ChartFrame("Results", chart);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_volAnalyticsBtnActionPerformed

    private void volAnalyticsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volAnalyticsBtn1ActionPerformed
        CategoryDataset dataset = createVolAgeDataset();

        // Create chart based on the dataset
        JFreeChart chart = ChartFactory.createBarChart(
                "Volunteer Age Distribution",     // Chart title
                "Age groups",             // X-axis label
                "Number of volunteers in the group",    // Y-axis label
                dataset);
        customizeBarChart(chart);
        
        ChartFrame frame = new ChartFrame("Results", chart);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_volAnalyticsBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cclogo;
    private javax.swing.JTextField citytxt;
    private javax.swing.JTextField countrytxt;
    private javax.swing.JLabel headinglbl;
    private javax.swing.JLabel idlbl;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable manageOrg;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField needvoltxt;
    private javax.swing.JButton orgAnalyticsBtn;
    private javax.swing.JTextField statetxt;
    private javax.swing.JButton updatedetailsbtn;
    private javax.swing.JButton volAnalyticsBtn;
    private javax.swing.JButton volAnalyticsBtn1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        Enterprise enter = business.getEnterprise();
        String activeEnterType = enter.getType();
        headinglbl.setText(activeEnterType + " Enterprise");
        
//        Table populate
        DefaultTableModel dtm = (DefaultTableModel) manageOrg.getModel();
        dtm.setRowCount(0);
        for(Organization org: enter.getOrglist()){
            Object[] row = new Object[6];
            row[0] = org.getId();
            row[1] = org.getName();
            row[2] = org.getCity();
            row[3] = org.getState();
            row[4] = org.getCountry();
            row[5] = org.getNeedVolunteerCount();
            dtm.addRow(row);      
        }
    }

    private void customizeBarChart(JFreeChart chart) {
        chart.setBackgroundPaint(Color.white);
        CategoryPlot plot = chart.getCategoryPlot();
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45); // Rotate labels for better readability
        domainAxis.setTickLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        chart.getLegend().setItemFont(new Font("SansSerif", Font.PLAIN, 12));
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        // Set maximum bar width in data units
        renderer.setMaximumBarWidth(0.1);
    }

    private CategoryDataset createOrgDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        HashMap<String, Integer> org_hash = new HashMap<String, Integer>();
        
        ArrayList<Organization> olist = business.getEnterprise().getOrglist();
        
        for(Organization o: olist){
            org_hash.put(o.getName(), o.getNeedVolunteerCount());
        }
        
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(org_hash.entrySet());
        Comparator<Map.Entry<String, Integer>> valueComparator = Comparator.comparing(Map.Entry::getValue);
        entryList.sort(valueComparator);
        
        for (int i = entryList.size() - 1; i >= 0; i--) {
            Map.Entry<String, Integer> entry = entryList.get(i);
            String org_name = entry.getKey();
            int value = entry.getValue();
            dataset.addValue(value, "Organization Volunteer Requirements", org_name);
        }
        
        return (CategoryDataset) dataset;
    }
    
    private PieDataset createVolunteerDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        HashMap<String, Integer> vol_hash = new HashMap<String, Integer>();
        ArrayList<Volunteer> vlist = business.getVolunteerdirectory().getAllVol();
        int mcount=1;
        int fcount=1;
        int ocount=1;
        
        for(Volunteer v: vlist){
            if(v.getGender().equalsIgnoreCase("Male")){
                vol_hash.put("Male", mcount);
                mcount+=1;
            }
            else if(v.getGender().equalsIgnoreCase("Female")){
                vol_hash.put("Female", fcount);
                fcount+=1;
            }
            else{
                vol_hash.put("Others", ocount);
                ocount+=1;
            }
        }
//        vol_hash.forEach((key, value) -> System.out.println(key + " " + value));

        
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(vol_hash.entrySet());
        Comparator<Map.Entry<String, Integer>> valueComparator = Comparator.comparing(Map.Entry::getValue);
        entryList.sort(valueComparator);
        for (int i = entryList.size() - 1; i >= 0; i--) {
            Map.Entry<String, Integer> entry = entryList.get(i);
            String s = entry.getKey();
            int value = entry.getValue();
            // Add data to the dataset
            dataset.setValue(s,value);
        }

        return (PieDataset) dataset;
    }

    private CategoryDataset createVolAgeDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        HashMap<String, Integer> age_hash = new HashMap<String, Integer>();
        
        ArrayList<Volunteer> vlist = business.getVolunteerdirectory().getAllVol();
        
        // Age groups
        int young_adult = 1;
        int adult_mid = 1;
        int mid_senior = 1;
        int senior = 1;
        
        for(Volunteer v: vlist){
            if(v.getAge() >= 15 && v.getAge()<= 24 ){
                age_hash.put("Young(15-24)", young_adult);
                young_adult+=1;
            }
            else if(v.getAge() >= 25 && v.getAge()<= 40){
                age_hash.put("Adult(25-40)", adult_mid);
                adult_mid+=1;
            }
            else if(v.getAge() >= 41 && v.getAge()<= 55){
                age_hash.put("Middle Aged(41-55)", mid_senior);
                mid_senior+=1;
            }
            else if(v.getAge() > 55){
                age_hash.put("Senior(55+)", senior);
                senior+=1;
            }
        }
        
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(age_hash.entrySet());
//        Comparator<Map.Entry<String, Integer>> valueComparator = Comparator.comparing(Map.Entry::getValue);
//        entryList.sort(valueComparator);
        
        for (int i = entryList.size() - 1; i >= 0; i--) {
            Map.Entry<String, Integer> entry = entryList.get(i);
            String age_group = entry.getKey();
            int value = entry.getValue();
            dataset.addValue(value, "Volunteer age group count", age_group);
        }
        
        return (CategoryDataset) dataset;
    }
}
