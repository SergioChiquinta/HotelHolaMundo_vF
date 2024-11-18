
package softwarereservacionhotel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PantallaBtnAdmin extends javax.swing.JFrame {

    // Instancia del fondo personalizado
    FondoAdmin FondoAdmin = new PantallaBtnAdmin.FondoAdmin();

    // Constructor de la clase PantallaBtnAdmin
    public PantallaBtnAdmin() {
        this.setContentPane(FondoAdmin); // Establecer el fondo personalizado como el contenido principal de la ventana
        initComponents(); // Inicializar componentes de la interfaz gráfica
        setIconImage(new ImageIcon(getClass().getResource("/img_news/Logo_Hotel.png")).getImage());
        setTitle("Hotel Hola Mundo - Launcher");
        this.setResizable(false);  // Línea para deshabilitar el redimensionamiento
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar ventana al iniciar
        this.setMinimumSize(new Dimension(1280, 800)); // Tamaño mínimo de la ventana
        // Actualizar la tabla de reservas después de inicializarla
        actualizarTabla();
        // Configurar el JLabel para que la imagen se ajuste al tamaño
        jLabelFondoGuía.setHorizontalAlignment(SwingConstants.CENTER);  // Centrado horizontal
        jLabelFondoGuía.setVerticalAlignment(SwingConstants.CENTER);    // Centrado vertical
        jPanel1.add(jLabelFondoGuía, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 798));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoAdmin();
        btnHabitaciones = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnNosotros = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnActualizarEstado = new javax.swing.JButton();
        btnActualizarTabla = new javax.swing.JButton();
        btnEditarInfoCliente = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        cmbFiltro = new javax.swing.JComboBox<>();
        scrollReservas = new javax.swing.JScrollPane();
        tblReservas = new javax.swing.JTable();
        CerrarSesion = new javax.swing.JButton();
        jLabelFondoGuía = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 800));
        jPanel1.setOpaque(false);
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
        btnReserva.setFocusPainted(false);
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

        btnAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAdmin.setContentAreaFilled(false);
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.setFocusPainted(false);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 58, 110, 60));

        btnActualizarEstado.setBorder(null);
        btnActualizarEstado.setBorderPainted(false);
        btnActualizarEstado.setContentAreaFilled(false);
        btnActualizarEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarEstado.setFocusable(false);
        btnActualizarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 290, 205, 75));

        btnActualizarTabla.setBorder(null);
        btnActualizarTabla.setBorderPainted(false);
        btnActualizarTabla.setContentAreaFilled(false);
        btnActualizarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarTabla.setFocusable(false);
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 205, 75));

        btnEditarInfoCliente.setBorder(null);
        btnEditarInfoCliente.setBorderPainted(false);
        btnEditarInfoCliente.setContentAreaFilled(false);
        btnEditarInfoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarInfoCliente.setFocusable(false);
        btnEditarInfoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInfoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarInfoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 280, 75));

        btnFiltrar.setBorder(null);
        btnFiltrar.setBorderPainted(false);
        btnFiltrar.setContentAreaFilled(false);
        btnFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltrar.setFocusPainted(false);
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 205, 135, 45));

        txtFiltro.setBackground(new java.awt.Color(244, 250, 251));
        txtFiltro.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        txtFiltro.setForeground(new java.awt.Color(7, 44, 117));
        jPanel1.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 215, 170, 30));

        cmbFiltro.setBackground(new java.awt.Color(244, 250, 251));
        cmbFiltro.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        cmbFiltro.setForeground(new java.awt.Color(7, 44, 117));
        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código R.", "Fecha Inicio", "Fecha Fin", "Razón Social", "Nº Habitación", "Cliente", "DNI Cliente", "ID Estado", "Estado R.", "Método Pago", "Monto", "Penalización", "Fecha Pago" }));
        jPanel1.add(cmbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 210, 160, 40));

        scrollReservas.setBackground(new java.awt.Color(244, 250, 251));
        scrollReservas.setForeground(new java.awt.Color(7, 44, 117));
        scrollReservas.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        tblReservas.setBackground(new java.awt.Color(244, 250, 251));
        tblReservas.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        tblReservas.setForeground(new java.awt.Color(7, 44, 117));
        tblReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código R.", "Fecha Inicio", "Fecha Fin", "Razón Social", "Nº Habitación", "Cliente", "DNI Cliente", "ID Estado", "Estado R.", "Método Pago", "Monto", "Penalización", "Tarjeta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblReservas.getTableHeader().setReorderingAllowed(false);
        scrollReservas.setViewportView(tblReservas);
        if (tblReservas.getColumnModel().getColumnCount() > 0) {
            tblReservas.getColumnModel().getColumn(0).setResizable(false);
            tblReservas.getColumnModel().getColumn(1).setResizable(false);
            tblReservas.getColumnModel().getColumn(2).setResizable(false);
            tblReservas.getColumnModel().getColumn(3).setResizable(false);
            tblReservas.getColumnModel().getColumn(4).setResizable(false);
            tblReservas.getColumnModel().getColumn(5).setResizable(false);
            tblReservas.getColumnModel().getColumn(6).setResizable(false);
            tblReservas.getColumnModel().getColumn(7).setResizable(false);
            tblReservas.getColumnModel().getColumn(8).setResizable(false);
            tblReservas.getColumnModel().getColumn(9).setResizable(false);
            tblReservas.getColumnModel().getColumn(10).setResizable(false);
        }

        jPanel1.add(scrollReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 1050, 350));

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
        jPanel1.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 97, 160, 40));

        jLabelFondoGuía.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_news/Nuevo_PantallaBtnAdmin.png"))); // NOI18N
        jPanel1.add(jLabelFondoGuía, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 798));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        // Crear una instancia de PantallaHabitaciones
        PantallaHabitaciones ph = new PantallaHabitaciones();
        // Hacer visible la pantalla de habitaciones
        ph.setVisible(true);
        // Cerrar la ventana actual desde la que se hizo clic en el botón
        dispose();
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        // Obtener el tipo de usuario desde la instancia singleton
        String tipoUsuario = UsuarioActual.getInstancia().getTipoUsuario().trim();
        System.out.println("Tipo de usuario: '" + tipoUsuario + "'"); // Imprimir para depuración

        // Realizar la comparación del tipo de usuario
        if ("Cliente".equalsIgnoreCase(tipoUsuario)) {
            PantallaReservarCliente prCliente = new PantallaReservarCliente();
            prCliente.setVisible(true);
        } else if ("Administrador".equalsIgnoreCase(tipoUsuario)) {
            PantallaReservarAdmin prAdmin = new PantallaReservarAdmin();
            prAdmin.setVisible(true);
        } else {
            System.out.println("Tipo de usuario no reconocido: '" + tipoUsuario + "'");
            JOptionPane.showMessageDialog(this, "Tipo de usuario no reconocido");
        }
        dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_btnReservaActionPerformed

    private void btnNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNosotrosActionPerformed
        // Crear una instancia de PantallaNosotros y mostrarla
        PantallaNosotros pn = new PantallaNosotros();
        pn.setVisible(true);
        // Cerrar la ventana actual
        dispose();
    }//GEN-LAST:event_btnNosotrosActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        // TODO add your handling code here:
        actualizarTabla();
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void btnEditarInfoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInfoClienteActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblReservas.getModel();
        int filaSeleccionada = tblReservas.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una reserva para editar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener el código de reserva de la fila seleccionada
        String codReserva = (String) modelo.getValueAt(filaSeleccionada, 0);

        // Solicitar nueva razón social al usuario mediante un cuadro de diálogo
        String nuevaRazonSocial = (String) JOptionPane.showInputDialog(this, "Ingrese nueva razón social:", "Editar Razón Social", JOptionPane.PLAIN_MESSAGE);

        // Obtener la conexión a la base de datos
        Connection conexion = Conexion.getConexion();

        try {
            // Comenzar la transacción
            conexion.setAutoCommit(false);

            // Actualizar RAZ_RES en la tabla RESERVA
            PreparedStatement psReserva = conexion.prepareStatement("UPDATE RESERVA SET RAZ_RES = ? WHERE COD_RES = ?");
            psReserva.setString(1, nuevaRazonSocial);
            psReserva.setString(2, codReserva);
            psReserva.executeUpdate();

            // Confirmar la transacción
            conexion.commit();

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Razón Social actualizada correctamente.", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);

            // Actualizar la tabla de reservas después de la edición
            actualizarTabla();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            try {
                conexion.rollback(); // Revertir la transacción en caso de error
            } catch (SQLException ex) {
                System.err.println("Error al hacer rollback: " + ex.toString());
            }
            System.err.println("Error SQL: " + e.toString());

        } finally {
            try {
                conexion.setAutoCommit(true); // Restaurar el modo de auto-commit por defecto
                conexion.close(); // Cerrar la conexión
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión: " + ex.toString());
            }
        }
    }//GEN-LAST:event_btnEditarInfoClienteActionPerformed

    private void btnActualizarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEstadoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblReservas.getModel();
        int filaSeleccionada = tblReservas.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una reserva para actualizar el estado.");
            return;
        }

        // Obtener el código de reserva de la fila seleccionada
        String codReserva = (String) modelo.getValueAt(filaSeleccionada, 0);

        // Crear el JComboBox con los posibles estados
        String[] estados = {"Confirmada", "Cancelada", "En Proceso", "Finalizada"};
        JComboBox<String> comboBox = new JComboBox<>(estados);

        // Mostrar el JOptionPane con el JComboBox para que el usuario seleccione el nuevo estado
        int result = JOptionPane.showConfirmDialog(this, comboBox, "Seleccione el nuevo estado", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Verificar si se seleccionó OK en el JOptionPane
        if (result == JOptionPane.OK_OPTION) {
            String nuevoEstado = (String) comboBox.getSelectedItem();

            // Mapeo de los nombres de estados a sus respectivos IDs
            String idEstado;
            switch (nuevoEstado) {
                case "Confirmada":
                    idEstado = "EST01";
                    break;
                case "Cancelada":
                    idEstado = "EST02";
                    break;
                case "En Proceso":
                    idEstado = "EST03";
                    break;
                case "Finalizada":
                    idEstado = "EST04";
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Estado no válido. Use EST01, EST02, EST03, o EST04.");
                    return;
            }

            // Obtener la conexión a la base de datos
            Connection conexion = Conexion.getConexion();

            try {
                // Actualizar ID_EST en la tabla RESERVA
                PreparedStatement psReserva = conexion.prepareStatement("UPDATE RESERVA SET ID_EST = ? WHERE COD_RES = ?");
                psReserva.setString(1, idEstado);
                psReserva.setString(2, codReserva);
                psReserva.executeUpdate();

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, "Estado de reserva actualizado correctamente.");

                // Actualizar la tabla de reservas después de la edición
                actualizarTabla(); // Suponiendo que tienes un método para cargar nuevamente las reservas desde la base de datos

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al actualizar el estado de la reserva.");
                System.err.println("Error SQL: " + e.toString());

            } finally {
                try {
                    conexion.close(); // Cerrar la conexión a la base de datos
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar la conexión: " + ex.toString());
                }
            }
        }
    }//GEN-LAST:event_btnActualizarEstadoActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
        filtrarReservas();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // Obtener una instancia de la ventana de inicio de sesión (Interfaz) y mostrarla
        Login loginWindow = Login.getInstancia();
        loginWindow.setVisible(true);
        // Cerrar la ventana actual
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) tblReservas.getModel();

        try (Connection con = Conexion.getConexion()) {
            model.setRowCount(0); // Limpiar tabla antes de cargar nuevos datos

            // Consulta SQL para obtener todas las reservas con información relevante
            String query = "SELECT r.COD_RES, r.INI_RES, r.FIN_RES, r.RAZ_RES, r.NUM_HAB, u.NOM_USU, c.DNI_CLI, e.ID_EST, e.NOM_EST, tp.MET_PAG, tp.MON_PAG, tp.PEN_PAG, tp.TAR_PAG " +
                           "FROM RESERVA r " +
                           "JOIN CLIENTE c ON r.DNI_CLI = c.DNI_CLI " +
                           "JOIN USUARIO u ON c.ID_USU = u.ID_USU " +
                           "JOIN ESTADO e ON r.ID_EST = e.ID_EST " +
                           "JOIN tipo_pagoCONreserva tpr ON r.COD_RES = tpr.COD_RES " +
                           "JOIN TIPO_PAGO tp ON tpr.ID_TPA = tp.ID_TPA";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                // Obtener datos de cada reserva y agregarlos a la tabla
                Object[] row = new Object[13];
                row[0] = rs.getString("COD_RES");
                row[1] = rs.getDate("INI_RES");
                row[2] = rs.getDate("FIN_RES");
                row[3] = rs.getString("RAZ_RES");
                row[4] = rs.getString("NUM_HAB");
                row[5] = rs.getString("NOM_USU");
                row[6] = rs.getInt("DNI_CLI");
                row[7] = rs.getString("ID_EST");
                row[8] = rs.getString("NOM_EST");
                row[9] = rs.getString("MET_PAG");
                row[10] = rs.getBigDecimal("MON_PAG");
                row[11] = rs.getBigDecimal("PEN_PAG"); // Campo de Penalización
                row[12] = rs.getString("TAR_PAG"); // Campo de Tarjeta

                model.addRow(row); // Agregar la fila al modelo de la tabla
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void filtrarReservas() {
        String filtro = txtFiltro.getText().trim();
        String campo = cmbFiltro.getSelectedItem().toString();

        // Mapear los campos del JComboBox a los nombres de columna en la base de datos
        String columna;
        switch (campo) {
            case "Código R.":
                columna = "r.COD_RES";
                break;
            case "Fecha Inicio":
                columna = "r.INI_RES";
                break;
            case "Fecha Fin":
                columna = "r.FIN_RES";
                break;
            case "Razón Social":
                columna = "r.RAZ_RES";
                break;
            case "Nº Habitación":
                columna = "r.NUM_HAB";
                break;
            case "Cliente":
                columna = "u.NOM_USU"; // Relacionado con la tabla usuario
                break;
            case "DNI Cliente":
                columna = "r.DNI_CLI";
                break;
            case "ID Estado":
                columna = "r.ID_EST";
                break;
            case "Estado R.":
                columna = "e.NOM_EST"; // Relacionado con la tabla estado
                break;
            case "Método Pago":
                columna = "tp.MET_PAG"; // Relacionado con la tabla tipo_pago
                break;
            case "Monto":
                columna = "tp.MON_PAG"; // Relacionado con la tabla tipo_pago
                break;
            case "Penalización":
                columna = "tp.PEN_PAG"; // Relacionado con la tabla tipo_pago
                break;
            case "Tarjeta":
                columna = "tp.TAR_PAG"; // Relacionado con la tabla tipo_pago
                break;
            default:
                columna = "";
                break;
        }

        if (!columna.isEmpty()) {
            try (Connection con = Conexion.getConexion()) {
                DefaultTableModel model = (DefaultTableModel) tblReservas.getModel();
                model.setRowCount(0); // Limpiar tabla antes de cargar nuevos datos

                // Consulta SQL para filtrar reservas según el campo y el filtro ingresado
                String query = "SELECT r.COD_RES, r.INI_RES, r.FIN_RES, r.RAZ_RES, r.NUM_HAB, u.NOM_USU, c.DNI_CLI, e.ID_EST, e.NOM_EST, tp.MET_PAG, tp.MON_PAG, tp.PEN_PAG, tp.TAR_PAG " +
                               "FROM RESERVA r " +
                               "JOIN CLIENTE c ON r.DNI_CLI = c.DNI_CLI " +
                               "JOIN USUARIO u ON c.ID_USU = u.ID_USU " +
                               "JOIN ESTADO e ON r.ID_EST = e.ID_EST " +
                               "JOIN tipo_pagoCONreserva tpr ON r.COD_RES = tpr.COD_RES " +
                               "JOIN TIPO_PAGO tp ON tpr.ID_TPA = tp.ID_TPA " +
                               "WHERE " + columna + " LIKE ?";

                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, "%" + filtro + "%");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    // Obtener datos de cada reserva filtrada y agregarlos a la tabla
                    Object[] row = new Object[13];
                    row[0] = rs.getString("COD_RES");
                    row[1] = rs.getDate("INI_RES");
                    row[2] = rs.getDate("FIN_RES");
                    row[3] = rs.getString("RAZ_RES");
                    row[4] = rs.getString("NUM_HAB");
                    row[5] = rs.getString("NOM_USU");
                    row[6] = rs.getInt("DNI_CLI");
                    row[7] = rs.getString("ID_EST");
                    row[8] = rs.getString("NOM_EST");
                    row[9] = rs.getString("MET_PAG");
                    row[10] = rs.getBigDecimal("MON_PAG");
                    row[11] = rs.getBigDecimal("PEN_PAG");
                    row[12] = rs.getString("TAR_PAG");

                    model.addRow(row); // Agregar la fila al modelo de la tabla
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
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
            java.util.logging.Logger.getLogger(PantallaBtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaBtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaBtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaBtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaBtnAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton btnActualizarEstado;
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnEditarInfoCliente;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnNosotros;
    private javax.swing.JButton btnReserva;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JLabel jLabelFondoGuía;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollReservas;
    private javax.swing.JTable tblReservas;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
    
    class FondoAdmin extends JPanel {
        private Image imagen;

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            imagen = new ImageIcon(getClass().getResource("/img_news/Nuevo_Fondo2.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
