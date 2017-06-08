/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1.ipc2;

import javax.swing.JOptionPane;

/**
 *
 * @author ErickBernal
 */
public class interfaz_IPC2 extends javax.swing.JFrame {

    /**
     * Creates new form interfaz_IPC2
     */
    int contador_vocales = 0;
    char[] palabra;
    int indice = 0;

    public interfaz_IPC2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textfiel_catetoA = new javax.swing.JTextField();
        textfiel_catetoB = new javax.swing.JTextField();
        textfiel_hipo = new javax.swing.JTextField();
        btn_hipotenusa = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Primer programa");

        textfiel_catetoA.setText("cateto \"a\"");
        textfiel_catetoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfiel_catetoAMouseClicked(evt);
            }
        });
        textfiel_catetoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfiel_catetoAActionPerformed(evt);
            }
        });

        textfiel_catetoB.setText("cateto \"b\"");
        textfiel_catetoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfiel_catetoBMouseClicked(evt);
            }
        });

        textfiel_hipo.setText("hipotenusa");

        btn_hipotenusa.setText("calcular hipotenusa");
        btn_hipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hipotenusaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_hipotenusa))
                    .addComponent(jLabel1)
                    .addComponent(textfiel_catetoA, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfiel_catetoB, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfiel_hipo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfiel_catetoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfiel_catetoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfiel_hipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hipotenusa)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Erick Javier Bernal Orellana");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("201480017");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(391, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//------------------------------PRIMER PROGRAMA--------------------------------------------------------------
    private void btn_hipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hipotenusaActionPerformed
        // TODO add your handling code here:
        int cat1 = 0, cat2 = 0;
        double hipotenusa = 0;
        try {
            cat1 = Integer.parseInt(textfiel_catetoA.getText());
            cat2 = Integer.parseInt(textfiel_catetoB.getText());
            hipotenusa = Math.sqrt(cat1 * cat1 + cat2 * cat2);
            textfiel_hipo.setText("" + hipotenusa);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "indique los catetos del triangulo");
        }

    }//GEN-LAST:event_btn_hipotenusaActionPerformed

    private void textfiel_catetoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfiel_catetoAActionPerformed
        // TODO add your handling code here:
        System.out.println("  botonazo");
    }//GEN-LAST:event_textfiel_catetoAActionPerformed

    private void textfiel_catetoAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfiel_catetoAMouseClicked
        // TODO add your handling code here:
        textfiel_catetoA.setText("");
    }//GEN-LAST:event_textfiel_catetoAMouseClicked

    private void textfiel_catetoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfiel_catetoBMouseClicked
        // TODO add your handling code here:
        textfiel_catetoB.setText("");
    }//GEN-LAST:event_textfiel_catetoBMouseClicked

    public void busca_vocales(int ent) {
        if (ent == 65 || ent == 69 || ent == 73 || ent == 79 || ent == 85 // A-u
                || ent == 97 || ent == 101 || ent == 105 || ent == 111 || ent == 117 || ent == 117 // a-u
                || ent == 237 || ent == 225 || ent == 233 || ent == 243 || ent == 250) {//tiltado
            contador_vocales++;
        }
    }

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
            java.util.logging.Logger.getLogger(interfaz_IPC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz_IPC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz_IPC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz_IPC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz_IPC2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hipotenusa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textfiel_catetoA;
    private javax.swing.JTextField textfiel_catetoB;
    private javax.swing.JTextField textfiel_hipo;
    // End of variables declaration//GEN-END:variables
}
