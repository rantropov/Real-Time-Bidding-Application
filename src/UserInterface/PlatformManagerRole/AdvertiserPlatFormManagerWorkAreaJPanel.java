/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PlatformManagerRole;

import Business.BiddingPlatform.DemandSideBiddingPlatform;
import Business.EcoSystem;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AnanthaShankar
 */
public class AdvertiserPlatFormManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdvertiserPlatFormManager
     */
    private JPanel upc;
    private AdvertiserEnterprise enterprise; 
    private EcoSystem system;
    private ArrayList<String> ds = new ArrayList<String>();
    public AdvertiserPlatFormManagerWorkAreaJPanel(JPanel upc, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.upc = upc;
        this.enterprise = (AdvertiserEnterprise) enterprise;
        this.system = system;
        
        usrAgeJCmbBx.removeAllItems();
        usrAgeJCmbBx.addItem("Teen"); // 10 - 20
        usrAgeJCmbBx.addItem("Young"); // 20 - 30
        usrAgeJCmbBx.addItem("Middle Aged"); // 30 - 50
        usrAgeJCmbBx.addItem("Aged"); // 50+
        
        catgJCmbBx.removeAllItems();
        catgJCmbBx.addItem("Clothes");
        catgJCmbBx.addItem("Education");
        catgJCmbBx.addItem("Electronics");
        catgJCmbBx.addItem("Food");
        catgJCmbBx.addItem("Music");
        catgJCmbBx.addItem("Movies");
        catgJCmbBx.addItem("Sports");
        catgJCmbBx.addItem("Travel");
        catgJCmbBx.addItem("Vehicles");
        
        recommJCmbBx.removeAllItems();
        recommJCmbBx.addItem("Clothes");
        recommJCmbBx.addItem("Education");
        recommJCmbBx.addItem("Electronics");
        recommJCmbBx.addItem("Food");
        recommJCmbBx.addItem("Music");
        recommJCmbBx.addItem("Movies");
        recommJCmbBx.addItem("Sports");
        recommJCmbBx.addItem("Travel");
        recommJCmbBx.addItem("Vehicles");
        
        usrUniqIdJCmbBx.removeAllItems();
        usrUniqIdJCmbBx.addItem("Needed");
        usrUniqIdJCmbBx.addItem("Not Needed");
        
        locationJCmbBx.removeAllItems();
        locationJCmbBx.addItem("Africa");
        locationJCmbBx.addItem("Asia");
        locationJCmbBx.addItem("North America");
        locationJCmbBx.addItem("South America");
        locationJCmbBx.addItem("Europe");
        locationJCmbBx.addItem("Australia");
        
       
        
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
        locationJCmbBx = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        catgJCmbBx = new javax.swing.JComboBox();
        recommJCmbBx = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        addCmbJBtn = new javax.swing.JButton();
        usrAgeJCmbBx = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        usrUniqIdJCmbBx = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prodPurCntJTxtField = new javax.swing.JTextField();
        adClikCntJTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pubProdBrwsCntJTxtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        minBidJTxtField = new javax.swing.JTextField();
        maxBidJtxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        crtDspJBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Demand Side Platform");

        locationJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Location");

        jLabel3.setText("Ad Type");

        catgJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        recommJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Recommended User Interests");

        addCmbJBtn.setText("Add To List");
        addCmbJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCmbJBtnActionPerformed(evt);
            }
        });

        usrAgeJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Age");

        usrUniqIdJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("User Unique Id");

        jLabel7.setText("Product Purchase Count");

        jLabel8.setText("Ad Click Count");

        jLabel9.setText("Publisher Product Browse Count");

        minBidJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minBidJTxtFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Minimum Bid");

        jLabel11.setText("Maximum Bid");

        crtDspJBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        crtDspJBtn.setText("Create DSP");
        crtDspJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crtDspJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(catgJCmbBx, javax.swing.GroupLayout.Alignment.LEADING, 0, 80, Short.MAX_VALUE)
                                    .addComponent(locationJCmbBx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usrUniqIdJCmbBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(179, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prodPurCntJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adClikCntJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pubProdBrwsCntJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(usrAgeJCmbBx, javax.swing.GroupLayout.Alignment.LEADING, 0, 80, Short.MAX_VALUE)
                                            .addComponent(recommJCmbBx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(addCmbJBtn))
                                    .addComponent(minBidJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maxBidJtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(crtDspJBtn))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(catgJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recommJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(addCmbJBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usrAgeJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usrUniqIdJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(prodPurCntJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adClikCntJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pubProdBrwsCntJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minBidJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxBidJtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(crtDspJBtn)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCmbJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCmbJBtnActionPerformed
        // TODO add your handling code here:
        String s = (String) recommJCmbBx.getSelectedItem();
        ds.add(s);
                
        
    }//GEN-LAST:event_addCmbJBtnActionPerformed

    private void minBidJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minBidJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minBidJTxtFieldActionPerformed

    private void crtDspJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crtDspJBtnActionPerformed
        // TODO add your handling code here:
        try{
        if(prodPurCntJTxtField.getText().trim().length() > 0 &&  adClikCntJTxtField.getText().trim().length() > 0 && 
               pubProdBrwsCntJTxtField.getText().trim().length() > 0 && minBidJTxtField.getText().trim().length() > 0 &&
                maxBidJtxtField.getText().trim().length() > 0 && ds.size() > 0){
            DemandSideBiddingPlatform dsp = enterprise.addDsp();
            dsp.setUserInterest(ds);
            dsp.setAdType((String) catgJCmbBx.getSelectedItem());
            dsp.setLocation((String) locationJCmbBx.getSelectedItem());
            dsp.setMaxBidRaise(Integer.parseInt(maxBidJtxtField.getText().trim()));
            dsp.setMinBidValue(Integer.parseInt(minBidJTxtField.getText().trim()));
            dsp.setNoOfClicksCount(Integer.parseInt(adClikCntJTxtField.getText().trim()));
            dsp.setNoOfPurchaseAdProductCount(Integer.parseInt(prodPurCntJTxtField.getText().trim()));
            dsp.setUserAge((String) usrAgeJCmbBx.getSelectedItem());
            dsp.setUserUniqueId((String) usrUniqIdJCmbBx.getSelectedItem());
            dsp.setProductBrowseCount(Integer.parseInt(pubProdBrwsCntJTxtField.getText().trim()));
            JOptionPane.showMessageDialog(null, "Dsp Created Successfully");
            ds = new ArrayList<String>();
            
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Creation");
        }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Input Value");
        }
        
    }//GEN-LAST:event_crtDspJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adClikCntJTxtField;
    private javax.swing.JButton addCmbJBtn;
    private javax.swing.JComboBox catgJCmbBx;
    private javax.swing.JButton crtDspJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox locationJCmbBx;
    private javax.swing.JTextField maxBidJtxtField;
    private javax.swing.JTextField minBidJTxtField;
    private javax.swing.JTextField prodPurCntJTxtField;
    private javax.swing.JTextField pubProdBrwsCntJTxtField;
    private javax.swing.JComboBox recommJCmbBx;
    private javax.swing.JComboBox usrAgeJCmbBx;
    private javax.swing.JComboBox usrUniqIdJCmbBx;
    // End of variables declaration//GEN-END:variables
}
