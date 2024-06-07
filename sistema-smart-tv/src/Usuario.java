public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv samsung = new SmartTv();
        System.out.println("ligada? " + samsung.ligada);
        System.out.println("canal atual: " + samsung.canal);
        System.out.println("volume atual: " + samsung.volume);
        samsung.aumentarVolume();
        System.out.println("novo volume: " + samsung.volume);
        samsung.mudarCanal(8);
        System.out.println("novo canal: " + samsung.canal);
        samsung.ligar();
        System.out.println("ligada? " + samsung.ligada);

    }
}
