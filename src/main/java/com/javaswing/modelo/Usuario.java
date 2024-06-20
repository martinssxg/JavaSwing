/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.modelo;

/**
 *
 * @author Jorge Lescura
 */
public class Usuario {
            private Integer codigo;
            private String nome;
            private String telefone;
            private String cidade;
            private Integer tipo;

                        
            public Integer getCodigo() {
                return codigo;
            }

            public void setCodigo(Integer codigo) {
                this.codigo = codigo;
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public String getTelefone() {
                return telefone;
            }

            public void setTelefone(String telefone) {
                this.telefone = telefone;
            }

            public String getCidade() {
                return cidade;
            }

            public void setCidade(String cidade) {
                this.cidade = cidade;
            }
            
            public Integer getTipo() {
                return tipo;
            }

            public void setTipo(Integer tipo) {
                this.tipo = tipo;
            }
}
