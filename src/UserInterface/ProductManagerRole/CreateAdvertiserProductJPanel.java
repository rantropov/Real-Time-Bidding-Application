/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProductManagerRole;

import Business.Advertisement;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import Business.Product.AdvertiserProduct;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AnanthaShankar
 */
public class CreateAdvertiserProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAdvertiserProductJPanel
     */
    private JPanel upc;
    private AdvertiserEnterprise enterprise;
    private String category;
    private int j;
    int temp = 0;

    public CreateAdvertiserProductJPanel(JPanel upc, AdvertiserEnterprise enterprise, String category, int i) {
        initComponents();
        this.upc = upc;
        this.enterprise = enterprise;
        this.category = category;
        prodCatgJTxtField.setText(category);
        this.j = i;
        if (j == 0) {

        } else if (j == 1) {
            prodAvailJTxtField.setEnabled(false);
            prodNmJTxtField.setEnabled(false);
            prodPricJTxtField.setEnabled(false);
            crtProdJBtn.setEnabled(false);
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

        prodCatgJTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prodNmJTxtField = new javax.swing.JTextField();
        crtProdJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        prodPricJTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        prodAvailJTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        crtAdJBtn = new javax.swing.JButton();
        createAdJBtn = new javax.swing.JButton();
        adPathJextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        backJBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        prodCatgJTxtField.setEditable(false);

        jLabel2.setText("Product Category");

        jLabel3.setText("Product Name");

        prodNmJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNmJTxtFieldActionPerformed(evt);
            }
        });

        crtProdJBtn.setText("Create Product");
        crtProdJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crtProdJBtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Create Product & Ad");

        prodPricJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodPricJTxtFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Product Price");

        prodAvailJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodAvailJTxtFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Product Availability");

        crtAdJBtn.setText("Create Ad");
        crtAdJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crtAdJBtnActionPerformed(evt);
            }
        });

        createAdJBtn.setText("Create Advertisement");
        createAdJBtn.setEnabled(false);
        createAdJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdJBtnActionPerformed(evt);
            }
        });

        adPathJextField.setEditable(false);

        jLabel6.setText("Ad Path");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(backJBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(prodAvailJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodPricJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prodNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodCatgJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAdJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(crtAdJBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crtProdJBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addComponent(adPathJextField))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodCatgJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodPricJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodAvailJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(crtProdJBtn)
                .addGap(18, 18, 18)
                .addComponent(crtAdJBtn)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adPathJextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAdJBtn)
                    .addComponent(backJBtn))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prodNmJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodNmJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNmJTxtFieldActionPerformed

    private void crtProdJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crtProdJBtnActionPerformed
        // TODO add your handling code here:
        try {
            if (prodNmJTxtField.getText().trim().length() > 0 && prodCatgJTxtField.getText().trim().length() > 0
                    && prodPricJTxtField.getText().trim().length() > 0 && prodAvailJTxtField.getText().trim().length() > 0) {
                AdvertiserProduct p = new AdvertiserProduct();
                p.setProdName(prodNmJTxtField.getText().trim());
                p.setProduct_Content("Empty");
                p.setProductType(prodCatgJTxtField.getText());
                p.setPrice(Integer.parseInt(prodPricJTxtField.getText().trim()));
                p.setAvailability(Integer.parseInt(prodAvailJTxtField.getText().trim()));
                int count = enterprise.getProdDir().getProductCatalog().size();
                p.setProductId((enterprise.getProdDir().getProductCatalog().get(count - 1).getProductId()) + 1);
                enterprise.getProdDir().getProductCatalog().add(p);
                JOptionPane.showMessageDialog(createAdJBtn, "Product Created Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Product Creation");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input Value");
        }

    }//GEN-LAST:event_crtProdJBtnActionPerformed

    private void prodPricJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodPricJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodPricJTxtFieldActionPerformed

    private void prodAvailJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodAvailJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodAvailJTxtFieldActionPerformed

    private void crtAdJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crtAdJBtnActionPerformed
        // TODO add your handling code here:
        int i = 0;
        for (Advertisement a : enterprise.getAds()) {
            if (a.getInterest().equalsIgnoreCase(category)) {
                i = 1;
                break;
            }
        }
        if (i == 0) {
            crtAdJBtn.setEnabled(false);
            adPathJextField.setEditable(true);
            createAdJBtn.setEnabled(true);

        } else {
            temp = 1;
            int j = JOptionPane.showConfirmDialog(null, "Ad for the selected category already exists. "
                    + "Do you want to replace with the new one?");
            if (j == JOptionPane.YES_OPTION) {
                crtAdJBtn.setEnabled(false);
                adPathJextField.setEditable(true);
                createAdJBtn.setEnabled(true);
            }
        }
    }//GEN-LAST:event_crtAdJBtnActionPerformed

    private void createAdJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdJBtnActionPerformed
        // TODO add your handling code here:
        if (temp == 0) {
            if (adPathJextField.getText().trim().length() > 0) {
                Advertisement a = enterprise.addAdverstisement();
                a.setInterest(category);
                a.setPath(adPathJextField.getText().trim());
                JOptionPane.showConfirmDialog(null, "Ad Created Successfully");
                crtAdJBtn.setEnabled(true);
                adPathJextField.setEditable(false);
                createAdJBtn.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Path");
            }
        } else if (temp == 1) {
            if (adPathJextField.getText().trim().length() > 0) {
                for (Advertisement a : enterprise.getAds()) {
                    if (a.getInterest().equalsIgnoreCase(category)) {
                        a.setInterest(category);
                        a.setPath(adPathJextField.getText().trim());
                        JOptionPane.showConfirmDialog(null, "Ad Created Successfully, Do You Want To Save?");
                        crtAdJBtn.setEnabled(true);
                        adPathJextField.setEditable(false);
                        createAdJBtn.setEnabled(false);
                        break;
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Path");
            }
        }
    }//GEN-LAST:event_createAdJBtnActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adPathJextField;
    private javax.swing.JButton backJBtn;
    private javax.swing.JButton createAdJBtn;
    private javax.swing.JButton crtAdJBtn;
    private javax.swing.JButton crtProdJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField prodAvailJTxtField;
    private javax.swing.JTextField prodCatgJTxtField;
    private javax.swing.JTextField prodNmJTxtField;
    private javax.swing.JTextField prodPricJTxtField;
    // End of variables declaration//GEN-END:variables
}
