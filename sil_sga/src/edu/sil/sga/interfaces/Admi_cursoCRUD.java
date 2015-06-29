/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.CursoDAO;
import edu.sil.sga.entidades.Curso;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar Lopez
 */
public class Admi_cursoCRUD extends javax.swing.JInternalFrame {

    /**
     * Creates new form admi_cursoCRUD
     */
    public List<Curso> listaCurso;
    Curso objCursoSeleccionado;

    public Admi_cursoCRUD() {
        initComponents();

        setLocation(200, 40);
        activaBotones(true, false, false, false);
        ListarCurso();
        activaCajas(false);

    }

    void activaCajas(boolean a) {
        txtNombreCorto.setEnabled(a);
        txtNombreLargo.setEnabled(a);
        txtHorasTeoricas.setEnabled(a);
        txtHorasPracticas.setEnabled(a);
        txtDescripcion.setEnabled(a);
    }

    void activaBotones(boolean a, boolean b, boolean c, boolean d) {
        btnNuevo.setEnabled(a);
        btnGuardar.setEnabled(b);
        btnActualizar.setEnabled(c);
        btnEliminar.setEnabled(d);
    }

    void limpiarCajas() {

        txtNombreCorto.setText("");
        txtNombreLargo.setText("");
        txtHorasTeoricas.setText("");
        txtHorasPracticas.setText("");
        txtDescripcion.setText("");
        txtNombreCorto.requestFocus();
    }

    public void ListarCurso() {
        CursoDAO dao = new CursoDAO();
        listaCurso = dao.ListarCurso();

        DefaultTableModel modelo1 = new DefaultTableModel();
        //modelo1.addColumn("id");
        modelo1.addColumn("Nombre Corto");
        modelo1.addColumn("Nombre Largo");
        modelo1.addColumn("Horas Teoricas");
        modelo1.addColumn("Horas Practicas");
        //modelo1.addColumn("Descripcion");

        for (Curso obcurso : listaCurso) {
            modelo1.addRow(new String[]{
                //obcurso.getId() + "",
                obcurso.getNombreCorto() + "",
                obcurso.getNombreLargo() + "",
                obcurso.getHorasTecnicas() + "",
                obcurso.getHorasPracticas() + ""
            //obcurso.getDescripcion() + ""
            });
        }
        tablaListaCurso.setModel(modelo1);
    }

