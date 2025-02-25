public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.aumentarVolume();

        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.mudarCanal(18);

        System.out.println("Tv ligada:" + tv.ligada);
        System.out.println("Canal atual: " + tv.canal);
        System.out.println("Volume atual: " + tv.volume);

        tv.ligar();
        System.out.println("Novo status Tv ligada: " + tv.ligada);
        tv.desligar();
        System.out.println("Novo status Tv ligada: " + tv.ligada);
        
    }
}
