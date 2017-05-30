/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import DAO.ConectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class New_Order extends javax.swing.JFrame {

    // LLAMAR A LA CLASE ConectDB
    static ConectDB con = new ConectDB();

    /**
     * Creates new form New_Order
     */
    public New_Order() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../img/icono_app.png")).getImage());

        con.AbrirConexion();  //ABRIR LA CONEXIÓN
        
        /**
         * Llamada al método combobox
         */
       
        
        String query2 = "SELECT * FROM Workers";
        ResultSet r2;
        Statement s2 = con.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        r2 = s2.executeQuery(query2);
        
        DefaultComboBoxModel value1 = new DefaultComboBoxModel();
        while (r2.next()) {
            value1.addElement(r2.getString("Name"));
        }
        
        ComboBox_worker.setModel(value1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        WORKER = new javax.swing.JLabel();
        ComboBox_worker = new javax.swing.JComboBox<>();
        PRODUCT = new javax.swing.JLabel();
        txt_product = new javax.swing.JTextField();
        BUYER = new javax.swing.JLabel();
        txt_buyer = new javax.swing.JTextField();
        DATE = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        PHONE = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        SAVE = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("NEW ORDER");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 57, -1, -1));

        WORKER.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        WORKER.setForeground(new java.awt.Color(255, 255, 255));
        WORKER.setText("Worker");
        getContentPane().add(WORKER, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 70, 30));

        ComboBox_worker.setBackground(new java.awt.Color(51, 51, 51));
        ComboBox_worker.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox_worker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboBox_worker, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 100, 30));

        PRODUCT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PRODUCT.setForeground(new java.awt.Color(255, 255, 255));
        PRODUCT.setText("Product");
        getContentPane().add(PRODUCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, 30));

        txt_product.setBackground(new java.awt.Color(51, 51, 51));
        txt_product.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 100, 30));

        BUYER.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BUYER.setForeground(new java.awt.Color(255, 255, 255));
        BUYER.setText("Buyer");
        getContentPane().add(BUYER, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 70, 30));

        txt_buyer.setBackground(new java.awt.Color(51, 51, 51));
        txt_buyer.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_buyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 100, 30));

        DATE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DATE.setForeground(new java.awt.Color(255, 255, 255));
        DATE.setText("Date");
        getContentPane().add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 70, 30));

        txt_date.setBackground(new java.awt.Color(51, 51, 51));
        txt_date.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 100, 30));

        PHONE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PHONE.setForeground(new java.awt.Color(255, 255, 255));
        PHONE.setText("Phone");
        getContentPane().add(PHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 70, 30));

        txt_phone.setBackground(new java.awt.Color(51, 51, 51));
        txt_phone.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 100, 30));

        SAVE.setBackground(new java.awt.Color(25, 25, 25));
        SAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar-A.png"))); // NOI18N
        SAVE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SAVE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar-B.png"))); // NOI18N
        SAVE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar.png"))); // NOI18N
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });
        getContentPane().add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 50, 50));

        CANCEL.setBackground(new java.awt.Color(25, 25, 25));
        CANCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_no-A.png"))); // NOI18N
        CANCEL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CANCEL.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_no-B.png"))); // NOI18N
        CANCEL.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_no.png"))); // NOI18N
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });
        getContentPane().add(CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 50, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_windows2.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
        // CANCEL
        Orders order = null;
        try {
            order = new Orders();
        } catch (SQLException ex) {
            Logger.getLogger(New_Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        order.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CANCELActionPerformed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        // SAVE

        String Work, Product, Buyer, Fecha, Phone;

        Work = (String) ComboBox_worker.getSelectedItem();
        int Worker = getCodWorker(Work);
        Product = txt_product.getText();
        Buyer = txt_buyer.getText();
        Fecha = txt_date.getText();
        Phone = txt_phone.getText();

        try {

            Statement s = con.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_UPDATABLE);
            String query = "INSERT INTO Orders (Worker, Product, Buyer, Fecha, Phone) VALUES ('" + Worker + "','" + Product + "','" + Buyer + "','" + Fecha + "','" + Phone + "')";
            int resultado = s.executeUpdate(query);

            query = "SELECT * FROM Orders";
            ResultSet r = s.executeQuery(query);
            r.first();
            ComboBox_worker.setSelectedItem(getNombreWorker(r.getInt("Worker")));
            txt_product.setText(r.getString("Product"));
            txt_buyer.setText(r.getString("Buyer"));
            txt_date.setText(r.getString("Fecha"));
            txt_phone.setText(r.getString("Phone"));
            
            Orders order = new Orders();
            order.setVisible(true);
            this.setVisible(false);
            
        } catch (SQLException ex) {
            Logger.getLogger(New_Order.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Data saved successfully", "INFORMATION",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SAVEActionPerformed

    /**
     * Metodo que coje el código del worker y devuelve su nombre.
     *
     * @param codigo - variable que contiene el código del worker.
     * @return nombre - variable que contiene el nombre del worker.
     */
    
    public static String getNombreWorker(int codigo) {

        String nombre;

        nombre = "";

        try {

            ResultSet r2;
            Statement s2 = con.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String queryNombre = "SELECT Name FROM Workers WHERE IdWorker =" + codigo;
            r2 = s2.executeQuery(queryNombre);
            r2.first();
            nombre = r2.getString("Name");

        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nombre;
    }
    
    /**
     * Método que coje el nombre del worker y devuelve su código.
     *
     * @param nombre - variable que contiene el nombre del worker.
     * @return codigo - variable que contiene el código del worker.
     *
     */
    public static int getCodWorker(String nombre) {

        int codigo = 0;

        try {
            ResultSet r2;
            Statement s2 = con.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String queryNombre = "SELECT IdWorker FROM Workers WHERE Name='" + nombre + "'";
            r2 = s2.executeQuery(queryNombre);
            r2.first();
            codigo = r2.getInt("IdWorker");
        } catch (SQLException ex) {
            Logger.getLogger(Workers.class.getName()).log(Level.SEVERE, null, ex);
        }

        return codigo;
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
            java.util.logging.Logger.getLogger(New_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new New_Order().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(New_Order.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BUYER;
    private javax.swing.JLabel Background;
    private javax.swing.JButton CANCEL;
    private javax.swing.JComboBox<String> ComboBox_worker;
    private javax.swing.JLabel DATE;
    private javax.swing.JLabel PHONE;
    private javax.swing.JLabel PRODUCT;
    private javax.swing.JButton SAVE;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel WORKER;
    private javax.swing.JTextField txt_buyer;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_product;
    // End of variables declaration//GEN-END:variables
}
