/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.HashSet;
import java.util.Set;
//librerias de conexion
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
import pojos.Proveedor;
/**
 *
 * @author danie
 */
public class actualizarProveedor extends javax.swing.JFrame {
    
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    /**
     * Creates new form actualizarProveedor
     */
    public actualizarProveedor() {
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

        lblImg = new javax.swing.JLabel();
        lblTituloVentana = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnActualizarTitulo = new javax.swing.JButton();
        btnActualizarNombre = new javax.swing.JButton();
        btnActualizarApellidoPaterno = new javax.swing.JButton();
        btnActualizarApellidoMaterno = new javax.swing.JButton();
        btnActualizarEmpresa = new javax.swing.JButton();
        btnActualizarTelefono = new javax.swing.JButton();
        btnActualizarEmail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cafe3.png"))); // NOI18N

        lblTituloVentana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloVentana.setText("Actualizaci??n de datos de proveedores");

        lblNota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNota.setText("*Tip: Por favor ingrese el ID del proveedor que quiere actualizar as?? como el campo, despu??s presione actualizar");

        lblId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblId.setText("Id:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitulo.setText("Titulo:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblApellidoPaterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblApellidoPaterno.setText("Apellido paterno:");

        lblApellidoMaterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblApellidoMaterno.setText("Apellido materno:");

        lblEmpresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpresa.setText("Empresa:");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelefono.setText("Telefono:");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setText("Email:");

        btnActualizarTitulo.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizarTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizarTitulo.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTitulo.setText("Actualizar titulo");
        btnActualizarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTituloActionPerformed(evt);
            }
        });

        btnActualizarNombre.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizarNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizarNombre.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarNombre.setText("Actualizar nombre");
        btnActualizarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarNombreActionPerformed(evt);
            }
        });

        btnActualizarApellidoPaterno.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizarApellidoPaterno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizarApellidoPaterno.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarApellidoPaterno.setText("Actualizar apellido paterno");
        btnActualizarApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarApellidoPaternoActionPerformed(evt);
            }
        });

        btnActualizarApellidoMaterno.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizarApellidoMaterno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizarApellidoMaterno.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarApellidoMaterno.setText("Actualizar apellido materno");
        btnActualizarApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarApellidoMaternoActionPerformed(evt);
            }
        });

        btnActualizarEmpresa.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizarEmpresa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarEmpresa.setText("Actualizar empresa");
        btnActualizarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpresaActionPerformed(evt);
            }
        });

        btnActualizarTelefono.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizarTelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizarTelefono.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTelefono.setText("Actualizar telefono");
        btnActualizarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTelefonoActionPerformed(evt);
            }
        });

        btnActualizarEmail.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizarEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizarEmail.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarEmail.setText("Actualizar email");
        btnActualizarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNota, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloVentana)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblApellidoPaterno)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidoPaterno))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId)
                                    .addComponent(lblTitulo)
                                    .addComponent(lblNombre))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId)
                                    .addComponent(txtTitulo)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellidoMaterno)
                                    .addComponent(lblEmpresa)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblEmail))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoMaterno)
                                    .addComponent(txtEmpresa)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                            .addComponent(btnActualizarTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarApellidoPaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarApellidoMaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarEmpresa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloVentana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNota, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarNombre)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoPaterno)
                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarApellidoPaterno)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoMaterno)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarApellidoMaterno)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpresa)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarEmpresa)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarTelefono)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarEmail))
                    .addComponent(lblImg))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTituloActionPerformed
        
        conectarBase();
        String actualizacionProveedor = "UPDATE tproveedores SET titulo = '"+txtTitulo.getText()+"' WHERE idProveedor = '"+txtId.getText()+"'";
        
        try {
            stmt.executeUpdate(actualizacionProveedor);
            JOptionPane.showMessageDialog(null, "Se actualizo proveedor de forma exitosa\n\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD al actualizar proveedor\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnActualizarTituloActionPerformed

    private void btnActualizarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarNombreActionPerformed
        conectarBase();
        String actualizacionProveedor = "UPDATE tproveedores SET nombre = '"+txtNombre.getText()+"' WHERE idProveedor = '"+txtId.getText()+"'";
        
        try {
            stmt.executeUpdate(actualizacionProveedor);
            JOptionPane.showMessageDialog(null, "Se actualizo proveedor de forma exitosa\n\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD al actualizar proveedor\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnActualizarNombreActionPerformed

    private void btnActualizarApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarApellidoPaternoActionPerformed
        conectarBase();
        String actualizacionProveedor = "UPDATE tproveedores SET apellidoPaterno = '"+txtApellidoPaterno.getText()+"' WHERE idProveedor = '"+txtId.getText()+"'";
        
        try {
            stmt.executeUpdate(actualizacionProveedor);
            JOptionPane.showMessageDialog(null, "Se actualizo proveedor de forma exitosa\n\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD al actualizar proveedor\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnActualizarApellidoPaternoActionPerformed

    private void btnActualizarApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarApellidoMaternoActionPerformed
        conectarBase();
        String actualizacionProveedor = "UPDATE tproveedores SET apellidoMaterno = '"+txtApellidoMaterno.getText()+"' WHERE idProveedor = '"+txtId.getText()+"'";
        
        try {
            stmt.executeUpdate(actualizacionProveedor);
            JOptionPane.showMessageDialog(null, "Se actualizo proveedor de forma exitosa\n\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD al actualizar proveedor\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnActualizarApellidoMaternoActionPerformed

    private void btnActualizarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpresaActionPerformed
        conectarBase();
        String actualizacionProveedor = "UPDATE tproveedores SET empresa = '"+txtEmpresa.getText()+"' WHERE idProveedor = '"+txtId.getText()+"'";
        
        try {
            stmt.executeUpdate(actualizacionProveedor);
            JOptionPane.showMessageDialog(null, "Se actualizo proveedor de forma exitosa\n\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD al actualizar proveedor\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnActualizarEmpresaActionPerformed

    private void btnActualizarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTelefonoActionPerformed
        conectarBase();
        String actualizacionProveedor = "UPDATE tproveedores SET telefono = '"+txtTelefono.getText()+"' WHERE idProveedor = '"+txtId.getText()+"'";
        
        try {
            stmt.executeUpdate(actualizacionProveedor);
            JOptionPane.showMessageDialog(null, "Se actualizo proveedor de forma exitosa\n\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD al actualizar proveedor\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnActualizarTelefonoActionPerformed

    private void btnActualizarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmailActionPerformed
        conectarBase();
        String actualizacionProveedor = "UPDATE tproveedores SET email = '"+txtEmail.getText()+"' WHERE idProveedor = '"+txtId.getText()+"'";
        
        try {
            stmt.executeUpdate(actualizacionProveedor);
            JOptionPane.showMessageDialog(null, "Se actualizo proveedor de forma exitosa\n\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD al actualizar proveedor\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnActualizarEmailActionPerformed
    
    public void conectarBase(){
        try{ //inicia try
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost/bdproyectofinalis","root","");
                JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nLuna");
                stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error de base de datos 1: \n"+ ex);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error de base de datos 2:"+ e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(actualizarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actualizarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarApellidoMaterno;
    private javax.swing.JButton btnActualizarApellidoPaterno;
    private javax.swing.JButton btnActualizarEmail;
    private javax.swing.JButton btnActualizarEmpresa;
    private javax.swing.JButton btnActualizarNombre;
    private javax.swing.JButton btnActualizarTelefono;
    private javax.swing.JButton btnActualizarTitulo;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
