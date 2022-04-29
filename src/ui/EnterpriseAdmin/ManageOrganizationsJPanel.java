/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EnterpriseAdmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dax98
 */
public class ManageOrganizationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizations
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    private OrganizationDirectory directory;
    public ManageOrganizationsJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        this.directory = directory;
        
        populateTable();
        populateCombo();
        //System.out.println(enterprise.getEnterpriseType().getValue());
    }

    @SuppressWarnings("unchecked")
    private void populateCombo(){
        comboBoxOrgType.removeAllItems();
        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("NGO")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.CaseVolunteer.getValue()) || type.getValue().equals(Organization.Type.PsychiatricOrganization.getValue())){
                    comboBoxOrgType.addItem(type);
                }
            }
        } else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Wellness")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.Hospital.getValue()) || type.getValue().equals(Organization.Type.Forensic.getValue())
                        || type.getValue().equals(Organization.Type.CounsellingOrganization.getValue())){
                    comboBoxOrgType.addItem(type);
                }
            }
        } else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Justice")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.Legal.getValue())){
                    comboBoxOrgType.addItem(type);
                }
            }
        }else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Pharmaceutical")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.Pharmacy.getValue())){
                    comboBoxOrgType.addItem(type);
                }
            }
        }else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Psychiatrist")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.PsychiatricOrganization.getValue())){
                    comboBoxOrgType.addItem(type);
                }
            }
        }
        
        
        
        
        /*for (Organization.Type type : Organization.Type.values()){
            if (!type.getValue().equals(Organization.Type.Admin.getValue()))
                organizationJComboBox.addItem(type);
        }*/
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tableOrg.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[1];
            //row[0] = organization.getOrganizationID();
            row[0] = organization;
            
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrg = new javax.swing.JTable();
        lblOrgType = new javax.swing.JLabel();
        btnAddOrg = new javax.swing.JButton();
        comboBoxOrgType = new javax.swing.JComboBox();
        btnDltOrg = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 126, 34));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Organization(s)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 656, 41));

        tableOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOrg);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 210, 98));

        lblOrgType.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblOrgType.setText("Organization Type:");
        jPanel1.add(lblOrgType, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, -1, 26));

        btnAddOrg.setBackground(new java.awt.Color(51, 102, 255));
        btnAddOrg.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnAddOrg.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrg.setText("Add Organization");
        btnAddOrg.setBorderPainted(false);
        btnAddOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddOrgMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddOrgMouseEntered(evt);
            }
        });
        btnAddOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrgActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        comboBoxOrgType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBoxOrgType, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 155, -1));

        btnDltOrg.setBackground(new java.awt.Color(51, 102, 255));
        btnDltOrg.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnDltOrg.setForeground(new java.awt.Color(255, 255, 255));
        btnDltOrg.setText("Delete Organization");
        btnDltOrg.setBorderPainted(false);
        btnDltOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDltOrgMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDltOrgMouseEntered(evt);
            }
        });
        btnDltOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltOrgActionPerformed(evt);
            }
        });
        jPanel1.add(btnDltOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 38, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOrgMouseEntered
        btnAddOrg.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddOrgMouseEntered

    private void btnAddOrgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOrgMouseExited
        btnAddOrg.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddOrgMouseExited

    private void btnAddOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrgActionPerformed
        // TODO add your handling code here:
        Organization.Type type = (Organization.Type) comboBoxOrgType.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_btnAddOrgActionPerformed

    private void btnDltOrgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDltOrgMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDltOrgMouseEntered

    private void btnDltOrgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDltOrgMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDltOrgMouseExited

    private void btnDltOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltOrgActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableOrg.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Organization o = (Organization) tableOrg.getValueAt(selectedRow, 0);

            for (Organization org: directory.getOrganizationList()){
                if (o==org){
                    directory.getOrganizationList().remove(o);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateTable();
        }

    }//GEN-LAST:event_btnDltOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrg;
    private javax.swing.JButton btnDltOrg;
    private javax.swing.JComboBox comboBoxOrgType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrgType;
    private javax.swing.JTable tableOrg;
    // End of variables declaration//GEN-END:variables
}
