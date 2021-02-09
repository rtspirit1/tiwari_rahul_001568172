/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.MedicalRecord;

/**
 *
 * @author rtspi
 */
public class ViewMedicalJPanel extends javax.swing.JPanel {
    
    MedicalRecord medicalRecord;
            
    /**
     * Creates new form ViewMedicalJPanel
     */
    public ViewMedicalJPanel(MedicalRecord medicalRecord) {
        initComponents();
        this.medicalRecord = medicalRecord;
        
        displayMedicalRecord();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAllergy1 = new javax.swing.JLabel();
        lblAllergy2 = new javax.swing.JLabel();
        lblAllergy3 = new javax.swing.JLabel();
        txtRecordNum = new javax.swing.JTextField();
        txtAllergy1 = new javax.swing.JTextField();
        txtAllergy2 = new javax.swing.JTextField();
        txtAllergy3 = new javax.swing.JTextField();
        lblMedicalRecord = new javax.swing.JLabel();
        lblRecordNum = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 350));

        lblAllergy1.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        lblAllergy1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAllergy1.setText("Allergy 1:");

        lblAllergy2.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        lblAllergy2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAllergy2.setText("Allergy 2:");

        lblAllergy3.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        lblAllergy3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAllergy3.setText("Allergy 3:");

        txtRecordNum.setEditable(false);
        txtRecordNum.setBackground(new java.awt.Color(255, 255, 255));
        txtRecordNum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRecordNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecordNumActionPerformed(evt);
            }
        });

        txtAllergy1.setEditable(false);
        txtAllergy1.setBackground(new java.awt.Color(255, 255, 255));
        txtAllergy1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtAllergy2.setEditable(false);
        txtAllergy2.setBackground(new java.awt.Color(255, 255, 255));
        txtAllergy2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtAllergy3.setEditable(false);
        txtAllergy3.setBackground(new java.awt.Color(255, 255, 255));
        txtAllergy3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblMedicalRecord.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblMedicalRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicalRecord.setText("Medical Record");

        lblRecordNum.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        lblRecordNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecordNum.setText("Medical Record Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMedicalRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRecordNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAllergy1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAllergy2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAllergy3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAllergy3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(txtAllergy2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(txtAllergy1)
                    .addComponent(txtRecordNum))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblMedicalRecord)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecordNum)
                    .addComponent(txtRecordNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAllergy1)
                    .addComponent(txtAllergy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAllergy2)
                    .addComponent(txtAllergy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAllergy3)
                    .addComponent(txtAllergy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRecordNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecordNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecordNumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAllergy1;
    private javax.swing.JLabel lblAllergy2;
    private javax.swing.JLabel lblAllergy3;
    private javax.swing.JLabel lblMedicalRecord;
    private javax.swing.JLabel lblRecordNum;
    private javax.swing.JTextField txtAllergy1;
    private javax.swing.JTextField txtAllergy2;
    private javax.swing.JTextField txtAllergy3;
    private javax.swing.JTextField txtRecordNum;
    // End of variables declaration//GEN-END:variables

    private void displayMedicalRecord() {
        txtRecordNum.setText(medicalRecord.getMedicalRecordNum());
        txtAllergy1.setText(medicalRecord.getAllergy1());
        txtAllergy2.setText(medicalRecord.getAllergy2());
        txtAllergy3.setText(medicalRecord.getAllergy3());
    }
}
