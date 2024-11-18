
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones10 extends javax.swing.JPanel {


    public Habitaciones10() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHabitacion215 = new javax.swing.JButton();
        btnHabitacion214 = new javax.swing.JButton();
        btnHabitacion213 = new javax.swing.JButton();
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
        jLabel3.setText(" 10");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 40, -1));

        btnHabitacion215.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion215.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion215.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion215.setText("Ver Disponibilidad");
        btnHabitacion215.setBorder(null);
        btnHabitacion215.setFocusPainted(false);
        btnHabitacion215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion215ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion215, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 480, 270, 45));

        btnHabitacion214.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion214.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion214.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion214.setText("Ver Disponibilidad");
        btnHabitacion214.setBorder(null);
        btnHabitacion214.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion214.setFocusPainted(false);
        btnHabitacion214.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion214ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion214, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 300, 270, 45));

        btnHabitacion213.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion213.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion213.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion213.setText("Ver Disponibilidad");
        btnHabitacion213.setBorder(null);
        btnHabitacion213.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion213.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHabitacion213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion213ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion213, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 130, 270, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs_news/Nuevo_Habitaciones10.jpg"))); // NOI18N
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

    private void btnHabitacion215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion215ActionPerformed
        // TODO add your handling code here:
        int numHab = 215;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion215ActionPerformed

    private void btnHabitacion214ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion214ActionPerformed
        // TODO add your handling code here:
        int numHab = 214;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion214ActionPerformed

    private void btnHabitacion213ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion213ActionPerformed
        // TODO add your handling code here:
        int numHab = 213;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacion213ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion213;
    private javax.swing.JButton btnHabitacion214;
    private javax.swing.JButton btnHabitacion215;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
