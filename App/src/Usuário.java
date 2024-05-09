public class Usuário {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Novo Volume: " + smartTv.volume);

        smartTv.mudarCanal(45);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
    }       
}
