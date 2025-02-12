public class SmartTv {

    boolean on = false;
    int canal = 1;
    int volume = 25;

    public void changeChannel(int newChannel) {
        canal = newChannel;
    }

    public void changeChannelToUp() {
        canal++;
    }

    public void changeChannelToDown() {
        canal--;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void increaseVolume() {
        System.out.println("Aumentando o volume para: " + volume);
        volume++;
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

}