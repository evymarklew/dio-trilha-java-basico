public class Usuário {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " +smartTv.volume);
        



        System.out.println("Tv Ligada?" + smartTv.ligada);
        System.out.println("Canal Atual?" + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);
        
    }
}
