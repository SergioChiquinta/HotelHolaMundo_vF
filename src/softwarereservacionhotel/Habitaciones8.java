
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones8 extends javax.swing.JPanel {


    public Habitaciones8() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHabitacion209 = new javax.swing.JButton();
        btnHabitacion208 = new javax.swing.JButton();
        btnHabitacion207 = new javax.swing.JButton();
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
        jLabel3.setText("  8");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 40, -1));

        btnHabitacion209.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion209.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion209.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion209.setText("Ver Disponibilidad");
        btnHabitacion209.setBorder(null);
        btnHabitacion209.setFocusPainted(false);
        btnHabitacion209.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion209ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion209, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 480, 270, 45));

        btnHabitacion208.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion208.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion208.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion208.setText("Ver Disponibilidad");
        btnHabitacion208.setBorder(null);
        btnHabitacion208.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion208.setFocusPainted(false);
        btnHabitacion208.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion208ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion208, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 300, 270, 45));

        btnHabitacion207.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion207.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion207.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion207.setText("Ver Disponibilidad");
        btnHabitacion207.setBorder(null);
        btnHabitacion207.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion207.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHabitacion207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion207ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion207, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 130, 270, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs_news/Nuevo_Habitaciones8.jpg"))); // NOI18N
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

    private void btnHabitacion209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion209ActionPerformed
        // TODO add your handling code here:
        int numHab = 209;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion209ActionPerformed

    private void btnHabitacion208ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion208ActionPerformed
        // TODO add your handling code here:
        int numHab = 208;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion208ActionPerformed

    private void btnHabitacion207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion207ActionPerformed
        // TODO add your handling code here:
        int numHab = 207;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion207ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion207;
    private javax.swing.JButton btnHabitacion208;
    private javax.swing.JButton btnHabitacion209;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
