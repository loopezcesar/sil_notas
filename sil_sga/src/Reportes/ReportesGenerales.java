/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import edu.sil.sga.dao.Conexion;
import edu.sil.sga.entidades.CursoPorGrado;
import edu.sil.sga.entidades.Docente;
import edu.sil.sga.entidades.Grado;
import edu.sil.sga.interfaces.Admi_buscarDocente;
import edu.sil.sga.interfaces.Admi_buscarGrado;
import edu.sil.sga.interfaces.Admin_buscarCursoPorGrado;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Eduardo Lopez
 */
public class ReportesGenerales extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReportesGenerales
     */
    
    Grado objGradoElegido = new Grado();
    public ReportesGenerales() {
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

        btnGenerarReporte = new javax.swing.JButton();
        txtGrado = new javax.swing.JTextField();
        btnBuscarGrado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        txtGrado.setEditable(false);

        btnBuscarGrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnBuscar.png"))); // NOI18N
        btnBuscarGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarGradoActionPerformed(evt);
            }
        });

        jLabel2.setText("* Grado:");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Reporte de cursos por un grado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnGenerarReporte))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarGrado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(btnGenerarReporte)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        // TODO add your handling code here:
        try {
         Connection con = Conexion.getConnection();
         Map parametro = new HashMap();
        parametro.put("parameter1",objGradoElegido.getId());
        String ruta ="src/Reportes/CursosPorGrado.jrxml";
         JasperReport reporte = JasperCompileManager.compileReport(ruta);
         JasperPrint print = JasperFillManager.fillReport(reporte, parametro, con);
         
         JasperViewer.viewReport(print);
         } catch (Exception e) {
         System.out.println("ERROR --> ABRIR --> REPORTE  " + e.getMessage());
         e.printStackTrace();
         }
        
        //lalalala
        
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void btnBuscarGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarGradoActionPerformed
        // TODO add your handling code here:
        List<Grado> lstGrado = new ArrayList<>();
        Admi_buscarGrado form = new Admi_buscarGrado(null, true, lstGrado);
        form.setVisible(true);
        if (lstGrado.isEmpty()) {
            //Ventana se cerro sin seleccionar
        } else {
            objGradoElegido = lstGrado.get(0);
            System.out.println("el ID del Grado que llego es: " + objGradoElegido.getId());
            txtGrado.setText(objGradoElegido.getnumeroGrado()+" "+objGradoElegido.getSeccion().getDescripcion()+" "+objGradoElegido.getNivel().getNombreLargo());
        }
    }//GEN-LAST:event_btnBuscarGradoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarGrado;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtGrado;
    // End of variables declaration//GEN-END:variables
}
