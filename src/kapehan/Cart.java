/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kapehan;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author Student.Admin
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form page2
     */
    static String imgSource;
    static String productName;
    static int numcart;
    static int couponId;
    Connect c = new Connect();
    JLabel trashICon;
    JPanel panel;
    JLabel priceLabel;

    public Cart() {
        setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        body.setBackground(new Color(0, 0, 0, 0));
        displayCart();

    }

    public static String getImgSource() {
        return imgSource;
    }

    public static String getProductName() {
        return productName;
    }

    public void setNumCart(int numcart) {
        this.numcart = numcart;
    }

    public static int getNumCart() {
        return numcart;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        checkoutPanel = new javax.swing.JPanel();
        coupon = new javax.swing.JTextField();
        applyCoupon = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        items = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        checkout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("jLabel1");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        body.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 70, 30));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane2.setViewportView(null);
        JScrollBar vertical = jScrollPane2.getVerticalScrollBar();
        vertical.setPreferredSize( new Dimension(1,0) );

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkoutPanel.setBackground(new java.awt.Color(255, 255, 255));

        coupon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 32, 0), 1, true));
        coupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couponActionPerformed(evt);
            }
        });

        applyCoupon.setBackground(new java.awt.Color(52, 32, 0));
        applyCoupon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        applyCoupon.setForeground(new java.awt.Color(255, 255, 255));
        applyCoupon.setText("Apply");
        applyCoupon.setBorder(null);
        applyCoupon.setBorderPainted(false);
        applyCoupon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        applyCoupon.setFocusPainted(false);
        applyCoupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyCouponActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Items");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Discount");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Total");

        items.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        items.setText("$1000.00");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("$10.00");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("$900.00");

        checkout.setBackground(new java.awt.Color(52, 32, 0));
        checkout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkout.setForeground(new java.awt.Color(255, 255, 255));
        checkout.setText("Checkout");
        checkout.setBorder(null);
        checkout.setBorderPainted(false);
        checkout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkout.setFocusPainted(false);
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checkoutPanelLayout = new javax.swing.GroupLayout(checkoutPanel);
        checkoutPanel.setLayout(checkoutPanelLayout);
        checkoutPanelLayout.setHorizontalGroup(
            checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkoutPanelLayout.createSequentialGroup()
                        .addComponent(coupon, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(applyCoupon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(checkoutPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(236, 236, 236)
                        .addComponent(items))
                    .addGroup(checkoutPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(230, 230, 230)
                        .addComponent(jLabel12))
                    .addGroup(checkoutPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(251, 251, 251)
                        .addComponent(jLabel15))
                    .addGroup(checkoutPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        checkoutPanelLayout.setVerticalGroup(
            checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coupon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyCoupon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(items))
                .addGap(5, 5, 5)
                .addGroup(checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addGap(59, 59, 59)
                .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(checkoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 380, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow-small-left.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("My Cart");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jScrollPane2.setViewportView(jPanel3);

        body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 390, 800));
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        phone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phone  (533 × 948 px) (1).png"))); // NOI18N
        body.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 0, 560, 940));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        body.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 420, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    public void displayCart() {
        try {
            int i = 80;
            int z = 530;

            Statement stmt = c.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select * from cart");

            while (rs.next()) {
                String product = rs.getString(2);
                String size = rs.getString(3);
                String price = rs.getString(4);
                String discount = rs.getString(5);
                String qty = rs.getString(6);
                String id = rs.getString(1);

                displayPanel(product, size, price, "/img/coffee/" + product + ".png", i, z, qty);
                delete(id);

                i += 130;
                z += 120;

            }
            c.connect().close();
        } catch (SQLException e) {
            System.out.println(e);
        }

//        try {
//            Statement stmt = c.connect().createStatement();
//            ResultSet rs = stmt.executeQuery("select Sum(price) as sumItems from cart");
//
//            while (rs.next()) {
//                String sum = rs.getString("sumItems");
//                items.setText(sum);
//             
//            }
//            c.connect().close();
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
    }

    public void displayPanel(String product, String size, String price, String imgsource, int y, int z, String qty) {
        panel = new javax.swing.JPanel();

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(168, 104, 11), 1, true));

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, y, 360, 130));
        JLabel label = new javax.swing.JLabel();

        label.setBackground(new java.awt.Color(255, 255, 255));

        label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        label.setText(product);

        panel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));
        JLabel sizeLabel = new javax.swing.JLabel();

        sizeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        sizeLabel.setText(size);

        panel.add(sizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 45, 70, 20));

        priceLabel = new javax.swing.JLabel();

        priceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        priceLabel.setText("$" + price);

        panel.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));
        JLabel img = new javax.swing.JLabel();

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgsource))); // NOI18N

        img.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        panel.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, 130));

        jPanel3.add(checkoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, z, 380, 260));
        JLabel qtyLabel = new javax.swing.JLabel();

        qtyLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        qtyLabel.setText(qty + "x");

        panel.add(qtyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));
        trashICon = new javax.swing.JLabel();

        trashICon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N

        trashICon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        panel.add(trashICon, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 100, -1, -1));

    }

    public void delete(String id) {

        trashICon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                target.removeAll();
//                target.repaint();
//                target.revalidate();

//                try {
//
//                    PreparedStatement ps = c.connect().prepareStatement("DELETE FROM cart WHERE cartID=?");
//                    ps.setString(1, id);
//
//                    ps.executeUpdate();
//
//                    int i = 80;
//                    int z = 530;
//
//                    Statement stmt = c.connect().createStatement();
//                    ResultSet rs = stmt.executeQuery("select * from cart");
//
//                    while (rs.next()) {
//                        String product = rs.getString(2);
//                        String size = rs.getString(3);
//                        String price = rs.getString(4);
//                        String discount = rs.getString(5);
//                        String qty = rs.getString(6);
//                        String id = rs.getString(1);
//
//                        displayPanel(product, size, price, "/img/coffee/" + product + ".png", i, z, qty);
//
//                        i += 130;
//                        z += 120;
//
//                    }
//
//                    c.connect().close();
//                } catch (SQLException e) {
//                    System.out.println(e);
//                }
            }
        });

    }

   


    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        this.setVisible(false);
        new Checkout().setVisible(true);
    }//GEN-LAST:event_checkoutActionPerformed

    private void applyCouponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyCouponActionPerformed

        String couponField = coupon.getText();
        boolean isValid = false;
        try {

            Statement stmt = c.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select * from coupon");

            while (rs.next()) {
                String couponCode = rs.getString(2);
                couponId = rs.getInt(1);

                if (couponField.equals(couponCode)) {
                    isValid = true;

                } else {
                    isValid = false;
                }

            }
            c.connect().close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_applyCouponActionPerformed

    private void couponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couponActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyCoupon;
    private javax.swing.JPanel body;
    private javax.swing.JButton checkout;
    private javax.swing.JPanel checkoutPanel;
    private javax.swing.JTextField coupon;
    private javax.swing.JLabel items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel phone;
    // End of variables declaration//GEN-END:variables

}
