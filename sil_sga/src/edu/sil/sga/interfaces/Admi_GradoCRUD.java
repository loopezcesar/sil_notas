/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.GradoDAO;
import edu.sil.sga.dao.NivelDAO;
import edu.sil.sga.dao.SeccionDAO;
import edu.sil.sga.entidades.Grado;
import edu.sil.sga.entidades.Nivel;
import edu.sil.sga.entidades.Seccion;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Admi_GradoCRUD extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admi_GradoCRUD
     */
    public List<Nivel> listaNivel;
    public List<Seccion> listaSeccion;
    public List<Grado> listaGrado;
    Grado objGradoSeleccionado;

    public Admi_GradoCRUD() {
        initComponents();
        CargarNivel();
        CargarSeccion();
        ListarGrados();
        activaCombos(false);
        setLocation(250, 50);

    }

    //-------------------------------------------------------------------------
    //METODOS A REUTILIZAR EN EL FORMULARIO =D  -------------------------------
    void activaCombos(boolean a) {
        cboNivel.setEnabled(a);
        cboGrado.setEnabled(a);
        cboSeccion.setEnabled(a);
    }

    public void activaBotones(boolean a, boolean b, boolean c, boolean d) {
        btnNuevo.setEnabled(a);
        btnGuardar.setEnabled(b);
        btnActualizar.setEnabled(c);
        btnEliminar.setEnabled(d);
    }

    void CargarNivel() {
        try {

            DefaultComboBoxModel model = new DefaultComboBoxModel();
            listaNivel = new NivelDAO().ListarNivel();
            for (Nivel nivel : listaNivel) {
                model.addElement(nivel.getNombreLargo());
            }
            cboNivel.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos" + e.getMessage());
            System.out.println("error --> interfaz --> grado --> cargar Nivel" + e.getMessage());
        }
    }

    void CargarSeccion() {
        try {

            DefaultComboBoxModel model = new DefaultComboBoxModel();
            listaSeccion = new SeccionDAO().ListarSeccion();
            for (Seccion seccion : listaSeccion) {
                model.addElement(seccion.getDescripcion());
            }
            cboSeccion.setModel(model);

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error de base de datos" + e.getMessage());
            System.out.println("error --> interfaz --> grado --> cargar Seccion" + e.getMessage());
        }
    }

    void ListarGrados() {
        try {
            GradoDAO dao = new GradoDAO();
            listaGrado = dao.ListarGrado();
            DefaultTableModel modelo1 = new DefaultTableModel();

            //modelo1.addColumn("id");
            modelo1.addColumn("Nivel");
            modelo1.addColumn("Grado");
            modelo1.addColumn("Seccion");

            for (Grado grado : listaGrado) {
                modelo1.addRow(new String[]{
                    //grado.getId() + "",
                    grado.getNivel().getNombreLargo() + "",
                    grado.getnumeroGrado() + "",
                    grado.getSeccion().getDescripcion() + ""

                });
            }

            tblGrados.setModel(modelo1);

        } catch (Exception e) {
            System.out.println("error --> interfaz --> grado --> listar " + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cboNivel = new javax.swing.JComboBox();
        cboGrado = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboSeccion = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrados = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("I.E.P San Ignacio de Loyola - Gestionar Grado");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Gestion de Grado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del grado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        cboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboNivelMouseClicked(evt);
            }
        });

        cboGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));

        jLabel2.setText("* Nivel:");

        jLabel3.setText("* Seccion:");

        cboSeccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("* Grado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboNivel, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboGrado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboSeccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Grados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        tblGrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblGrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGrados);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nivel", "Grado" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnNuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGuardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnActualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addGap(14, 14, 14)
                                .addComponent(btnGuardar)
                                .addGap(10, 10, 10)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        if (btnNuevo.getText().equals("Nuevo")) {

            activaBotones(true, true, false, false);
            btnNuevo.setText("Cancelar");
            activaCombos(true);
        } else {
            activaBotones(true, false, false, false);
            btnNuevo.setText("Nuevo");
            activaCombos(false);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        String niv = cboNivel.getSelectedItem().toString();
        String gra = cboGrado.getSelectedItem().toString();
        String sec = cboSeccion.getSelectedItem().toString();

        if (niv.equalsIgnoreCase("")
                || gra.equalsIgnoreCase("")
                || sec.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "debe ingresar los campos requeridos (*)");

        } else {

            try {
                Grado grado = new Grado();
                GradoDAO dao = new GradoDAO();

                int posicionComboSeleccionado = cboNivel.getSelectedIndex();
                Nivel nivelSeleccionado = listaNivel.get(posicionComboSeleccionado);
                grado.setNivel(nivelSeleccionado);

                int posicionComboSeleccionado2 = cboSeccion.getSelectedIndex();
                Seccion seccionSeleccionado = listaSeccion.get(posicionComboSeleccionado2);
                grado.setSeccion(seccionSeleccionado);

                grado.setnumeroGrado(gra);

                if (dao.RegistrarGrado(grado)) {
                    JOptionPane.showMessageDialog(this, "Se registro correctamente el grado :) ");
                    ListarGrados();
                    activaBotones(true, false, false, false);
                    activaCombos(false);
                    btnNuevo.setText("Nuevo");
                } else {
                    JOptionPane.showMessageDialog(this, "ESTAMOS EN EL ELSE ");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "POR PROBLEMAS INTERNOS NO SE PUEDO AGREGAR  :( " + e.getMessage());

            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:

        // ME FALTA MEJORAR EL ACTUALIZAAAAAAAAAAAAR
        try {

            Grado grado = new Grado();
            GradoDAO dao = new GradoDAO();

            grado.setId(objGradoSeleccionado.getId());
            grado.setNivel(listaNivel.get(cboNivel.getSelectedIndex()));
            grado.setSeccion(listaSeccion.get(cboSeccion.getSelectedIndex()));
            grado.setnumeroGrado(cboGrado.getSelectedItem().toString());

            if (dao.ActualizarGrado(grado)) {
                JOptionPane.showMessageDialog(this, "Se Actualizo correctamente los datos del Grado ");
                ListarGrados();
                activaBotones(true, false, false, false);
                activaCombos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Verifique los datos ingresados e intentelo nuevamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudimos actualizar datos del grado  :(" + e.getMessage());
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblGradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGradosMouseClicked
        // TODO add your handling code here:

        int fila = tblGrados.getSelectedRow();
        if (fila != -1) {
            objGradoSeleccionado = listaGrado.get(fila);

            cboNivel.setSelectedItem(objGradoSeleccionado.getNivel().getNombreLargo());
            cboGrado.setSelectedItem(objGradoSeleccionado.getnumeroGrado());
            cboSeccion.setSelectedItem(objGradoSeleccionado.getSeccion().getDescripcion());

            btnNuevo.setText("Nuevo");
            activaBotones(true, false, true, true);
            activaCombos(true);
        }
    }//GEN-LAST:event_tblGradosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        try {

            Grado grado = new Grado();
            GradoDAO dao = new GradoDAO();

            grado.setId(objGradoSeleccionado.getId());
            grado.setNivel(listaNivel.get(cboNivel.getSelectedIndex()));
            grado.setSeccion(listaSeccion.get(cboSeccion.getSelectedIndex()));
            grado.setnumeroGrado(cboGrado.getSelectedItem().toString());

            if (dao.EliminarGrado(grado)) {
                JOptionPane.showMessageDialog(this, "Se ELIMINO correctamente el grado ^^  ");
                ListarGrados();
                activaBotones(true, false, false, false);
                activaCombos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Verifique los datos ingresados e intentelo nuevamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudimos actualizar datos del grado :(" + e.getMessage());
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboNivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboNivelMouseClicked
        // TODO add your handling code here:
        System.out.println("hice lick =P ");
        System.out.println("la cantidad de elemento del grado es : " + cboGrado.getItemCount());
        System.out.println("el texto que tiene es: " + cboNivel.getSelectedItem());

        DefaultComboBoxModel model = new DefaultComboBoxModel();

        if (cboNivel.getSelectedItem().equals("PRIMARIA")) {
            model.addElement("1");
            model.addElement("2");
            model.addElement("3");
            model.addElement("4");
            model.addElement("5");
            model.addElement("6");
        }else if(cboNivel.getSelectedItem().equals("SECUNDARIA")){
            model.addElement("1");
            model.addElement("2");
            model.addElement("3");
            model.addElement("4");
            model.addElement("5");
        }

        cboGrado.setModel(model);

    }//GEN-LAST:event_cboNivelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboGrado;
    private javax.swing.JComboBox cboNivel;
    private javax.swing.JComboBox cboSeccion;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblGrados;
    // End of variables declaration//GEN-END:variables
}
