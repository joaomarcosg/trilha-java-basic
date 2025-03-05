import java.util.Random;

public class ExemploDoWhile {

    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando...");

        }while(ringing());

        System.out.println("Alo!");
    }

    private static boolean ringing() {
        boolean answered = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + answered);
        return ! answered;
    }
}
