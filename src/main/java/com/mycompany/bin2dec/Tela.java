/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bin2dec;

import static java.awt.event.KeyEvent.VK_0;
import static java.awt.event.KeyEvent.VK_1;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }
    
    public int separarCaracteres(String texto) {
        int decimal = 0;
        int tamanho = texto.length();
        for (int i = 0; i < texto.length(); i++) {
            int temp = Character.getNumericValue(texto.charAt(i));
            decimal = decimal + temp * (int)Math.pow(2, tamanho - 1);
            tamanho--;
        }
        return decimal;
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
        jtxtNumero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jlblResultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Entre com o número binário:");

        jtxtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNumeroKeyTyped(evt);
            }
        });

        jButton1.setText("Converter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        jlblResultado.setText("Decimal:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Conversor de Binário para Decimal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblResultado)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtNumero)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblResultado)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
        char tecla = evt.getKeyChar();
        /*if((tecla != VK_1) || (tecla != VK_0)){
            JOptionPane.showMessageDialog(null, "O número deve ser 0 ou 1");
        }*/
        //jlblResultado.setText(jlblResultado.getText() + " " + tecla);
        jlblResultado.setText(tecla + "");
    }//GEN-LAST:event_jButton1KeyTyped

    private void jtxtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNumeroKeyTyped
        // Pegar o a tecla que a pessoa digitou e tranformar em string
        String t = String.valueOf(evt.getKeyChar());
        if((!t.equals("1")) && (!t.equals("0"))){
            JOptionPane.showMessageDialog(null, "O número deve ser 0 ou 1");
        }
    }//GEN-LAST:event_jtxtNumeroKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int resultado = separarCaracteres(jtxtNumero.getText());
        jlblResultado.setText("Decimal: " + resultado);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlblResultado;
    private javax.swing.JTextField jtxtNumero;
    // End of variables declaration//GEN-END:variables
}
