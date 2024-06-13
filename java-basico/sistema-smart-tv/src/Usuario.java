public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada?" + smartTv.ligada);
        System.out.println("Está em que canal?" + smartTv.canal);
        System.out.println("Está em qual volume?" + smartTv.volume);

        smartTv.ligar();
        System.out.println("A TV está ligada?" + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);
    }
}
