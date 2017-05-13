/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package com.ewaste.ui.administrativerole;

import com.ewaste.business.enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        lblValue.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeadeer = new javax.swing.JLabel();
        btnManageUserAccount = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();
        lblEnterprise = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeadeer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeadeer.setText("My Work Area -Adminstrative Role");
        add(lblHeadeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnManageUserAccount.setText("Manage User Account");
        btnManageUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserAccountActionPerformed(evt);
            }
        });
        add(btnManageUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 150, -1));

        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        add(btnManageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 150, -1));

        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });
        add(btnManageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        lblEnterprise.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnterprise.setText("Enterprise :");
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        lblValue.setText("<value>");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccountActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserAccountActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUserAccount;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblHeadeer;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables
    
}