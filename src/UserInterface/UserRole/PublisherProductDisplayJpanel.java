/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.UserRole;

import Business.Advertisement;
import Business.BiddingPlatform.DemandSideBiddingPlatform;
import Business.EcoSystem;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Network.Network;
import Business.Person.Customer;
import Business.Product.Product;
import Business.Purchase.AdvertiserPurchase;
import Business.Purchase.Purchase;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AnanthaShankar
 */
public class PublisherProductDisplayJpanel extends javax.swing.JPanel {

    /**
     * Creates new form PublisherProductDisplayJpanel
     */
    private JPanel upc;
    private EcoSystem system;
    private UserAccount ua;
    private PublisherEnterprise e;
    private String s;
    private Customer c;

    public PublisherProductDisplayJpanel(JPanel upc, EcoSystem system, UserAccount ua, PublisherEnterprise e, String s) {
        initComponents();
        this.upc = upc;
        this.system = system;
        this.ua = ua;
        this.e = e;
        this.s = s;
        c = (Customer) ua.getPerson();
        // JOptionPane.showMessageDialog(null, c.getAccount().getAccountHolderName());
        prodJCmbBx.removeAllItems();
        for (Product p : e.getProdDir().getProductCatalog()) {
            if (p.getProductType().equalsIgnoreCase(s)) {
                prodJCmbBx.addItem(p);
            }
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

        prodJCmbBx = new javax.swing.JComboBox();
        browseProdJBtn = new javax.swing.JButton();
        backJBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        prodJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        prodJCmbBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodJCmbBxActionPerformed(evt);
            }
        });

        browseProdJBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        browseProdJBtn.setText("Browse Product");
        browseProdJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseProdJBtnActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(browseProdJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prodJCmbBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backJBtn)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(prodJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(browseProdJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(backJBtn)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prodJCmbBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodJCmbBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodJCmbBxActionPerformed

    private void browseProdJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseProdJBtnActionPerformed
        // TODO add your handling code here:
        String s = null;
        int i = 0;
        String age = "";
        String verification_result = "";
        String adEnt = null;
        Advertisement a = null;
        AdvertiserEnterprise ae = null;
        TreeMap<String, DemandSideBiddingPlatform> bid_winner = new TreeMap<String, DemandSideBiddingPlatform>();

        if (c.getAge() > 10 && c.getAge() <= 20) {
            age = "Teen";
        } else if (c.getAge() > 20 && c.getAge() <= 30) {
            age = "Young";
        } else if (c.getAge() > 30 && c.getAge() <= 50) {
            age = "Middle Aged";
        } else if (c.getAge() > 50) {
            age = "Aged";
        } else {
            age = "Child";
        }
        Product p = (Product) prodJCmbBx.getSelectedItem();
        for (Product prod : e.getProdDir().getProductCatalog()) {
            if (p.getProdName().equalsIgnoreCase(prod.getProdName()) && p.getProductId() == prod.getProductId()
                    && p.getProductType().equalsIgnoreCase(prod.getProductType())) {
                i = prod.getProductViewsCount();
                prod.setProductViewsCount(i + 1);
                break;
            }
        }
        int j = ((Customer) ua.getPerson()).getNoOfPublisherBrowseCount();
        ((Customer) ua.getPerson()).setNoOfPublisherBrowseCount(j + 1);
        for (Network n : system.getNetworkList()) {
            for (Enterprise entr : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getName().equalsIgnoreCase(entr.getName())) {
                    s = n.getName();
                    System.out.println(s);
                    break;
                }
            }
        }
        if (c.getAccount().getBankName().trim().length() > 0 && c.getAccount().getUniqueId().trim().length() > 0) {
            verification_result = system.getBankDirectory().userAccountAuthentication(c.getAccount().getBankName(),
                    c.getAccount().getUniqueId());
        } else {
            verification_result = "Invalid User Account";
        }

        bid_winner = system.getAdExDir().bidRequest(e.getName(), i + 1, age,
                c.getNoOfClicksCount(), c.getNoOfPurchaseAdProductCount(),
                c.getNoOfPublisherBrowseCount(), s, verification_result, c.getInterests());

        if (!(bid_winner.size() > 0)) {

            
            DisplayPublisherProductAndAdJPanel dppj = new DisplayPublisherProductAndAdJPanel(upc, system, ua,
                    e, ae, a, p);
            upc.add("Display Ad", dppj);
            CardLayout layout = (CardLayout) upc.getLayout();
            layout.next(upc);
        } else {

            adEnt = bid_winner.firstKey();
            
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e instanceof AdvertiserEnterprise && e.getName().equals(adEnt)) {
                        ae = (AdvertiserEnterprise) e;
                        for (Advertisement ad : ae.getAds()) {
                            if (ad.getInterest().equalsIgnoreCase(bid_winner.get(adEnt).getAdType())) {
                                a = ad;
                                break;
                            }
                        }
                    }
                }
            }
            AdvertiserPurchase ad_purchase = new AdvertiserPurchase();
            ad_purchase.setBuyer_Enterprise(ae.getName());
            ad_purchase.setSeller_Enterprise(e.getName());
            if (bid_winner.get(adEnt).getMinBidValue() == 0) {
                ad_purchase.setPurchaseAmount(bid_winner.get(adEnt).getMaxBidRaise());
            } else {
                ad_purchase.setPurchaseAmount(bid_winner.get(adEnt).getMaxBidRaise());
            }
            ad_purchase.setQuantity(1);
            ad_purchase.setStatus("Pending");

            e.getPurchHist().addPurchase(ad_purchase);
            ae.getPurchHist().addPurchase(ad_purchase);

            DisplayPublisherProductAndAdJPanel dppj = new DisplayPublisherProductAndAdJPanel(upc, system, ua,
                    e, ae, a, p);
            upc.add("Display Ad", dppj);
            CardLayout layout = (CardLayout) upc.getLayout();
            layout.next(upc);
        }

    }//GEN-LAST:event_browseProdJBtnActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJBtn;
    private javax.swing.JButton browseProdJBtn;
    private javax.swing.JComboBox prodJCmbBx;
    // End of variables declaration//GEN-END:variables
}
