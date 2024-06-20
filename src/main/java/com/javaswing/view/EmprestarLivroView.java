/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.javaswing.view;

import com.javaswing.controle.EmprestarLivroControle;
import com.javaswing.controle.UsuarioControle;
import com.javaswing.controle.LivroControle;
import com.javaswing.modelo.Emprestimo;
import com.javaswing.modelo.Livro;
import com.javaswing.modelo.Usuario;
import com.javaswing.relatorio.ComprovanteEmprestimoRelatorio;
import com.javaswing.relatorio.Relatorio;
import com.javaswing.service.EmprestarLivroService;
import com.javaswing.service.Util;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EmprestarLivroView extends javax.swing.JFrame {
    
    private Emprestimo emprestimoLivro;
    
    public EmprestarLivroView() {
        initComponents();
        setLocationRelativeTo( null );  // centraliza o Jframe no meio da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataEmprestimo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDataDevolucao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoLivro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        btnEmprestar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Código do Usuário");

        txtCodigoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoUsuarioActionPerformed(evt);
            }
        });
        txtCodigoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoUsuarioKeyPressed(evt);
            }
        });

        jLabel2.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Data do Empréstimo");

        jLabel4.setText("Data de Devolução");

        jLabel5.setText("Código do Livro");

        txtCodigoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLivroActionPerformed(evt);
            }
        });
        txtCodigoLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoLivroKeyPressed(evt);
            }
        });

        jLabel6.setText("Título");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir Comprovante");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnEmprestar.setText("EMPRESTAR");
        btnEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(159, 159, 159)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmprestar)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir)
                    .addComponent(btnEmprestar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoUsuarioActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCodigoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoUsuarioKeyPressed
            if (evt.getKeyCode() == evt.VK_ENTER) {    
                    UsuarioControle usuarioControle = new UsuarioControle();
                    Usuario usuario = new Usuario();
                    Util util = new Util();
                    EmprestarLivroService  emprestarLivroService = new EmprestarLivroService();
                    
                    usuario.setCodigo(Integer.parseInt(txtCodigoUsuario.getText()));
                    
                try {
                    usuario = usuarioControle.consultarCodigo(usuario);
                    txtNome.setText(usuario.getNome());
                    Integer tipo = usuario.getTipo();
                    
                    Date dataHoje = new Date();
                    txtDataEmprestimo.setText(util.dateToString(dataHoje));
                    
                    Date dataEntrega = emprestarLivroService.calcularDataEntrega(dataHoje, tipo);
                    txtDataDevolucao.setText(util.dateToString(dataEntrega));
                    
                } catch (SQLException ex) {
                    Logger.getLogger(EmprestarLivroView.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
            }
    }//GEN-LAST:event_txtCodigoUsuarioKeyPressed

    private void txtCodigoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoLivroActionPerformed

    private void txtCodigoLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoLivroKeyPressed
                 if (evt.getKeyCode() == evt.VK_ENTER) {   
                     LivroControle livroControle = new LivroControle();
                     Livro livro = new Livro();
                     
                     livro.setCodigo(Integer.parseInt(txtCodigoLivro.getText()));
                     
                     
                     try {
                         livro = livroControle.consultarCodigo(livro);
                         txtTitulo.setText(livro.getTitulo());
                     } catch (SQLException ex) {
                         Logger.getLogger(EmprestarLivroView.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     
                 }
    }//GEN-LAST:event_txtCodigoLivroKeyPressed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestarActionPerformed
                Emprestimo emprestimo = new Emprestimo();
                EmprestarLivroControle emprestarLivroControle = new EmprestarLivroControle();
                Util util = new Util();
                
                emprestimo.setCodLivro(Integer.parseInt(txtCodigoLivro.getText()));
                emprestimo.setCodUsuario(Integer.parseInt(txtCodigoUsuario.getText()));
                
                try {
                    emprestimo.setDataEmprestimo(util.stringToDate(txtDataEmprestimo.getText()));
                    emprestimo.setDataDevolucao(util.stringToDate(txtDataDevolucao.getText()));
                    this.emprestimoLivro = emprestimo;
                } catch (ParseException ex) {
                    Logger.getLogger(EmprestarLivroView.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                if(emprestarLivroControle.emprestarLivro(emprestimo)  == true){
                    JOptionPane.showMessageDialog(null,"Empréstimo efetuado com Sucesso!","ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(null,"ERRO; Livro não foi emprestado !","ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
                }
                
    }//GEN-LAST:event_btnEmprestarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
         ComprovanteEmprestimoRelatorio comprovante = new ComprovanteEmprestimoRelatorio();

        // Obtendo os valores dos campos de texto
        String nomeUsuario = txtNome.getText();
        String tituloLivro = txtTitulo.getText();

        // Gerando o comprovante
        String arquivo = comprovante.gerarComprovante(this.emprestimoLivro, nomeUsuario, tituloLivro);
        if (arquivo != null && !arquivo.isEmpty()) {
            Relatorio relatorio = new Relatorio();
            relatorio.visualizar(arquivo);
        } else {
            System.out.println("Erro ao gerar o comprovante.");
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(EmprestarLivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmprestarLivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmprestarLivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmprestarLivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmprestarLivroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmprestar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCodigoLivro;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtDataDevolucao;
    private javax.swing.JTextField txtDataEmprestimo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
