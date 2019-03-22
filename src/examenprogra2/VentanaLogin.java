/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprogra2;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author noe
 */
public class VentanaLogin extends javax.swing.JFrame {

    
    /**
     * Creates new form ventanaLogin
     */
    
    public static String user = "user@gmail.com";
    public static String pass = "hola@123";
    
    public VentanaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        txtUser.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        lblPerfil = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("¿Olvidó su contraseña?");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        lblPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examenprogra2/imagenes/grupo1.png"))); // NOI18N
        getContentPane().add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 200));

        lblPass.setBackground(java.awt.Color.white);
        lblPass.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblPass.setForeground(java.awt.Color.white);
        lblPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examenprogra2/imagenes/candadoColor2.png"))); // NOI18N
        getContentPane().add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 50, -1));

        lblUser.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblUser.setForeground(java.awt.Color.white);
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examenprogra2/imagenes/persona1.png"))); // NOI18N
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 60, 60));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 110, -1));

        txtUser.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtUser.setToolTipText("");
        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 230, 30));

        password.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 230, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examenprogra2/imagenes/fondo2.jpeg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        RestaurarPass v2 = new RestaurarPass();
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        this.verificarLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.verificarLogin();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.verificarLogin();
        }
    }//GEN-LAST:event_passwordKeyPressed

    public void verificarLogin(){
       
        if (password.getText().equals(pass)&&txtUser.getText().equals(user)) {
            VentanaUser v1 = new VentanaUser();
            v1.setVisible(true);
            this.setVisible(false);
            
        }else if (password.getText().isEmpty()&&txtUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null ,"Campos Vacios");
            txtUser.requestFocus();
        }else{
           VentanaError ventana = new VentanaError();
           ventana.setVisible(true);
           txtUser.setText("");
           txtUser.requestFocus();
           password.setText("");
        }
        
        
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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
