package br.com.cecote.gamereview.modelos;

public class Titulos {
    private String nome;
    private int anoLancamento;
    private String comentario;
    private double totalAvaliacoes = 0;
    private int quantidadeAvaliacoes = 0;
    private String distribuidora;
    private String genero;
    private double tempoDeDuracaoTotalEmMinutos;
    public void setNome(String nomeFilme){
        nome = nomeFilme;
    }
    public String getNome(){
        return nome;
    }
    public void setAnoLancamento(int anoLancamentoFilme){
        anoLancamento = anoLancamentoFilme;
    }
    public int getAnoLancamento(){
        return anoLancamento;
    }
    public void setComentario(String comentarioFilme){
        comentario = comentarioFilme;
    }
    public String getComentario(){
        return comentario;
    }
    public int getQuantidadeAvaliacoes(){
        return quantidadeAvaliacoes;
    }
    public void setAvaliacao(double avaliacaoFilme){
        quantidadeAvaliacoes++;
        totalAvaliacoes += avaliacaoFilme;
    }
    public double getMediaAvaliacoes(){
        return totalAvaliacoes/quantidadeAvaliacoes;
    }
    public void setDistribuidora(String distribuidoraFilme){
        distribuidora = distribuidoraFilme;
    }
    public String getDistribuidora(){
        return distribuidora;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setTempoDeDuracaoTotalEmMinutos(double tempoDeDuracaoTotalEmMinutos){
        this.tempoDeDuracaoTotalEmMinutos = tempoDeDuracaoTotalEmMinutos;
    }
    public double getTempoDeDuracaoTotalEmMinutos(){
        return this.tempoDeDuracaoTotalEmMinutos;
    }
}
