
package softwarereservacionhotel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class PantallaNosotros extends javax.swing.JFrame {

    FondoNosotros FondoNosotros = new PantallaNosotros.FondoNosotros();
    private static PantallaNosotros instancia;
    
    public PantallaNosotros() {
        this.setContentPane(FondoNosotros);
        initComponents();
        instancia = this;
        setIconImage(new ImageIcon(getClass().getResource("/img_news/Logo_Hotel.png")).getImage());
        setTitle("Hotel Hola Mundo - Launcher");
        this.setResizable(true);  // Línea para deshabilitar el redimensionamiento
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar ventana al iniciar
        this.setMinimumSize(new Dimension(1280, 800)); // Tamaño mínimo de la ventana
    }
    
    public static PantallaNosotros getInstancia() {
        if (instancia == null) {
            instancia = new PantallaNosotros();
        }
        return instancia;
    }

    @Override
    public void dispose() {
        instancia = null;
        super.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new FondoNosotros();
        btnHabitaciones = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnNosotros = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();
        btnAdminSinUso = new javax.swing.JButton();
        jLabelFondoGuíaNosotros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnHabitaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnHabitaciones.setContentAreaFilled(false);
        btnHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitaciones.setFocusPainted(false);
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 186;
        gridBagConstraints.ipady = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 151, 0, 0);
        jPanel1.add(btnHabitaciones, gridBagConstraints);

        btnReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnReserva.setContentAreaFilled(false);
        btnReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReserva.setFocusPainted(false);
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 128;
        gridBagConstraints.ipady = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 47, 0, 0);
        jPanel1.add(btnReserva, gridBagConstraints);

        btnNosotros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnNosotros.setContentAreaFilled(false);
        btnNosotros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNosotros.setFocusPainted(false);
        btnNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNosotrosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 42, 0, 0);
        jPanel1.add(btnNosotros, gridBagConstraints);

        CerrarSesion.setBorder(null);
        CerrarSesion.setBorderPainted(false);
        CerrarSesion.setContentAreaFilled(false);
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(96, 182, 0, 0);
        jPanel1.add(CerrarSesion, gridBagConstraints);

        btnAdminSinUso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAdminSinUso.setContentAreaFilled(false);
        btnAdminSinUso.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 106;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 48, 0, 0);
        jPanel1.add(btnAdminSinUso, gridBagConstraints);

        jLabelFondoGuíaNosotros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_news/Nuevo_FondoPantallaNosotros.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabelFondoGuíaNosotros, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        // Obtener la instancia de PantallaHabitaciones
        PantallaHabitaciones ph = PantallaHabitaciones.getInstancia();
        if (!ph.isVisible()) {
            ph.setVisible(true);
        } else {
            ph.toFront(); // Llevar la ventana existente al frente
        }
        dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        // Obtener el tipo de usuario desde la instancia singleton
        String tipoUsuario = UsuarioActual.getInstancia().getTipoUsuario().trim();
        System.out.println("Tipo de usuario: '" + tipoUsuario + "'"); // Imprimir para depuración

        // Realizar la comparación del tipo de usuario
        if ("Cliente".equalsIgnoreCase(tipoUsuario)) {
            PantallaReservarCliente prCliente = PantallaReservarCliente.getInstancia();
            if (!prCliente.isVisible()) {
                prCliente.setVisible(true);
            } else {
                prCliente.toFront(); // Llevar la ventana existente al frente
            }
        } else if ("Administrador".equalsIgnoreCase(tipoUsuario)) {
            PantallaReservarAdmin prAdmin = PantallaReservarAdmin.getInstancia();
            if (!prAdmin.isVisible()) {
                prAdmin.setVisible(true);
            } else {
                prAdmin.toFront(); // Llevar la ventana existente al frente
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tipo de usuario no reconocido");
        }
        dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_btnReservaActionPerformed

    private void btnNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNosotrosActionPerformed
        // No hace nada, ya estás en la pantalla
    }//GEN-LAST:event_btnNosotrosActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // Obtener una instancia de la ventana de inicio de sesión (Interfaz) y mostrarla
        Login loginWindow = Login.getInstancia();
        loginWindow.setVisible(true);
        // Cerrar la ventana actual
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaNosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaNosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaNosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaNosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaNosotros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton btnAdminSinUso;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnNosotros;
    private javax.swing.JButton btnReserva;
    private javax.swing.JLabel jLabelFondoGuíaNosotros;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    class FondoNosotros extends JPanel {
        private Image imagen;

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            imagen = new ImageIcon(getClass().getResource("/img_news/Nuevo_Fondo2.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
