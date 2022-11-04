
package tptransversal.vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import tptransversal.data.AlumnoData;
import tptransversal.data.InscripcionData;
import tptransversal.data.MateriaData;
import tptransversal.modelo.Alumno;
import tptransversal.modelo.Inscripcion;

public class CargaNotasView extends javax.swing.JInternalFrame {

    private AlumnoData alD;
    private MateriaData maD;
    private ArrayList<Alumno> listaAlumno;
    private InscripcionData insD;
    private DefaultTableModel dtmInscripcion;
    
    public CargaNotasView() {
        dtmInscripcion = new DefaultTableModel(new String[]{"Inscripcion", "Materia", "Nota"}, 0);
        initComponents();
         alD = new AlumnoData();
        insD = new InscripcionData();
        maD = new MateriaData();
        listaAlumno = alD.listarAlumnos();

        for (Alumno alumno : listaAlumno) {
            jCBAlumnos.addItem(alumno);
        }

        jTInscripcion.setModel(dtmInscripcion);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInscripcion = new javax.swing.JTable();
        jBGuardar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jCBAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("CARGA DE NOTAS");

        jTInscripcion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTInscripcion);

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");

        jLabel2.setText("Alumno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(jCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(jBGuardar)
                            .addGap(48, 48, 48)
                            .addComponent(jBCancelar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(jLabel1))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBCancelar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnosActionPerformed
        ArrayList<Inscripcion> listaInscripcion = insD.listarInscripcionAlu((Alumno)jCBAlumnos.getSelectedItem());
        dtmInscripcion.setNumRows(0);
        for (Inscripcion inscripcion : listaInscripcion) {
            dtmInscripcion.addRow(new Object[]{inscripcion.getIdInscripcion(), inscripcion.getIdMateria().getNombreMateria(), inscripcion.getNota()});
        }
        
    }//GEN-LAST:event_jCBAlumnosActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        Inscripcion ins = insD.buscarInscripcion((Integer)dtmInscripcion.getValueAt(jTInscripcion.getSelectedRow(),0));
        ins.setNota(Float.parseFloat(dtmInscripcion.getValueAt(jTInscripcion.getSelectedRow(),2).toString().trim()));
        insD.actualizaInscripcion(ins);
    }//GEN-LAST:event_jBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<Alumno> jCBAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTInscripcion;
    // End of variables declaration//GEN-END:variables
}
