/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kapehan;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

/**
 *
 * @author Student.Admin
 */
public class ProductInfo extends javax.swing.JFrame {

    /**
     * Creates new form page2
     */
    
    static int qtyCounter;
    public ProductInfo() {
        setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        body.setBackground(new Color(0, 0, 0, 0));
        
 
       
        target.setIcon(new javax.swing.ImageIcon(getClass().getResource(new Home().getImgSource())));
        prodName.setText(new Home().getProductName());
        cartNum.setText(String.valueOf(new Home().getNumCart()));
    }
    
    public static int getQtyCounter(){
    return qtyCounter;
    }
    
    
    public void setQtyCounter(int qtyCounter){
    this.qtyCounter=qtyCounter;
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cartNum = new javax.swing.JLabel();
        cart = new javax.swing.JLabel();
        target = new javax.swing.JLabel();
        prodName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        qty = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkout = new javax.swing.JButton();
        addTocart = new javax.swing.JButton();
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow-small-left (2).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cartNum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartNum.setForeground(new java.awt.Color(255, 255, 255));
        cartNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartNum.setText("0");
        jPanel3.add(cartNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 25, 20, 20));

        cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/noti-40.png"))); // NOI18N
        cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMouseClicked(evt);
            }
        });
        jPanel3.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 5, -1, -1));
        jPanel3.add(target, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        prodName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(prodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("$100.00");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel5.setText("<html>Lorem ipsum dolor sit amet consectetur. Et habitasse eu sit ut.</html>");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Size");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 335, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, 30));

        minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minus (2).png"))); // NOI18N
        minus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMouseClicked(evt);
            }
        });
        jPanel3.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add (2).png"))); // NOI18N
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        qty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qty.setText("0");
        jPanel3.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Short", "Tall", "Grande", "Venti" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 330, 110, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Total");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 405, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("$100.00");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 405, -1, -1));

        checkout.setBackground(new java.awt.Color(52, 32, 0));
        checkout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
        jPanel3.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 100, 25));

        addTocart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addTocart.setForeground(new java.awt.Color(52, 32, 0));
        addTocart.setText("Add to Cart");
        addTocart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 32, 0), 1, true));
        addTocart.setContentAreaFilled(false);
        addTocart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTocart.setFocusPainted(false);
        addTocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTocartActionPerformed(evt);
            }
        });
        jPanel3.add(addTocart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 100, 25));

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
        new Home().setNumCart(Integer.parseInt(cartNum.getText()));
        new Home().setVisible(true);
        
      
    }//GEN-LAST:event_jLabel1MouseClicked

    private void minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseClicked
                int currentQty = Integer.parseInt(qty.getText());

        String currentVal = cartNum.getText();
        
        if(currentVal.equals("0")){
        } else{
         
        
         if(Integer.parseInt(qty.getText())<1){
         
         }else{
          currentQty--;
           qty.setText(String.valueOf(currentQty));
         }
        
        
         
        }
    }//GEN-LAST:event_minusMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        String currentVal = cartNum.getText();
        int currentQty = Integer.parseInt(qty.getText());
       
       
          if(Integer.parseInt(qty.getText())<0){
         
         }else{
          currentQty++;
           qty.setText(String.valueOf(currentQty));
         }
        
    }//GEN-LAST:event_addMouseClicked

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
       this.setVisible(false);
       new Checkout().setVisible(true);
    }//GEN-LAST:event_checkoutActionPerformed

    private void addTocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTocartActionPerformed
        JOptionPane.showMessageDialog(null, "Added to cart.","I love Coffee!", JOptionPane.PLAIN_MESSAGE);
        int current = Integer.parseInt(cartNum.getText());
        int newVal = Integer.parseInt(qty.getText());
        cartNum.setText(String.valueOf(current+newVal));
       
    }//GEN-LAST:event_addTocartActionPerformed

    private void cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseClicked
        this.setVisible(false);
        new Cart().setVisible(true);
    }//GEN-LAST:event_cartMouseClicked

   
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
            java.util.logging.Logger.getLogger(ProductInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ProductInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JButton addTocart;
    private javax.swing.JPanel body;
    private javax.swing.JLabel cart;
    private javax.swing.JLabel cartNum;
    private javax.swing.JButton checkout;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel prodName;
    private javax.swing.JLabel qty;
    private javax.swing.JLabel target;
    // End of variables declaration//GEN-END:variables
}
