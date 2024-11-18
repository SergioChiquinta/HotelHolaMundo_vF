
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones5 extends javax.swing.JPanel {

    public Habitaciones5() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHabitacion115 = new javax.swing.JButton();
        btnHabitacion114 = new javax.swing.JButton();
        btnHabitacion113 = new javax.swing.JButton();
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
        jLabel3.setText("  5");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 40, -1));

        btnHabitacion115.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion115.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion115.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion115.setText("Ver Disponibilidad");
        btnHabitacion115.setBorder(null);
        btnHabitacion115.setFocusPainted(false);
        btnHabitacion115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion115ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion115, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 500, 270, 45));

        btnHabitacion114.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion114.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion114.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion114.setText("Ver Disponibilidad");
        btnHabitacion114.setBorder(null);
        btnHabitacion114.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion114.setFocusPainted(false);
        btnHabitacion114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion114ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion114, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 330, 270, 45));

        btnHabitacion113.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion113.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion113.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion113.setText("Ver Disponibilidad");
        btnHabitacion113.setBorder(null);
        btnHabitacion113.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion113.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHabitacion113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion113ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion113, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 130, 270, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs_news/Nuevo_Habitaciones5.jpg"))); // NOI18N
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

    private void btnHabitacion115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion115ActionPerformed
        // TODO add your handling code here:
        int numHab = 115;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion115ActionPerformed

    private void btnHabitacion114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion114ActionPerformed
        // TODO add your handling code here:
        int numHab = 114;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion114ActionPerformed

    private void btnHabitacion113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion113ActionPerformed
        // TODO add your handling code here:
        int numHab = 113;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion113ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion113;
    private javax.swing.JButton btnHabitacion114;
    private javax.swing.JButton btnHabitacion115;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
