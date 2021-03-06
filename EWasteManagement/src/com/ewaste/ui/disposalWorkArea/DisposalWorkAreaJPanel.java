/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.ui.disposalWorkArea;

import com.ewaste.business.enterprise.Enterprise;
import com.ewaste.business.network.Network;
import com.ewaste.business.organization.DisposalOrganization;
import com.ewaste.business.organization.TestingOrganization;
import com.ewaste.business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author varsha bhanushali
 */
public class DisposalWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisposalWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private DisposalOrganization disposalOrganization;
    private Enterprise enterprise;
    private Network network;
    public DisposalWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, DisposalOrganization disposalOrganization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount=userAccount;
        this.disposalOrganization = disposalOrganization;
        this.enterprise = enterprise;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTestingDepartment = new javax.swing.JLabel();
        btnNewTask = new javax.swing.JButton();
        btnAssignTask = new javax.swing.JButton();

        lblTestingDepartment.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTestingDepartment.setText("Disposal Department");

        btnNewTask.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnNewTask.setText("New Task");
        btnNewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTaskActionPerformed(evt);
            }
        });

        btnAssignTask.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAssignTask.setText("Assigned Task");
        btnAssignTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAssignTask)
                            .addComponent(btnNewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lblTestingDepartment)))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTestingDepartment)
                .addGap(68, 68, 68)
                .addComponent(btnNewTask)
                .addGap(32, 32, 32)
                .addComponent(btnAssignTask)
                .addContainerGap(444, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTaskActionPerformed

        DisposalNewTaskPanel disposalNewTaskPanel = new DisposalNewTaskPanel(userProcessContainer, userAccount, disposalOrganization, enterprise, network);
        userProcessContainer.add("DisposalNewTaskPanel",disposalNewTaskPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNewTaskActionPerformed

    private void btnAssignTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignTaskActionPerformed
        DisposalAssignedTaskPanel disposalAssignedTaskPanel = new DisposalAssignedTaskPanel(userProcessContainer, userAccount, disposalOrganization, enterprise, network);
        userProcessContainer.add("DisposalAssignedTaskPanel",disposalAssignedTaskPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAssignTaskActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignTask;
    private javax.swing.JButton btnNewTask;
    private javax.swing.JLabel lblTestingDepartment;
    // End of variables declaration//GEN-END:variables
}
