package main;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static methods.ImgColorida.calcularHistogramaColorido;
import static methods.ImgPretoeBranco.calcularHistogramaPretoeBranco;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage imagemPretoeBranco = ImageIO.read(
                new File("C:\\Users\\jande\\IdeaProjects\\project-histograma-pdi\\src\\imagens\\logoOriginal\\grey_scale.jpg\\")
        );

        BufferedImage imagemColorida = ImageIO.read(
                new File("C:\\Users\\jande\\IdeaProjects\\project-histograma-pdi\\src\\imagens\\logoOriginal\\sombrinhas.jpg\\")
        );

        System.out.println();
        System.out.println("Imagem Preto e Branco -------------------------------------------------------------------");
        System.out.println();

        calcularHistogramaPretoeBranco(imagemPretoeBranco);
        System.out.println();
        System.out.println("Imagem Colorida -------------------------------------------------------------------");
        System.out.println();

        calcularHistogramaColorido(imagemColorida);

    }
}

