package br.com.joaocarloslima.model;

public class Cenoura {
    private int tamanho = 1;
    private int tempoDeVida = 0;
    private int tempoDeCrescimento = 4;

    public Cenoura() {
        this.tempoDeVida = 0;
    }

    public void crescer(){
        tempoDeVida++;

        if(tempoDeVida % tempoDeCrescimento == 0 && tamanho < 4){
            ++tamanho;
        }
    }

    public boolean podeColher(){
        return tamanho >= 4;
    }

    public String getImagem() {
        return "/br/com/joaocarloslima/images/cenoura" + tamanho + ".png";
    }
}