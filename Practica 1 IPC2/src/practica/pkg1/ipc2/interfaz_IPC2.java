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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textfiel_palabra = new javax.swing.JTextField();
        btn_palabra = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textfiel_nombre = new javax.swing.JTextField();
        textfiel_apellido = new javax.swing.JTextField();
        btn_tercerPrograma = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Segundo Programa");

        jLabel3.setText("calcula si una palabra cuenta");

        jLabel4.setText("con 5 vocales con o sin acento");

        textfiel_palabra.setText("Ingrese palabra");
        textfiel_palabra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfiel_palabraMouseClicked(evt);
            }
        });

        btn_palabra.setText("comprobar");
        btn_palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_palabraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfiel_palabra)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btn_palabra)))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(textfiel_palabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_palabra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tercer Programa");

        textfiel_nombre.setText("Ingrese un Nombre");
        textfiel_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfiel_nombreMouseClicked(evt);
            }
        });
        textfiel_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfiel_nombreActionPerformed(evt);
            }
        });

        textfiel_apellido.setText("Ingrese un Apellido");
        textfiel_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfiel_apellidoMouseClicked(evt);
            }
        });

        btn_tercerPrograma.setText("cambiar orden ");
        btn_tercerPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tercerProgramaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("..............................");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("...............................");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(textfiel_nombre)
                    .addComponent(textfiel_apellido)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btn_tercerPrograma)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(textfiel_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textfiel_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(btn_tercerPrograma)
                .addGap(10, 10, 10))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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

//---------------------------SEGUNDO PROGRAMA------------------------------------------------------------------------------
    private void btn_palabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_palabraActionPerformed
        // TODO add your handling code here:
        indice = 0;
        contador_vocales = 0;

        try {
            palabra = textfiel_palabra.getText().toCharArray();
            do {
                busca_vocales(palabra[indice]);
                indice++;
            } while (indice < palabra.length);

            if (contador_vocales == 5) {
                JOptionPane.showMessageDialog(null, "la palabra:   " + textfiel_palabra.getText() + "  °°SI CUMPLE°°");
            } else {
                JOptionPane.showMessageDialog(null, "la palabra:   " + textfiel_palabra.getText() + "  °°NO CUMPLE°°");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese una palabra");

        }
        indice = 0;
    }//GEN-LAST:event_btn_palabraActionPerformed

    private void textfiel_palabraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfiel_palabraMouseClicked
        textfiel_palabra.setText("");
    }//GEN-LAST:event_textfiel_palabraMouseClicked

//---------------------TERCER PROGRAMA----------------------------------------------------------------------------------------------

    private void btn_tercerProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tercerProgramaActionPerformed
        try {

            String invertido = "";
            /// NOMBRE..................................................
            palabra = textfiel_nombre.getText().toCharArray();
            indice = palabra.length - 1;

            do {
                invertido = invertido + palabra[indice];
                indice--;
            } while (indice != -1);
            jLabel6.setText(invertido);

            ///APELLIDO................................................
            invertido = "";
            palabra = textfiel_apellido.getText().toCharArray();
            indice = palabra.length - 1;
            do {
                invertido = invertido + palabra[indice];
                indice--;
            } while (indice != -1);
            jLabel7.setText(invertido);

            indice = 0;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese una palabra");
        }
    }//GEN-LAST:event_btn_tercerProgramaActionPerformed

    private void textfiel_apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfiel_apellidoMouseClicked
        // TODO add your handling code here:
        textfiel_apellido.setText("");
    }//GEN-LAST:event_textfiel_apellidoMouseClicked

    private void textfiel_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfiel_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfiel_nombreActionPerformed

    private void textfiel_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfiel_nombreMouseClicked
        // TODO add your handling code here:
        textfiel_nombre.setText("");
    }//GEN-LAST:event_textfiel_nombreMouseClicked

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
    private javax.swing.JButton btn_palabra;
    private javax.swing.JButton btn_tercerPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textfiel_apellido;
    private javax.swing.JTextField textfiel_catetoA;
    private javax.swing.JTextField textfiel_catetoB;
    private javax.swing.JTextField textfiel_hipo;
    private javax.swing.JTextField textfiel_nombre;
    private javax.swing.JTextField textfiel_palabra;
    // End of variables declaration//GEN-END:variables
}
