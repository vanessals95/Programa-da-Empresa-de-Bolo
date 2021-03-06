/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.produtos;
import controller.ProdutosController;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.ProdutosDAO;

/**
 *
 * @author Vanessa
 */
public class jtfcadastro extends javax.swing.JFrame {
    
    produtos objprod = new produtos();
    
    /**
     * Creates new form jtfcadastro
     */
    public jtfcadastro() {
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

        cod = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        btcad = new javax.swing.JButton();
        dataval = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        quant_prod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 70, -1));
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 190, -1));

        jLabel1.setText("Código:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel2.setText("Descrição:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel3.setText("Preço:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel4.setText("Data de Validade:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoActionPerformed(evt);
            }
        });
        getContentPane().add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 70, -1));

        btcad.setText("Cadastrar");
        btcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadActionPerformed(evt);
            }
        });
        getContentPane().add(btcad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        dataval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datavalActionPerformed(evt);
            }
        });
        getContentPane().add(dataval, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, -1));

        jLabel5.setText("Quantidade:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        quant_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quant_prodActionPerformed(evt);
            }
        });
        getContentPane().add(quant_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 40, -1));

        setBounds(0, 0, 623, 475);
    }// </editor-fold>//GEN-END:initComponents

    private void btcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadActionPerformed
        
        ProdutosController pc = new ProdutosController();
        objprod = new produtos();
        preencher_objetos();
                
        ProdutosDAO IDAO;
        try {
            IDAO = new ProdutosDAO();
            IDAO.Inserir(objprod);
            JOptionPane.showMessageDialog(this, "Dados inseridos com sucesso!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jtfcadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jtfcadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limpa_tela();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btcadActionPerformed

    public void limpa_tela(){
        cod.setText("");
        desc.setText("");
        preco.setText("");
        dataval.setText("");
    }
        
    public void preencher_objetos(){
        objprod.setCodigo_produto(Integer.parseInt(cod.getText()));
        objprod.setDescricao_produto(desc.getText());
        objprod.setQuantidade_produto(Integer.parseInt(quant_prod.getText()));
        objprod.setPreco_produto(Double.parseDouble(preco.getText()));
        objprod.setData_validade_produto(Date.valueOf(dataval.getText()));        
    }
    
    private void datavalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datavalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datavalActionPerformed

    private void precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoActionPerformed

    private void quant_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quant_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quant_prodActionPerformed

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
            java.util.logging.Logger.getLogger(jtfcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jtfcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jtfcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jtfcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jtfcadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcad;
    private javax.swing.JTextField cod;
    private javax.swing.JFormattedTextField dataval;
    private javax.swing.JTextField desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField quant_prod;
    // End of variables declaration//GEN-END:variables
}
