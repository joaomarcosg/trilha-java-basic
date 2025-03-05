import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String name = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String lastName = scanner.next();

        System.out.println("Digite a sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double height = scanner.nextDouble();

        System.out.println("Me chamo: " + name.toUpperCase() + " " + lastName.toUpperCase());
        System.out.println("Tenho: " + age + " anos");
        System.out.println("Minha altura: " + height + " cm");
        scanner.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        }
    }
}
