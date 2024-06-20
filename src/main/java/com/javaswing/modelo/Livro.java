/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.modelo;

/**
 *
 * @author Jorge Lescura
 */
public class Livro {
    
    private int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private Integer quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int id) {
        this.codigo = id;
    }
    
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
