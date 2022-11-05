package tptransversal.vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import tptransversal.data.AlumnoData;
import tptransversal.data.InscripcionData;
import tptransversal.data.MateriaData;
import tptransversal.modelo.Alumno;
import tptransversal.modelo.Inscripcion;
import tptransversal.modelo.Materia;

public class AlumnosMateriasView extends javax.swing.JInternalFrame {
    
    private AlumnoData alD;
    private MateriaData maD;
    private ArrayList<Materia> listaMateria;
    private InscripcionData insD;
    private DefaultTableModel dtmInscripcion;
    
    public AlumnosMateriasView() {
        dtmInscripcion = new DefaultTableModel(new String[]{"Inscripcion", "Alumno", "Nota"}, 0);
        initComponents();
        alD = new AlumnoData();
        insD = new InscripcionData();
        maD = new MateriaData();
        listaMateria = maD.listarMaterias();
        for (Materia materia : listaMateria) {
            jCBMaterias.addItem(materia);
        }
        
        jTInscripcion.setModel(dtmInscripcion);
        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCBMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInscripcion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("ALUMNOS POR MATERIAS");

        jCBMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMateriasActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jCBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMateriasActionPerformed
        ArrayList<Inscripcion> listaInscripcion = insD.listarInscripcionMat((Materia) jCBMaterias.getSelectedItem());
        dtmInscripcion.setNumRows(0);
        for (Inscripcion inscripcion : listaInscripcion) {
            dtmInscripcion.addRow(new Object[]{inscripcion.getIdInscripcion(), inscripcion.getIdAlumno().getNombre() + " " + inscripcion.getIdAlumno().getApellido(), inscripcion.getNota()});
            
        }

    }//GEN-LAST:event_jCBMateriasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> jCBMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTInscripcion;
    // End of variables declaration//GEN-END:variables
}
