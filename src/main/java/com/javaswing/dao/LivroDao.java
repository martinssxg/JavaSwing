/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.dao;

import com.javaswing.modelo.Livro;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jorge Lescura
 */
public class LivroDao {
    
    // Link para fazer download do driver do mysql
    // https://downloads.mysql.com/archives/c-j/
           
    public boolean cadastrar(Livro livro) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
                
        String query = "INSERT INTO Livro (Titulo,Autor,Editora,quantidade) values (" +
                "'" +   livro.getTitulo()  + "'," +
                "'" +   livro.getAutor()   + "'," +
                "'" +   livro.getEditora() + "'," +
                livro.getQuantidade()+ ")";
        
        //INSERT INTO Livro (Titulo,Autor,Editora,quantidade) values ('O Rei','João','Caminho das letras',2)
        //INSERT INTO Livro (Titulo,Autor,Editora,quantidade) values (O Rei,João,Caminho das letras,2)
        
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            conexao.desconectar(connection);
            return true;
        }catch (SQLException ex) {
            System.out.print(ex.initCause(ex));
            return false;
        } 
    }

    public ArrayList<Livro> consultar(Livro livro) throws SQLException {
        ArrayList<Livro> listLivro = new ArrayList<Livro>();
        
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM livro where titulo like '" + livro.getTitulo() + "%'";
        Statement statement =  connection.createStatement();
        ResultSet retorno =  statement.executeQuery(query);
        
          
        while (retorno.next()){
            Livro livroRetorno = new Livro();     
                livroRetorno.setCodigo(retorno.getInt("codigo"));
                livroRetorno.setTitulo(retorno.getString("Titulo"));
                livroRetorno.setAutor(retorno.getString("Autor"));
                livroRetorno.setEditora(retorno.getString("Editora"));
                livroRetorno.setQuantidade(retorno.getInt("Quantidade"));
                listLivro.add(livroRetorno);
        }
        
        return listLivro;
    }
    
    public Livro consultarCodigo(Livro livro) throws SQLException {
        
        Livro livroRetorno = new Livro();   
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM livro where codigo = " + livro.getCodigo();
        Statement statement =  connection.createStatement();
        ResultSet retorno =  statement.executeQuery(query);
        
          
        while (retorno.next()){
              
                livroRetorno.setCodigo(retorno.getInt("codigo"));
                livroRetorno.setTitulo(retorno.getString("Titulo"));
                livroRetorno.setAutor(retorno.getString("Autor"));
                livroRetorno.setEditora(retorno.getString("Editora"));
                livroRetorno.setQuantidade(retorno.getInt("Quantidade"));
                
        }
        
        return livroRetorno;
    }
    
    public Livro consultarQuantidade(Connection connection, Livro livro) throws SQLException {
        
        Livro livroRetorno = new Livro();   
        //Conexao conexao = new Conexao();
        //Connection connection = conexao.conectar();
        String query = "SELECT quantidade FROM livro where codigo = " + livro.getCodigo();
        Statement statement =  connection.createStatement();
        ResultSet retorno =  statement.executeQuery(query);
        
          
        while (retorno.next()){
              
                livroRetorno.setQuantidade(retorno.getInt("Quantidade"));
                
        }
        
        return livroRetorno;
    }
    public boolean atualizar(Livro livro) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        boolean retorno = false;
        String query = "UPDATE LIVRO SET "
                + "titulo = " + "'" +   livro.getTitulo()  + "'," 
                + "autor =  "  + "'" +   livro.getAutor()  + "',"
                + "editora =  "  + "'" +   livro.getEditora()  + "',"
                + "quantidade =  "  +    livro.getQuantidade()  +
                
                " where codigo = " + livro.getCodigo();
        
        try {
            Statement statement = connection.createStatement();
            retorno =  statement.execute(query);
        }catch (SQLException ex) {
            retorno = true;
        } finally {
            conexao.desconectar(connection);
        }
        
        return retorno;
    }
    
    public boolean atualizarQuantidade(Connection connection, int quantidade, int codLivro) throws SQLException {
        //Conexao conexao = new Conexao();
        //Connection connection = conexao.conectar();
        boolean retorno = false;
        String query = "UPDATE LIVRO SET "
                + "quantidade =  "  +    quantidade 
                + " where codigo = " + codLivro;
        
        try {
            Statement statement = connection.createStatement();
            retorno =  statement.execute(query);
        }catch (SQLException ex) {
            retorno = true;
        } 
        
        return retorno;
    }
    public boolean excluir(Livro livro) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        boolean retorno = false;
        String query = "DELETE FROM livro where Codigo = " + livro.getCodigo();
        try {
            Statement statement = connection.createStatement();
            retorno =  statement.execute(query);
        }catch (SQLException ex) {
            retorno = true;
        } finally {
            conexao.desconectar(connection);
        }
        
        return retorno;
    }
    
    
    
    
}
