/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BankAccountManager;

import Business.Bank;
import Business.BankAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AnanthaShankar
 */
public class ViewAvailableAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAvailableAccountsJPanel
     */
    private JPanel upc;
    private Bank b;
    public ViewAvailableAccountsJPanel(JPanel upc, Bank b) {
        initComponents();
        this.b = b;
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) acctJTbl.getModel();
        dtm.setRowCount(0);
        
        for(BankAccount ba: b.getBankAccountList()){
            Object row[] = new Object[10];
            row[0] = ba;
            row[1] = ba.getAccountNumber();
            row[2] = ba.getUniqueId();
            row[3] = ba.getCardNumber();
            row[4] = ba.getAddress();
            row[5] = ba.getAccountType();
            row[6] = ba.getCardPin();
            row[7] = ba.getBalanceAmount();
            row[8] = ba.getCardType();
            row[9] = ba.getCardExpireDate();
            dtm.addRow(row);
            
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        acctJTbl = new javax.swing.JTable();
        backJBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        acctJTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AcctHolderName", "AcctNumber", "Unique Id", "Card Num", "Address", "Account Type", "Card Pin", "BalanceAmount", "Card Type", "Card Expiry Date"
            }
        ));
        jScrollPane1.setViewportView(acctJTbl);

        backJBtn.setText("<<  Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backJBtn)
                .addGap(0, 76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable acctJTbl;
    private javax.swing.JButton backJBtn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}