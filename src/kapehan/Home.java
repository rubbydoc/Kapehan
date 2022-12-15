/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kapehan;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Student.Admin
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form page2
     */
    static String imgSource;
    static String imgs;
    static String productName;
    static String productDes;
    static String productPrice;
    static int numcart;
    Connect c = new Connect();

    public Home() {
        setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        body.setBackground(new Color(0, 0, 0, 0));

//        cartNum.setText(String.valueOf(numcart));
        displayProducts();

    }

    public static String getImgSource() {
        return imgSource;
    }
    
     public static String getIMGS() {
        return imgs;
    }

    public static String getProductName() {
        return productName;
    }

    public static String getProductDescription() {
        return productDes;
    }

    public static String getProductPrice() {
        return productPrice;
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        cart = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hot = new javax.swing.JLabel();
        ice = new javax.swing.JLabel();
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
        jScrollPane2.setViewportView(jPanel3);

        body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 390, 510));
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 70, 30));

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user (1).png"))); // NOI18N
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        body.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart.png"))); // NOI18N
        cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMouseClicked(evt);
            }
        });
        body.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 30, -1));

        searchField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 32, 0), 1, true));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        body.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 310, 40));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (2).png"))); // NOI18N
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        body.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Categories");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        hot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/category.png"))); // NOI18N
        hot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotMouseClicked(evt);
            }
        });
        body.add(hot, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        ice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/category (1).png"))); // NOI18N
        ice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iceMouseClicked(evt);
            }
        });
        body.add(ice, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

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

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed


    private void cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseClicked
        this.dispose();
        new Cart().setVisible(true);
    }//GEN-LAST:event_cartMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        this.dispose();
        new Account().setVisible(true);
    }//GEN-LAST:event_profileMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        String search = searchField.getText();

        if (search.equals("")) {
            jPanel3.removeAll();
            jPanel3.repaint();
            jPanel3.revalidate();
            displayProducts();

        } else {
            jPanel3.removeAll();
            jPanel3.repaint();
            jPanel3.revalidate();
            try {
                int i = 40;
                int j = 200;
                int l = 40;

                Statement stmt = c.connect().createStatement();
                ResultSet rs = stmt.executeQuery("select * from products where status='available' and productName LIKE'" + search + "%'");

                while (rs.next()) {
                    String productName = rs.getString(2);
                    String productPrice = rs.getString(4);
                    String des = rs.getString(3);

                    if (rs.getInt(1) % 2 == 1) {
                        columnOne(productName, productPrice, i, "/img/coffee/" + productName + ".png", des);
                        i += 250;
                    } else {

                        columnTwo(productName, productPrice, j, l, "/img/coffee/" + productName + ".png", des);
                        l += 250;

                    }

                }
                c.connect().close();
            } catch (SQLException e) {
                System.out.println(e);
            }

        }


    }//GEN-LAST:event_searchButtonMouseClicked

    private void hotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotMouseClicked
        try {
            jPanel3.removeAll();
            jPanel3.repaint();
            jPanel3.revalidate();
            int i = 40;
            int j = 200;
            int l = 40;

            Statement stmt = c.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select * from products where status='available' and category ='Hot'");

            while (rs.next()) {
                String productName = rs.getString(2);
                String productPrice = rs.getString(4);
                String des = rs.getString(3);

                if (rs.getInt(1) % 2 == 1) {
                    columnOne(productName, productPrice, i, "/img/coffee/" + productName + ".png", des);
                    i += 250;
                } else {

                    columnTwo(productName, productPrice, j, l, "/img/coffee/" + productName + ".png", des);
                    l += 250;

                }

            }
            c.connect().close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_hotMouseClicked

    private void iceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iceMouseClicked
        try {
            jPanel3.removeAll();
            jPanel3.repaint();
            jPanel3.revalidate();
            int i = 40;
            int j = 200;
            int l = 40;

            Statement stmt = c.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select * from products where status='available' and category ='Ice'");

            while (rs.next()) {
                String productName = rs.getString(2);
                String productPrice = rs.getString(4);
                String des = rs.getString(3);

                if (rs.getInt(1) % 2 == 1) {
                    columnOne(productName, productPrice, i, "/img/coffee/" + productName + ".png", des);
                    i += 250;
                } else {

                    columnTwo(productName, productPrice, j, l, "/img/coffee/" + productName + ".png", des);
                    l += 250;

                }

            }
            c.connect().close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_iceMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        displayProducts();
    }//GEN-LAST:event_jLabel5MouseClicked

    public void displayProducts() {
        try {
            int i = 40;
            int j = 200;
            int l = 40;

            Statement stmt = c.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select * from products where status='available'");

            while (rs.next()) {
                String productName = rs.getString(2);
                String productPrice = rs.getString(4);
                String des = rs.getString(3);

                if (rs.getInt(1) % 2 == 1) {
                    columnOne(productName, productPrice, i, "/img/coffee/" + productName + ".png", des);
                    i += 250;
                } else {

                    columnTwo(productName, productPrice, j, l, "/img/coffee/" + productName + ".png", des);
                    l += 250;

                }

            }
            c.connect().close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void columnOne(String name, String price, int y, String imgsource, String description) {
        JPanel panel = new JPanel();

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(168, 104, 11), 1, true));

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y, 160, 230));
        JLabel label = new JLabel();

        label.setBackground(new java.awt.Color(255, 255, 255));

        label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        label.setText(name);

        panel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, 180, -1));

        JLabel pr = new javax.swing.JLabel();

        pr.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        pr.setText("$" + price);

        panel.add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        JLabel img = new javax.swing.JLabel();

        try {
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgsource))); // NOI18N
        } catch (Exception e) {
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coffee/img.png"))); // NOI18N

        }
        img.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                imgSource = "/img/coffee/" + name + "_info" + ".png";
                imgs = "/img/coffee/img_info.png";
                productName = name;
                productDes = description;
                productPrice = price;

                new Home().dispose();
                new ProductInfo().setVisible(true);

            }
        });

        panel.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

    }

    public void columnTwo(String name, String price, int x, int y, String imgsource, String description) {
        JPanel panel = new JPanel();

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(168, 104, 11), 1, true));

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, 160, 230));
        JLabel label = new JLabel();

        label.setBackground(new java.awt.Color(255, 255, 255));

        label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        label.setText(name);

        panel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, 180, -1));

        JLabel pr = new javax.swing.JLabel();

        pr.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        pr.setText("$" + price);

        panel.add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        JLabel img = new javax.swing.JLabel();

        try {
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgsource))); // NOI18N
        } catch (Exception e) {
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coffee/img.png"))); // NOI18N

        }
        img.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgSource = "/img/coffee/" + name + "_info" + ".png";
                imgs = "/img/coffee/img_info.png";

                productName = name;
                productDes = description;
                productPrice = price;

                new Home().dispose();
                new ProductInfo().setVisible(true);

            }
        });

        panel.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel cart;
    private javax.swing.JLabel hot;
    private javax.swing.JLabel ice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel searchButton;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables

}
