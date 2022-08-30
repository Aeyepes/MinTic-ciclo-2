/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wk03aplicacionformulario;

/**
 *
 * @author user
 */
public class ComboBoxUno extends javax.swing.JFrame {

    /**
     * Creates new form ComboBoxUno
     */
    public ComboBoxUno() {
        initComponents();
        cargarCombo();
    }
    
    public void cargarCombo(){
        JComboBoxPaises.addItem("Seleccione un país");
        JComboBoxPaises.addItem("Colombia");
        JComboBoxPaises.addItem("Brasil");
        JComboBoxPaises.addItem("Argentina");
        JComboBoxPaises.addItem("Ecuador");
        JComboBoxPaises.addItem("Venezuela");
        JComboBoxPaises.addItem("Uruguay");
        JComboBoxPaises.addItem("Paraguay");
        JComboBoxPaises.addItem("Bolivia");
        JComboBoxPaises.addItem("Peru");
        JComboBoxPaises.addItem("Chile");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVolver = new javax.swing.JButton();
        JComboBoxPaises = new javax.swing.JComboBox<>();
        JComboBoxDepartamentos = new javax.swing.JComboBox<>();
        JComboBoxCiudades = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        JComboBoxPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxPaisesActionPerformed(evt);
            }
        });

        JComboBoxDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxDepartamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JComboBoxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JComboBoxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JComboBoxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboBoxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JComboBoxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JComboBoxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(33, 33, 33))
        );

        setBounds(0, 0, 416, 308);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void JComboBoxDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxDepartamentosActionPerformed

    private void JComboBoxPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxPaisesActionPerformed
        JComboBoxCiudades.removeAllItems();
        if(JComboBoxPaises.getSelectedItem()=="Colombia"){
            JComboBoxCiudades.addItem("Seleccione una ciudad");
            JComboBoxCiudades.addItem("Bogota");
            JComboBoxCiudades.addItem("Medellin");
            JComboBoxCiudades.addItem("Cali");
            JComboBoxCiudades.addItem("Barranquilla");
            JComboBoxCiudades.addItem("Cartagena");
        }
        else if (JComboBoxPaises.getSelectedItem()=="Argentina"){
            JComboBoxCiudades.addItem("Seleccione una ciudad");
            JComboBoxCiudades.addItem("Buenos Aires");
            JComboBoxCiudades.addItem("Rosario");
            JComboBoxCiudades.addItem("La plata");
        }
        else if (JComboBoxPaises.getSelectedIndex()==2){
            JComboBoxCiudades.addItem("Seleccione una ciudad");
            JComboBoxCiudades.addItem("Rio de Janeiro");
            JComboBoxCiudades.addItem("Sao Pablo");
            JComboBoxCiudades.addItem("Brasilia");
        }
    }//GEN-LAST:event_JComboBoxPaisesActionPerformed

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
            java.util.logging.Logger.getLogger(ComboBoxUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboBoxUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboBoxUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboBoxUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboBoxUno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboBoxCiudades;
    private javax.swing.JComboBox<String> JComboBoxDepartamentos;
    private javax.swing.JComboBox<String> JComboBoxPaises;
    private javax.swing.JButton jButtonVolver;
    // End of variables declaration//GEN-END:variables
}
