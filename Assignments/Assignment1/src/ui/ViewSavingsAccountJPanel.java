/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.SavingsAccountInformation;

/**
 *
 * @author rtspi
 */
public class ViewSavingsAccountJPanel extends javax.swing.JPanel {
    SavingsAccountInformation savingsAccInfo;
    /**
     * Creates new form ViewAccountJPanel
     */
    public ViewSavingsAccountJPanel(SavingsAccountInformation savingsAccInfo) {
        initComponents();
        this.savingsAccInfo = savingsAccInfo;
        
        displaySavingsAccInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBankName1 = new javax.swing.JTextField();
        txtRoutingNum1 = new javax.swing.JTextField();
        txtAccountNum1 = new javax.swing.JTextField();
        txtAccountBal1 = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblBankName1 = new javax.swing.JLabel();
        lblRoutingNum1 = new javax.swing.JLabel();
        txtAccountType1 = new javax.swing.JTextField();
        lblAccountNum1 = new javax.swing.JLabel();
        lblAccountBal1 = new javax.swing.JLabel();
        lblAccountType1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 350));

        txtBankName1.setEditable(false);
        txtBankName1.setBackground(new java.awt.Color(255, 255, 255));

        txtRoutingNum1.setEditable(false);
        txtRoutingNum1.setBackground(new java.awt.Color(255, 255, 255));

        txtAccountNum1.setEditable(false);
        txtAccountNum1.setBackground(new java.awt.Color(255, 255, 255));

        txtAccountBal1.setEditable(false);
        txtAccountBal1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTitle.setText("                                         View Savings Account Information");

        lblBankName1.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        lblBankName1.setText("Bank Name:");

        lblRoutingNum1.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        lblRoutingNum1.setText("Routing Number:");

        txtAccountType1.setEditable(false);
        txtAccountType1.setBackground(new java.awt.Color(255, 255, 255));
        txtAccountType1.setFont(new java.awt.Font("Calibri", 2, 11)); // NOI18N
        txtAccountType1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblAccountNum1.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        lblAccountNum1.setText("Account Number:");

        lblAccountBal1.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        lblAccountBal1.setText("Account Balance:");

        lblAccountType1.setFont(new java.awt.Font("Calibri", 3, 11)); // NOI18N
        lblAccountType1.setText("Account Type:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAccountBal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAccountType1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16)))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccountBal1)
                            .addComponent(txtAccountType1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAccountNum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRoutingNum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBankName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBankName1)
                            .addComponent(txtRoutingNum1)
                            .addComponent(txtAccountNum1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName1)
                    .addComponent(txtBankName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNum1)
                    .addComponent(txtRoutingNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountNum1)
                    .addComponent(txtAccountNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountBal1)
                    .addComponent(txtAccountBal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountType1)
                    .addComponent(txtAccountType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAccountBal1;
    private javax.swing.JLabel lblAccountNum1;
    private javax.swing.JLabel lblAccountType1;
    private javax.swing.JLabel lblBankName1;
    private javax.swing.JLabel lblRoutingNum1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAccountBal1;
    private javax.swing.JTextField txtAccountNum1;
    private javax.swing.JTextField txtAccountType1;
    private javax.swing.JTextField txtBankName1;
    private javax.swing.JTextField txtRoutingNum1;
    // End of variables declaration//GEN-END:variables

    private void displaySavingsAccInfo() {
        
        txtBankName1.setText(savingsAccInfo.getBankName());
        txtAccountNum1.setText(savingsAccInfo.getAccountNum());
        txtRoutingNum1.setText(savingsAccInfo.getRoutingNum());
        txtAccountBal1.setText(savingsAccInfo.getAccountBal());
    }
}
