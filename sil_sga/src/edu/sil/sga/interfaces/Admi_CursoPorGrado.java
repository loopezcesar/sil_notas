/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.entidades.Curso;
import edu.sil.sga.entidades.Grado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Lopez
 */
public class Admi_CursoPorGrado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admi_CursoPorGrado
     */
    Grado grado;
    Curso curso;
    public Admi_CursoPorGrado() {
        initComponents();
    }
    void cargarDatosGrado(Grado objGrado) {
        this.grado = objGrado;
        txtGrado.setText(" ' " + objGrado.getnumeroGrado() + " - " + objGrado.getSeccion().getDescripcion() + " ' de " + objGrado.getNivel().getNombreCorto());
        //txtSeccion.setText(objGrado.getSeccion().getDescripcion());
        //txtNivel.setText(objGrado.getNivel().getNombreCorto());
    }
    void cargarDatosCurso(Curso objCurso) {
        this.curso = objCurso;
        txtCurso.setText(objCurso.getNombreLargo());
        //txtSeccion.setText(objGrado.getSeccion().getDescripcion());
        //txtNivel.setText(objGrado.getNivel().getNombreCorto());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarCurso = new javax.swing.JButton();
        btnBuscarGrado = new javax.swing.JButton();
        txtCurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Curso por Grado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 434, 100));

        btnBuscarCurso.setText("buscar");
        btnBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCursoActionPerformed(evt);
            }
        });

        btnBuscarGrado.setText("buscar");
        btnBuscarGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarGradoActionPerformed(evt);
            }
        });

        jLabel3.setText("Curso:");

        jLabel2.setText("Grado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(txtGrado))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarGrado)
                    .addComponent(btnBuscarCurso))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarGrado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCurso))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 340, 110));

        jButton3.setText("Actualizar");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jButton4.setText("-");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jButton5.setText("Guardar");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jButton6.setText("Nuevo");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jButton7.setText("Eliminar");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarGradoActionPerformed
        // TODO add your handling code here:
        List<Grado> lstGrado = new ArrayList<>();
        Admi_buscarGrado form = new Admi_buscarGrado(null, true, lstGrado);
        form.setVisible(true);
        if (lstGrado.isEmpty()) {
            //Ventana se cerro sin seleccionar
        } else {
            Grado objGradoElegido = lstGrado.get(0);
            cargarDatosGrado(objGradoElegido);
        }
    }//GEN-LAST:event_btnBuscarGradoActionPerformed

    private void btnBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCursoActionPerformed
        // TODO add your handling code here:
        List<Curso> lstCurso = new ArrayList<>();
        Admi_buscarCurso form = new Admi_buscarCurso(null, true, lstCurso);
        form.setVisible(true);
        if (lstCurso.isEmpty()) {
            //Ventana se cerro sin seleccionar
        } else {
            Curso objCursoElegido = lstCurso.get(0);
            //cargarDatosCurso(objCursoElegido);
        }
    }//GEN-LAST:event_btnBuscarCursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCurso;
    private javax.swing.JButton btnBuscarGrado;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtGrado;
    // End of variables declaration//GEN-END:variables
}