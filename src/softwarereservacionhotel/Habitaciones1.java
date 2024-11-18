
package softwarereservacionhotel;

import javax.swing.JTextField;


public class Habitaciones1 extends javax.swing.JPanel {


    public Habitaciones1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHabitacion103 = new javax.swing.JButton();
        btnHabitacion102 = new javax.swing.JButton();
        btnHabitacion101 = new javax.swing.JButton();
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
        jLabel3.setText("  1");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 40, -1));

        btnHabitacion103.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion103.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion103.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion103.setText("Ver Disponibilidad");
        btnHabitacion103.setBorder(null);
        btnHabitacion103.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion103.setFocusPainted(false);
        btnHabitacion103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion103ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion103, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 530, 270, 45));

        btnHabitacion102.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion102.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion102.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion102.setText("Ver Disponibilidad");
        btnHabitacion102.setBorder(null);
        btnHabitacion102.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion102.setFocusPainted(false);
        btnHabitacion102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion102ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion102, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 330, 270, 45));

        btnHabitacion101.setBackground(new java.awt.Color(244, 250, 251));
        btnHabitacion101.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnHabitacion101.setForeground(new java.awt.Color(23, 34, 77));
        btnHabitacion101.setText("Ver Disponibilidad");
        btnHabitacion101.setBorder(null);
        btnHabitacion101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion101.setFocusPainted(false);
        btnHabitacion101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion101ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitacion101, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 130, 270, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imghabs_news/Nuevo_Habitaciones1.jpg"))); // NOI18N
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

    private void btnHabitacion101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion101ActionPerformed
        // TODO add your handling code here:
        int numHab = 101;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true);        
    }//GEN-LAST:event_btnHabitacion101ActionPerformed

    private void btnHabitacion102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion102ActionPerformed
        // TODO add your handling code here:
        int numHab = 102;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true); 
    }//GEN-LAST:event_btnHabitacion102ActionPerformed

    private void btnHabitacion103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion103ActionPerformed
        // TODO add your handling code here:
        int numHab = 103;
        TablaHabitacion tablaHabitacion = new TablaHabitacion(numHab);
        tablaHabitacion.setVisible(true); 
    }//GEN-LAST:event_btnHabitacion103ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion101;
    private javax.swing.JButton btnHabitacion102;
    private javax.swing.JButton btnHabitacion103;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
