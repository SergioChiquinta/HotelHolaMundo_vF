
package softwarereservacionhotel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import java.sql.*;

public class Registro extends JFrame {
    
    // Declaración e inicialización del panel personalizado FondoRegistro
    FondoRegistro fondoRegistro = new FondoRegistro();

    // Constructor de la clase Registro
    public Registro() {
        // Establece fondoRegistro como el panel principal (ContentPane) del JFrame actual
        this.setContentPane(fondoRegistro);
        // Inicializa los componentes de la interfaz gráfica generados automáticamente
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img_news/Logo_Hotel.png")).getImage());
        setTitle("Hotel Hola Mundo - Launcher");
        this.setResizable(true);  // Línea para deshabilitar el redimensionamiento
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar ventana al iniciar
        this.setMinimumSize(new Dimension(1280, 800)); // Tamaño mínimo de la ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new FondoRegistro();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        btnVolverLogin = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabelFondoGuía = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txtNombre.setBackground(new java.awt.Color(244, 250, 251));
        txtNombre.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(7, 44, 117));
        txtNombre.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(160, 250, 0, 0);
        jPanel1.add(txtNombre, gridBagConstraints);

        txtApellido.setBackground(new java.awt.Color(244, 250, 251));
        txtApellido.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(7, 44, 117));
        txtApellido.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 250, 0, 0);
        jPanel1.add(txtApellido, gridBagConstraints);

        txtCorreo.setBackground(new java.awt.Color(244, 250, 251));
        txtCorreo.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(7, 44, 117));
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 250, 0, 0);
        jPanel1.add(txtCorreo, gridBagConstraints);

        txtContraseña.setBackground(new java.awt.Color(244, 250, 251));
        txtContraseña.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(7, 44, 117));
        txtContraseña.setBorder(null);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 250, 0, 0);
        jPanel1.add(txtContraseña, gridBagConstraints);

        txtTelefono.setBackground(new java.awt.Color(244, 250, 251));
        txtTelefono.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(7, 44, 117));
        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 356;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 76, 0, 0);
        jPanel1.add(txtTelefono, gridBagConstraints);

        txtCiudad.setBackground(new java.awt.Color(244, 250, 251));
        txtCiudad.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtCiudad.setForeground(new java.awt.Color(7, 44, 117));
        txtCiudad.setBorder(null);
        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 356;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 76, 0, 0);
        jPanel1.add(txtCiudad, gridBagConstraints);

        txtDni.setBackground(new java.awt.Color(244, 250, 251));
        txtDni.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(7, 44, 117));
        txtDni.setBorder(null);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 356;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(160, 76, 0, 0);
        jPanel1.add(txtDni, gridBagConstraints);

        txtPais.setBackground(new java.awt.Color(244, 250, 251));
        txtPais.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtPais.setForeground(new java.awt.Color(7, 44, 117));
        txtPais.setBorder(null);
        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 356;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 76, 0, 0);
        jPanel1.add(txtPais, gridBagConstraints);

        btnRegistrarse.setBackground(new java.awt.Color(244, 250, 251));
        btnRegistrarse.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(23, 34, 77));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 290, 0, 0);
        jPanel1.add(btnRegistrarse, gridBagConstraints);

        btnVolverLogin.setBackground(new java.awt.Color(244, 250, 251));
        btnVolverLogin.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnVolverLogin.setForeground(new java.awt.Color(23, 34, 77));
        btnVolverLogin.setText("Volver al Login");
        btnVolverLogin.setBorder(null);
        btnVolverLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 115, 0, 0);
        jPanel1.add(btnVolverLogin, gridBagConstraints);

        cmbTipo.setBackground(new java.awt.Color(244, 250, 251));
        cmbTipo.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        cmbTipo.setForeground(new java.awt.Color(7, 44, 117));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Administrador" }));
        cmbTipo.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 248;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(55, 168, 0, 0);
        jPanel1.add(cmbTipo, gridBagConstraints);

        jLabelFondoGuía.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_news/Nuevo_FondoRegistro.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabelFondoGuía, gridBagConstraints);

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

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // Obtener y recortar los valores de los campos de texto
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String dni = txtDni.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String pais = txtPais.getText().trim();
        String ciudad = txtCiudad.getText().trim();
        String correo = txtCorreo.getText().trim();
        String contraseña = txtContraseña.getText().trim();
        String tipo = cmbTipo.getSelectedItem().toString(); // Obtener el valor seleccionado del combo box

        // Verificar si algún campo está vacío
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || telefono.isEmpty() ||
            pais.isEmpty() || ciudad.isEmpty() || correo.isEmpty() || contraseña.isEmpty()) {
            // Mostrar un mensaje si algún campo está vacío
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        } else {
            try {
                // Intentar registrar el usuario con los datos proporcionados
                registrar(nombre, apellido, dni, telefono, pais, ciudad, correo, contraseña, tipo);
            } catch (SQLException ex) {
                // Manejar cualquier excepción SQL que ocurra durante el registro
                ex.printStackTrace();
                // Mostrar un mensaje si ocurre un error al registrar el usuario
                JOptionPane.showMessageDialog(this, "Error al registrar el usuario");
            }
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLoginActionPerformed
        // Obtener la instancia de la ventana de inicio de sesión
        Login loginWindow = Login.getInstancia();
        // Hacer visible la ventana de inicio de sesión
        loginWindow.setVisible(true);
        // Cerrar la ventana actual (la ventana de registro)
        this.dispose();
    }//GEN-LAST:event_btnVolverLoginActionPerformed

    private boolean validarDNI(String dni) {
        // Utiliza una expresión regular para validar que el DNI sea un número de 8 dígitos
        return dni.matches("\\d{8}");
    }

    private boolean validarTelefono(String telefono) {
        // Utiliza una expresión regular para validar que el número de teléfono sea un número de 9 dígitos
        return telefono.matches("\\d{9}");
    }

    private boolean validarCorreo(String correo) {
        // Utiliza una expresión regular para validar que el correo electrónico tenga un formato válido
        return correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    private void registrar(String nombre, String apellido, String dni, String telefono,
                            String pais, String ciudad, String correo, String contraseña, String tipo) throws SQLException {
        try (Connection con = Conexion.getConexion()) {
            // Validar el formato del DNI
            if (!validarDNI(dni)) {
                JOptionPane.showMessageDialog(this, "El DNI debe contener 8 dígitos numéricos");
                return;
            }

            // Validar el formato del número de teléfono
            if (!validarTelefono(telefono)) {
                JOptionPane.showMessageDialog(this, "El teléfono debe contener 9 dígitos numéricos");
                return;
            }

            // Validar el formato del correo electrónico
            if (!validarCorreo(correo)) {
                JOptionPane.showMessageDialog(this, "El formato del correo electrónico no es válido");
                return;
            }

            // Verificar si el DNI ya existe en la base de datos
            if (dniExiste(con, dni)) {
                JOptionPane.showMessageDialog(this, "El DNI ya está asociado a una cuenta existente");
                return;
            }

            // Generar un ID único para el nuevo usuario
            int idUsuario = generarIDUsuario(con);

            // Consulta para insertar el nuevo usuario en la tabla 'usuario'
            String query = "INSERT INTO usuario (ID_USU, NOM_USU, APE_USU, TIP_USU, TEL_USU, EMA_USU, CON_USU, PAI_USU, CIU_USU) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setInt(1, idUsuario);
                ps.setString(2, nombre);
                ps.setString(3, apellido);
                ps.setString(4, tipo);
                ps.setString(5, telefono);
                ps.setString(6, correo);
                ps.setString(7, contraseña);
                ps.setString(8, pais);
                ps.setString(9, ciudad);

                int rowsAffected = ps.executeUpdate();

                if (rowsAffected == 1) {
                    // Dependiendo del tipo de usuario (Cliente o Administrador), se inserta en la tabla correspondiente
                    if ("Cliente".equals(tipo)) {
                        query = "INSERT INTO CLIENTE (DNI_CLI, ID_USU) VALUES (?, ?)";
                    } else {
                        query = "INSERT INTO ADMINISTRADOR (DNI_ADM, ID_USU) VALUES (?, ?)";
                    }

                    try (PreparedStatement ps2 = con.prepareStatement(query)) {
                        ps2.setString(1, dni);
                        ps2.setInt(2, idUsuario);
                        ps2.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente");
                        LimpiarCampos();
                        new Login().setVisible(true); // Mostrar la ventana de inicio de sesión
                        dispose(); // Cerrar la ventana actual (de registro)
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error al registrar el usuario");
                }
            }
        }
    }

    private boolean dniExiste(Connection con, String dni) throws SQLException {
        // Consulta para verificar si el DNI existe en las tablas CLIENTE o ADMINISTRADOR
        String query = "SELECT COUNT(*) AS total FROM CLIENTE WHERE DNI_CLI = ? UNION ALL SELECT COUNT(*) FROM ADMINISTRADOR WHERE DNI_ADM = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, Integer.parseInt(dni)); // Convertir dni a entero si es necesario
            ps.setInt(2, Integer.parseInt(dni)); // Convertir dni a entero si es necesario
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int total = rs.getInt("total");
                    return total > 0; // Devuelve true si el DNI existe en alguna de las tablas
                }
            }
        }
        return false; // Devuelve false si el DNI no existe en ninguna tabla
    }

    private int generarIDUsuario(Connection con) throws SQLException {
        // Obtener el último ID_USU de la tabla usuario y generar el siguiente ID único
        String query = "SELECT MAX(ID_USU) AS UltimoID FROM usuario";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        int ultimoID = 0;
        if (rs.next()) {
            ultimoID = rs.getInt("UltimoID");
        }
        return ultimoID + 1; // Devuelve el siguiente ID único para un nuevo usuario
    }

    private void LimpiarCampos() {
        // Limpiar los campos del formulario de registro
        txtNombre.setText("");
        txtApellido.setText("");
        txtPais.setText("");
        txtTelefono.setText("");
        txtCiudad.setText("");
        txtDni.setText("");
        txtCorreo.setText("");
        txtContraseña.setText("");
    }
    
    public static void main(String[] args) {
        new Registro().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolverLogin;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabelFondoGuía;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    class FondoRegistro extends JPanel {
        private Image imagen;

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            imagen = new ImageIcon(getClass().getResource("/img_news/Nuevo_Fondo2.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
