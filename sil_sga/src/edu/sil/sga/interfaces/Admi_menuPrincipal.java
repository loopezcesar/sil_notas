/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

/**
 *
 * @author Cesar Lopez
 */
public class Admi_menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Admi_menuPrincipal
     */
    public Admi_menuPrincipal() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }
    
    //GENERE TODOS LOS MENU ITEM =D 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemPrincipal = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemAlumno = new javax.swing.JMenuItem();
        menuItemApoderado = new javax.swing.JMenuItem();
        menuItemCurso = new javax.swing.JMenuItem();
        menuItemEspecialidad = new javax.swing.JMenuItem();
        menuItemDocente = new javax.swing.JMenuItem();
        menuItemGrado = new javax.swing.JMenuItem();
        menuItemNivel = new javax.swing.JMenuItem();
        menuItemPeriodo = new javax.swing.JMenuItem();
        menuItemSeccion = new javax.swing.JMenuItem();
        menuItemTipoEvaluacion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jdPrincipalLayout = new javax.swing.GroupLayout(jdPrincipal);
        jdPrincipal.setLayout(jdPrincipalLayout);
        jdPrincipalLayout.setHorizontalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jMenu1.setText("Inicio");

        menuItemPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuItemPrincipal.setText("Principal");
        jMenu1.add(menuItemPrincipal);

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestionar");

        menuItemAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAlumno.setText("Alumno");
        menuItemAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAlumnoActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemAlumno);

        menuItemApoderado.setText("Apoderado");
        menuItemApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemApoderadoActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemApoderado);

        menuItemCurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCurso.setText("Curso");
        menuItemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCursoActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemCurso);

        menuItemEspecialidad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEspecialidad.setText("Especialidad");
        menuItemEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspecialidadActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemEspecialidad);

        menuItemDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuItemDocente.setText("Docente");
        menuItemDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDocenteActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemDocente);

        menuItemGrado.setText("Grado");
        menuItemGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGradoActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemGrado);

        menuItemNivel.setText("Nivel");
        menuItemNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNivelActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemNivel);

        menuItemPeriodo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuItemPeriodo.setText("Periodo");
        menuItemPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPeriodoActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemPeriodo);

        menuItemSeccion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSeccion.setText("Seccion");
        menuItemSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSeccionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemSeccion);

        menuItemTipoEvaluacion.setText("Tipo Evaluacion");
        menuItemTipoEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTipoEvaluacionActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemTipoEvaluacion);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Accesos");

        jMenuItem13.setText("Perfiles");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Usuario");
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        jMenuItem2.setText("Contenito de Ayuda");
        jMenu4.add(jMenuItem2);

        jMenuItem6.setText("Reportar Problemas");
        jMenu4.add(jMenuItem6);

        jMenuItem4.setText("Acerca de SIL SGA");
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspecialidadActionPerformed
        // TODO add your handling code here:
        Admi_especialidadCRUD frm = new Admi_especialidadCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemEspecialidadActionPerformed

    private void menuItemDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDocenteActionPerformed
        // TODO add your handling code here:
        Admi_docenteCRUD frm = new Admi_docenteCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemDocenteActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void menuItemNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNivelActionPerformed
        // TODO add your handling code here:
        Admi_nivelCRUD frm = new Admi_nivelCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemNivelActionPerformed

    private void menuItemSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSeccionActionPerformed
        // TODO add your handling code here:
        Admi_SeccionCRUD frm = new Admi_SeccionCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemSeccionActionPerformed

    private void menuItemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCursoActionPerformed
        Admi_cursoCRUD frm = new Admi_cursoCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemCursoActionPerformed

    private void menuItemGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGradoActionPerformed
        // TODO add your handling code here:
        Admi_GradoCRUD frm = new Admi_GradoCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemGradoActionPerformed

    private void menuItemAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAlumnoActionPerformed
       Admi_alumnoCRUD frm = new Admi_alumnoCRUD();
       jdPrincipal.add(frm);
       frm.setVisible(true);
    }//GEN-LAST:event_menuItemAlumnoActionPerformed

    private void menuItemApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemApoderadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemApoderadoActionPerformed

    private void menuItemPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemPeriodoActionPerformed

    private void menuItemTipoEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTipoEvaluacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemTipoEvaluacionActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login dialog = new Login(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_menuItemSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Admi_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admi_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admi_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admi_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admi_menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JDesktopPane jdPrincipal;
    private javax.swing.JMenuItem menuItemAlumno;
    private javax.swing.JMenuItem menuItemApoderado;
    private javax.swing.JMenuItem menuItemCurso;
    private javax.swing.JMenuItem menuItemDocente;
    private javax.swing.JMenuItem menuItemEspecialidad;
    private javax.swing.JMenuItem menuItemGrado;
    private javax.swing.JMenuItem menuItemNivel;
    private javax.swing.JMenuItem menuItemPeriodo;
    private javax.swing.JMenuItem menuItemPrincipal;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuItem menuItemSeccion;
    private javax.swing.JMenuItem menuItemTipoEvaluacion;
    // End of variables declaration//GEN-END:variables
}
