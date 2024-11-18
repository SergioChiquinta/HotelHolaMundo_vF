
package softwarereservacionhotel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class TablaHabitacion extends javax.swing.JFrame {

    // Establecer el fondo personalizado para la tabla de habitaciones
    FondoTablaHabitacion FondoTablaHabitacion = new TablaHabitacion.FondoTablaHabitacion();
    // Añadir la variable numHab como campo de clase
    private int numHab;
    
    //Constructor por defecto
    public TablaHabitacion() {
        initComponents();
    }

    //Constructor con parámetro que inicializa la ventana con el número de habitación especificado
    public TablaHabitacion(int numHab) {
        this.setContentPane(FondoTablaHabitacion);  // Establecer el panel de fondo personalizado
        this.numHab = numHab;  // Inicializar el campo numHab con el valor proporcionado
        initComponents();  // Inicializar los componentes gráficos
        setHabitacion(numHab);  // Establecer la habitación y cargar las reservas asociadas
        this.setResizable(false);  // Deshabilitar redimensionamiento de la ventana
        txtHabitacion.setEnabled(false);  // Deshabilitar la edición del campo de número de habitación
        setIconImage(new ImageIcon(getClass().getResource("/img_news/Logo_Hotel.png")).getImage());
        setTitle("Hotel Hola Mundo - Tabla Habitación " + numHab);
        this.setResizable(true);  // Línea para deshabilitar el redimensionamiento
        this.setMinimumSize(new Dimension(620, 700)); // Tamaño mínimo de la ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoTablaHabitacion();
        txtHabitacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnFiltrarEntreFechas = new javax.swing.JButton();
        txtFechaInicio = new javax.swing.JTextField();
        lblFiltrarEntreFechas = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        lblFiltrarEntreFechas1 = new javax.swing.JLabel();
        btnActualizarTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(620, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHabitacion.setBackground(new java.awt.Color(244, 250, 251));
        txtHabitacion.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtHabitacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHabitacion.setBorder(null);
        jPanel1.add(txtHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 36, 90, 45));

        jTable1.setBackground(new java.awt.Color(244, 250, 251));
        jTable1.setFont(new java.awt.Font("Gadugi", 1, 10)); // NOI18N
        jTable1.setForeground(new java.awt.Color(23, 34, 77));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Reserva", "Fecha Inicio", "Fecha Fin", "ID Estado", "Estado Reserva"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(244, 250, 251));
        jTable1.setSelectionBackground(new java.awt.Color(23, 34, 77));
        jTable1.setSelectionForeground(new java.awt.Color(244, 250, 251));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 176, 590, 510));

        btnFiltrarEntreFechas.setBackground(new java.awt.Color(244, 250, 251));
        btnFiltrarEntreFechas.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnFiltrarEntreFechas.setForeground(new java.awt.Color(23, 34, 77));
        btnFiltrarEntreFechas.setText("Filtrar");
        btnFiltrarEntreFechas.setBorder(null);
        btnFiltrarEntreFechas.setBorderPainted(false);
        btnFiltrarEntreFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarEntreFechasActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrarEntreFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 116, 87, 39));

        txtFechaInicio.setBackground(new java.awt.Color(244, 250, 251));
        txtFechaInicio.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtFechaInicio.setForeground(new java.awt.Color(23, 34, 77));
        txtFechaInicio.setBorder(null);
        jPanel1.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 107, 155, 57));

        lblFiltrarEntreFechas.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        lblFiltrarEntreFechas.setForeground(new java.awt.Color(23, 34, 77));
        lblFiltrarEntreFechas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFiltrarEntreFechas.setText("a");
        jPanel1.add(lblFiltrarEntreFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 116, -1, 39));

        txtFechaFin.setBackground(new java.awt.Color(244, 250, 251));
        txtFechaFin.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        txtFechaFin.setForeground(new java.awt.Color(23, 34, 77));
        txtFechaFin.setBorder(null);
        jPanel1.add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 107, 155, 57));

        lblFiltrarEntreFechas1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        lblFiltrarEntreFechas1.setForeground(new java.awt.Color(23, 34, 77));
        lblFiltrarEntreFechas1.setText("FILTRAR ENTRE FECHAS :");
        jPanel1.add(lblFiltrarEntreFechas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 116, -1, 39));

        btnActualizarTabla.setBackground(new java.awt.Color(244, 250, 251));
        btnActualizarTabla.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnActualizarTabla.setForeground(new java.awt.Color(23, 34, 77));
        btnActualizarTabla.setText("Actualizar");
        btnActualizarTabla.setBorder(null);
        btnActualizarTabla.setBorderPainted(false);
        btnActualizarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarTabla.setFocusPainted(false);
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 36, 101, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarEntreFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarEntreFechasActionPerformed
        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        // Obtener las fechas ingresadas por el usuario
        String fechaInicioStr = txtFechaInicio.getText().trim();
        String fechaFinStr = txtFechaFin.getText().trim();

        // Validar las fechas ingresadas
        if (!validarFechas(fechaInicioStr, fechaFinStr)) {
            return; // Salir del método si las fechas no son válidas
        }

        // Formato de fecha esperado en la base de datos
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement("SELECT r.COD_RES, r.INI_RES, r.FIN_RES, r.ID_EST, e.NOM_EST " +
                                                             "FROM reserva r " +
                                                             "JOIN estado e ON r.ID_EST = e.ID_EST " +
                                                             "WHERE r.NUM_HAB = ? AND r.INI_RES >= ? AND r.FIN_RES <= ?")) {
            // Número de habitación a filtrar
            stmt.setInt(1, numHab);

            // Convertir fechas de inicio y fin al formato adecuado para SQL Date
            stmt.setDate(2, new java.sql.Date(sdf.parse(fechaInicioStr).getTime()));
            stmt.setDate(3, new java.sql.Date(sdf.parse(fechaFinStr).getTime()));

            // Ejecutar la consulta SQL
            ResultSet rs = stmt.executeQuery();

            // Limpiar el modelo de la tabla antes de cargar nuevas filas
            modelo.setRowCount(0);

            // Procesar los resultados de la consulta y agregar filas al modelo de la tabla
            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getString("COD_RES");
                fila[1] = rs.getDate("INI_RES");
                fila[2] = rs.getDate("FIN_RES");
                fila[3] = rs.getString("ID_EST");
                fila[4] = rs.getString("NOM_EST");
                modelo.addRow(fila);
            }
        } catch (SQLException | ParseException e) {
            e.printStackTrace(); // Imprimir detalles del error en la consola
        }
    }//GEN-LAST:event_btnFiltrarEntreFechasActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        // Limpiar campos de fechas
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        // Cargar las reservas actualizadas
        cargarReservas();
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    public void cargarReservas() {
        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        // Limpiar el modelo actual de la tabla
        modelo.setRowCount(0); // Limpiar tabla

        // Consulta SQL para seleccionar las reservas de la habitación actual
        String sql = "SELECT r.COD_RES, r.INI_RES, r.FIN_RES, r.ID_EST, e.NOM_EST " +
                     "FROM reserva r " +
                     "JOIN estado e ON r.ID_EST = e.ID_EST " +
                     "WHERE r.NUM_HAB = ?";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Establecer el número de habitación como parámetro en la consulta
            stmt.setInt(1, numHab);

            // Ejecutar la consulta SQL
            ResultSet rs = stmt.executeQuery();

            // Procesar los resultados y agregar filas al modelo de la tabla
            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getString("COD_RES");
                fila[1] = rs.getDate("INI_RES");
                fila[2] = rs.getDate("FIN_RES");
                fila[3] = rs.getString("ID_EST");
                fila[4] = rs.getString("NOM_EST");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprimir detalles del error en la consola
        }
    }

    public void setHabitacion(int numHab) {
        if (txtHabitacion != null) {
            // Establecer el número de habitación en el campo de texto txtHabitacion
            txtHabitacion.setText(String.valueOf(numHab));
            // Cargar las reservas correspondientes a la habitación establecida
            cargarReservas();
        } else {
            // Si el campo de texto es nulo, imprimir un mensaje de error en la consola
            System.err.println("txtHabitacion es nulo en setHabitacion");
        }
    }
    
    private boolean validarFechas(String fechaInicioStr, String fechaFinStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // Parsear las fechas de inicio y fin desde las cadenas proporcionadas
            Date fechaInicio = sdf.parse(fechaInicioStr);
            Date fechaFin = sdf.parse(fechaFinStr);

            // Verificar que la fecha de inicio sea anterior a la fecha de fin
            if (fechaInicio.after(fechaFin)) {
                // Mostrar un mensaje de error si la fecha de inicio no es anterior a la fecha de fin
                JOptionPane.showMessageDialog(this, "La fecha de inicio debe ser anterior a la fecha de fin.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (ParseException e) {
            // Capturar la excepción de formato incorrecto de fecha y mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto. Utilice yyyy-MM-dd.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        // Si las fechas son válidas y la fecha de inicio es anterior a la fecha de fin, retornar true
        return true;
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
            java.util.logging.Logger.getLogger(TablaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnFiltrarEntreFechas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFiltrarEntreFechas;
    private javax.swing.JLabel lblFiltrarEntreFechas1;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtHabitacion;
    // End of variables declaration//GEN-END:variables

    class FondoTablaHabitacion extends JPanel {
        private Image imagen;

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            imagen = new ImageIcon(getClass().getResource("/img_news/Nuevo_FondoPantallaTablaHabitacion.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
