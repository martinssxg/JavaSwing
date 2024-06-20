/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.controle;

import com.javaswing.modelo.Livro;
import com.javaswing.service.LivroService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jorge Lescura
 */
public class LivroControle {
    
        
    public boolean cadastrar(Livro livro) throws SQLException{
        LivroService livroService = new LivroService();
        return livroService.cadastrar(livro);
    }
    
    public ArrayList<Livro> consultar(Livro livro) throws SQLException{
        LivroService livroService = new LivroService();
        return livroService.consultar(livro);
    }
    
    public Livro consultarCodigo(Livro livro) throws SQLException {
        LivroService livroService = new LivroService();
        return livroService.consultarCodigo(livro);
    }
    
    public boolean excluir(Livro livro) throws SQLException{
        LivroService livroService = new LivroService();
        return livroService.excluir(livro);
    }
    
    public boolean atualizar(Livro livro) throws SQLException{
        LivroService livroService = new LivroService();
        return livroService.atualizar(livro);
    }
    
}
