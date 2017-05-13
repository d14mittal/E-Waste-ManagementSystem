/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.ui.extraction;

import com.ewaste.business.enterprise.Enterprise;
import com.ewaste.business.network.Network;
import com.ewaste.business.organization.ExtractionOrganization;
import com.ewaste.business.organization.Organization;
import com.ewaste.business.organization.UserOrganization;
import com.ewaste.business.useraccount.UserAccount;
import com.ewaste.business.workqueue.WorkQueue;
import com.ewaste.business.workqueue.WorkRequest;
import com.ewaste.ui.sortingworkarea.SortAssignedTaskPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jyotsna Khatter
 */
public class ExtractionWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form extractionWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;

    public ExtractionWorkAreaPanel(JPanel userProcessContainer, UserAccount userAccount,  ExtractionOrganization organization,Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
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

        jLabel1 = new javax.swing.JLabel();
        assignedTaskButton = new javax.swing.JButton();
        newTaskButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Extraction Department");

        assignedTaskButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        assignedTaskButton.setText("Assigned Task");
        assignedTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignedTaskButtonActionPerformed(evt);
            }
        });

        newTaskButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        newTaskButton.setText("New Task");
        newTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTaskButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(assignedTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addComponent(assignedTaskButton)
                .addGap(72, 72, 72)
                .addComponent(newTaskButton)
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignedTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignedTaskButtonActionPerformed
        WorkQueue workQueue = organization.getWorkQueue();
        ExtractionAssignedTaskPanel extractionAssignedTaskPanel = new ExtractionAssignedTaskPanel(userProcessContainer,userAccount,network,enterprise,organization);
        userProcessContainer.add("ExtractionAssignedTaskPanel",extractionAssignedTaskPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_assignedTaskButtonActionPerformed

    private void newTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTaskButtonActionPerformed
        ExtractionNewTaskPanel extractionNewTaskPanel = new ExtractionNewTaskPanel(userProcessContainer,userAccount,network,enterprise,organization);
        userProcessContainer.add("ExtractionNewTaskPanel",extractionNewTaskPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_newTaskButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignedTaskButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newTaskButton;
    // End of variables declaration//GEN-END:variables
}
