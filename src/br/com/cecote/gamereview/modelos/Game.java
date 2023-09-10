package br.com.cecote.gamereview.modelos;

public class Game extends Titulos {
    private boolean estaNaBiblioteca;
    private String plataforma;

    public void gameReview(){
        System.out.println("/---------------------------------------------------------------------------------/");
        System.out.println("Nome do jogo: " + getNome());
        System.out.println("Ano de landaçamento do jogo: " + getAnoLancamento());
        if (estaNaBiblioteca) {
            System.out.println("O jogo está na biblioteca");
        } else{
            System.out.println("O jogo não está na biblioteca");
        }
        System.out.println("A nota média das avaliações desse jogo é: " + getMediaAvaliacoes());
        System.out.println("Total de pessoas que avaliaram esse jogo até o momento: " + getQuantidadeAvaliacoes());
        System.out.println("Tempo de duração do jogo: " + getTempoDeDuracaoTotalEmMinutos());
        System.out.println("Comentário: " + getComentario());
        System.out.println("Distribuidora do jogo: " + getDistribuidora());
        System.out.println("O jogo pode ser jogado na(s) seguinte(s) plataforma(s): " + getPlataforma());
        System.out.println("/---------------------------------------------------------------------------------/");
    }
    public void setEstaNaBiblioteca(boolean estaNaBiblioteca){
        this.estaNaBiblioteca = estaNaBiblioteca;
    }
    public String getEstaNaBiblioteca(){
        if (estaNaBiblioteca) {
            return ("O jogo está na biblioteca");
        } else{
            return ("O jogo não está na biblioteca");
        }
    }
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    public String getPlataforma(){
        return this.plataforma;
    }

}
