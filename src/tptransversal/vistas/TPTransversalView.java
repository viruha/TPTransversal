

package tptransversal.vistas;


import com.formdev.flatlaf.IntelliJTheme;

public class TPTransversalView extends javax.swing.JFrame {

    public TPTransversalView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDP = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMArchivo = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenuItem();
        jMMaterias = new javax.swing.JMenu();
        jMFormularioMaterias = new javax.swing.JMenuItem();
        jMAlumnos = new javax.swing.JMenu();
        jMFormularioAlumnos = new javax.swing.JMenuItem();
        jMInscripciones = new javax.swing.JMenu();
        jMManejoInscripciones = new javax.swing.JMenuItem();
        jMCargaNotas = new javax.swing.JMenu();
        jMManipulacionNotas = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMListadoAlumnosXMateria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDPLayout = new javax.swing.GroupLayout(jDP);
        jDP.setLayout(jDPLayout);
        jDPLayout.setHorizontalGroup(
            jDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        jDPLayout.setVerticalGroup(
            jDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        jMArchivo.setText("Archivo");

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMArchivo.add(jMSalir);

        jMenuBar1.add(jMArchivo);

        jMMaterias.setText("Materias");

        jMFormularioMaterias.setText("Formulario de Materias");
        jMFormularioMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioMateriasActionPerformed(evt);
            }
        });
        jMMaterias.add(jMFormularioMaterias);

        jMenuBar1.add(jMMaterias);

        jMAlumnos.setText("Alumnos");

        jMFormularioAlumnos.setText("Formulario de alumnos");
        jMFormularioAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioAlumnosActionPerformed(evt);
            }
        });
        jMAlumnos.add(jMFormularioAlumnos);

        jMenuBar1.add(jMAlumnos);

        jMInscripciones.setText("Inscripciones");

        jMManejoInscripciones.setText("Manejo de inscripciones");
        jMManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMManejoInscripcionesActionPerformed(evt);
            }
        });
        jMInscripciones.add(jMManejoInscripciones);

        jMenuBar1.add(jMInscripciones);

        jMCargaNotas.setText("Carga de notas");

        jMManipulacionNotas.setText("Manipulaci??n de notas");
        jMManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMManipulacionNotasActionPerformed(evt);
            }
        });
        jMCargaNotas.add(jMManipulacionNotas);

        jMenuBar1.add(jMCargaNotas);

        jMConsultas.setText("Consultas");

        jMListadoAlumnosXMateria.setText("Listado de alumnos x materia");
        jMListadoAlumnosXMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListadoAlumnosXMateriaActionPerformed(evt);
            }
        });
        jMConsultas.add(jMListadoAlumnosXMateria);

        jMenuBar1.add(jMConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDP)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMFormularioMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioMateriasActionPerformed
        jDP.removeAll();
        jDP.repaint();
        MateriasView Materias_view = new MateriasView();
        Materias_view.setVisible(true);
        jDP.add(Materias_view);
        jDP.moveToFront(Materias_view); 
    }//GEN-LAST:event_jMFormularioMateriasActionPerformed

    private void jMFormularioAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioAlumnosActionPerformed
        jDP.removeAll();
        jDP.repaint();
        AlumnoView Alumno_view = new AlumnoView();
        Alumno_view.setVisible(true);
        jDP.add(Alumno_view);
        jDP.moveToFront(Alumno_view); 
    }//GEN-LAST:event_jMFormularioAlumnosActionPerformed

    private void jMManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMManejoInscripcionesActionPerformed
        jDP.removeAll();
        jDP.repaint();
        InscripcionView Inscripcion_view = new InscripcionView();
        Inscripcion_view.setVisible(true);
        jDP.add(Inscripcion_view);
        jDP.moveToFront(Inscripcion_view); 
    }//GEN-LAST:event_jMManejoInscripcionesActionPerformed

    private void jMManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMManipulacionNotasActionPerformed
        jDP.removeAll();
        jDP.repaint();
        CargaNotasView notas_view = new CargaNotasView();
        notas_view.setVisible(true);
        jDP.add(notas_view);
        jDP.moveToFront(notas_view); 
    }//GEN-LAST:event_jMManipulacionNotasActionPerformed

    private void jMListadoAlumnosXMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListadoAlumnosXMateriaActionPerformed
        jDP.removeAll();
        jDP.repaint();
        AlumnosMateriasView alMa_view = new AlumnosMateriasView();
        alMa_view.setVisible(true);
        jDP.add(alMa_view);
        jDP.moveToFront(alMa_view); 
    }//GEN-LAST:event_jMListadoAlumnosXMateriaActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TPTransversalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPTransversalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPTransversalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPTransversalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        IntelliJTheme.setup(TPTransversalView.class.getResourceAsStream("/librerias/Atom One Light Contrast.theme.json"));
        javax.swing.UIManager.put( "Component.focusWidth", 0 );
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPTransversalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDP;
    private javax.swing.JMenu jMAlumnos;
    private javax.swing.JMenu jMArchivo;
    private javax.swing.JMenu jMCargaNotas;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenuItem jMFormularioAlumnos;
    private javax.swing.JMenuItem jMFormularioMaterias;
    private javax.swing.JMenu jMInscripciones;
    private javax.swing.JMenuItem jMListadoAlumnosXMateria;
    private javax.swing.JMenuItem jMManejoInscripciones;
    private javax.swing.JMenuItem jMManipulacionNotas;
    private javax.swing.JMenu jMMaterias;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
