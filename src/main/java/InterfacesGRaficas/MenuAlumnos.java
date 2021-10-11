/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGRaficas;

/**
 *
 * @author micaelakorec
 */
public class MenuAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form MenuAlumnos
     */
    public MenuAlumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BotonMenuAlumno = new javax.swing.JButton();
        BotonGestionIngreso = new javax.swing.JButton();
        BotonMenuTutor = new javax.swing.JButton();
        BotonGestionHorarios = new javax.swing.JButton();
        BotonGestionCuotas = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 10));

        jPanel3.setBackground(new java.awt.Color(9, 151, 9));

        jLabel5.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Menú de opciones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel5)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, 50));

        jPanel4.setBackground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 10));

        BotonMenuAlumno.setText("Menú alumno");
        BotonMenuAlumno.setMaximumSize(new java.awt.Dimension(128, 28));
        BotonMenuAlumno.setMinimumSize(new java.awt.Dimension(128, 28));
        BotonMenuAlumno.setPreferredSize(new java.awt.Dimension(128, 28));
        BotonMenuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonMenuAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 70));

        BotonGestionIngreso.setText("Gestión ingreso");
        BotonGestionIngreso.setMaximumSize(new java.awt.Dimension(128, 28));
        BotonGestionIngreso.setMinimumSize(new java.awt.Dimension(128, 28));
        BotonGestionIngreso.setPreferredSize(new java.awt.Dimension(128, 28));
        BotonGestionIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGestionIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonGestionIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, 70));

        BotonMenuTutor.setText("Menú tutor");
        BotonMenuTutor.setMaximumSize(new java.awt.Dimension(128, 28));
        BotonMenuTutor.setMinimumSize(new java.awt.Dimension(128, 28));
        BotonMenuTutor.setPreferredSize(new java.awt.Dimension(128, 28));
        BotonMenuTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuTutorActionPerformed(evt);
            }
        });
        jPanel1.add(BotonMenuTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 70));

        BotonGestionHorarios.setText("Gestión horarios");
        BotonGestionHorarios.setMaximumSize(new java.awt.Dimension(128, 28));
        BotonGestionHorarios.setMinimumSize(new java.awt.Dimension(128, 28));
        BotonGestionHorarios.setPreferredSize(new java.awt.Dimension(128, 28));
        jPanel1.add(BotonGestionHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, 70));

        BotonGestionCuotas.setText("Gestión cuotas");
        BotonGestionCuotas.setMaximumSize(new java.awt.Dimension(128, 28));
        BotonGestionCuotas.setMinimumSize(new java.awt.Dimension(128, 28));
        BotonGestionCuotas.setPreferredSize(new java.awt.Dimension(128, 28));
        jPanel1.add(BotonGestionCuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 120, 70));

        BotonSalir.setText("Salir");
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMenuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuAlumnoActionPerformed
        MenuPrincipal.setVisible(false);
        MenuAlumnos.setVisible(true);
    }//GEN-LAST:event_BotonMenuAlumnoActionPerformed

    private void BotonGestionIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGestionIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGestionIngresoActionPerformed

    private void BotonMenuTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMenuTutorActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGestionCuotas;
    private javax.swing.JButton BotonGestionHorarios;
    private javax.swing.JButton BotonGestionIngreso;
    private javax.swing.JButton BotonMenuAlumno;
    private javax.swing.JButton BotonMenuTutor;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JPanel MenuPrincipal1;
    private javax.swing.JPanel MenuPrincipal2;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
