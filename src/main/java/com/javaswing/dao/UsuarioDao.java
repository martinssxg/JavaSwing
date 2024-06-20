/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.dao;

import com.javaswing.modelo.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jorge Lescura
 */
public class UsuarioDao {
    
    
    public Usuario consultarCodigo(Usuario usuario) throws SQLException {
        
        Usuario usuarioRetorno = new Usuario();   
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM usuario where codigo = " + usuario.getCodigo();
        Statement statement =  connection.createStatement();
        ResultSet retorno =  statement.executeQuery(query);
        
          
        while (retorno.next()){
              
                usuarioRetorno.setCodigo(retorno.getInt("codigo"));
                usuarioRetorno.setNome(retorno.getString("nome"));
                usuarioRetorno.setTelefone(retorno.getString("telefone"));
                usuarioRetorno.setCidade(retorno.getString("cidade"));
                usuarioRetorno.setTipo(retorno.getInt("tipo"));
                
        }
        
        return usuarioRetorno;
    }
    
}
