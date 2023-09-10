package br.com.cecote.gamereview.modelos;

public class Anime extends Titulos {
    private int temporadas;
    private boolean assistido;

    public void animeReview(){
        System.out.println("/---------------------------------------------------------------------------------/");
        System.out.println("Nome do anime: " + getNome());
        System.out.println("Ano de landaçamento do anime: " + getAnoLancamento());
        if (assistido) {
            System.out.println("sim");
        } else{
            System.out.println("não");
        }
        System.out.println("A nota média das avaliações desse anime é: " + getMediaAvaliacoes());
        System.out.println("Total de pessoas que avaliaram esse anime até o momento: " + getQuantidadeAvaliacoes());
        System.out.println("A quantidade total de temporadas desse anime até o momento é de: " + getTemporadas());
        System.out.println("Comentário: " + getComentario());
        System.out.println("Distribuidora do jogo: " + getDistribuidora());
        System.out.println("/---------------------------------------------------------------------------------/");
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getTemporadas(){
        return this.temporadas;
    }
    public void setAssistido(boolean assistido){
        this.assistido = assistido;
    }
    public String getAssistido(){
        if (this.assistido){
            return "sim";
        } else {
            return "nao";
        }
    }
    @Override
    public double getTempoDeDuracaoTotalEmMinutos() {
        //O número de ep * duração(em minutos) * numero de temporadas
        return 12 * 24 * this.temporadas;
    }
}
