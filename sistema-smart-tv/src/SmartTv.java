// Caracteristicas da classe:
// Ela deve possuir as caracteristicas: ligada (boolean), canal(int) e volume(int);
// A Tv poderá ser ligada e desligada;
// A Tv poderá aumentar ou diminuir o volume sempre de +1 ou -1;
// A Tv poderá mudar de canal de 1 em 1 ou definindo um número corresponente.

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        // volume = volume + 1
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal(){
        // volume = volume + 1
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;   
        System.out.println("Mudando o canal para: " + canal);
    }

    public void aumentarVolume(){
        // volume = volume + 1
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        // volume = volume + 1
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
}
