package windows;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage (new ImageIcon(getClass().getResource("../img/icono_app.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LOGIN = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        EXIT = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGIN.setBackground(new java.awt.Color(0, 0, 0));
        LOGIN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(255, 255, 255));
        LOGIN.setText("login");
        LOGIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGIN.setOpaque(false);
        getContentPane().add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 80, 40));

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_user.png"))); // NOI18N
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        txt_user.setBackground(new java.awt.Color(51, 51, 51));
        txt_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_user.setForeground(new java.awt.Color(204, 204, 204));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(null);
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 120, 30));

        jPasswordField1.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setBorder(null);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 322, 120, 30));

        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_error-A.png"))); // NOI18N
        EXIT.setBorder(null);
        EXIT.setBorderPainted(false);
        EXIT.setContentAreaFilled(false);
        EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_error-B.png"))); // NOI18N
        EXIT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_error.png"))); // NOI18N
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 40, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_login.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
    // BOTON EXIT
        
        int answer = JOptionPane.showConfirmDialog(null, "You are closing the application, do you want to continue?", "SIGNAL" ,JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (JOptionPane.OK_OPTION == answer){
            System.exit(0);
        }else{}
    }//GEN-LAST:event_EXITActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton LOGIN;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txt_user;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
