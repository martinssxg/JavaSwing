/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.javaswing.view;

import com.javaswing.controle.LivroControle;
import com.javaswing.modelo.Livro;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jorge Lescura
 */
public class LivroConsultarView extends javax.swing.JFrame {
    private ArrayList<Livro> listLivro;
    /**
     * Creates new form LivroConsultarView
     */
    public LivroConsultarView() {
        initComponents();
        setLocationRelativeTo( null );
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
        txtConsultar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLivro = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA DE LIVROS");
        setPreferredSize(new java.awt.Dimension(900, 500));
        setSize(new java.awt.Dimension(900, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Título");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 48, 63, 27));
        getContentPane().add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 48, 230, 27));

        tblLivro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Quantidade", "Autor", "Editora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLivro.setGridColor(new java.awt.Color(204, 204, 204));
        tblLivro.setMaximumSize(new java.awt.Dimension(2147483647, 5));
        tblLivro.setPreferredSize(new java.awt.Dimension(700, 300));
        jScrollPane1.setViewportView(tblLivro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 820, 196));

        btnConsultar.setText("Consultar");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
                
                Livro livro = new Livro();
                livro.setTitulo(txtConsultar.getText());
                LivroControle livroControle = new LivroControle();
        try {
            listLivro = livroControle.consultar(livro);
            this.carregaDadosNaTabela();
        } catch (SQLException ex) {
            Logger.getLogger(LivroConsultarView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    private void carregaDadosNaTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tblLivro.getModel();
        
        for(Livro livro: listLivro){
            modelo.addRow(new Object[]{
                livro.getCodigo(),
                livro.getTitulo(),
                livro.getQuantidade(),
                livro.getAutor(),
                livro.getEditora()
                

            });
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLivro;
    private javax.swing.JTextField txtConsultar;
    // End of variables declaration//GEN-END:variables
}
