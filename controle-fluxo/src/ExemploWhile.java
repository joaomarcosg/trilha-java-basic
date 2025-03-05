import java.util.concurrent.ThreadLocalRandom; //classe para gerar número aleatório

public class ExemploWhile {

    public static void main(String[] args) {

        double allowance = 50.0;

        while (allowance > 0) {

            double candyValue = aleatoryValue();

            if (candyValue > allowance) {
                candyValue = allowance;
            }

            System.out.println("Valor do doce: " + candyValue + " Adicionado ao carrinho");
            allowance = allowance - candyValue;
        }

        System.out.println("Mesada: " + allowance);
        System.out.println("João gastou todo a sua mesada em doces");

    }

    private static double aleatoryValue() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
