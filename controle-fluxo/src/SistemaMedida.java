public class SistemaMedida {

    public static void main(String[] args) {
        String acronym = "M";

        switch (acronym) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
            System.out.println("Indefinido");
        }
    }
}
