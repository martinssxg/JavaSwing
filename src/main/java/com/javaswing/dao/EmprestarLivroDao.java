/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.dao;

import com.javaswing.modelo.Emprestimo;
import com.javaswing.modelo.Livro;
import com.javaswing.service.Util;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jorge Lescura
 */
public class EmprestarLivroDao {
            public boolean emprestarLivro(Emprestimo emprestimo){
                
                Conexao conexao = new Conexao();
                Connection connection = conexao.conectar();
                Util util = new Util();
                Livro livro = new Livro();
                
                LivroDao livroDao = new LivroDao();
                String query = "INSERT INTO Emprestimo (codLivro,codUsuario,dataEmprestimo,dataDevolucao) values (" 
                       +           emprestimo.getCodLivro() + "," 
                       +           emprestimo.getCodUsuario()   + "," 
                       +   "'" +   util.dateToStringUsa(emprestimo.getDataEmprestimo())+ "'," 
                       +   "'" +   util.dateToStringUsa(emprestimo.getDataDevolucao()) + "')" ;
        
                
                try {
                    Statement statement = connection.createStatement();
                    statement.execute(query);
                    
                    // pesquisar o livro pelo codigo
                    livro.setCodigo(emprestimo.getCodLivro());
                    livro = livroDao.consultarQuantidade(connection,livro); //select quantidade from livro where codigo = livro.getCodigo
                    
                    int quantidade = livro.getQuantidade() - 1;
                    livroDao.atualizarQuantidade(connection,quantidade, emprestimo.getCodLivro()); // update livro set quantidade = quantidade where codigo = livro.getCodigo
                    
                    conexao.desconectar(connection);
                    
                    return true;
                }catch (SQLException ex) {
                    System.out.print(ex.initCause(ex));
                    return false;
                } 
                
                
                
            }
}
