/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.Estudiantes;

/**
 *
 * @author mrbingus
 */
public class FrmEstudiantePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmEstudiantePrincipal
     */
    public FrmEstudiantePrincipal() {
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
        jLabel1 = new javax.swing.JLabel();
        btnAsignaturas = new javax.swing.JButton();
        btnMatriculas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(413, 407));

        jPanel1.setPreferredSize(new java.awt.Dimension(413, 407));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("SGA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        btnAsignaturas.setText("Mis Asignaturas");
        btnAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignaturasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignaturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 130, 320));

        btnMatriculas1.setText("Matriculas");
        btnMatriculas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculas1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMatriculas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, 320));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMatriculas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculas1ActionPerformed
        new FrmMatriculas().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMatriculas1ActionPerformed

    private void btnAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignaturasActionPerformed
        new FrmAsignaturasAsistencias().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsignaturasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEstudiantePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiantePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiantePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiantePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstudiantePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignaturas;
    private javax.swing.JButton btnMatriculas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
