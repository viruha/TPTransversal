package tptransversal.vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tptransversal.data.AlumnoData;
import tptransversal.data.InscripcionData;
import tptransversal.data.MateriaData;
import tptransversal.modelo.Alumno;
import tptransversal.modelo.Inscripcion;
import tptransversal.modelo.Materia;

public class InscripcionView extends javax.swing.JInternalFrame {

    private AlumnoData alD;
    private MateriaData maD;
    private ArrayList<Alumno> listaAlumno;
    private InscripcionData insD;
    private DefaultTableModel dtmMaterias;

    public InscripcionView() {
        initComponents();
        alD = new AlumnoData();
        insD = new InscripcionData();
        maD = new MateriaData();
        listaAlumno = alD.listarAlumnos();

        for (Alumno alumno : listaAlumno) {
            jCBAlumnos.addItem(alumno);
        }
        dtmMaterias = new DefaultTableModel(new String[]{"Código", "Materia", "Año"}, 0);
        jTMaterias.setModel(dtmMaterias);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jCBAlumnos = new javax.swing.JComboBox<>();
        jRBNoInscriptas = new javax.swing.JRadioButton();
        jRBInscriptas = new javax.swing.JRadioButton();
        jBInscribir = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBDesinscribir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMaterias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Inscripciones");

        buttonGroup1.add(jRBNoInscriptas);
        jRBNoInscriptas.setText("No Inscriptas");
        jRBNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNoInscriptasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBInscriptas);
        jRBInscriptas.setText("Inscriptas");
        jRBInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBInscriptasActionPerformed(evt);
            }
        });

        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");

        jBDesinscribir.setText("Anular inscirpción");
        jBDesinscribir.setEnabled(false);
        jBDesinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesinscribirActionPerformed(evt);
            }
        });

        jTMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTMaterias);

        jLabel2.setText("Alumnos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRBInscriptas)
                                        .addGap(113, 113, 113)
                                        .addComponent(jRBNoInscriptas))
                                    .addComponent(jCBAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jBInscribir)
                .addGap(74, 74, 74)
                .addComponent(jBDesinscribir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNoInscriptas)
                    .addComponent(jRBInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBDesinscribir)
                    .addComponent(jBSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInscriptasActionPerformed
        jBDesinscribir.setEnabled(true);
        jBInscribir.setEnabled(false);
        dtmMaterias.setNumRows(0);
        ArrayList<Materia> inscriptas = insD.obtenerMateriasInscriptas((Alumno) jCBAlumnos.getSelectedItem());
        for (Materia materia : inscriptas) {
            dtmMaterias.addRow(new Object[]{materia.getIdMateria(), materia.getNombreMateria(), materia.getAnio()});
        }
    }//GEN-LAST:event_jRBInscriptasActionPerformed

    private void jRBNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNoInscriptasActionPerformed
        jBDesinscribir.setEnabled(false);
        jBInscribir.setEnabled(true);
        dtmMaterias.setNumRows(0);
        ArrayList<Materia> inscriptas = insD.obtenerMateriasNoInscriptas((Alumno) jCBAlumnos.getSelectedItem());
        for (Materia materia : inscriptas) {
            dtmMaterias.addRow(new Object[]{materia.getIdMateria(), materia.getNombreMateria(), materia.getAnio()});
        }
    }//GEN-LAST:event_jRBNoInscriptasActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        if (jTMaterias.getSelectedRow() != -1) {
            Alumno alu = (Alumno) jCBAlumnos.getSelectedItem();
            Materia mat = maD.buscarMateria((Integer) dtmMaterias.getValueAt(jTMaterias.getSelectedRow(), 0));
            if (alu != null && mat != null) {
                Inscripcion ins = new Inscripcion(alu, mat, 0);
                insD.guardarInscripcion(ins);
                jRBNoInscriptasActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Corrobore que tiene un alumno y materia seleccionados");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia de la lista");
        }


    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBDesinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesinscribirActionPerformed
        if (jTMaterias.getSelectedRow() != -1) {
            Alumno alu = (Alumno) jCBAlumnos.getSelectedItem();
            Materia mat = maD.buscarMateria((Integer) dtmMaterias.getValueAt(jTMaterias.getSelectedRow(), 0));
            if (alu != null && mat != null) {
                Inscripcion ins = insD.buscarInscripcionAluMAt(alu, mat);
                insD.borrarInscripcion(ins.getIdInscripcion());
                jRBInscriptasActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Corrobore que tiene un alumno y materia seleccionados");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia de la lista");
        }
    }//GEN-LAST:event_jBDesinscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBDesinscribir;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Alumno> jCBAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRBInscriptas;
    private javax.swing.JRadioButton jRBNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMaterias;
    // End of variables declaration//GEN-END:variables
}
