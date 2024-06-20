package com.javaswing.relatorio;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.javaswing.modelo.Emprestimo;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

public class ComprovanteEmprestimoRelatorio {

    public String gerarComprovante(Emprestimo emprestimo, String nomeUsuario, String tituloLivro) {
        String caminho = "C:\\Users\\alebo\\Documents\\NetBeansProjects\\JavaSwing\\src\\main\\java\\com\\javaswing\\dao\\";
        String arquivo = caminho + "comprovante-emprestimo.pdf";

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(arquivo));
            document.open();

            Font tituloFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
            Font textoFont = new Font(Font.FontFamily.TIMES_ROMAN, 12);

            Paragraph titulo = new Paragraph("Comprovante de Empréstimo", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            document.add(new Paragraph("\n==================================================\n", textoFont));

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            Paragraph dataEmprestimo = new Paragraph("Data: " + sdf.format(emprestimo.getDataEmprestimo()), textoFont);
            document.add(dataEmprestimo);

            Paragraph codigoUsuario = new Paragraph("Código do Usuário: " + emprestimo.getCodUsuario(), textoFont);
            document.add(codigoUsuario);

            Paragraph nome = new Paragraph("Nome: " + nomeUsuario, textoFont);
            document.add(nome);

            document.add(new Paragraph("\n==================================================\n", textoFont));

            Paragraph dataDevolucao = new Paragraph("Devolver em: " + sdf.format(emprestimo.getDataDevolucao()), textoFont);
            document.add(dataDevolucao);

            Paragraph codigoLivro = new Paragraph("Código do Livro: " + emprestimo.getCodLivro(), textoFont);
            document.add(codigoLivro);

            Paragraph tituloLivroParagrafo = new Paragraph("Título: " + tituloLivro, textoFont);
            document.add(tituloLivroParagrafo);

            document.add(new Paragraph("\n==================================================\n", textoFont));

            Paragraph termos = new Paragraph("Ao realizar o empréstimo, estarei ciente" +
                    "que estarei sujeito a sanções e medidas prevencionais quando os prazos e termos de devolução não forem cumpridos.", textoFont);
            termos.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(termos);

            document.add(new Paragraph("\n==================================================\n", textoFont));

            Paragraph assinatura = new Paragraph("------------------------------------------------\n" +
                    "Assinatura do usuário", textoFont);
            assinatura.setAlignment(Element.ALIGN_CENTER);
            document.add(assinatura);

            document.close();

            return arquivo;

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
