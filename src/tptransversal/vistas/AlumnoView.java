
package tptransversal.vistas;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import tptransversal.data.AlumnoData;
import tptransversal.modelo.Alumno;


public class AlumnoView extends javax.swing.JInternalFrame {

    private Alumno alu = null;
    private AlumnoData alD = new AlumnoData();

    public AlumnoView() {
        initComponents();
        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(false);
        jCBEstado.setSelected(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jCBEstado = new javax.swing.JCheckBox();
        jBBuscar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFDni = new javax.swing.JTextField();
        JDCFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("ALUMNO");

        jCBEstado.setText("Estado");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código");

        jLabel3.setText("Nombre");

        jLabel4.setText("Fecha nacimiento");

        jLabel5.setText("Apellido");

        jLabel6.setText("Dni");

        JDCFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jBActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpiar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBBuscar)
                                .addGap(87, 87, 87))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(185, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTFApellido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNombre)))
                        .addGap(96, 96, 96))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBBuscar)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCBEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBBorrar)
                    .addComponent(jBActualizar)
                    .addComponent(jBLimpiar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            alu = alD.buscarAlumno(Integer.parseInt(jTFCodigo.getText()));
            jTFNombre.setText(alu.getNombre());
            jCBEstado.setSelected(alu.getEstado());
            jTFApellido.setText(alu.getApellido());
            jTFDni.setText(String.valueOf(alu.getDni()));
            JDCFechaNacimiento.setDate(Date.valueOf(alu.getFechaDeNacimiento()));
            jBGuardar.setEnabled(false);
            jBBuscar.setEnabled(false);
            jBActualizar.setEnabled(true);
            jBBorrar.setEnabled(true);
            jTFCodigo.setEnabled(false);
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(this, "El dato ingresado no es valido o no existe");
            jTFCodigo.setText("");
            jTFNombre.setText("");
            jCBEstado.setSelected(false);
            jTFApellido.setText("");
            jTFDni.setText("");
            JDCFechaNacimiento.setCalendar(null);

        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        try {
            alD.borrarAlumno(alu);
            jBGuardar.setEnabled(false);
            jBBuscar.setEnabled(false);
            jBActualizar.setEnabled(true);
            jBBorrar.setEnabled(true);
            jTFCodigo.setEnabled(false);
            jCBEstado.setSelected(false);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "El dato ingresado no es valido o no existe");
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (jTFNombre.getText().length() > 0 && jTFApellido.getText().length() > 0 && JDCFechaNacimiento.getDate() != null) {
            alu = new Alumno();
            alu.setNombre(jTFNombre.getText());
            alu.setEstado(jCBEstado.isSelected());
            alu.setApellido(jTFApellido.getText());
            alu.setDni(Integer.parseInt(jTFDni.getText()));
            alu.setFechaDeNacimiento(LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(JDCFechaNacimiento.getDate())));
            alD.guardarAlumno(alu); //guarda Alumno
            jTFCodigo.setText(String.valueOf(alu.getIdAlumno()));
            jBGuardar.setEnabled(false);
            jBBuscar.setEnabled(false);
            jBActualizar.setEnabled(true);
            jBBorrar.setEnabled(true);
            jTFCodigo.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
         if (jTFNombre.getText().length() > 0 || jTFApellido.getText().length() > 0 && JDCFechaNacimiento.getDate() != null) {
            alu = new Alumno();
            alu.setIdAlumno(Integer.parseInt(jTFCodigo.getText()));
            alu.setNombre(jTFNombre.getText());
            alu.setEstado(jCBEstado.isSelected());
            alu.setApellido(jTFApellido.getText());
            alu.setDni(Integer.parseInt(jTFDni.getText()));
            alu.setFechaDeNacimiento(LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(JDCFechaNacimiento.getDate())));
            jBGuardar.setEnabled(false);
            jBBuscar.setEnabled(false);
            jBActualizar.setEnabled(true);
            jBBorrar.setEnabled(true);
            jTFCodigo.setEnabled(false);
            alD.actualizarAlumno(alu);
        }else{
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios");
        }

    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        alu = null;
        jBGuardar.setEnabled(true);
        jBBuscar.setEnabled(true);
        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(false);
        jCBEstado.setSelected(true);
        jTFCodigo.setEnabled(true);
        jTFNombre.setText("");
        jTFCodigo.setText("");
        jTFApellido.setText("");
        jTFDni.setText("");
        JDCFechaNacimiento.setCalendar(null);
    }//GEN-LAST:event_jBLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDCFechaNacimiento;
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JCheckBox jCBEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
