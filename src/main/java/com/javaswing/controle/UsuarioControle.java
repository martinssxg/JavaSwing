/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.controle;

import com.javaswing.modelo.Usuario;
import com.javaswing.service.UsuarioService;
import java.sql.SQLException;

/**
 *
 * @author Jorge Lescura
 */
public class UsuarioControle {
        public Usuario consultarCodigo(Usuario usuario) throws SQLException {
                UsuarioService usuarioService = new UsuarioService();
                return usuarioService.consultarCodigo(usuario);
    }
}
