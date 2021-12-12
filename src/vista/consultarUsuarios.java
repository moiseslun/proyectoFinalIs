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
import pojos.Usuario;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author danie
 */
public class consultarUsuarios extends javax.swing.JFrame {

    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    Usuario objUsuario = new Usuario();
    
    /**
     * Creates new form consultarUsuarios
     */
    public consultarUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
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
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupUsuario = new javax.swing.ButtonGroup();
        lblTituloVentana = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        panRol = new javax.swing.JPanel();
        optAdministrador = new javax.swing.JRadioButton();
        optVendedor = new javax.swing.JRadioButton();
        btnReporte = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTituloVentana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloVentana.setText("Lista de usuarios");

        btnActualizar.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Mostrar lista de usuarios");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cafe3.png"))); // NOI18N

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "Usuario", "Password"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        panRol.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        btnGroupUsuario.add(optAdministrador);
        optAdministrador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        optAdministrador.setText("Administrador");

        btnGroupUsuario.add(optVendedor);
        optVendedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        optVendedor.setText("Vendedor");

        javax.swing.GroupLayout panRolLayout = new javax.swing.GroupLayout(panRol);
        panRol.setLayout(panRolLayout);
        panRolLayout.setHorizontalGroup(
            panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRolLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(optAdministrador)
                .addGap(44, 44, 44)
                .addComponent(optVendedor)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        panRolLayout.setVerticalGroup(
            panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optAdministrador)
                    .addComponent(optVendedor))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnReporte.setBackground(new java.awt.Color(0, 102, 204));
        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("Ver reporte PDF");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(0, 102, 204));
        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("Imprimir lista de usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(lblTituloVentana))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(panRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloVentana)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte)
                    .addComponent(btnImprimir))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
  
        if (optAdministrador.isSelected()) {//if para usuario administrado
            try{
                conectarBase();

                //Declaracion de un onjeto de almacenamiento lógico de datos "Modelo de datos"
                DefaultTableModel modeloDatos = new DefaultTableModel();
                jtConsulta.setModel(modeloDatos);
                rs = stmt.executeQuery("SELECT * FROM tusuariosadmin");

                ResultSetMetaData rsmd = rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();

                modeloDatos.addColumn("Id");
                modeloDatos.addColumn("Usuario");
                modeloDatos.addColumn("Password");
            
                //imprimir filas o registros
                while(rs.next()){
                    Object fila [] = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = rs.getObject(i+1);
                    }

                    modeloDatos.addRow(fila);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error 2 de BD Consulta"+e);
            }
        } else if(optVendedor.isSelected()){
            try{
                conectarBase();

                //Declaracion de un onjeto de almacenamiento lógico de datos "Modelo de datos"
                DefaultTableModel modeloDatos = new DefaultTableModel();
                jtConsulta.setModel(modeloDatos);
                rs = stmt.executeQuery("SELECT * FROM tusuariosvend");

                ResultSetMetaData rsmd = rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();

                modeloDatos.addColumn("Id");
                modeloDatos.addColumn("Usuario");
                modeloDatos.addColumn("Password");
            
                //imprimir filas o registros
                while(rs.next()){
                    Object fila [] = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = rs.getObject(i+1);
                    }

                    modeloDatos.addRow(fila);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error 2 de BD Consulta"+e);
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        if (optAdministrador.isSelected()) {//if para usuario administrado
            conectarBase();
            try {
                String rutaReporte="src/reportes/reportesUsuariosAdmin.jasper";
                JasperPrint rptProveedoresPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
                JasperViewer ventanaVisor = new JasperViewer(rptProveedoresPDF,false);
                ventanaVisor.setTitle("Reporte de usuarios administrador Sistema Luna");
                ventanaVisor.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
            }
        } else if(optVendedor.isSelected()){
            conectarBase();
            try {
                String rutaReporte="src/reportes/reportesUsuariosVendedores.jasper";
                JasperPrint rptProveedoresPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
                JasperViewer ventanaVisor = new JasperViewer(rptProveedoresPDF,false);
                ventanaVisor.setTitle("Reporte de usuarios vendedores Sistema Luna");
                ventanaVisor.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
            }
        }
    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(consultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.ButtonGroup btnGroupUsuario;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnReporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JRadioButton optAdministrador;
    private javax.swing.JRadioButton optVendedor;
    private javax.swing.JPanel panRol;
    // End of variables declaration//GEN-END:variables
}
