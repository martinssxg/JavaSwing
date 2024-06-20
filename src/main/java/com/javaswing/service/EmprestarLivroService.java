/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.service;

import com.javaswing.dao.EmprestarLivroDao;
import com.javaswing.modelo.Emprestimo;
import java.util.Date;

/**
 *
 * @author Jorge Lescura
 */
public class EmprestarLivroService {
            
            public Date calcularDataEntrega(Date dataHoje,Integer tipo){
                
                if(tipo == 1){
                        dataHoje.setDate(dataHoje.getDate() + 7);
                }else if(tipo == 2){
                        dataHoje.setDate(dataHoje.getDate() + 14);
                }else if(tipo == 3){
                        dataHoje.setDate(dataHoje.getDate() + 20);
                }
                        
                        
                Date dataEntrega =  dataHoje;        
                return dataEntrega;
            }
            
            public boolean emprestarLivro(Emprestimo emprestimo){
                    EmprestarLivroDao emprestarLivroDao = new EmprestarLivroDao();
                    return emprestarLivroDao.emprestarLivro(emprestimo);
            }

}