    void actualizarBusqueda() {
        listaCurso = new CursoDAO().BuscarCurso(String.valueOf(txtCampoBusqueda.getText()));
        DefaultTableModel modelo1 = new DefaultTableModel();

        //modelo1.addColumn("id");
        modelo1.addColumn("Nombre Corto");
        modelo1.addColumn("Nombre Largo");
        modelo1.addColumn("Horas Teoricas");
        modelo1.addColumn("Horas Practicas");
        //modelo1.addColumn("Descripcion");

        for (Curso curso : listaCurso) {
            modelo1.addRow(new String[]{
                //curso.getId() + "",
                curso.getNombreCorto() + "",
                curso.getNombreLargo() + "",
                curso.getHorasTecnicas() + "",
                curso.getHorasPracticas() + ""
            //curso.getDescripcion() + ""
            });
        }
        tablaListaCurso.setModel(modelo1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelEspecialidad = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panelEspecialidad1 = new javax.swing.JPanel();
        txtNombreLargo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtHorasTeoricas = new javax.swing.JTextField();
        txtHorasPracticas = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtNombreCorto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaListaCurso = new javax.swing.JTable();
        txtCampoBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Especialidad");

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

        panelEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Especialidad"));

        jLabel3.setText("Nombre:");

        jButton1.setText("Guardar");
        jButton1.setEnabled(false);

        jButton2.setText("Buscar");

        jButton4.setText("Actualizar");

        jButton3.setText("Nuevo");

        jLabel5.setText("Observacion:");

        javax.swing.GroupLayout panelEspecialidadLayout = new javax.swing.GroupLayout(panelEspecialidad);
        panelEspecialidad.setLayout(panelEspecialidadLayout);
        panelEspecialidadLayout.setHorizontalGroup(
            panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidadLayout.createSequentialGroup()
                .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEspecialidadLayout.createSequentialGroup()
                        .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEspecialidadLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEspecialidadLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)))
                        .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEspecialidadLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEspecialidadLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))))
                    .addGroup(panelEspecialidadLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelEspecialidadLayout.setVerticalGroup(
            panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidadLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3))
                    .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar Curso - IEP San Ignacio de Loyola");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Gestionar Curso");

        panelEspecialidad1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Curso"));

        txtNombreLargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreLargoKeyTyped(evt);
            }
        });

        jLabel8.setText("* Nombre Corto:");

        jLabel9.setText("* Nombre Largo");

        txtHorasTeoricas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHorasTeoricasKeyTyped(evt);
            }
        });

        txtHorasPracticas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHorasPracticasKeyTyped(evt);
            }
        });

        txtNombreCorto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCortoKeyTyped(evt);
            }
        });

        jLabel12.setText("* Horas Teoricas:");

        jLabel13.setText("* Horas Practicas:");

        jLabel14.setText("Descripcion:");

        javax.swing.GroupLayout panelEspecialidad1Layout = new javax.swing.GroupLayout(panelEspecialidad1);
        panelEspecialidad1.setLayout(panelEspecialidad1Layout);
        panelEspecialidad1Layout.setHorizontalGroup(
            panelEspecialidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidad1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelEspecialidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(52, 52, 52)
                .addGroup(panelEspecialidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHorasPracticas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorasTeoricas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCorto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelEspecialidad1Layout.setVerticalGroup(
            panelEspecialidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidad1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelEspecialidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEspecialidad1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelEspecialidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(panelEspecialidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHorasTeoricas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(panelEspecialidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHorasPracticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(panelEspecialidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreCorto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(panelEspecialidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Cursos:"));

        tablaListaCurso.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaListaCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListaCursoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaListaCurso);

        txtCampoBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCampoBusquedaKeyReleased(evt);
            }
        });

        jLabel1.setText("Buscar por Nombre: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCampoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCampoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelEspecialidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addGap(17, 17, 17)
                                .addComponent(btnGuardar)
                                .addGap(19, 19, 19)
                                .addComponent(btnActualizar)
                                .addGap(11, 11, 11)
                                .addComponent(btnEliminar)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(panelEspecialidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText().equals("Nuevo")) {
            limpiarCajas();
            activaBotones(true, true, false, false);
            btnNuevo.setText("Cancelar");
            activaCajas(true);
        } else {
            activaBotones(true, false, false, false);
            btnNuevo.setText("Nuevo");
            limpiarCajas();
            activaCajas(false);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtNombreCorto.getText().equalsIgnoreCase("")
                || txtNombreLargo.getText().equalsIgnoreCase("")
                || txtHorasTeoricas.getText().equalsIgnoreCase("")
                || txtHorasPracticas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos requeridos(*) ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Curso curso = new Curso();
                CursoDAO dao = new CursoDAO();

                curso.setNombreCorto(txtNombreCorto.getText());
                curso.setNombreLargo(txtNombreLargo.getText());
                curso.setHorasTecnicas(Integer.parseInt(txtHorasTeoricas.getText()));
                curso.setHorasPracticas(Integer.parseInt(txtHorasPracticas.getText()));
                curso.setDescripcion(txtDescripcion.getText());

                if (dao.RegistrarCurso(curso)) {
                    JOptionPane.showMessageDialog(null, "Se registro correctamente el curso", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    activaBotones(true, false, false, false);
                    btnNuevo.setText("Nuevo");
                    limpiarCajas();
                    ListarCurso();
                    activaCajas(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Verifique que los datos e intentelo nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ocurrio un problema interno.. Acuda al area de SOPORTE");
                System.out.println("ERROR --> INTERFAZ --> CURSO --> GUARDAR --> " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCampoBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoBusquedaKeyReleased
        if (String.valueOf(txtCampoBusqueda.getText()) == "") {
            ListarCurso();
        } else {
            actualizarBusqueda();
        }
    }//GEN-LAST:event_txtCampoBusquedaKeyReleased

    private void tablaListaCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListaCursoMouseClicked

        int fila = tablaListaCurso.getSelectedRow();
        if (fila != -1) {

            objCursoSeleccionado = listaCurso.get(fila);

            txtNombreCorto.setText(objCursoSeleccionado.getNombreCorto());
            txtNombreLargo.setText(objCursoSeleccionado.getNombreLargo());
            txtHorasTeoricas.setText(String.valueOf(objCursoSeleccionado.getHorasTecnicas()));
            txtHorasPracticas.setText(String.valueOf(objCursoSeleccionado.getHorasPracticas()));
            txtDescripcion.setText(objCursoSeleccionado.getDescripcion());

            btnNuevo.setText("Nuevo");
            activaBotones(true, false, true, true);
            activaCajas(true);
        }
    }//GEN-LAST:event_tablaListaCursoMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (txtNombreCorto.getText().equalsIgnoreCase("")
                || txtNombreLargo.getText().equalsIgnoreCase("")
                || txtHorasTeoricas.getText().equalsIgnoreCase("")
                || txtHorasPracticas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos Requeridos(*) ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Curso objCurso = new Curso();
                CursoDAO dao = new CursoDAO();

                objCurso.setNombreCorto(txtNombreCorto.getText());
                objCurso.setNombreLargo(txtNombreLargo.getText());
                objCurso.setHorasTecnicas(Integer.parseInt(txtHorasTeoricas.getText()));
                objCurso.setHorasPracticas(Integer.parseInt(txtHorasPracticas.getText()));
                objCurso.setDescripcion(txtDescripcion.getText());
                objCurso.setId(objCursoSeleccionado.getId());

                if (dao.ActualizarCurso(objCurso)) {
                    JOptionPane.showMessageDialog(this, "Se actualizo Correctamente el Registro", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);
                    ListarCurso();
                    limpiarCajas();
                    activaBotones(true, false, false, false);
                    activaCajas(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Verifique que los Datos ingresados son Correctos", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ocurrio un problema interno.. Acuda al area de SOPORTE");
                System.out.println("ERROR --> INTERFAZ --> CURSO --> ACTUALIZAR --> " + e.getMessage());
            }
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*      String id = txtId.getText();
         String nomCo = txtNombreCorto.getText();
         String nomLa = txtNombreLargo.getText();
         String horaTe = txtHorasTeoricas.getText();
         String horaPr = txtHorasPracticas.getText();
         String desc = txtDescripcion.getText();
        
         if(nomCo.equalsIgnoreCase("")||nomLa.equalsIgnoreCase("")||horaTe.equalsIgnoreCase("")){
         JOptionPane.showMessageDialog(null, "No borre los campos Requeridos por favor: (*) ","ERROR",JOptionPane.ERROR_MESSAGE);
         }else{
         try {
         Curso objCurso = new Curso();
         CursoDAO dao = new CursoDAO();

         objCurso.setId(Integer.parseInt(id));
         objCurso.setNombreCorto(nomCo);
         objCurso.setNombreLargo(nomLa);
         objCurso.setHorasTecnicas(Integer.parseInt(horaTe));
         objCurso.setHorasPracticas(Integer.parseInt(horaPr));
         objCurso.setDescripcion(desc);
         if (dao.EliminarCurso(objCurso)) {
         JOptionPane.showMessageDialog(this, "Se elimino Correctamente","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
         ListarCurso();
         limpiarCajas();
         activaBotones(true, false, false, false);
         activaCajas(false);
         }else{
         JOptionPane.showMessageDialog(this, "No se pudo eliminar ","ERROR",JOptionPane.ERROR_MESSAGE);
         }
         } catch (Exception e) {
         System.out.println("error --> interfaz --> docente --> eliminar");
         }
         }*/

        if (txtNombreCorto.getText().equalsIgnoreCase("")
                || txtNombreLargo.getText().equalsIgnoreCase("")
                || txtHorasTeoricas.getText().equalsIgnoreCase("")
                || txtHorasPracticas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos Requeridos(*) ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Curso objCurso = new Curso();
                CursoDAO dao = new CursoDAO();

                objCurso.setNombreCorto(txtNombreCorto.getText());
                objCurso.setNombreLargo(txtNombreLargo.getText());
                objCurso.setHorasTecnicas(Integer.parseInt(txtHorasTeoricas.getText()));
                objCurso.setHorasPracticas(Integer.parseInt(txtHorasPracticas.getText()));
                objCurso.setDescripcion(txtDescripcion.getText());
                objCurso.setId(objCursoSeleccionado.getId());

                if (dao.EliminarCurso(objCurso)) {
                    JOptionPane.showMessageDialog(this, "Se Elimino Correctamente");
                    ListarCurso();
                    limpiarCajas();
                    activaBotones(true, false, false, false);
                    activaCajas(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Verifique que los datos ingresados e intentelo nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ocurrio un problema interno.. Acuda al area de SOPORTE");
                System.out.println("ERROR --> INTERFAZ --> CURSO --> ELIMINAR --> " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreCortoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCortoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreCortoKeyTyped

    private void txtNombreLargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreLargoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreLargoKeyTyped

    private void txtHorasTeoricasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasTeoricasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (txtHorasTeoricas.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHorasTeoricasKeyTyped

    private void txtHorasPracticasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasPracticasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (txtHorasPracticas.getText().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHorasPracticasKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panelEspecialidad;
    private javax.swing.JPanel panelEspecialidad1;
    private javax.swing.JTable tablaListaCurso;
    private javax.swing.JTextField txtCampoBusqueda;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtHorasPracticas;
    private javax.swing.JTextField txtHorasTeoricas;
    private javax.swing.JTextField txtNombreCorto;
    private javax.swing.JTextField txtNombreLargo;
    // End of variables declaration//GEN-END:variables
}
