
package kapehan;

public class MyAccountForm extends javax.swing.JFrame {

    /**
     * Creates new form MyAccountForm
     */
    public MyAccountForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MyAccountLabel = new javax.swing.JLabel();
        LeftArrow = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        ProfileName = new javax.swing.JLabel();
        UserAddress = new javax.swing.JLabel();
        SignOut = new javax.swing.JLabel();
        userInfo = new javax.swing.JLabel();
        UserPassword = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ea7a08282f40760a5989ba022d6f0480-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        MyAccountLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MyAccountLabel.setText("My Account");
        getContentPane().add(MyAccountLabel);
        MyAccountLabel.setBounds(90, 70, 110, 30);

        LeftArrow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LeftArrow.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student.admin\\Desktop\\Ethyl\\ethyl28\\src\\img\\leftArrow.png")); // NOI18N
        LeftArrow.setText("jLabel2");
        getContentPane().add(LeftArrow);
        LeftArrow.setBounds(30, 80, 30, 20);

        Profile.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student.admin\\Desktop\\Ethyl\\ethyl28\\src\\img\\profile.png")); // NOI18N
        getContentPane().add(Profile);
        Profile.setBounds(90, 100, 96, 100);

        ProfileName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ProfileName.setText("Laurence");
        getContentPane().add(ProfileName);
        ProfileName.setBounds(100, 200, 80, 40);

        UserAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserAddress.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student.admin\\Desktop\\Ethyl\\ethyl28\\src\\img\\address.png")); // NOI18N
        UserAddress.setText("  Address");
        getContentPane().add(UserAddress);
        UserAddress.setBounds(40, 310, 190, 40);

        SignOut.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SignOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student.admin\\Desktop\\Ethyl\\ethyl28\\src\\img\\logOut.png")); // NOI18N
        SignOut.setText("  Sign Out");
        getContentPane().add(SignOut);
        SignOut.setBounds(40, 390, 160, 40);

        userInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userInfo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student.admin\\Desktop\\Ethyl\\ethyl28\\src\\img\\userInfo.png")); // NOI18N
        userInfo.setText("  My Information");
        getContentPane().add(userInfo);
        userInfo.setBounds(40, 270, 190, 40);

        UserPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserPassword.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student.admin\\Desktop\\Ethyl\\ethyl28\\src\\img\\userpass.png")); // NOI18N
        UserPassword.setText("   Password");
        getContentPane().add(UserPassword);
        UserPassword.setBounds(40, 350, 180, 40);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student.admin\\Desktop\\Ethyl\\ethyl28\\src\\img\\ea7a08282f40760a5989ba022d6f0480-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 20, 285, 549);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student.admin\\Desktop\\Ethyl\\ethyl28\\src\\img\\editpencil.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 150, 50, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 30, 250, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MyAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyAccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LeftArrow;
    private javax.swing.JLabel MyAccountLabel;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel ProfileName;
    private javax.swing.JLabel SignOut;
    private javax.swing.JLabel UserAddress;
    private javax.swing.JLabel UserPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel userInfo;
    // End of variables declaration//GEN-END:variables
}
