/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.ClaseDAO;
import edu.sil.sga.dao.PeriodoDAO;
import edu.sil.sga.dao.TipoEvaluacionDAO;
import edu.sil.sga.entidades.Clase;
import edu.sil.sga.entidades.Docente;
import edu.sil.sga.entidades.Periodo;
import edu.sil.sga.entidades.TipoEvaluacion;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo Lopez
 */
public class Docente_seleccionarClase extends javax.swing.JInternalFrame {

    /**
     * Creates new form Docente_seleccionarClase
     */
    Docente docente = new Docente();
    public List<Clase> listaDeClasesPorDocente;
    public List<Periodo> listaDePeriodos;
    public List<TipoEvaluacion> listaDeTipoEvaluacion;
    Clase objClaseSeleccionada;
    JDesktopPane jdPrincipalDocente;

    public Docente_seleccionarClase(Docente objDocente, JDesktopPane jdPrincipalDocente) {
        setLocation(280, 50);
        this.docente = objDocente;
        initComponents();
        CargarPeriodo();
        CargarTipoNota();
        ListarClasesPorDocente();
        this.jdPrincipalDocente = jdPrincipalDocente;
    }

    void CargarPeriodo() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            listaDePeriodos = new PeriodoDAO().ListarPeriodo();
            for (Periodo objEspecialidad : listaDePeriodos) {
                model.addElement(objEspecialidad.getDescripcion());
            }
            cboPeriodo.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
            System.out.println("Error:  Cargar Periodo" + e.getMessage());
            e.printStackTrace();

        }
    }

    void CargarTipoNota() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            listaDeTipoEvaluacion = new TipoEvaluacionDAO().ListarTipoEvaluacion();
            for (TipoEvaluacion objTipoEvaluacion : listaDeTipoEvaluacion) {
                model.addElement(objTipoEvaluacion.getDescripcion());
            }
            cboTipoNota.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
            System.out.println("Error: Carga TipoEvaluacion" + e.getMessage());
            e.printStackTrace();

        }
    }

    void ListarClasesPorDocente() {
        try {
            ClaseDAO dao = new ClaseDAO();
            //docente.setId(Integer.parseInt(txtIdDocente.getText()));

            listaDeClasesPorDocente = dao.ListarClasesPorDocente(docente);
            DefaultTableModel modelo1 = new DefaultTableModel();

            //modelo1.addColumn("id");
            modelo1.addColumn("Curso");
            modelo1.addColumn("Grado");
            modelo1.addColumn("Seccion");

            for (Clase clase : listaDeClasesPorDocente) {
                modelo1.addRow(new String[]{
                    //objDocente.getId() + "",
                    clase.getCursoGrado().getCurso().getNombreLargo() + "",
                    clase.getCursoGrado().getGrado().getnumeroGrado() + "",
                    clase.getCursoGrado().getGrado().getSeccion().getDescripcion() + ""
                //objDocente.getDni() + "", //objDocente.getTelefono() + "",
                //objDocente.getMovil() + "",
                //objDocente.getEmail() + "",
                //objDocente.getEspecialidad().getDescripcion()
                });
            }

            tblClases.setModel(modelo1);

        } catch (Exception e) {
            System.out.println("error --> interfaz --> docente --> listar");
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
        tblClases = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        cboTipoNota = new javax.swing.JComboBox();
        txtGrado = new javax.swing.JTextField();
        txtNivel = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtSeccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboPeriodo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btnIngresarNota = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("I.E.P San Ignacio de Loyola - Gestionar Nota");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Clase"));

        tblClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Alex Chavez", "10"},
                {"Sandra Marin", "12"},
                {"Pedro Ramos", "14"},
                {"Junior Andrade", "12"},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {"XXX", null},
                {null, null}
            },
            new String [] {
                "curso", "grado"
            }
        ));
        tblClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClasesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClases);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Curso", "Grado" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Clase"));

        txtGrado.setEditable(false);

        txtNivel.setEditable(false);

        txtCurso.setEditable(false);

        txtSeccion.setEditable(false);

        jLabel5.setText("Nivel:");

        jLabel6.setText("Grado:");

        jLabel9.setText("Seccion:");

        jLabel7.setText("Curso:");

        jLabel3.setText("Trimestre: ");

        jLabel8.setText("Tipo Nota:");

        cboPeriodo.setEditable(true);
        cboPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboTipoNota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCurso)
                            .addComponent(txtSeccion)
                            .addComponent(cboPeriodo, 0, 120, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Gestionar Nota");

        btnIngresarNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnActualizar.png"))); // NOI18N
        btnIngresarNota.setText(" Ingresar Notas");
        btnIngresarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel4)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIngresarNota)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClasesMouseClicked
        // TODO add your handling code here:
        int fila = tblClases.getSelectedRow();
        if (fila != -1) {

            objClaseSeleccionada = listaDeClasesPorDocente.get(fila);

            txtNivel.setText(objClaseSeleccionada.getCursoGrado().getGrado().getNivel().getNombreLargo());
            txtGrado.setText(objClaseSeleccionada.getCursoGrado().getGrado().getnumeroGrado());
            txtSeccion.setText(objClaseSeleccionada.getCursoGrado().getGrado().getSeccion().getDescripcion());
            txtCurso.setText(objClaseSeleccionada.getCursoGrado().getCurso().getNombreLargo());

        }
    }//GEN-LAST:event_tblClasesMouseClicked

    private void btnIngresarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNotaActionPerformed
        // TODO add your handling code here:
        if (txtGrado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Grado ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            TipoEvaluacion tipoEval = new TipoEvaluacion();
            Periodo periodo = new Periodo();

            tipoEval = listaDeTipoEvaluacion.get(cboTipoNota.getSelectedIndex());
            periodo = listaDePeriodos.get(cboPeriodo.getSelectedIndex());

            //
            Docente_IngresarNotaClase ventana = new Docente_IngresarNotaClase(docente, objClaseSeleccionada, tipoEval, periodo, jdPrincipalDocente);
            this.getParent().add(ventana);
            ventana.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnIngresarNotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarNota;
    private javax.swing.JComboBox cboPeriodo;
    private javax.swing.JComboBox cboTipoNota;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblClases;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtSeccion;
    // End of variables declaration//GEN-END:variables
}
