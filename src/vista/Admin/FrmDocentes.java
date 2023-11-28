/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.Admin;

import controlador.utiles.Utiles;
import javax.swing.JOptionPane;
import vista.lista.tabla.ModeloTablaDocentes;

/**
 *
 * @author mrbingus
 */
public class FrmDocentes extends javax.swing.JFrame {

   
    private ModeloTablaDocentes modelotabla = new ModeloTablaDocentes();
    
    public FrmDocentes() {
        initComponents();
        cargarTabla();
    }
 public void cargarTabla(){
        tblListaDocentes.setModel(modelotabla);
        tblListaDocentes.updateUI();
    }
 
        public void guardar(){
                if (validar()) {
                        if(Utiles.verificarCelular(txtCelular.getText().trim())){
                                if (Utiles.validadorDeCedula(txtDNI1.getText().trim())) {
                                        JOptionPane.showMessageDialog(null, "Datos correctos ingresados", "Datos correctos", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                        JOptionPane.showMessageDialog(null, "Cedula ingresada incorrecto", "Cedula incorrecta", JOptionPane.ERROR_MESSAGE);
                                }
                        } else {
                                JOptionPane.showMessageDialog(null, "Numero de celular ingresado incorrecto", "Celular Incorrecta", JOptionPane.ERROR_MESSAGE);
                        }
                } else {
                        JOptionPane.showMessageDialog(null, "Faltan datos por llenar", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
                }   
        }
 
        public Boolean validar(){
                if (!txtApellido.getText().trim().isEmpty() &&
                        !txtNombre.getText().trim().isEmpty() && 
                        !txtDNI1.getText().trim().isEmpty() &&
                        !txtCelular.getText().trim().isEmpty()){
                        return true;
                } else {
                        return false;
                }
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
                jScrollPane1 = new javax.swing.JScrollPane();
                tblListaDocentes = new javax.swing.JTable();
                btnGuardar = new javax.swing.JButton();
                btnModificar = new javax.swing.JButton();
                btnBorrar = new javax.swing.JButton();
                btnBuscar = new javax.swing.JButton();
                txtApellido = new javax.swing.JTextField();
                txtCelular = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                txtNombre = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                txtDNI1 = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jPanel1.setPreferredSize(new java.awt.Dimension(484, 481));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                tblListaDocentes.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                jScrollPane1.setViewportView(tblListaDocentes);

                jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 420, 200));

                btnGuardar.setText("Guardar");
                btnGuardar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnGuardarActionPerformed(evt);
                        }
                });
                jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 90, -1));

                btnModificar.setText("Modificar");
                btnModificar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnModificarActionPerformed(evt);
                        }
                });
                jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 90, -1));

                btnBorrar.setText("Borrar");
                jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 90, -1));

                btnBuscar.setText("Buscar");
                jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 90, -1));
                jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 130, -1));

                txtCelular.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtCelularActionPerformed(evt);
                        }
                });
                jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 130, -1));

                jLabel1.setText("DOCENTES");
                jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

                jLabel2.setText("Celular:");
                jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

                jLabel3.setText("Apellido:");
                jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

                jLabel4.setText("Nombre:");
                jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
                jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 130, -1));

                jLabel5.setText("Docentes registrados");
                jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

                jLabel6.setText("DNI:");
                jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
                jPanel1.add(txtDNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 130, -1));

                getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

        private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtCelularActionPerformed

        private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                guardar();
        }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDocentes().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBorrar;
        private javax.swing.JButton btnBuscar;
        private javax.swing.JButton btnGuardar;
        private javax.swing.JButton btnModificar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tblListaDocentes;
        private javax.swing.JTextField txtApellido;
        private javax.swing.JTextField txtCelular;
        private javax.swing.JTextField txtDNI1;
        private javax.swing.JTextField txtNombre;
        // End of variables declaration//GEN-END:variables
}
