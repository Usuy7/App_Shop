/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author AlumMati
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage (new ImageIcon(getClass().getResource("../img/icono_app.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PRODUCTS = new javax.swing.JButton();
        SALES = new javax.swing.JButton();
        PERSONAL = new javax.swing.JButton();
        CUSTOMERS = new javax.swing.JButton();
        LOG_OUT = new javax.swing.JButton();
        WAREHOUSE = new javax.swing.JButton();
        PROVIDER = new javax.swing.JButton();
        ORDERS = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRODUCTS.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        PRODUCTS.setForeground(new java.awt.Color(52, 73, 94));
        PRODUCTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_productos-A.png"))); // NOI18N
        PRODUCTS.setText("PRODUCTS");
        PRODUCTS.setBorder(null);
        PRODUCTS.setContentAreaFilled(false);
        PRODUCTS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PRODUCTS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRODUCTS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_productos-B.png"))); // NOI18N
        PRODUCTS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_productos.png"))); // NOI18N
        PRODUCTS.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PRODUCTS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(PRODUCTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 110, 150));

        SALES.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SALES.setForeground(new java.awt.Color(52, 73, 94));
        SALES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_ventas-A.png"))); // NOI18N
        SALES.setText("SALES");
        SALES.setBorder(null);
        SALES.setContentAreaFilled(false);
        SALES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SALES.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SALES.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_ventas-B.png"))); // NOI18N
        SALES.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_ventas.png"))); // NOI18N
        SALES.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        SALES.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(SALES, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 110, 150));

        PERSONAL.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        PERSONAL.setForeground(new java.awt.Color(52, 73, 94));
        PERSONAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_personal-A.png"))); // NOI18N
        PERSONAL.setText("PERSONAL");
        PERSONAL.setBorder(null);
        PERSONAL.setContentAreaFilled(false);
        PERSONAL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PERSONAL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PERSONAL.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_personal-B.png"))); // NOI18N
        PERSONAL.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_personal.png"))); // NOI18N
        PERSONAL.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PERSONAL.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(PERSONAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 120, 150));

        CUSTOMERS.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        CUSTOMERS.setForeground(new java.awt.Color(52, 73, 94));
        CUSTOMERS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_cliente-A.png"))); // NOI18N
        CUSTOMERS.setText("CUSTOMERS");
        CUSTOMERS.setBorder(null);
        CUSTOMERS.setContentAreaFilled(false);
        CUSTOMERS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CUSTOMERS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CUSTOMERS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_cliente-B.png"))); // NOI18N
        CUSTOMERS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_cliente.png"))); // NOI18N
        CUSTOMERS.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        CUSTOMERS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(CUSTOMERS, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 110, 150));

        LOG_OUT.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LOG_OUT.setForeground(new java.awt.Color(52, 73, 94));
        LOG_OUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_sign off-A.png"))); // NOI18N
        LOG_OUT.setText("LOG OUT");
        LOG_OUT.setToolTipText("");
        LOG_OUT.setBorder(null);
        LOG_OUT.setContentAreaFilled(false);
        LOG_OUT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOG_OUT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LOG_OUT.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_sign off-B.png"))); // NOI18N
        LOG_OUT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_sign off.png"))); // NOI18N
        LOG_OUT.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LOG_OUT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LOG_OUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOG_OUTActionPerformed(evt);
            }
        });
        getContentPane().add(LOG_OUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 110, 150));

        WAREHOUSE.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        WAREHOUSE.setForeground(new java.awt.Color(52, 73, 94));
        WAREHOUSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_almacen-A.png"))); // NOI18N
        WAREHOUSE.setText("WAREHOUSE");
        WAREHOUSE.setBorder(null);
        WAREHOUSE.setContentAreaFilled(false);
        WAREHOUSE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WAREHOUSE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WAREHOUSE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_almacen-B.png"))); // NOI18N
        WAREHOUSE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_almacen.png"))); // NOI18N
        WAREHOUSE.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        WAREHOUSE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(WAREHOUSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 110, 150));

        PROVIDER.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        PROVIDER.setForeground(new java.awt.Color(52, 73, 94));
        PROVIDER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_proveedor-A.png"))); // NOI18N
        PROVIDER.setText("PROVIDER");
        PROVIDER.setBorder(null);
        PROVIDER.setContentAreaFilled(false);
        PROVIDER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PROVIDER.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PROVIDER.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_proveedor-B.png"))); // NOI18N
        PROVIDER.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_proveedor.png"))); // NOI18N
        PROVIDER.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PROVIDER.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(PROVIDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 110, 150));

        ORDERS.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ORDERS.setForeground(new java.awt.Color(52, 73, 94));
        ORDERS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_pedidos-A.png"))); // NOI18N
        ORDERS.setText("ORDERS");
        ORDERS.setBorder(null);
        ORDERS.setContentAreaFilled(false);
        ORDERS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ORDERS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ORDERS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_pedidos-B.png"))); // NOI18N
        ORDERS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_pedidos.png"))); // NOI18N
        ORDERS.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ORDERS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(ORDERS, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 110, 150));

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
        getContentPane().add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 50, 50));

        Background.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Background.setForeground(new java.awt.Color(52, 73, 94));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_menu.jpg"))); // NOI18N
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Background.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Background.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
         // BOTON SALIR 
        
        // JOptionPane.showMessageDialog(null,"Los datos del nuevo producto se han guardado correctamente", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE); MENSAJE DE AVISO
        
        int answer = JOptionPane.showConfirmDialog(null, "You are closing the application, do you want to continue?", "SIGNAL" ,JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (JOptionPane.OK_OPTION == answer){
           System.exit(0);
        }else{}
    }//GEN-LAST:event_EXITActionPerformed

    private void LOG_OUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOG_OUTActionPerformed
           int answer = JOptionPane.showConfirmDialog(null, "You are closing session, do you want to continue?", "SIGNAL" ,JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (JOptionPane.OK_OPTION == answer){
            System.exit(0);
        }else{}
    }//GEN-LAST:event_LOG_OUTActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton CUSTOMERS;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton LOG_OUT;
    private javax.swing.JButton ORDERS;
    private javax.swing.JButton PERSONAL;
    private javax.swing.JButton PRODUCTS;
    private javax.swing.JButton PROVIDER;
    private javax.swing.JButton SALES;
    private javax.swing.JButton WAREHOUSE;
    // End of variables declaration//GEN-END:variables
}
