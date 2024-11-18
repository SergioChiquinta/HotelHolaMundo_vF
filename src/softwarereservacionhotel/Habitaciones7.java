
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones7 extends javax.swing.JPanel {


    public Habitaciones7() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHabitacion206 = new javax.swing.JButton();
        btnHabitacion205 = new javax.swing.JButton();
        btnHabitacion204 = new javax.swing.JButton();
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
        jLabel3.setText("  7");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 40, -1));

        btnHabitacion206.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion206.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion206.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion206.setText("Ver Disponibilidad");
        btnHabitacion206.setBorder(null);
        btnHabitacion206.setFocusPainted(false);
        btnHabitacion206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion206ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion206, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 480, 270, 45));

        btnHabitacion205.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion205.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion205.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion205.setText("Ver Disponibilidad");
        btnHabitacion205.setBorder(null);
        btnHabitacion205.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion205.setFocusPainted(false);
        btnHabitacion205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion205ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion205, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 300, 270, 45));

        btnHabitacion204.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion204.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion204.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion204.setText("Ver Disponibilidad");
        btnHabitacion204.setBorder(null);
        btnHabitacion204.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion204.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHabitacion204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion204ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion204, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 130, 270, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs_news/Nuevo_Habitaciones7.jpg"))); // NOI18N
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

    private void btnHabitacion206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion206ActionPerformed
        // TODO add your handling code here:
        int numHab = 206;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion206ActionPerformed

    private void btnHabitacion205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion205ActionPerformed
        // TODO add your handling code here:
        int numHab = 205;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion205ActionPerformed

    private void btnHabitacion204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion204ActionPerformed
        // TODO add your handling code here:
        int numHab = 204;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion204ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion204;
    private javax.swing.JButton btnHabitacion205;
    private javax.swing.JButton btnHabitacion206;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
