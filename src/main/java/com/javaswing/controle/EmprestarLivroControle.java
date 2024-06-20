/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.controle;

import com.javaswing.modelo.Emprestimo;
import com.javaswing.service.EmprestarLivroService;

/**
 *
 * @author Jorge Lescura
 */
public class EmprestarLivroControle {
        public boolean emprestarLivro(Emprestimo emprestimo){
            EmprestarLivroService emprestarLivroService = new EmprestarLivroService();
            return emprestarLivroService.emprestarLivro(emprestimo);
        }
}
