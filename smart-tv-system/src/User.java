public class User {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(); //instancia a classe SmartTv

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();

        smartTv.changeChannel(12);
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Tv ligada? " + smartTv.on);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("Tv ligada? " + smartTv.on);

    }
}
