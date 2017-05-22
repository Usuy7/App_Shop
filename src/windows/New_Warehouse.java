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
public class New_Warehouse extends javax.swing.JFrame {

    /**
     * Creates new form New_Warehouse
     */
    public New_Warehouse() {
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

        Title = new javax.swing.JLabel();
        NAME = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        TRADEMARK = new javax.swing.JLabel();
        ComboBox_trademark = new javax.swing.JComboBox<>();
        SIZE = new javax.swing.JLabel();
        ComboBox_size = new javax.swing.JComboBox<>();
        DESCRIPTION = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_description = new javax.swing.JTextArea();
        COLOR = new javax.swing.JLabel();
        ComboBox_color = new javax.swing.JComboBox<>();
        MATERIAL = new javax.swing.JLabel();
        ComboBox_material = new javax.swing.JComboBox<>();
        CATEGORY = new javax.swing.JLabel();
        ComboBox_category = new javax.swing.JComboBox<>();
        PROVIDER = new javax.swing.JLabel();
        ComboBox_provider = new javax.swing.JComboBox<>();
        SAVE = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("NEW WAREHOUSE");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 30));

        NAME.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NAME.setForeground(new java.awt.Color(255, 255, 255));
        NAME.setText("Name");
        getContentPane().add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, 30));

        txt_name.setBackground(new java.awt.Color(51, 51, 51));
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 100, 30));

        TRADEMARK.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TRADEMARK.setForeground(new java.awt.Color(255, 255, 255));
        TRADEMARK.setText("Trademark");
        getContentPane().add(TRADEMARK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, 30));

        ComboBox_trademark.setBackground(new java.awt.Color(51, 51, 51));
        ComboBox_trademark.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox_trademark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboBox_trademark, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 100, 30));

        SIZE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        SIZE.setForeground(new java.awt.Color(255, 255, 255));
        SIZE.setText("Size");
        getContentPane().add(SIZE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 70, 30));

        ComboBox_size.setBackground(new java.awt.Color(51, 51, 51));
        ComboBox_size.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboBox_size, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 100, 30));

        DESCRIPTION.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DESCRIPTION.setForeground(new java.awt.Color(255, 255, 255));
        DESCRIPTION.setText("Description");
        getContentPane().add(DESCRIPTION, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 30));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        TextArea_description.setBackground(new java.awt.Color(51, 51, 51));
        TextArea_description.setColumns(20);
        TextArea_description.setRows(5);
        jScrollPane1.setViewportView(TextArea_description);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 373, -1, 110));

        COLOR.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        COLOR.setForeground(new java.awt.Color(255, 255, 255));
        COLOR.setText("Color");
        getContentPane().add(COLOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 70, 30));

        ComboBox_color.setBackground(new java.awt.Color(51, 51, 51));
        ComboBox_color.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox_color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboBox_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 100, 30));

        MATERIAL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MATERIAL.setForeground(new java.awt.Color(255, 255, 255));
        MATERIAL.setText("Material");
        getContentPane().add(MATERIAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 70, 30));

        ComboBox_material.setBackground(new java.awt.Color(51, 51, 51));
        ComboBox_material.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox_material.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboBox_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 100, 30));

        CATEGORY.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CATEGORY.setForeground(new java.awt.Color(255, 255, 255));
        CATEGORY.setText("Category");
        getContentPane().add(CATEGORY, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 70, 30));

        ComboBox_category.setBackground(new java.awt.Color(51, 51, 51));
        ComboBox_category.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboBox_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 100, 30));

        PROVIDER.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PROVIDER.setForeground(new java.awt.Color(255, 255, 255));
        PROVIDER.setText("Provider");
        getContentPane().add(PROVIDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 70, 30));

        ComboBox_provider.setBackground(new java.awt.Color(51, 51, 51));
        ComboBox_provider.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox_provider.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboBox_provider, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 100, 30));

        SAVE.setBackground(new java.awt.Color(25, 25, 25));
        SAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar-A.png"))); // NOI18N
        SAVE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SAVE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar-B.png"))); // NOI18N
        SAVE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_guardar.png"))); // NOI18N
        getContentPane().add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 435, 50, 50));

        CANCEL.setBackground(new java.awt.Color(25, 25, 25));
        CANCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_no-A.png"))); // NOI18N
        CANCEL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CANCEL.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_no-B.png"))); // NOI18N
        CANCEL.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_no.png"))); // NOI18N
        getContentPane().add(CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 435, 50, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_windows2.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(New_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Warehouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton CANCEL;
    private javax.swing.JLabel CATEGORY;
    private javax.swing.JLabel COLOR;
    private javax.swing.JComboBox<String> ComboBox_category;
    private javax.swing.JComboBox<String> ComboBox_color;
    private javax.swing.JComboBox<String> ComboBox_material;
    private javax.swing.JComboBox<String> ComboBox_provider;
    private javax.swing.JComboBox<String> ComboBox_size;
    private javax.swing.JComboBox<String> ComboBox_trademark;
    private javax.swing.JLabel DESCRIPTION;
    private javax.swing.JLabel MATERIAL;
    private javax.swing.JLabel NAME;
    private javax.swing.JLabel PROVIDER;
    private javax.swing.JButton SAVE;
    private javax.swing.JLabel SIZE;
    private javax.swing.JLabel TRADEMARK;
    private javax.swing.JTextArea TextArea_description;
    private javax.swing.JLabel Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
