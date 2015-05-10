/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SysAdminRole;

import Business.Bank;
import Business.BankDirectory;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AnanthaShankar
 */
public class ManageBankDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBankDirectory
     */
    private JPanel upc;
    private EcoSystem system;
    private SysAdminWorkAreaJPanel sa;
    private Bank bank;

    public ManageBankDirectoryJPanel(JPanel upc, EcoSystem system, SysAdminWorkAreaJPanel sa) {
        initComponents();
        this.upc = upc;
        this.system = system;
        this.sa = sa;
        bank = null;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) bnkJTbl.getModel();
        dtm.setRowCount(0);

        for (Bank b : system.getBankDirectory().getBankList()) {
            Object row[] = new Object[1];
            row[0] = b;
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
        bnkJTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        nmJTxtField = new javax.swing.JTextField();
        createJBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        bnkJTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bank Name"
            }
        ));
        jScrollPane1.setViewportView(bnkJTbl);

        jLabel3.setText("Name");

        createJBtn.setText("Create");
        createJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJBtnActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(backJButton)
                        .addGap(18, 18, 18)
                        .addComponent(createJBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(nmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createJBtn)
                    .addComponent(backJButton))
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJBtnActionPerformed
        // TODO add your handling code here:
        int i = 0;
        if (nmJTxtField.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Name");
            i = 1;
        } else {

            for (Bank b : system.getBankDirectory().getBankList()) {
                if (b.getName().equalsIgnoreCase(nmJTxtField.getText().trim())) {
                    i = 1;
                    JOptionPane.showMessageDialog(null, "Bank already exists with the entered name. "
                            + "Please select some other name.");
                    break;
                }
            }
        }
        if (i == 0) {
            bank = system.getBankDirectory().addBank(nmJTxtField.getText().trim());
            if (bank != null) {
                populateTable();
                JOptionPane.showMessageDialog(null, "Bank created successfully. Please Create Useraccount");
                ManageBanksAccountJPanel mad = new ManageBanksAccountJPanel(upc, system, bank, this);
                upc.add("ManageBanksAccountJPanel", mad);
                CardLayout layout = (CardLayout) upc.getLayout();
                layout.next(upc);
            } else {
                JOptionPane.showMessageDialog(null, "Bank Creation failed");
            }
            
        }
    }//GEN-LAST:event_createJBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        sa.populateNetworkTree();
        layout.previous(upc);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable bnkJTbl;
    private javax.swing.JButton createJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nmJTxtField;
    // End of variables declaration//GEN-END:variables
}
