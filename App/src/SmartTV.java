public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume ++;
        System.out.println("Volume definido para: " + volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("Volume definido para: " + volume);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal Atual: " + canal);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Canal Atual: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal Atual: " + canal);
    }
}
