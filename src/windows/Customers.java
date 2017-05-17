/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import javax.swing.ImageIcon;

/**
 *
 * @author AlumMati
 */
public class Customers extends javax.swing.JFrame {

    /**
     * Creates new form Customers
     */
    public Customers() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage (new ImageIcon(getClass().getResource("../img/icono_app.png")).getImage());
        SAVE.setVisible(false);
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
        SEARCH = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        NEW = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        SAVE = new javax.swing.JButton();
        Table = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(52, 73, 94));
        Title.setText("CUSTOMERS");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 180, 40));

        SEARCH.setBackground(new java.awt.Color(25, 25, 25));
        SEARCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_search-A.png"))); // NOI18N
        SEARCH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SEARCH.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_search-B.png"))); // NOI18N
        SEARCH.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_search.png"))); // NOI18N
        getContentPane().add(SEARCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, -1));

        txt_search.setBackground(new java.awt.Color(51, 51, 51));
        txt_search.setForeground(new java.awt.Color(219, 219, 219));
        txt_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_search.setBorder(null);
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 160, 48));

        NEW.setBackground(new java.awt.Color(25, 25, 25));
        NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_añadir-A.png"))); // NOI18N
        NEW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NEW.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_añadir-B.png"))); // NOI18N
        NEW.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_añadir.png"))); // NOI18N
        getContentPane().add(NEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 60, 60));

        EDIT.setBackground(new java.awt.Color(25, 25, 25));
        EDIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_edit-A.png"))); // NOI18N
        EDIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EDIT.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_edit-B.png"))); // NOI18N
        EDIT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_edit.png"))); // NOI18N
        getContentPane().add(EDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 60, 60));

        DELETE.setBackground(new java.awt.Color(25, 25, 25));
        DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_borrar-A.png"))); // NOI18N
        DELETE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DELETE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_borrar-B.png"))); // NOI18N
        DELETE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_borrar.png"))); // NOI18N
        getContentPane().add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 60, 60));

        SAVE.setBackground(new java.awt.Color(25, 25, 25));
        SAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar-A.png"))); // NOI18N
        SAVE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SAVE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar-B.png"))); // NOI18N
        SAVE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar.png"))); // NOI18N
        getContentPane().add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 60, 60));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surnames", "Address", "City", "CP", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.setViewportView(jTable1);

        getContentPane().add(Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 800, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_productos.jpg"))); // NOI18N
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 580));

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton EDIT;
    private javax.swing.JButton NEW;
    private javax.swing.JButton SAVE;
    private javax.swing.JButton SEARCH;
    private javax.swing.JScrollPane Table;
    private javax.swing.JLabel Title;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
