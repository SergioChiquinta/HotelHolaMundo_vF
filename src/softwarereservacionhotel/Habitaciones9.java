
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones9 extends javax.swing.JPanel {


    public Habitaciones9() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHabitacion212 = new javax.swing.JButton();
        btnHabitacion211 = new javax.swing.JButton();
        btnHabitacion210 = new javax.swing.JButton();
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
        jLabel3.setText("  9");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 40, -1));

        btnHabitacion212.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion212.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion212.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion212.setText("Ver Disponibilidad");
        btnHabitacion212.setBorder(null);
        btnHabitacion212.setFocusPainted(false);
        btnHabitacion212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion212ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion212, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 480, 270, 45));

        btnHabitacion211.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion211.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion211.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion211.setText("Ver Disponibilidad");
        btnHabitacion211.setBorder(null);
        btnHabitacion211.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion211.setFocusPainted(false);
        btnHabitacion211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion211ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion211, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 300, 270, 45));

        btnHabitacion210.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion210.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion210.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion210.setText("Ver Disponibilidad");
        btnHabitacion210.setBorder(null);
        btnHabitacion210.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion210.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHabitacion210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion210ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion210, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 130, 270, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs_news/Nuevo_Habitaciones9.jpg"))); // NOI18N
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

    private void btnHabitacion212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion212ActionPerformed
        // TODO add your handling code here:
        int numHab = 212;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion212ActionPerformed

    private void btnHabitacion211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion211ActionPerformed
        // TODO add your handling code here:
        int numHab = 211;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion211ActionPerformed

    private void btnHabitacion210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion210ActionPerformed
        // TODO add your handling code here:
        int numHab = 210;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion210ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion210;
    private javax.swing.JButton btnHabitacion211;
    private javax.swing.JButton btnHabitacion212;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
