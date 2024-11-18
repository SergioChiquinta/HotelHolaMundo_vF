
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones4 extends javax.swing.JPanel {


    public Habitaciones4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnHabitacion110 = new javax.swing.JButton();
        btnHabitacion111 = new javax.swing.JButton();
        btnHabitacion112 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(244, 250, 251));
        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 250, 251));
        jLabel3.setText("  4");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 40, -1));

        jLabel4.setBackground(new java.awt.Color(244, 250, 251));
        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" 10");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 580, 40, -1));

        btnHabitacion110.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion110.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion110.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion110.setText("Ver Disponibilidad");
        btnHabitacion110.setBorder(null);
        btnHabitacion110.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion110.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHabitacion110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion110ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion110, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 130, 270, 45));

        btnHabitacion111.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion111.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion111.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion111.setText("Ver Disponibilidad");
        btnHabitacion111.setBorder(null);
        btnHabitacion111.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion111.setFocusPainted(false);
        btnHabitacion111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion111ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion111, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 330, 270, 45));

        btnHabitacion112.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion112.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion112.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion112.setText("Ver Disponibilidad");
        btnHabitacion112.setBorder(null);
        btnHabitacion112.setFocusPainted(false);
        btnHabitacion112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion112ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion112, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 500, 270, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs_news/Nuevo_Habitaciones4.jpg"))); // NOI18N
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

    private void btnHabitacion112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion112ActionPerformed
        // TODO add your handling code here:
        int numHab = 112;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion112ActionPerformed

    private void btnHabitacion111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion111ActionPerformed
        // TODO add your handling code here:
        int numHab = 111;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion111ActionPerformed

    private void btnHabitacion110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion110ActionPerformed
        // TODO add your handling code here:
        int numHab = 110;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion110ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion110;
    private javax.swing.JButton btnHabitacion111;
    private javax.swing.JButton btnHabitacion112;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
