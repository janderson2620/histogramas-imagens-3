package methods;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImgPretoeBranco {
    public static void calcularHistogramaPretoeBranco(BufferedImage imagem) {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        int[] histogramaRGB = new int[256];

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                int intensidade = (cor.getRed() + cor.getGreen() + cor.getBlue()) / 3;

                histogramaRGB[intensidade]++;
            }
        }

        for (int i = 0; i < histogramaRGB.length; i++) {
            System.out.println("Intensidade " + i + ": " + histogramaRGB[i]);
        }
    }
}

