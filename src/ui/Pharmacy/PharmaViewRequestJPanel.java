/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Pharmacy;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.PharmaceuticalEnterprise;
import business.Organization.Organization;
import business.Organization.PharmacyOrganization;
import business.UserAccount.UserAccount;
import business.WorkQueue.PharmacistWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shah0    
 */
public class PharmaViewRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmaViewRequestJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    PharmacyOrganization Organization;
    UserAccount userAccount;
    public PharmaViewRequestJPanel(JPanel userProcessContainer, EcoSystem system,PharmacyOrganization Organization,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.Organization = Organization;
        this.userAccount = userAccount;
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

        lblHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPharmaViewRequest = new javax.swing.JTable();
        btnAssignRequest = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 241, 222));

        lblHeader.setBackground(new java.awt.Color(129, 178, 154));
        lblHeader.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(61, 64, 91));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage Requests");

        tblPharmaViewRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient's Name", "Doctor's Name", "Status", "Pharmacist"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPharmaViewRequest);

        btnAssignRequest.setBackground(new java.awt.Color(129, 178, 154));
        btnAssignRequest.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnAssignRequest.setForeground(new java.awt.Color(61, 64, 58));
        btnAssignRequest.setText("Assign Request");
        btnAssignRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseExited(evt);
            }
        });
        btnAssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRequestActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(129, 178, 154));
        btnView.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(61, 64, 58));
        btnView.setText("View");
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewMouseExited(evt);
            }
        });
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(btnAssignRequest)
                        .addGap(43, 43, 43)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignRequest)
                    .addComponent(btnView))
                .addGap(103, 103, 103))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseEntered
        btnAssignRequest.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseEntered

    private void btnAssignRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseExited
        btnAssignRequest.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseExited

    private void btnAssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPharmaViewRequest.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        PharmacistWorkRequest request = (PharmacistWorkRequest)tblPharmaViewRequest.getValueAt(selectedRow, 2);
        request.setReceiver(userAccount);
        request.setStatus("Accepted");
        populateTable();
    }//GEN-LAST:event_btnAssignRequestActionPerformed

    private void btnViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseEntered
        btnView.setForeground(new Color(0,128,128));         // TODO add your handling code here:
    }//GEN-LAST:event_btnViewMouseEntered

    private void btnViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseExited
        btnView.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewMouseExited

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPharmaViewRequest.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        PharmacistWorkRequest request = (PharmacistWorkRequest)tblPharmaViewRequest.getValueAt(selectedRow, 2);
        if (request.getReceiver()!=userAccount){
            JOptionPane.showMessageDialog(this, "You cannot view the report of this case. Access Denied.");
        }else{

            ViewPrescriptionJPanel caseReportJPanel = new ViewPrescriptionJPanel(userProcessContainer,system,request,userAccount);
            userProcessContainer.add("caseReportJPanel", caseReportJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_btnViewActionPerformed
        
    private void populateTable() {
        
        DefaultTableModel model= (DefaultTableModel) tblPharmaViewRequest.getModel();
        Object[] row=new Object[4];
        model.setRowCount(0);
        
        
         for(PharmacistWorkRequest request : Organization.getWorkQueue().getPharmacistWorkRequest())
         {
         
            row[0]=request.getDoctorWorkRequest().getCaseReporterWorkRequest().getChildName();
            row[1] = request.getSender();
            row[2] = request;
            if (request.getReceiver()==null){
                row[3] = "Not Assigned";
            }else{
                row[3] = request.getReceiver();
            }
            
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignRequest;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblPharmaViewRequest;
    // End of variables declaration//GEN-END:variables
}
