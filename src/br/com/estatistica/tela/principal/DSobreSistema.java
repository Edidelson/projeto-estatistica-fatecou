/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DSobreSistema.java
 *
 * Created on 12/03/2012, 13:33:58
 */
package br.com.estatistica.tela.principal;

import java.awt.Cursor;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Edidelson
 */
public class DSobreSistema extends javax.swing.JDialog {

    /** Creates new form DSobreSistema */
    public DSobreSistema(java.awt.Frame parent, boolean modal) {
        super(parent, modal);        
        initComponents();        
        setTitle("Sobre...");
        setLocationRelativeTo(null);
        setResizable(false);        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbAll = new javax.swing.JLabel();
        lbempresa = new javax.swing.JLabel();
        lbtelefone = new javax.swing.JLabel();
        lbDescricaoWebsite = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        lbserial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbAll.setText("Todos Direitos Reservados");

        lbempresa.setText("ZapInfo Informática ©2012");

        lbtelefone.setText("Fone: (43) 3532-3423");

        lbDescricaoWebsite.setForeground(new java.awt.Color(51, 51, 255));
        lbDescricaoWebsite.setText("http://www.zapinformatica.net");
        lbDescricaoWebsite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDescricaoWebsiteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbDescricaoWebsiteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbDescricaoWebsiteMouseExited(evt);
            }
        });

        jLabel6.setText("Versão: 1.0.0 - (17/12/2012)");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbserial.setBackground(new java.awt.Color(204, 204, 204));
        lbserial.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lbserial.setForeground(new java.awt.Color(153, 153, 153));
        lbserial.setText("Serial: 20110406FST1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbserial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDescricaoWebsite, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbtelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbempresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbempresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbtelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescricaoWebsite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbserial)
                    .addComponent(btSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
    dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void lbDescricaoWebsiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDescricaoWebsiteMouseClicked
    try{
        Runtime.getRuntime().exec("cmd /c start http://www.zapinformatica.net");
    }catch(IOException e){
        JOptionPane.showMessageDialog(null,"Falha ao consultar link externo\n" + e);
    }
    }//GEN-LAST:event_lbDescricaoWebsiteMouseClicked

    private void lbDescricaoWebsiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDescricaoWebsiteMouseEntered
    lbDescricaoWebsite.setText("<html><u>http://www.zapinformatica.net</u></html>");
    lbDescricaoWebsite.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
    }//GEN-LAST:event_lbDescricaoWebsiteMouseEntered

    private void lbDescricaoWebsiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDescricaoWebsiteMouseExited
    lbDescricaoWebsite.setText("http://www.zapinformatica.net");
    lbDescricaoWebsite.setCursor(Cursor.getDefaultCursor()); 
    }//GEN-LAST:event_lbDescricaoWebsiteMouseExited

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
            java.util.logging.Logger.getLogger(DSobreSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSobreSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSobreSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSobreSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DSobreSistema dialog = new DSobreSistema(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAll;
    private javax.swing.JLabel lbDescricaoWebsite;
    private javax.swing.JLabel lbempresa;
    private javax.swing.JLabel lbserial;
    private javax.swing.JLabel lbtelefone;
    // End of variables declaration//GEN-END:variables
}
