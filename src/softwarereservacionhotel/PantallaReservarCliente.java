
package softwarereservacionhotel;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PantallaReservarCliente extends javax.swing.JFrame {

    // Declaración del fondo de la pantalla reservar cliente
    FondoReservarCliente FondoReservarCliente = new PantallaReservarCliente.FondoReservarCliente();
    private static PantallaReservarCliente instancia;

    // Formato para las fechas
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // Constructor de la clase PantallaReservarCliente
    public PantallaReservarCliente() {
        // Establecer el contenido del panel como el fondo personalizado
        this.setContentPane(FondoReservarCliente);
        // Inicializar componentes de la interfaz
        initComponents();
        instancia = this;
        setIconImage(new ImageIcon(getClass().getResource("/img_news/Logo_Hotel.png")).getImage());
        setTitle("Hotel Hola Mundo - Launcher");
        this.setResizable(false);  // Línea para deshabilitar el redimensionamiento
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar ventana al iniciar
        this.setMinimumSize(new Dimension(1280, 800)); // Tamaño mínimo de la ventana
        // Generar y mostrar el código único de reserva
        generarYMostrarCodigoReserva();
        // Cargar los datos de las reservas del usuario en la tabla
        cargarDatosTabla();
        // Obtener fecha actual y fecha máxima permitida para reservas
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaMaxima = fechaActual.plusYears(2);
        // Configurar restricciones en jdcFechaInicio
        jdcFechaInicio.setSelectableDateRange(Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant()), Date.from(fechaMaxima.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        // Configurar restricciones en jdcFechaFin
        jdcFechaFin.setSelectableDateRange(Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant()), Date.from(fechaMaxima.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        // Configurar restricciones en jdcFechaPago
        jdcFechaPago.setSelectableDateRange(Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant()), Date.from(fechaMaxima.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        // Configurar listener para detectar cambios en la fecha de inicio y actualizar ComboBox de habitaciones disponibles
        jdcFechaInicio.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                actualizarComboBoxHabitaciones();
                if ("date".equals(evt.getPropertyName())) {
                    java.util.Date fechaInicio = jdcFechaInicio.getDate();
                    if (fechaInicio != null) {
                        jdcFechaPago.setDate(fechaInicio);
                    }
                }
            }
        });
        // Configurar listener para detectar cambios en la fecha de fin y actualizar ComboBox de habitaciones disponibles
        jdcFechaFin.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                actualizarComboBoxHabitaciones();
            }
        });
        // Deshabilitar el JDateChooser para la fecha de pago
        jdcFechaPago.setEnabled(false);
        // Deshabilitar la edición de los campos que deben llenarse automáticamente
        txtMontoPago.setEnabled(false);
        txtTipoHab.setEnabled(false);
        txtCodigoRes.setEnabled(false);
        txtTarjetaUsu.setEnabled(true);
        txtPenalizacion.setEnabled(false);
        // Agregar el DocumentListener a txtMontoPago
        txtMontoPago.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarPenalizacion();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarPenalizacion();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarPenalizacion();
            }
            private void actualizarPenalizacion() {
                try {
                    double montoPago = Double.parseDouble(txtMontoPago.getText());
                    double penalizacion = calcularPenalizacion(montoPago);
                    txtPenalizacion.setText(String.format("%.2f", penalizacion));
                } catch (NumberFormatException ex) {
                    // Maneja el caso donde el contenido no es un número válido
                    txtPenalizacion.setText("");
                }
            }
        });
        // Deshabilitar la capacidad de cambiar el tamaño de la ventana
        this.setResizable(false); 
    }
    
    public static PantallaReservarCliente getInstancia() {
        if (instancia == null) {
            instancia = new PantallaReservarCliente();
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

        jPanel1 = new FondoReservarCliente();
        btnHabitaciones = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnNosotros = new javax.swing.JButton();
        btnAdminSinUso = new javax.swing.JButton();
        txtMontoPago = new javax.swing.JTextField();
        btnReservar = new javax.swing.JButton();
        cmbMetodos = new javax.swing.JComboBox<>();
        txtRazonSocial = new javax.swing.JTextField();
        txtCodigoRes = new javax.swing.JTextField();
        txtTipoHab = new javax.swing.JTextField();
        cmbNumHab = new javax.swing.JComboBox<>();
        txtTarjetaUsu = new javax.swing.JTextField();
        CerrarSesion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();
        jdcFechaPago = new com.toedter.calendar.JDateChooser();
        btnCancelar = new javax.swing.JButton();
        txtPenalizacion = new javax.swing.JTextField();
        jLabelFondoGuía = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 800));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHabitaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnHabitaciones.setContentAreaFilled(false);
        btnHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitaciones.setFocusPainted(false);
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 58, 190, 60));

        btnReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnReserva.setContentAreaFilled(false);
        btnReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReserva.setFocusable(false);
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 58, 130, 60));

        btnNosotros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnNosotros.setContentAreaFilled(false);
        btnNosotros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNosotros.setFocusPainted(false);
        btnNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNosotrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 58, 150, 60));

        btnAdminSinUso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAdminSinUso.setContentAreaFilled(false);
        btnAdminSinUso.setFocusPainted(false);
        btnAdminSinUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminSinUsoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdminSinUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 58, 110, 60));

        txtMontoPago.setBackground(new java.awt.Color(244, 250, 251));
        txtMontoPago.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtMontoPago.setForeground(new java.awt.Color(7, 44, 117));
        txtMontoPago.setText("120");
        txtMontoPago.setBorder(null);
        jPanel1.add(txtMontoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 680, 210, 45));

        btnReservar.setBorder(null);
        btnReservar.setBorderPainted(false);
        btnReservar.setContentAreaFilled(false);
        btnReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservar.setFocusPainted(false);
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        jPanel1.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 665, 202, 57));

        cmbMetodos.setBackground(new java.awt.Color(244, 250, 251));
        cmbMetodos.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        cmbMetodos.setForeground(new java.awt.Color(7, 44, 117));
        cmbMetodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Yape" }));
        cmbMetodos.setBorder(null);
        jPanel1.add(cmbMetodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 520, 210, 45));

        txtRazonSocial.setBackground(new java.awt.Color(244, 250, 251));
        txtRazonSocial.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtRazonSocial.setForeground(new java.awt.Color(7, 44, 117));
        txtRazonSocial.setText("Vacaciones Familiares");
        txtRazonSocial.setBorder(null);
        jPanel1.add(txtRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 400, 210, 45));

        txtCodigoRes.setBackground(new java.awt.Color(244, 250, 251));
        txtCodigoRes.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtCodigoRes.setForeground(new java.awt.Color(7, 44, 117));
        txtCodigoRes.setBorder(null);
        txtCodigoRes.setMargin(new java.awt.Insets(2, 50, 2, 50));
        jPanel1.add(txtCodigoRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 210, 45));

        txtTipoHab.setBackground(new java.awt.Color(244, 250, 251));
        txtTipoHab.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtTipoHab.setForeground(new java.awt.Color(7, 44, 117));
        txtTipoHab.setText("Doble Cama");
        txtTipoHab.setBorder(null);
        txtTipoHab.setMargin(new java.awt.Insets(2, 50, 2, 50));
        jPanel1.add(txtTipoHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 325, 210, 45));

        cmbNumHab.setBackground(new java.awt.Color(244, 250, 251));
        cmbNumHab.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        cmbNumHab.setForeground(new java.awt.Color(7, 44, 117));
        cmbNumHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215" }));
        cmbNumHab.setBorder(null);
        cmbNumHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNumHabActionPerformed(evt);
            }
        });
        jPanel1.add(cmbNumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 255, 210, 45));

        txtTarjetaUsu.setBackground(new java.awt.Color(244, 250, 251));
        txtTarjetaUsu.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtTarjetaUsu.setForeground(new java.awt.Color(7, 44, 117));
        txtTarjetaUsu.setBorder(null);
        jPanel1.add(txtTarjetaUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 210, 45));

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
        jPanel1.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 95, 165, 40));

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo.R", "Fecha Inicio", "Fecha Fin", "Razon Social", "N° Hab", "Monto", "Estado", "FechaPago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaCliente);
        if (tablaCliente.getColumnModel().getColumnCount() > 0) {
            tablaCliente.getColumnModel().getColumn(0).setResizable(false);
            tablaCliente.getColumnModel().getColumn(1).setResizable(false);
            tablaCliente.getColumnModel().getColumn(2).setResizable(false);
            tablaCliente.getColumnModel().getColumn(3).setResizable(false);
            tablaCliente.getColumnModel().getColumn(4).setResizable(false);
            tablaCliente.getColumnModel().getColumn(5).setResizable(false);
            tablaCliente.getColumnModel().getColumn(6).setResizable(false);
            tablaCliente.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 230, 620, 436));

        jdcFechaInicio.setBackground(new java.awt.Color(244, 250, 251));
        jdcFechaInicio.setForeground(new java.awt.Color(7, 44, 117));
        jPanel1.add(jdcFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 255, 210, 45));

        jdcFechaFin.setBackground(new java.awt.Color(244, 250, 251));
        jdcFechaFin.setForeground(new java.awt.Color(7, 44, 117));
        jPanel1.add(jdcFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 325, 210, 45));

        jdcFechaPago.setBackground(new java.awt.Color(244, 250, 251));
        jdcFechaPago.setForeground(new java.awt.Color(7, 44, 117));
        jPanel1.add(jdcFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 600, 210, 45));

        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 675, 202, 57));

        txtPenalizacion.setBackground(new java.awt.Color(244, 250, 251));
        txtPenalizacion.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtPenalizacion.setForeground(new java.awt.Color(7, 44, 117));
        txtPenalizacion.setText("24.00");
        txtPenalizacion.setBorder(null);
        jPanel1.add(txtPenalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 210, 45));

        jLabelFondoGuía.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_news/Nuevo_PantallaReservarCliente.png"))); // NOI18N
        jPanel1.add(jLabelFondoGuía, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

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

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        // Validar que todos los campos estén correctamente llenados
        if (validarCampos()) {
            // Obtener el código de reserva ingresado por el usuario
            String codigoReserva = txtCodigoRes.getText();
            // Generar un ID único para el tipo de pago
            String idTipoPago = GeneradorIdTipoPago.generarIdUnico();
            double montoPago = Double.parseDouble(txtMontoPago.getText()); // Convertir montoPago a double

            // Insertar la reserva y el tipo de pago en la base de datos
            if (insertarReserva(codigoReserva) && insertarTipoPago(idTipoPago, montoPago)) {
                insertarTipoPagoConReserva(idTipoPago, codigoReserva);
                cargarDatosTabla();
                JOptionPane.showMessageDialog(this, "Reserva y tipo de pago registrados con éxito");
                generarYMostrarCodigoReserva();
                actualizarComboBoxHabitaciones();
            } else {
                JOptionPane.showMessageDialog(this, "Error. Algo ocurrió con el registro");
            }
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // Obtener una instancia de la ventana de inicio de sesión (Interfaz) y mostrarla
        Login loginWindow = Login.getInstancia();
        loginWindow.setVisible(true);
        // Cerrar la ventana actual
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void cmbNumHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNumHabActionPerformed
        // Llama al método para mostrar la información de la habitación según la elección
        llenarDatosHabitacion();
    }//GEN-LAST:event_cmbNumHabActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Si el cliente quiere cancelar reserva
        DefaultTableModel modelo = (DefaultTableModel) tablaCliente.getModel();
        int filaSeleccionada = tablaCliente.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una reserva para poder cancelarla. Tenga precaución");
            return;
        }

        // Obtener el código de reserva de la fila seleccionada
        String codReserva = (String) modelo.getValueAt(filaSeleccionada, 0);

        // Obtener la conexión a la base de datos
        Connection conexion = Conexion.getConexion();
        try {
            // Verificar el estado actual de la reserva
            PreparedStatement psVerificar = conexion.prepareStatement("SELECT ID_EST FROM RESERVA WHERE COD_RES = ?");
            psVerificar.setString(1, codReserva);
            ResultSet rs = psVerificar.executeQuery();

            if (rs.next()) {
                String estadoActual = rs.getString("ID_EST");
                if ("EST02".equals(estadoActual)) {
                    JOptionPane.showMessageDialog(this, "La reserva ya estaba cancelada.");
                    return;
                }
            }

            // Confirmación antes de cancelar la reserva
            int confirmacion = JOptionPane.showConfirmDialog(this, 
                    "¿Seguro que quieres cancelar la reserva? Ya no podrás revertirlo. Además, se aplicará una penzalización del 20%", 
                    "Confirmar Cancelación", 
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion != JOptionPane.YES_OPTION) {
                return;
            }

            String idEstado = "EST02";

            // Actualizar ID_EST en la tabla RESERVA
            PreparedStatement psReserva = conexion.prepareStatement("UPDATE RESERVA SET ID_EST = ? WHERE COD_RES = ?");
            psReserva.setString(1, idEstado);
            psReserva.setString(2, codReserva);
            psReserva.executeUpdate();

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Reserva cancelada correctamente.");

            // Actualizar la tabla de reservas después de la edición
            cargarDatosTabla(); // Suponiendo que tienes un método para cargar nuevamente las reservas desde la base de datos

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cancelar la reserva.");
            System.err.println("Error SQL: " + e.toString());

        } finally {
            try {
                conexion.close(); // Cerrar la conexión a la base de datos
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión: " + ex.toString());
            }
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

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
        // No hace nada, ya estás en la pantalla
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

    private void btnAdminSinUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminSinUsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminSinUsoActionPerformed

    private void llenarDatosHabitacion() {
        String selectedRoom = (String) cmbNumHab.getSelectedItem();
        if (selectedRoom != null) {
            int roomNumber = Integer.parseInt(selectedRoom);
            if (roomNumber >= 101 && roomNumber <= 115) {
                txtTipoHab.setText("Doble Cama");
                txtMontoPago.setText("120");
            } else if (roomNumber >= 201 && roomNumber <= 215) {
                txtTipoHab.setText("Suite");
                txtMontoPago.setText("150");
            }
        }
    }

    private void generarYMostrarCodigoReserva() {
        // Generar un código único de reserva utilizando un generador específico
        String codigoReserva = GeneradorCodigo.generarCodigoUnicoYVerificar();
        // Mostrar el código generado en el campo de texto correspondiente
        txtCodigoRes.setText(codigoReserva);
    }

    private boolean validarCampos() {
        // Validar que las fechas del JDateChooser no estén vacías
        if (jdcFechaInicio.getDate() == null || jdcFechaFin.getDate() == null || jdcFechaPago.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione fechas de inicio, fin y pago");
            return false;
        }
        // Obtener fechas del componente JDateChooser
        LocalDate fechaInicio = jdcFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaFin = jdcFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaPago = jdcFechaPago.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        // Validar formato de fechas
        if (!validarFormatoFecha(fechaInicio) || !validarFormatoFecha(fechaFin) || !validarFormatoFecha(fechaPago)) {
            return false;
        }
        // Validar que la fecha de inicio no sea posterior a la fecha fin
        if (!validarFechaInicioFin(fechaInicio, fechaFin)) {
            return false;
        }
        // Validar que las fechas estén dentro de los límites permitidos
        if (!validarLimitesFechas(fechaInicio, fechaFin)) {
            return false;
        }
        // Validar que la fecha de pago esté dentro del rango de fechas de reservación
        if (!validarFechaPago(fechaInicio, fechaFin, fechaPago)) {
            return false;
        }
        // Validación: Existe error de fechas (ya hay una reserva en ese momento en esa habitación)
        if (existeErrorFechas(fechaInicio, fechaFin)) {
            JOptionPane.showMessageDialog(this, "La fecha ingresada no está disponible, ingrese una fecha distinta");
            return false;
        }
        // Verificar disponibilidad de habitaciones
        ArrayList<String> habitacionesDisponibles = obtenerHabitacionesDisponibles(fechaInicio, fechaFin);
        if (habitacionesDisponibles.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay habitaciones disponibles para las fechas seleccionadas");
            return false;
        }
        // Validar campos obligatorios
        if (txtCodigoRes.getText().isEmpty() ||
            txtRazonSocial.getText().isEmpty() ||
            txtTipoHab.getText().isEmpty() ||
            txtMontoPago.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos");
            return false;
        }
        // Obtener el número de tarjeta desde el componente GUI
        String tarjetaPago = txtTarjetaUsu.getText();
        // Validar el número de tarjeta
        if (!validarNumeroTarjeta(tarjetaPago)) {
            JOptionPane.showMessageDialog(this, "Número de tarjeta inválido. Por favor, verifique y vuelva a intentarlo.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Indicar fallo en la inserción debido a número de tarjeta inválido
        }
        return true;
    }
    
    
    
    private boolean existeErrorFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        // Consultar las fechas de reserva existentes, excluyendo reservas canceladas
        Map<LocalDate, LocalDate> disponibilidadFechasMap = consultarFechas();
        // Iterar sobre las fechas disponibles y verificar si hay coincidencias
        for (Map.Entry<LocalDate, LocalDate> entry : disponibilidadFechasMap.entrySet()) {
            LocalDate fechaInicioMap = entry.getKey();
            LocalDate fechaFinMap = entry.getValue();
            // Verificar si hay coincidencias entre las fechas consultadas y las fechas existentes
            if (existeCoincidenciasFechaMap(fechaInicioMap, fechaFinMap, fechaInicio, fechaFin)) {
                return true; // Hay coincidencia de fechas
            }
        }
        return false;
    }
    
    private Map<LocalDate, LocalDate> consultarFechas() {
        // Map para almacenar las fechas disponibles por habitación
        Map<LocalDate, LocalDate> fechasDisponiblesMap = new HashMap<>();
        try (Connection con = Conexion.getConexion()) {
            // Consultar las fechas de reserva para la habitación seleccionada, excluyendo reservas canceladas
            PreparedStatement psf = con.prepareStatement(
                "SELECT INI_RES, FIN_RES FROM RESERVA WHERE NUM_HAB = ? AND ID_EST != 'EST02'"
            );
            psf.setString(1, (String) cmbNumHab.getSelectedItem()); // Obtener número de habitación seleccionada
            ResultSet rs = psf.executeQuery();

            // Iterar sobre los resultados y almacenar las fechas en el mapa
            while (rs.next()) {
                LocalDate fechaInicio = rs.getDate("INI_RES").toLocalDate();
                LocalDate fechaFin = rs.getDate("FIN_RES").toLocalDate();
                fechasDisponiblesMap.put(fechaInicio, fechaFin);
            }
        } catch (SQLException ex) {
            // Manejo de errores en caso de fallo al consultar la base de datos
            JOptionPane.showMessageDialog(this, "Error al consultar las fechas disponibles de las habitaciones: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return fechasDisponiblesMap; // Devolver el mapa con las fechas disponibles
    }

    private boolean existeCoincidenciasFechaMap(LocalDate fechaInicioMap, LocalDate fechaFinMap, LocalDate fechaInicioIngresada, LocalDate fechaFinIngresada) {
        // Verificar si hay coincidencia de fechas entre las fechas ingresadas y las fechas del mapa
        return (fechaInicioIngresada.isBefore(fechaFinMap) && fechaFinIngresada.isAfter(fechaInicioMap)) ||
               (fechaInicioIngresada.isEqual(fechaInicioMap) || fechaInicioIngresada.isEqual(fechaFinMap)) ||
               (fechaFinIngresada.isEqual(fechaInicioMap) || fechaFinIngresada.isEqual(fechaFinMap));
    }

    // Método para validar que la fecha de inicio no sea posterior a la fecha fin
    private boolean validarFechaInicioFin(LocalDate fechaInicio, LocalDate fechaFin) {
        if (fechaInicio.isAfter(fechaFin)) {
            JOptionPane.showMessageDialog(this, "La fecha de inicio no puede ser posterior a la fecha de fin");
            return false;
        }
        return true;
    }

    // Método para validar que las fechas de inicio y fin estén dentro de los límites permitidos
    private boolean validarLimitesFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaMaxima = fechaActual.plusYears(2);
        if (fechaInicio.isBefore(fechaActual) || fechaInicio.isAfter(fechaMaxima) ||
            fechaFin.isBefore(fechaActual) || fechaFin.isAfter(fechaMaxima)) {
            JOptionPane.showMessageDialog(this, "La fecha ingresada excede los límites mínimos o máximos permitidos");
            return false;
        }
        return true;
    }

    // Método para validar el formato de fecha (yyyy-MM-dd)
    private boolean validarFormatoFecha(LocalDate fecha) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fechaString = fecha.format(formatter);
            LocalDate.parse(fechaString, formatter);
            return true;
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto. Use el formato 'yyyy-MM-dd'");
            return false;
        }
    }

    // Método para validar que la fecha de pago esté dentro del rango de fechas de reservación
    private boolean validarFechaPago(LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaPago) {
        if (fechaPago.isBefore(fechaInicio) || fechaPago.isAfter(fechaFin)) {
            JOptionPane.showMessageDialog(this, "La fecha de pago no se encuentra dentro de las fechas de reservación");
            return false;
        }
        return true;
    }

    public boolean validarNumeroTarjeta(String numeroTarjeta) {
        // Remover todos los espacios en blanco del número de tarjeta
        numeroTarjeta = numeroTarjeta.replaceAll("\\s+", "");

        // Verificar que el número tenga exactamente 16 dígitos después de eliminar los espacios
        if (numeroTarjeta.length() != 16 || !numeroTarjeta.matches("\\d+")) {
            return false;
        }

        // Aplicar el algoritmo de Luhn
        int suma = 0;
        boolean alternar = false;

        for (int i = numeroTarjeta.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(numeroTarjeta.charAt(i));

            if (alternar) {
                digito *= 2;
                if (digito > 9) {
                    digito -= 9;
                }
            }

            suma += digito;
            alternar = !alternar;
        }

        return (suma % 10 == 0);
    }
    
    private boolean insertarReserva(String codigoReserva) {
        // Obtener las fechas de inicio y fin del componente JDateChooser
        LocalDate fechaInicio = jdcFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaFin = jdcFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Obtener la razón social, número de habitación y DNI del usuario actual
        String razonSocial = txtRazonSocial.getText();
        String numHabitacion = (String) cmbNumHab.getSelectedItem();
        String dniUsuario = UsuarioActual.getInstancia().getDni(); // Obtener el DNI del usuario actual

        // Estado inicial de la reserva: En Proceso (EST03)
        String estado = "EST03";

        try (Connection con = Conexion.getConexion()) {
            // Insertar la reserva en la tabla RESERVA
            String queryInsertReserva = "INSERT INTO RESERVA (COD_RES, INI_RES, FIN_RES, RAZ_RES, NUM_HAB, DNI_CLI, ID_EST) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psInsertReserva = con.prepareStatement(queryInsertReserva);
            psInsertReserva.setString(1, codigoReserva);
            psInsertReserva.setDate(2, Date.valueOf(fechaInicio));
            psInsertReserva.setDate(3, Date.valueOf(fechaFin));
            psInsertReserva.setString(4, razonSocial);
            psInsertReserva.setString(5, numHabitacion);
            psInsertReserva.setString(6, dniUsuario);
            psInsertReserva.setString(7, estado);

            psInsertReserva.executeUpdate(); // Ejecutar la inserción

            return true; // Indicar éxito en la inserción

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al insertar la reserva en la base de datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Indicar fallo en la inserción
        }
    }

    private boolean insertarTipoPago(String idTipoPago, double montoPago) {
        // Obtener el método de pago desde el componente GUI
        String metodoPago = (String) cmbMetodos.getSelectedItem();

        // Calcular la penalización
        double penalizacion = montoPago * 0.20;

        // Obtener el número de tarjeta desde el componente GUI
        String tarjetaPago = txtTarjetaUsu.getText();

        // Convertir la fecha de pago de java.util.Date a java.sql.Date
        Date fechaPago = new Date(jdcFechaPago.getDate().getTime());

        try (Connection con = Conexion.getConexion()) {
            // Preparar la consulta SQL para insertar el tipo de pago con penalización
            String query = "INSERT INTO TIPO_PAGO (ID_TPA, MET_PAG, MON_PAG, PEN_PAG, TAR_PAG, FEC_PAG) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, idTipoPago);
            ps.setString(2, metodoPago);
            ps.setDouble(3, montoPago);
            ps.setDouble(4, penalizacion);
            ps.setString(5, tarjetaPago);
            ps.setDate(6, fechaPago);

            // Ejecutar la inserción del tipo de pago
            ps.executeUpdate();
            return true; // Indicar éxito en la inserción

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al insertar el tipo de pago en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Indicar fallo en la inserción
        }
    }

    private void insertarTipoPagoConReserva(String idTipoPago, String codigoReserva) {
        try (Connection con = Conexion.getConexion()) {
            // Preparar la consulta SQL para insertar la relación tipo de pago con reserva
            String query = "INSERT INTO tipo_pagoCONreserva (ID_TPA, COD_RES) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, idTipoPago);     // Asignar el ID del tipo de pago
            ps.setString(2, codigoReserva);  // Asignar el código de la reserva
            ps.executeUpdate();             // Ejecutar la inserción

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al insertar la relación tipo de pago con reserva en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarDatosTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaCliente.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

        UsuarioActual usuarioActual = UsuarioActual.getInstancia();

        String query = "SELECT R.COD_RES, R.INI_RES, R.FIN_RES, R.RAZ_RES, R.NUM_HAB, P.MON_PAG, e.NOM_EST, P.FEC_PAG " +
                       "FROM RESERVA R " +
                       "JOIN ESTADO e ON R.ID_EST = e.ID_EST " +
                       "JOIN tipo_pagoCONreserva PR ON R.COD_RES = PR.COD_RES " +
                       "JOIN TIPO_PAGO P ON PR.ID_TPA = P.ID_TPA " +
                       "WHERE R.DNI_CLI = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, usuarioActual.getDni()); // Establecer el DNI del usuario actual en el parámetro de la consulta
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // Obtener los valores de cada columna de la consulta
                String codigoReserva = rs.getString("COD_RES");
                String fechaInicio = rs.getString("INI_RES");
                String fechaFin = rs.getString("FIN_RES");
                String razonSocial = rs.getString("RAZ_RES");
                String numHabitacion = rs.getString("NUM_HAB");
                String montoPago = rs.getString("MON_PAG");
                String estado = rs.getString("NOM_EST");
                String fechaPago = rs.getString("FEC_PAG");

                // Agregar una nueva fila con los datos obtenidos al modelo de la tabla
                model.addRow(new Object[]{codigoReserva, fechaInicio, fechaFin, razonSocial, numHabitacion, montoPago, estado, fechaPago});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los datos en la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para actualizar el ComboBox de habitaciones disponibles
    private void actualizarComboBoxHabitaciones() {
        // Obtener las fechas de inicio y fin seleccionadas
        LocalDate fechaInicio = obtenerFecha(jdcFechaInicio);
        LocalDate fechaFin = obtenerFecha(jdcFechaFin);

        // Verificar que las fechas no sean nulas
        if (fechaInicio != null && fechaFin != null) {
            // Obtener la lista de habitaciones disponibles para las fechas especificadas
            ArrayList<String> habitacionesDisponibles = obtenerHabitacionesDisponibles(fechaInicio, fechaFin);

            // Limpiar ComboBox y añadir nuevas opciones
            cmbNumHab.removeAllItems(); // Limpiar todos los elementos actuales del ComboBox
            for (String habitacion : habitacionesDisponibles) {
                cmbNumHab.addItem(habitacion); // Agregar cada habitación disponible al ComboBox
            }
        }
    }

    // Método para obtener las habitaciones disponibles en las fechas indicadas
    private ArrayList<String> obtenerHabitacionesDisponibles(LocalDate fechaInicio, LocalDate fechaFin) {
        ArrayList<String> habitacionesDisponibles = new ArrayList<>();

        try (Connection con = Conexion.getConexion()) {
            // Consulta SQL para obtener habitaciones disponibles en las fechas seleccionadas, excluyendo reservas canceladas
            String query = "SELECT DISTINCT NUM_HAB FROM HABITACION " +
                           "WHERE NUM_HAB NOT IN ( " +
                           "    SELECT NUM_HAB FROM RESERVA " +
                           "    WHERE (INI_RES <= ? AND FIN_RES >= ? " + 
                           "        OR INI_RES <= ? AND FIN_RES >= ? " +
                           "        OR INI_RES >= ? AND FIN_RES <= ? " +
                           "        OR INI_RES = ? " + 
                           "        OR FIN_RES = ?) " +
                           "        AND ID_EST != 'EST02' " + // Excluir reservas canceladas
                           ")";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setDate(1, Date.valueOf(fechaFin)); // Fin seleccionado es mayor que inicio reservado
            ps.setDate(2, Date.valueOf(fechaInicio)); // Inicio seleccionado es menor que fin reservado
            ps.setDate(3, Date.valueOf(fechaInicio)); // Inicio seleccionado es menor que fin reservado
            ps.setDate(4, Date.valueOf(fechaFin)); // Fin seleccionado es mayor que inicio reservado
            ps.setDate(5, Date.valueOf(fechaInicio)); // Inicio seleccionado es mayor o igual que inicio reservado
            ps.setDate(6, Date.valueOf(fechaFin)); // Fin seleccionado es menor o igual que fin reservado
            ps.setDate(7, Date.valueOf(fechaInicio)); // Fecha de inicio coincidente
            ps.setDate(8, Date.valueOf(fechaFin)); // Fecha de fin coincidente

            ResultSet rs = ps.executeQuery();

            // Iterar sobre el resultado y agregar las habitaciones disponibles a la lista
            while (rs.next()) {
                habitacionesDisponibles.add(rs.getString("NUM_HAB"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener las habitaciones disponibles: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return habitacionesDisponibles;
    }

    // Método auxiliar para obtener LocalDate desde JDateChooser
    private LocalDate obtenerFecha(JDateChooser dateChooser) {
        if (dateChooser.getDate() != null) {
            // Obtener la fecha seleccionada del JDateChooser y convertirla a LocalDate
            return dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } else {
            return null; // Devolver null si no hay ninguna fecha seleccionada
        }
    }
    
    // Método para el TextField de penalización
    private static final double PENALIZACION = 0.20;

    public double calcularPenalizacion(double montoPago) {
        return montoPago * PENALIZACION;
    }

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
            java.util.logging.Logger.getLogger(PantallaReservarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaReservarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaReservarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaReservarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaReservarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton btnAdminSinUso;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnNosotros;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cmbMetodos;
    private javax.swing.JComboBox<String> cmbNumHab;
    private javax.swing.JLabel jLabelFondoGuía;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private com.toedter.calendar.JDateChooser jdcFechaPago;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtCodigoRes;
    private javax.swing.JTextField txtMontoPago;
    private javax.swing.JTextField txtPenalizacion;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTarjetaUsu;
    private javax.swing.JTextField txtTipoHab;
    // End of variables declaration//GEN-END:variables

    class FondoReservarCliente extends JPanel {
        private Image imagen;

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            imagen = new ImageIcon(getClass().getResource("/img_news/Nuevo_Fondo2.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
