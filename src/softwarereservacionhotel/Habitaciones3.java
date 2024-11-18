
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones3 extends javax.swing.JPanel {


    public Habitaciones3() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHabitacion109 = new javax.swing.JButton();
        btnHabitacion108 = new javax.swing.JButton();
        btnHabitacion107 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(244, 250, 251));
        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" 10");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 580, 40, -1));

        jLabel3.setBackground(new java.awt.Color(244, 250, 251));
        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 250, 251));
        jLabel3.setText("  3");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 40, -1));

        btnHabitacion109.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion109.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion109.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion109.setText("Ver Disponibilidad");
        btnHabitacion109.setBorder(null);
        btnHabitacion109.setFocusPainted(false);
        btnHabitacion109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion109ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion109, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 500, 270, 45));

        btnHabitacion108.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion108.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion108.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion108.setText("Ver Disponibilidad");
        btnHabitacion108.setBorder(null);
        btnHabitacion108.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion108.setFocusPainted(false);
        btnHabitacion108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion108ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion108, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 330, 270, 45));

        btnHabitacion107.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion107.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion107.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion107.setText("Ver Disponibilidad");
        btnHabitacion107.setBorder(null);
        btnHabitacion107.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion107.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHabitacion107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion107ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion107, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 130, 270, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs_news/Nuevo_Habitaciones3.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHabitacion107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion107ActionPerformed
        // TODO add your handling code here:
        int numHab = 107;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion107ActionPerformed

    private void btnHabitacion108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion108ActionPerformed
        // TODO add your handling code here:
        int numHab = 108;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion108ActionPerformed

    private void btnHabitacion109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion109ActionPerformed
        // TODO add your handling code here:
        int numHab = 109;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion109ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion107;
    private javax.swing.JButton btnHabitacion108;
    private javax.swing.JButton btnHabitacion109;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
