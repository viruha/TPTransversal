
package tptransversal.vistas;

import javax.swing.JOptionPane;
import tptransversal.data.MateriaData;
import tptransversal.modelo.Materia;


public class MateriasView extends javax.swing.JInternalFrame {

    private Materia mat = null;
    MateriaData maD = new MateriaData();

    public MateriasView() {
        initComponents();
        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(false);
        jCBEstado.setSelected(true);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTFAnio = new javax.swing.JTextField();
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

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("MATERIAS");

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

        jLabel4.setText("Año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(jBBuscar)
                                .addGap(31, 31, 31))
                            .addComponent(jTFNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBEstado)
                                    .addComponent(jTFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jBGuardar)
                            .addGap(18, 18, 18)
                            .addComponent(jBBorrar)
                            .addGap(18, 18, 18)
                            .addComponent(jBActualizar)
                            .addGap(18, 18, 18)
                            .addComponent(jBLimpiar))))
                .addGap(23, 23, 23))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBEstado)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBBorrar)
                    .addComponent(jBActualizar)
                    .addComponent(jBLimpiar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            mat = maD.buscarMateria(Integer.parseInt(jTFCodigo.getText()));
            jTFNombre.setText(mat.getNombreMateria());
            jTFAnio.setText(mat.getAnio());
            jCBEstado.setSelected(mat.getEstado());
            jBGuardar.setEnabled(false);
            jBBuscar.setEnabled(false);
            jBActualizar.setEnabled(true);
            jBBorrar.setEnabled(true);
            jTFCodigo.setEnabled(false);
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(this, "El dato ingresado no es valido o no existe");
            jTFCodigo.setText("");
            jTFNombre.setText("");
            jTFAnio.setText("");
            jCBEstado.setSelected(false);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        try {
            maD.borrarMateria(mat);
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
        if (jTFNombre.getText().length() > 0 && jTFAnio.getText().length() > 0) {
            mat = new Materia();
            mat.setNombreMateria(jTFNombre.getText());
            mat.setAnio(jTFAnio.getText());
            mat.setEstado(jCBEstado.isSelected());
            maD.guardarMateria(mat); //guarda materia
            jTFCodigo.setText(String.valueOf(mat.getIdMateria()));
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
        if (jTFNombre.getText().length() > 0 && jTFAnio.getText().length() > 0) {
            mat.setNombreMateria(jTFNombre.getText());
            mat.setAnio(jTFAnio.getText());
            mat.setEstado(jCBEstado.isSelected());
            jBGuardar.setEnabled(false);
            jBBuscar.setEnabled(false);
            jBActualizar.setEnabled(true);
            jBBorrar.setEnabled(true);
            jTFCodigo.setEnabled(false);
            maD.actualizarMateria(mat);
        }else{
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios");
        }
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        mat = null;
        jBGuardar.setEnabled(true);
        jBBuscar.setEnabled(true);
        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(false);
        jCBEstado.setSelected(true);
        jTFCodigo.setEnabled(true);
        jTFNombre.setText("");
        jTFAnio.setText("");
        jTFCodigo.setText("");
    }//GEN-LAST:event_jBLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField jTFAnio;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
