/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.service;

import com.javaswing.dao.UsuarioDao;
import com.javaswing.modelo.Usuario;
import java.sql.SQLException;

/**
 *
 * @author Jorge Lescura
 */
public class UsuarioService {
         public Usuario consultarCodigo(Usuario usuario) throws SQLException{
                    UsuarioDao usuarioDao = new UsuarioDao();
                    return usuarioDao.consultarCodigo(usuario);
        }
}
