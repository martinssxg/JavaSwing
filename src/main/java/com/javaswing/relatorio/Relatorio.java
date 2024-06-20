package com.javaswing.relatorio;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Relatorio {

    public void visualizar(String caminhoArquivo) {
        try {
            if (caminhoArquivo == null || caminhoArquivo.isEmpty()) {
                System.out.println("Caminho do arquivo está vazio ou nulo.");
                return;
            }

            File arquivo = new File(caminhoArquivo);
            if (arquivo.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(arquivo);
                    System.out.println("Arquivo aberto com sucesso: " + caminhoArquivo);
                } else {
                    System.out.println("Abertura de arquivo não suportada");
                }
            } else {
                System.out.println("Arquivo não encontrado: " + caminhoArquivo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
