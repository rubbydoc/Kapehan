/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kapehan;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

/**
 *
 * @author Student.Admin
 */
public class Checkout extends javax.swing.JFrame {

    /**
     * Creates new form page2
     */
    static String imgSource;
    static String productName;
    static int numcart;
    Connect c = new Connect();
    static String t;
    double totl;
    double sumItems;
    static int couponId;
    boolean pick = true;
    String addres;
    String phoneNum;
    String mode;

    public Checkout() {
        setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        body.setBackground(new Color(0, 0, 0, 0));
        total.setText(t);
        summary();
        //        total.setText("$" + String.valueOf(totl));
        addrPhone();

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
        jScrollPane2 = new javax.swing.JScrollPane();
        pickupPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pickup = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        delivery = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        paymentMethod = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        pickupPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        addr1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        address1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        paymentMethod1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        phonenum = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane2.setViewportView(null);
        JScrollBar vertical = jScrollPane2.getVerticalScrollBar();
        vertical.setPreferredSize( new Dimension(1,0) );

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);

        pickupPanel.setBackground(new java.awt.Color(255, 255, 255));
        pickupPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow-small-left.png"))); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        pickupPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Checkout");
        pickupPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        pickup.setBackground(new java.awt.Color(52, 32, 0));
        pickup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pickup.setForeground(new java.awt.Color(255, 255, 255));
        pickup.setText("Pickup");
        pickup.setBorder(null);
        pickup.setBorderPainted(false);
        pickup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pickup.setFocusPainted(false);
        pickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupActionPerformed(evt);
            }
        });
        pickupPanel.add(pickup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Total");
        pickupPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, -1, -1));

        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total.setText("$900.00");
        pickupPanel.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 690, -1, -1));

        pay.setBackground(new java.awt.Color(52, 32, 0));
        pay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pay.setForeground(new java.awt.Color(255, 255, 255));
        pay.setText("Pay");
        pay.setBorder(null);
        pay.setBorderPainted(false);
        pay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pay.setFocusPainted(false);
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        pickupPanel.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 750, 260, 40));

        delivery.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delivery.setForeground(new java.awt.Color(52, 32, 0));
        delivery.setText("Delivery");
        delivery.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 32, 0)));
        delivery.setContentAreaFilled(false);
        delivery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delivery.setFocusPainted(false);
        delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryActionPerformed(evt);
            }
        });
        pickupPanel.add(delivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 170, 40));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane3.setViewportView(null);
        JScrollBar v = jScrollPane2.getVerticalScrollBar();
        v.setPreferredSize( new Dimension(1,0) );

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane3.setViewportView(jPanel3);

        pickupPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 390, 220));
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Summary Items");
        pickupPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        paymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card" }));
        paymentMethod.setSelectedIndex(-1);
        paymentMethod.setBorder(null);
        paymentMethod.setFocusable(false);
        paymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentMethodActionPerformed(evt);
            }
        });
        pickupPanel.add(paymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 340, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Payment Method");
        pickupPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        pickupPanel1.setBackground(new java.awt.Color(255, 255, 255));
        pickupPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Checkout");
        pickupPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        addr1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addr1.setText("Samjung Bldg. Nasipit Road, Talamban");
        addr1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 32, 0), 1, true));
        addr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addr1ActionPerformed(evt);
            }
        });
        pickupPanel1.add(addr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 340, 40));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane4.setViewportView(null);
        JScrollBar ver = jScrollPane2.getVerticalScrollBar();
        ver.setPreferredSize( new Dimension(1,0) );

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane4.setViewportView(jPanel4);

        pickupPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 390, 140));
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        address1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        address1.setText("Shop Address");
        pickupPanel1.add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Summary Items");
        pickupPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        paymentMethod1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash on Pickup", "Credit Card" }));
        paymentMethod1.setSelectedIndex(-1);
        paymentMethod1.setBorder(null);
        paymentMethod1.setFocusable(false);
        paymentMethod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentMethod1ActionPerformed(evt);
            }
        });
        pickupPanel1.add(paymentMethod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 340, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Payment Method");
        pickupPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        pn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 32, 0), 1, true));
        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });
        pickupPanel1.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 340, 40));

        phonenum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phonenum.setText("Phone Number");
        pickupPanel1.add(phonenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        pickupPanel.add(pickupPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane2.setViewportView(pickupPanel);

        body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 390, 800));
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        jLabel3.setText("jLabel1");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        body.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 70, 30));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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


    private void pickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupActionPerformed
        pick = true;
        addrPhone();

        pickup.setContentAreaFilled(true);
        pickup.setBackground(new java.awt.Color(52, 32, 2));
        pickup.setForeground(new java.awt.Color(255, 255, 255));
        delivery.setForeground(new java.awt.Color(52, 32, 0));
        delivery.setBackground(new java.awt.Color(255, 255, 255));
        delivery.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 32, 0)));
        address1.setText("Shop Address");
        addr1.setText("Samjung Bldg. Nasipit Road, Talamban");

    }//GEN-LAST:event_pickupActionPerformed

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnActionPerformed

    //check if there is address and phone number
    public void addrPhone() {
        try {
            Statement stmt = c.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select * from customers where customerID = '" + new SignIn().custID + "'");

            while (rs.next()) {
                phoneNum = rs.getString(4);
                addres = rs.getString(6);

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        if (pick == true) {
            pn.setText(phoneNum);
        } else {
            pn.setText(phoneNum);
            addr1.setText(addres);
        }

    }

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        if (paymentMethod.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please select a payment method");

        } else {
            if (pick == true) {
                mode = "Pickup";

                if (pn.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please input your phone number.");

                } else {
                    payment();
                    deleteCart();
                    JOptionPane.showMessageDialog(null, "Thank you for purchasing. Your order is being processed.");
                    this.dispose();
                    new Home().setVisible(true);
                }
            } else {
                mode = "Delivery";

                if (addr1.getText().equals("") || pn.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please input your delivery address and phone number.");

                } else {
                    payment();
                    deleteCart();
                    JOptionPane.showMessageDialog(null, "Thank you for purchasing. Your order is being processed.");
                    this.dispose();
                    new Home().setVisible(true);
                }
            }

        }


    }//GEN-LAST:event_payActionPerformed

    public void deleteCart() {
        try {

            PreparedStatement ps = c.connect().prepareStatement("DELETE FROM cart ");

            ps.executeUpdate();

            c.connect().close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

//    public void updateAddrPhone(){
//        try {
//              PreparedStatement ps = c.connect().prepareStatement("UPDATE customers SET address=?,phone=? WHERE customerID=? ");
//                ps.setString(1, addr1.getText());
//                ps.setString(2,pn.getText());
//                ps.setInt(3,new SignIn().custID);
//
//            } catch (SQLException ex) {
//                System.out.println(ex);
//            }
//    
//    
//    }
    public void payment() {

        int option = JOptionPane.showConfirmDialog(null, "Confirm Payment?", "", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {

            try {
                Statement stmt = c.connect().createStatement();
                ResultSet rs = stmt.executeQuery("select * from cart");

                while (rs.next()) {
                    String name = rs.getString(2);

                    double pri = rs.getDouble(4);
                    int qty = rs.getInt(6);
                    double tot = pri * qty;

                    PreparedStatement ps = c.connect().prepareStatement("INSERT INTO transactions (customerID, productName,price, qty,total, paymentMethod, mode) VALUES (?,?,?,?,?,?,?)");
                    ps.setInt(1, new SignIn().custID);
                    ps.setString(2, name);
                    ps.setDouble(3, pri);

                    ps.setString(4, String.valueOf(qty));
                    ps.setDouble(5, tot);
                    ps.setString(6, paymentMethod.getSelectedItem().toString());
                    ps.setString(7, mode);
                    ps.executeUpdate();

                }

            } catch (SQLException ex) {
                System.out.println(ex);
            }

        }

//        updateAddrPhone();
    }
    private void deliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryActionPerformed
        pick = false;

        delivery.setContentAreaFilled(true);
        delivery.setBackground(new java.awt.Color(52, 32, 2));
        delivery.setForeground(new java.awt.Color(255, 255, 255));
        pickup.setForeground(new java.awt.Color(52, 32, 0));
        pickup.setBackground(new java.awt.Color(255, 255, 255));
        pickup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 32, 0)));
        pickup.setBorderPainted(true);
        address1.setText("Delivery Address");
        addr1.setText("");
        addrPhone();


    }//GEN-LAST:event_deliveryActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        this.setVisible(false);
        new Cart().setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    public void summary() {
        totl = 0;
        try {
            int y = 10;

            Statement stmt = c.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select * from cart");

            while (rs.next()) {
                String product = rs.getString(2);
                String quantity = rs.getString(5);

                double pr = rs.getDouble(4);
                displayItems(y, product, pr,quantity );
                totl += pr;
                y += 20;

            }
            c.connect().close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        refresh();

    }

    public void displayItems(int y, String item, double price , String qty) {

        JLabel jLabel1 = new javax.swing.JLabel();

        jLabel1.setText(qty+"x " + item);

        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, y, 207, -1));

        JLabel jLabel5 = new javax.swing.JLabel();

        jLabel5.setText(String.valueOf(price));

        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, y, -1, -1));
        JLabel dis = new javax.swing.JLabel();

    }

    private void paymentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentMethodActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    public void refresh() {
//
//        items.setText("$0.0");
//        discount.setText("$0.0");
//        totall.setText("$0.0");
        try {

            Statement stmt = c.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select Sum(total) as sumItems from cart");

            while (rs.next()) {
                sumItems = rs.getDouble("sumItems");


                String item = String.format("%.2f", sumItems);

//                items.setText("$" + item);
                total.setText("$" + item);
//                tot = totall.getText();

            }

            c.connect().close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void addr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addr1ActionPerformed

    private void paymentMethod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentMethod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentMethod1ActionPerformed

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addr1;
    private javax.swing.JLabel address1;
    private javax.swing.JLabel backButton;
    private javax.swing.JPanel body;
    private javax.swing.JButton delivery;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton pay;
    private javax.swing.JComboBox<String> paymentMethod;
    private javax.swing.JComboBox<String> paymentMethod1;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel phonenum;
    private javax.swing.JButton pickup;
    public javax.swing.JPanel pickupPanel;
    public javax.swing.JPanel pickupPanel1;
    private javax.swing.JTextField pn;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

}
