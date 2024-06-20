/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.service;

import com.javaswing.dao.LivroDao;
import com.javaswing.modelo.Livro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jorge Lescura
 */
public class LivroService {
    
    public boolean cadastrar(Livro livro) throws SQLException{
        LivroDao livroDao = new LivroDao();
        return livroDao.cadastrar(livro);
    }
    
    public ArrayList<Livro> consultar(Livro livro) throws SQLException{
        LivroDao livroDao = new LivroDao();
        return livroDao.consultar(livro);
    }
    
    public Livro consultarCodigo(Livro livro) throws SQLException{
        LivroDao livroDao = new LivroDao();
        return livroDao.consultarCodigo(livro);
    }
    
    public boolean excluir(Livro livro) throws SQLException{
        LivroDao livroDao = new LivroDao();
        return livroDao.excluir(livro);
    }
    
    public boolean atualizar(Livro livro) throws SQLException{
        LivroDao livroDao = new LivroDao();
        return livroDao.atualizar(livro);
    }
}
