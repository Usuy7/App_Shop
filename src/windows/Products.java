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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier
 */
public class Products extends javax.swing.JFrame {

    // LLAMAR A LA CLASE ConectDB
    ConectDB con = new ConectDB();

    /**
     * Creates new form Productos
     */
    DefaultTableModel model;

    public Products() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../img/icono_app.png")).getImage());

        con.AbrirConexion();  //ABRIR LA CONEXIÓN

        // ALIGN DATA TABLE LEFT
        DefaultTableModel columnModel = (DefaultTableModel) jTable1.getModel();
        DefaultTableCellRenderer t = new DefaultTableCellRenderer();
        t.setHorizontalAlignment(SwingConstants.LEFT);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(t);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(t);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(t);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(t);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(t);
        jTable1.getColumnModel().getColumn(6).setCellRenderer(t);
        jTable1.getColumnModel().getColumn(7).setCellRenderer(t);
        jTable1.getColumnModel().getColumn(8).setCellRenderer(t);

        Statement s = con.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String query = "SELECT * FROM Products";
        ResultSet rs = s.executeQuery(query);

        Object datosTabla[] = new Object[9];

        while (rs.next()) {
            datosTabla[0] = rs.getInt("IdProduct");
            datosTabla[1] = rs.getString("Name");
            datosTabla[2] = rs.getInt("Provider");
            datosTabla[3] = rs.getInt("Category");
            datosTabla[4] = rs.getInt("Trademark");
            datosTabla[5] = rs.getInt("Size");
            datosTabla[6] = rs.getInt("Color");
            datosTabla[7] = rs.getInt("Material");
            datosTabla[8] = rs.getInt("Price");
            columnModel.addRow(datosTabla);
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

        MENU = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        NEW = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        Table = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_atras-A.png"))); // NOI18N
        MENU.setBorder(null);
        MENU.setBorderPainted(false);
        MENU.setContentAreaFilled(false);
        MENU.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_atras-B.png"))); // NOI18N
        MENU.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_atras.png"))); // NOI18N
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });
        getContentPane().add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        Title.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(52, 73, 94));
        Title.setText("PRODUCTS");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 150, 40));

        NEW.setBackground(new java.awt.Color(25, 25, 25));
        NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_añadir-A.png"))); // NOI18N
        NEW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NEW.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_añadir-B.png"))); // NOI18N
        NEW.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_añadir.png"))); // NOI18N
        NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWActionPerformed(evt);
            }
        });
        getContentPane().add(NEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 60, 60));

        EDIT.setBackground(new java.awt.Color(25, 25, 25));
        EDIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_edit-A.png"))); // NOI18N
        EDIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EDIT.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_edit-B.png"))); // NOI18N
        EDIT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_edit.png"))); // NOI18N
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });
        getContentPane().add(EDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 60, 60));

        DELETE.setBackground(new java.awt.Color(25, 25, 25));
        DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_borrar-A.png"))); // NOI18N
        DELETE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DELETE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_borrar-B.png"))); // NOI18N
        DELETE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_borrar.png"))); // NOI18N
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 60, 60));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(219, 219, 219));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Provider", "Category", "Trademark", "Size", "Color", "Material", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.setRowMargin(2);
        Table.setViewportView(jTable1);

        getContentPane().add(Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 820, 430));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_windows.jpg"))); // NOI18N
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // DELETE PRODUCT
        int answer = JOptionPane.showConfirmDialog(null, "You are deleting the data, do you want to continue?", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (JOptionPane.OK_OPTION == answer) {

        } else {
        }
    }//GEN-LAST:event_DELETEActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EDITActionPerformed

    private void NEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWActionPerformed
        // NEW PRODUCT
        New_Product nuevo = new New_Product();
        nuevo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NEWActionPerformed

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
        // COME BACK TO MENU
        this.setVisible(false);
    }//GEN-LAST:event_MENUActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Products().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton EDIT;
    private javax.swing.JButton MENU;
    private javax.swing.JButton NEW;
    private javax.swing.JScrollPane Table;
    private javax.swing.JLabel Title;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
