
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones2 extends javax.swing.JPanel {


    public Habitaciones2() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHabitacion106 = new javax.swing.JButton();
        btnHabitacion105 = new javax.swing.JButton();
        btnHabitacion104 = new javax.swing.JButton();
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
        jLabel3.setText("  2");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 40, -1));

        btnHabitacion106.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion106.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion106.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion106.setText("Ver Disponibilidad");
        btnHabitacion106.setBorder(null);
        btnHabitacion106.setFocusPainted(false);
        btnHabitacion106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion106ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion106, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 500, 270, 45));

        btnHabitacion105.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion105.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion105.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion105.setText("Ver Disponibilidad");
        btnHabitacion105.setBorder(null);
        btnHabitacion105.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion105.setFocusPainted(false);
        btnHabitacion105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion105ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion105, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 330, 270, 45));

        btnHabitacion104.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion104.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion104.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion104.setText("Ver Disponibilidad");
        btnHabitacion104.setBorder(null);
        btnHabitacion104.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion104.setFocusPainted(false);
        btnHabitacion104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion104ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion104, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 130, 270, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs_news/Nuevo_Habitaciones2.jpg"))); // NOI18N
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

    private void btnHabitacion106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion106ActionPerformed
        // TODO add your handling code here:
        int numHab = 106;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true); 
    }//GEN-LAST:event_btnHabitacion106ActionPerformed

    private void btnHabitacion105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion105ActionPerformed
        // TODO add your handling code here:
        int numHab = 105;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true); 
    }//GEN-LAST:event_btnHabitacion105ActionPerformed

    private void btnHabitacion104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion104ActionPerformed
        // TODO add your handling code here:
        int numHab = 104;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion104ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion104;
    private javax.swing.JButton btnHabitacion105;
    private javax.swing.JButton btnHabitacion106;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
