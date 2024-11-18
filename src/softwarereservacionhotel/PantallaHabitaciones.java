package softwarereservacionhotel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class PantallaHabitaciones extends javax.swing.JFrame {

    private static PantallaHabitaciones instancia;
    // Declaración de instancias de las habitaciones
    Habitaciones1 hab1 = new Habitaciones1();
    Habitaciones2 hab2 = new Habitaciones2();
    Habitaciones3 hab3 = new Habitaciones3();
    Habitaciones4 hab4 = new Habitaciones4();
    Habitaciones5 hab5 = new Habitaciones5();
    Habitaciones6 hab6 = new Habitaciones6();
    Habitaciones7 hab7 = new Habitaciones7();
    Habitaciones8 hab8 = new Habitaciones8();
    Habitaciones9 hab9 = new Habitaciones9();
    Habitaciones10 hab10 = new Habitaciones10();

    int IndiceHab = 1; // Variable para mantener el índice de la habitación mostrada

    public PantallaHabitaciones() {
        initComponents(); // Inicialización de componentes Swing
        instancia = this;
        MostrarPanel(hab1); // Mostrar inicialmente la habitación hab1 al abrir la ventana
        setIconImage(new ImageIcon(getClass().getResource("/img_news/Logo_Hotel.png")).getImage());
        setTitle("Hotel Hola Mundo - Launcher");
        this.setResizable(true);  // Línea para deshabilitar el redimensionamiento
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar ventana al iniciar
        this.setMinimumSize(new Dimension(1280, 800)); // Tamaño mínimo de la ventana
    }

    public static PantallaHabitaciones getInstancia() {
        if (instancia == null) {
            instancia = new PantallaHabitaciones();
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

        jPanel1 = new FondoHabitaciones();
        content = new javax.swing.JPanel();
        btnHabitaciones = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnNosotros = new javax.swing.JButton();
        IzquierdaBtn = new javax.swing.JButton();
        DerechaBtn = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();
        btnAdminSinUso = new javax.swing.JButton();
        jLabelFondoGuíaHabitaciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 1100;
        gridBagConstraints.ipady = 610;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 0, 0, 0);
        jPanel1.add(content, gridBagConstraints);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 188;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 148, 0, 0);
        jPanel1.add(btnHabitaciones, gridBagConstraints);

        btnReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnReserva.setContentAreaFilled(false);
        btnReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReserva.setFocusable(false);
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 128;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 50, 0, 0);
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
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 40, 0, 0);
        jPanel1.add(btnNosotros, gridBagConstraints);

        IzquierdaBtn.setBorder(null);
        IzquierdaBtn.setBorderPainted(false);
        IzquierdaBtn.setContentAreaFilled(false);
        IzquierdaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzquierdaBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(293, 30, 0, 0);
        jPanel1.add(IzquierdaBtn, gridBagConstraints);

        DerechaBtn.setBorder(null);
        DerechaBtn.setBorderPainted(false);
        DerechaBtn.setContentAreaFilled(false);
        DerechaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DerechaBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(293, 0, 0, 0);
        jPanel1.add(DerechaBtn, gridBagConstraints);

        CerrarSesion.setBorder(null);
        CerrarSesion.setBorderPainted(false);
        CerrarSesion.setContentAreaFilled(false);
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesion.setFocusPainted(false);
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(97, 92, 0, 0);
        jPanel1.add(CerrarSesion, gridBagConstraints);

        btnAdminSinUso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAdminSinUso.setContentAreaFilled(false);
        btnAdminSinUso.setFocusPainted(false);
        btnAdminSinUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminSinUsoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 108;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 50, 0, 0);
        jPanel1.add(btnAdminSinUso, gridBagConstraints);

        jLabelFondoGuíaHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_news/Nuevo_FondoPantallaHabitaciones.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabelFondoGuíaHabitaciones, gridBagConstraints);

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
        // No hace nada, ya estás en la pantalla
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
        // Obtener la instancia de PantallaNosotros
        PantallaNosotros pn = PantallaNosotros.getInstancia();
        if (!pn.isVisible()) {
            pn.setVisible(true);
        } else {
            pn.toFront(); // Llevar la ventana existente al frente
        }
        dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_btnNosotrosActionPerformed

    private void IzquierdaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzquierdaBtnActionPerformed
        // Decrementar el índice de habitación si es mayor que 1 y menor que 11
        if (IndiceHab > 1 && IndiceHab < 11) {
            IndiceHab--;
            // Llamar al método para modificar el panel con el nuevo índice de habitación
            ModificarPanel(IndiceHab);
        }
    }//GEN-LAST:event_IzquierdaBtnActionPerformed

    private void DerechaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DerechaBtnActionPerformed
        // Incrementar el índice de habitación si es mayor que 0 y menor que 10
        if (IndiceHab > 0 && IndiceHab < 10) {
            IndiceHab++;
            // Llamar al método para modificar el panel con el nuevo índice de habitación
            ModificarPanel(IndiceHab);
        }
    }//GEN-LAST:event_DerechaBtnActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // Obtener una instancia de la ventana de inicio de sesión (Interfaz) y mostrarla
        Login loginWindow = Login.getInstancia();
        loginWindow.setVisible(true);
        // Cerrar la ventana actual
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void btnAdminSinUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminSinUsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminSinUsoActionPerformed
    
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
            java.util.logging.Logger.getLogger(PantallaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaHabitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton DerechaBtn;
    private javax.swing.JButton IzquierdaBtn;
    private javax.swing.JButton btnAdminSinUso;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnNosotros;
    private javax.swing.JButton btnReserva;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabelFondoGuíaHabitaciones;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void MostrarPanel(JPanel jp) {
        // Definir dimensiones de la ventana
        int Alto = 610;  // Altura deseada
        int Ancho = 1100;  // Ancho deseado

        // Establecer el tamaño y la ubicación del panel jp
        jp.setSize(Ancho, Alto);  // Establecer tamaño del panel
        jp.setLocation(0, 0);  // Establecer ubicación del panel en la ventana

        // Limpiar todo el contenido anterior del contenedor principal (content)
        content.removeAll();  // Eliminar todos los componentes del contenedor

        // Agregar el panel jp al centro del contenedor principal
        content.add(jp, BorderLayout.CENTER);  // Agregar el panel al centro del BorderLayout

        // Validar y repintar el contenedor para reflejar los cambios
        content.revalidate();  // Validar el contenedor
        content.repaint();  // Repintar el contenedor para actualizar la interfaz gráfica
    }

    private void ModificarPanel(int indice) {
        switch (indice) {
            case 1:
                MostrarPanel(hab1); // Mostrar el panel hab1
                break;
            case 2:
                MostrarPanel(hab2); // Mostrar el panel hab2
                break;
            case 3:
                MostrarPanel(hab3); // Mostrar el panel hab3
                break;
            case 4:
                MostrarPanel(hab4); // Mostrar el panel hab4
                break;
            case 5:
                MostrarPanel(hab5); // Mostrar el panel hab5
                break;
            case 6:
                MostrarPanel(hab6); // Mostrar el panel hab6
                break;
            case 7:
                MostrarPanel(hab7); // Mostrar el panel hab7
                break;
            case 8:
                MostrarPanel(hab8); // Mostrar el panel hab8
                break;
            case 9:
                MostrarPanel(hab9); // Mostrar el panel hab9
                break;
            case 10:
                MostrarPanel(hab10); // Mostrar el panel hab10
                break;
            default:
                MostrarPanel(hab1); // Mostrar el panel hab1 por defecto si el índice no está en el rango esperado
                IndiceHab = 1; // Reiniciar el índice a 1 si no se cumplen las condiciones anteriores
        }
    }
    
    class FondoHabitaciones extends JPanel {
        private Image imagen;

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            imagen = new ImageIcon(getClass().getResource("/img_news/Nuevo_Fondo2.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
