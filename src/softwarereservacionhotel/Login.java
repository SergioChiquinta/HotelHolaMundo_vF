
package softwarereservacionhotel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Login extends JFrame {

    private static Login instancia;
    FondoLogin FondoLogin = new FondoLogin();
    
    public Login() {
        this.setContentPane(FondoLogin);
        initComponents();
        checkbox1.addItemListener(evt -> checkboxMostrarContraseña(evt));
        txtContraseña.setEchoChar('•'); // Ocultar texto con "•"
        checkbox1.addItemListener(new java.awt.event.ItemListener() { //Funcionalidad para el checkbox contraseña se actualice
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkboxMostrarContraseña(evt);
            }
        });
        txtContraseña.setEchoChar('•'); // Ocultar texto con "•"
        setIconImage(new ImageIcon(getClass().getResource("/img_news/Logo_Hotel.png")).getImage());
        setTitle("Hotel Hola Mundo - Launcher");
        this.setResizable(true);  // Línea para deshabilitar el redimensionamiento
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar ventana al iniciar
        this.setMinimumSize(new Dimension(1280, 800)); // Tamaño mínimo de la ventana
    }
    
    public static Login getInstancia() {
        // Verificar si la instancia de la clase Login es nula
        if (instancia == null) {
            // Si es nula, crear una nueva instancia de la clase Login
            instancia = new Login();
        }
        // Devolver la instancia única de la clase Login
        return instancia;
    }

    private void login() {
        // Obtener el texto ingresado en los campos de correo/nombre de usuario y contraseña
        String correoOusuario = txtCorreo.getText();
        String contraseña = new String(txtContraseña.getPassword());

        try (Connection con = Conexion.getConexion()) {
            // Consulta SQL para seleccionar el usuario según el correo/nombre de usuario y la contraseña
            String query = "SELECT * FROM usuario WHERE (EMA_USU = ? OR NOM_USU = ?) AND CON_USU = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, correoOusuario); // Asignar correo/nombre de usuario al primer parámetro
            ps.setString(2, correoOusuario); // Asignar correo/nombre de usuario al segundo parámetro
            ps.setString(3, contraseña); // Asignar la contraseña al tercer parámetro
            ResultSet rs = ps.executeQuery();

            // Verificar si se encontró un usuario que coincida con los criterios
            if (rs.next()) {
                // Obtener los datos del usuario desde el resultado de la consulta
                String nombreUsuario = rs.getString("NOM_USU");
                String correoUsuario = rs.getString("EMA_USU");
                String tipoUsuario = rs.getString("TIP_USU");
                String idUsuario = rs.getString("ID_USU");

                // Obtener la instancia actual del usuario y establecer sus atributos dentro de UsuarioActual
                UsuarioActual usuarioActual = UsuarioActual.getInstancia();
                usuarioActual.setNombreUsuario(nombreUsuario); // Asignar el nombre obtenido
                usuarioActual.setCorreoUsuario(correoUsuario); // Asignar el correo obtenido
                usuarioActual.setTipoUsuario(tipoUsuario); // Asignar el tipo de usuario obtenido
                usuarioActual.setIdUsuario(idUsuario); // Asignar el ID de usuario obtenido

                // Consulta SQL para obtener el DNI del usuario según su tipo (Cliente o Administrador)
                String dniQuery = "SELECT DNI_CLI FROM CLIENTE WHERE ID_USU = ?";
                PreparedStatement dniPs = con.prepareStatement(dniQuery);
                dniPs.setString(1, idUsuario); // Asignar el ID de usuario al primer parámetro
                ResultSet dniRs = dniPs.executeQuery();

                // Verificar si se encontró un DNI para el usuario
                if (dniRs.next()) {
                    String dni = dniRs.getString(1); // El DNI está en la primera columna de la tabla
                    usuarioActual.setDni(dni);
                }

                // Mensajes de depuración y bienvenida
                JOptionPane.showMessageDialog(this, "Tipo Usuario: " + tipoUsuario); // Mostrar el tipo de usuario
                JOptionPane.showMessageDialog(this, "¡Bienvenido, " + nombreUsuario + "!"); // Mostrar mensaje de bienvenida
                LimpiarCampos(); // Limpiar los campos del formulario de login
                PantallaHabitaciones ph = new PantallaHabitaciones(); // Crear la pantalla de habitaciones
                ph.setVisible(true); // Hacer visible la pantalla de habitaciones
                dispose(); // Cerrar la pantalla de login
            } else {
                // Mostrar mensaje de error si el correo/nombre de usuario o contraseña son incorrectos
                JOptionPane.showMessageDialog(this, "Correo, nombre de usuario o contraseña incorrectos");
            }
        } catch (SQLException ex) {
            // Manejar errores de conexión con la base de datos
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos");
        }
    }

    private void LimpiarCampos() {
        // Limpiar el campo de texto del correo/nombre de usuario
        txtCorreo.setText("");
        // Limpiar el campo de texto de la contraseña
        txtContraseña.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new FondoLogin();
        btnLogin = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        checkbox1 = new java.awt.Checkbox();
        jLabelFondoGuíaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnLogin.setBackground(new java.awt.Color(244, 250, 251));
        btnLogin.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(23, 34, 77));
        btnLogin.setText("Iniciar Sesión");
        btnLogin.setToolTipText("");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 890, 0, 0);
        jPanel1.add(btnLogin, gridBagConstraints);

        txtCorreo.setBackground(new java.awt.Color(244, 250, 251));
        txtCorreo.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(7, 44, 117));
        txtCorreo.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(330, 780, 0, 0);
        jPanel1.add(txtCorreo, gridBagConstraints);

        btnRegistro.setBackground(new java.awt.Color(244, 250, 251));
        btnRegistro.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(23, 34, 77));
        btnRegistro.setText("Registrese aquí");
        btnRegistro.setBorder(null);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(96, 990, 0, 0);
        jPanel1.add(btnRegistro, gridBagConstraints);

        txtContraseña.setBackground(new java.awt.Color(244, 250, 251));
        txtContraseña.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(7, 44, 117));
        txtContraseña.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 780, 0, 0);
        jPanel1.add(txtContraseña, gridBagConstraints);

        checkbox1.setBackground(new java.awt.Color(126, 245, 242));
        checkbox1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        checkbox1.setForeground(new java.awt.Color(23, 34, 77));
        checkbox1.setLabel(" Mostrar Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 980, 0, 0);
        jPanel1.add(checkbox1, gridBagConstraints);

        jLabelFondoGuíaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_news/Nuevo_FondoLogin.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabelFondoGuíaLogin, gridBagConstraints);

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

    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Funcionalidad del botón mediante el llamado al método login
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // Crear una nueva instancia de la ventana de registro
        Registro registro = new Registro();
        // Hacer visible la ventana de registro
        registro.setVisible(true);
        // Cerrar la ventana actual (presumiblemente la ventana de login)
        this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void checkboxMostrarContraseña(java.awt.event.ItemEvent evt) {                                          
        // Verificar si el checkbox está seleccionado
        if (checkbox1.getState()) {
            // Si está seleccionado, mostrar la contraseña en texto claro
            txtContraseña.setEchoChar((char) 0);
        } else {
            // Si no está seleccionado, ocultar la contraseña usando un carácter de asterisco
            txtContraseña.setEchoChar('•');
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JLabel jLabelFondoGuíaLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables

    
    class FondoLogin extends JPanel {
        private Image imagen;

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            imagen = new ImageIcon(getClass().getResource("/img_news/Nuevo_Fondo2.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
