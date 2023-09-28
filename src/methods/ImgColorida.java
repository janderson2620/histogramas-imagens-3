package methods;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImgColorida {

    public static void calcularHistogramaColorido(BufferedImage imagem) {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        int[] histogramaR = new int[256];
        int[] histogramaG = new int[256];
        int[] histogramaB = new int[256];


        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                int intensidadeR = cor.getRed();
                int intensidadeG = cor.getGreen();
                int intensidadeB = cor.getBlue();

                histogramaR[intensidadeR]++;
                histogramaG[intensidadeG]++;
                histogramaB[intensidadeB]++;
            }
        }

        for (int i = 0; i < histogramaR.length; i++) {
            System.out.println("Intensidade Vermelho " + i + ": " + histogramaR[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------------");
        for (int i = 0; i < histogramaG.length; i++) {
            System.out.println("Intensidade Verde " + i + ": " + histogramaG[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------------");
        for (int i = 0; i < histogramaB.length; i++) {
            System.out.println("Intensidade Azul " + i + ": " + histogramaB[i]);
        }
    }

}
