/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class NewJFrameSeguridad extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameSeguridad
     */
    public NewJFrameSeguridad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelImagenUsuario = new javax.swing.JLabel();
        jLabelImagenContra = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jButtonIngresar = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelRecuperarCuenta = new javax.swing.JLabel();
        jLabelImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 211, 49));

        jLabelUsuario.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 102, 0));
        jLabelUsuario.setText("Usuario");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 141, 86, 45));

        jLabelImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        getContentPane().add(jLabelImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 92, -1, -1));

        jLabelImagenContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/passwor.png"))); // NOI18N
        getContentPane().add(jLabelImagenContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 238, -1, -1));

        jLabelLogin.setFont(new java.awt.Font("Bauhaus 93", 1, 48)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 102, 0));
        jLabelLogin.setText("LOGIN");
        getContentPane().add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 21, -1, -1));

        jLabelContrasena.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabelContrasena.setForeground(new java.awt.Color(255, 102, 0));
        jLabelContrasena.setText("Contraseña");
        getContentPane().add(jLabelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 286, -1, 45));

        jButtonIngresar.setBackground(new java.awt.Color(51, 204, 255));
        jButtonIngresar.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(255, 102, 0));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 190, 50));

        jLabelRecuperarCuenta.setBackground(new java.awt.Color(0, 51, 255));
        jLabelRecuperarCuenta.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelRecuperarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRecuperarCuenta.setText("Olvido su contraseña o Usuario");
        jLabelRecuperarCuenta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                azul(evt);
            }
        });
        getContentPane().add(jLabelRecuperarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 200, -1));

        jLabelImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-negro-puntos-luces-azules_1035-6355.jpg"))); // NOI18N
        getContentPane().add(jLabelImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void azul(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_azul
        // TODO add your handling code here:
    }//GEN-LAST:event_azul

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
            java.util.logging.Logger.getLogger(NewJFrameSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameSeguridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelImagenContra;
    private javax.swing.JLabel jLabelImagenFondo;
    private javax.swing.JLabel jLabelImagenUsuario;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelRecuperarCuenta;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
