import br.com.cecote.gamereview.modelos.Game;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Game jogo1 = new Game();
        Random numAleatorio = new Random();
        double num = 0;

        jogo1.setNome("Dark Souls - Remastered");
        jogo1.setAnoLancamento(2018);
        jogo1.setEstaNaBiblioteca(true);
        jogo1.setComentario("Jogo perfeito para quem quer passar raiva!");
        jogo1.setDistribuidora("Bandai");
        for (int i = 0; i < 5; i++) {
            num = numAleatorio.nextInt(11);
            jogo1.setAvaliacao(num);
            System.out.println(num);
        }
        jogo1.gameReview();
    }
}