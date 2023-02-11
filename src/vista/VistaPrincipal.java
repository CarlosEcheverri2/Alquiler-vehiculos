
package vista;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.*;


public class VistaPrincipal extends javax.swing.JFrame {

    ArrayList<VehiculoCarga> listCarga = new ArrayList(2);
    ArrayList<VehiculoTransporte> listTransporte = new ArrayList(2);

    public VistaPrincipal() {
        initComponents();

        VehiculoCarga carga1 = new VehiculoCarga("WTQ420", "Turbo", "furgoneta", 15);
        VehiculoCarga carga3 = new VehiculoCarga("ALE377", "JAC", "furgoneta", 10);
        VehiculoCarga carga2 = new VehiculoCarga("SWA612", "Dobletroke", "camion", 25);
        VehiculoCarga carga4 = new VehiculoCarga("WTG888", "Quick", "camion", 25);
        VehiculoTransporte coche1 = new VehiculoTransporte("HLA312", "Sandeto", "coche");
        VehiculoTransporte coche2 = new VehiculoTransporte("UUF914", "buseton", "microbuseta");
        VehiculoTransporte coche3 = new VehiculoTransporte("LIF914", "gol", "coche");
        VehiculoTransporte coche4 = new VehiculoTransporte("ACH852", "Volare", "microbuseta");

        listCarga.add(carga1);
        listCarga.add(carga2);
        listCarga.add(carga3);
        listCarga.add(carga4);
        listTransporte.add(coche1);
        listTransporte.add(coche2);
        listTransporte.add(coche3);
        listTransporte.add(coche4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SltTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        FldDias = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnCalcular = new javax.swing.JButton();
        FldResult = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SltCaracteristica = new javax.swing.JComboBox<>();
        SltCarro = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FldMatricula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        SltTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SltTipoActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo");

        FldDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FldDiasActionPerformed(evt);
            }
        });

        jLabel2.setText("Carro");

        BtnCalcular.setText("Consultar");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        FldResult.setEditable(false);
        FldResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FldResultActionPerformed(evt);
            }
        });

        jLabel3.setText("Caracteristica");

        SltCaracteristica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carga", "Transporte", "" }));
        SltCaracteristica.setSelectedIndex(2);
        SltCaracteristica.setToolTipText("");
        SltCaracteristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SltCaracteristicaActionPerformed(evt);
            }
        });

        SltCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SltCarroActionPerformed(evt);
            }
        });

        jLabel4.setText("Dias de alquiler");

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("CALCULADORA DE ALQUILER DE VEHICULOS");

        jLabel6.setText("Costo:");

        FldMatricula.setEditable(false);
        FldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FldMatriculaActionPerformed(evt);
            }
        });

        jLabel7.setText("Matricula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(FldResult, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SltTipo, 0, 194, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(FldDias, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(SltCaracteristica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SltCarro, 0, 194, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(BtnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(265, 265, 265))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SltCaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SltTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SltCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FldDias, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCalcular)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FldResult, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SltTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SltTipoActionPerformed

        SltCarro.removeAllItems();
        FldDias.setText("");
        FldResult.setText("");
        
        try {

            String tipo = SltTipo.getSelectedItem().toString();
            String caracteristica = SltCaracteristica.getSelectedItem().toString();

            if (caracteristica.equals("Carga")) {
                for (VehiculoCarga vehiculo : listCarga) {

                    if (vehiculo.getTipo() == tipo) {
                        SltCarro.addItem(vehiculo.getModelo());
                    }
                }
            } else {
                for (VehiculoTransporte vehiculo : listTransporte) {
                    if (vehiculo.getTipo() == tipo) {
                        SltCarro.addItem(vehiculo.getModelo());
                    }
                }
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_SltTipoActionPerformed

    private void FldDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FldDiasActionPerformed

    }//GEN-LAST:event_FldDiasActionPerformed

    private void SltCaracteristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SltCaracteristicaActionPerformed
        String caracteristica = SltCaracteristica.getSelectedItem().toString();
        SltTipo.removeAllItems();
        FldDias.setText("");
        FldResult.setText("");

        if (caracteristica == "Carga") {
            SltTipo.addItem("");
            SltTipo.addItem("furgoneta");
            SltTipo.addItem("camion");
        }

        if (caracteristica == "Transporte") {
            SltTipo.addItem("");
            SltTipo.addItem("microbuseta");
            SltTipo.addItem("coche");
        }

    }//GEN-LAST:event_SltCaracteristicaActionPerformed

    private void SltCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SltCarroActionPerformed
        try {
            String carro = SltCarro.getSelectedItem().toString();
            String caracteristica = SltCaracteristica.getSelectedItem().toString();
            if (caracteristica.equals("Carga")) {
                for (VehiculoCarga vehiculo : listCarga) {

                    if (vehiculo.getModelo()== carro) {
                        FldMatricula.setText(vehiculo.getMatricula());
                    }
                }
            } else {
                for (VehiculoTransporte vehiculo : listTransporte) {
                    if (vehiculo.getModelo()== carro) {
                         FldMatricula.setText(vehiculo.getMatricula());
                    }
                }
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_SltCarroActionPerformed

    private void FldResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FldResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FldResultActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed

        String caracteristica = SltCaracteristica.getSelectedItem().toString();
        //String tipo = SltTipo.getSelectedItem().toString();
        String carro = SltCarro.getSelectedItem().toString();
        String dias = FldDias.getText();
        int numDias;

        try {
            numDias = Integer.parseInt(dias);
            DecimalFormat df = new DecimalFormat("#.00");
            if (caracteristica.equals("Carga")) {
                for (VehiculoCarga vehiculo : listCarga) {
                    if (vehiculo.getModelo() == carro) {
                            String value = df.format(vehiculo.calcularCosto(numDias));
                            FldResult.setText("$ "+ value);
                    }
                }
            } else {
                for (VehiculoTransporte vehiculo : listTransporte) {
                    if (vehiculo.getModelo() == carro) {                                                 
                            String value = df.format(vehiculo.calcularCosto(numDias));
                            FldResult.setText("$ "+ value);
                    }
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El campo Dias de alquiler esta vacio o su valor no es numerico");
        }
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void FldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FldMatriculaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JTextField FldDias;
    private javax.swing.JTextField FldMatricula;
    private javax.swing.JTextField FldResult;
    private javax.swing.JComboBox<String> SltCaracteristica;
    private javax.swing.JComboBox<String> SltCarro;
    private javax.swing.JComboBox<String> SltTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
