/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estructuras;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import estructuras.Dependencia;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author cgabo
 */
public class RegistrarMovimiento extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarMovimiento
     */
    public RegistrarMovimiento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregarMovimiento = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtIdExpediente = new javax.swing.JTextField();
        btnVerUltimo = new javax.swing.JButton();
        btnQuitarUltimo = new javax.swing.JButton();
        btnVerTodos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDependencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID del Expediente: ");

        jLabel2.setText("Descripción: ");

        btnAgregarMovimiento.setText("Agregar movimiento");
        btnAgregarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMovimientoActionPerformed(evt);
            }
        });

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        txtIdExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdExpedienteActionPerformed(evt);
            }
        });

        btnVerUltimo.setText("Ver Ultimo");
        btnVerUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerUltimoActionPerformed(evt);
            }
        });

        btnQuitarUltimo.setText("Quitar Ultimo");
        btnQuitarUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarUltimoActionPerformed(evt);
            }
        });

        btnVerTodos.setText("Ver Todos");
        btnVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodosActionPerformed(evt);
            }
        });

        jLabel4.setText("Dependencia:");

        txtDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDependenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnQuitarUltimo))
                    .addComponent(btnAgregarMovimiento, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVerTodos)
                    .addComponent(btnVerUltimo))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txtDependencia))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMovimiento)
                    .addComponent(btnVerUltimo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuitarUltimo)
                    .addComponent(btnVerTodos))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMovimientoActionPerformed
        String idExpediente = txtIdExpediente.getText().trim();
        String descripcion = txtDescripcion.getText().trim();
        String dependencia = txtDependencia.getText().trim(); // <- Campo agregado

        if (idExpediente.isEmpty() || descripcion.isEmpty() || dependencia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
            return;
        }

        Expediente expediente = GestorTramites.buscarExpedientePorId(idExpediente);
        if (expediente == null) {
            JOptionPane.showMessageDialog(this, "⚠ No se encontró el expediente con ID: " + idExpediente);
            return;
        }

        Movimiento movimiento = new Movimiento(descripcion, dependencia);
        expediente.getMovimientos().push(movimiento);

// Registrar en la ruta de dependencia
        Dependencia dependenciaObj = new Dependencia(dependencia);
        expediente.agregarDependencia(dependenciaObj);

        ListaEnlazada<Expediente> lista = GestorTramites.rutasDependencias.get(dependencia);
        if (lista == null) {
            lista = new ListaEnlazada<>();
            GestorTramites.rutasDependencias.put(dependencia, lista);
        }
        lista.insertarFinal(expediente);

        JOptionPane.showMessageDialog(this, "✅ Movimiento registrado correctamente.");

// Limpiar los campos
        txtDescripcion.setText("");
        txtDependencia.setText("");
        txtIdExpediente.setText("");
    }//GEN-LAST:event_btnAgregarMovimientoActionPerformed

    private void txtIdExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdExpedienteActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosActionPerformed
        StringBuilder sb = new StringBuilder("📋 TODOS LOS MOVIMIENTOS REGISTRADOS:\n\n");

        // Revisar colas en trámite (alta, media, baja)
        for (Queue_LL<Expediente> cola : List.of(
                GestorTramites.colaAlta,
                GestorTramites.colaMedia,
                GestorTramites.colaBaja)) {

            Queue_LL<Expediente>.Node actual = cola.getFront();
            while (actual != null) {
                Expediente exp = actual.data;
                java.util.List<Movimiento> movimientos = exp.getMovimientos().getTodosLosElementos();
                if (!movimientos.isEmpty()) {
                    sb.append("📁 EXPEDIENTE: ").append(exp.getId()).append("\n");
                    Collections.reverse(movimientos); // ⬅ Invertimos el orden para mostrar como pila
                    for (Movimiento mov : movimientos) {
                        sb.append("  - ").append(mov.toString()).append("\n");
                    }
                    sb.append("-------------------------\n");
                }
                actual = actual.next;
            }
        }

        // Revisar expedientes finalizados
        Nodo<Expediente> nodo = GestorTramites.expedientesFinalizados.getHead();
        while (nodo != null) {
            Expediente exp = nodo.getClave();
            java.util.List<Movimiento> movimientos = exp.getMovimientos().getTodosLosElementos();
            if (!movimientos.isEmpty()) {
                sb.append("📁 EXPEDIENTE (Finalizado): ").append(exp.getId()).append("\n");
                Collections.reverse(movimientos); // ⬅ También invertimos aquí
                for (Movimiento mov : movimientos) {
                    sb.append("  - ").append(mov.toString()).append("\n");
                }
                sb.append("-------------------------\n");
            }
            nodo = nodo.getSiguiente();
        }

        // Mostrar mensaje si no hay movimientos
        if (sb.toString().equals("📋 TODOS LOS MOVIMIENTOS REGISTRADOS:\n\n")) {
            sb.append("⚠ No hay movimientos registrados.");
        }

        // Mostrar en un JScrollPane
        JTextArea area = new JTextArea(sb.toString());
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new java.awt.Dimension(550, 400));
        JOptionPane.showMessageDialog(this, scroll, "Movimientos de Todos los Expedientes", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnVerTodosActionPerformed

    private void btnVerUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerUltimoActionPerformed
        Expediente exp = GestorTramites.getUltimoExpedienteRegistrado();
        if (exp == null) {
            JOptionPane.showMessageDialog(this, "⚠ No hay expedientes registrados.");
            return;
        }

        Movimiento ult = exp.getUltimoMovimiento();
        if (ult == null) {
            JOptionPane.showMessageDialog(this, "⚠ El expediente no tiene movimientos.");
            return;
        }

        JOptionPane.showMessageDialog(this, "📌 Último movimiento de " + exp.getId() + ":\n" + ult.toString());

    }//GEN-LAST:event_btnVerUltimoActionPerformed

    private void btnQuitarUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarUltimoActionPerformed
        Expediente exp = GestorTramites.getUltimoExpedienteRegistrado();
        if (exp == null) {
            JOptionPane.showMessageDialog(this, "⚠️ No hay expedientes registrados.");
            return;
        }

        Movimiento quitado = exp.quitarUltimoMovimiento();
        if (quitado == null) {
            JOptionPane.showMessageDialog(this, "⚠️ No hay movimientos para quitar en " + exp.getId());
        } else {
            JOptionPane.showMessageDialog(this, "🗑️ Movimiento eliminado de " + exp.getId() + ":\n" + quitado.toString());
        }
    }//GEN-LAST:event_btnQuitarUltimoActionPerformed

    private void txtDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDependenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDependenciaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarMovimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMovimiento;
    private javax.swing.JButton btnQuitarUltimo;
    private javax.swing.JButton btnVerTodos;
    private javax.swing.JButton btnVerUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDependencia;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdExpediente;
    // End of variables declaration//GEN-END:variables
}
