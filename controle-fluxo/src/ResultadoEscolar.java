public class ResultadoEscolar {
    public static void main(String[] args) {

        int grade = 6;
        String result = grade >= 7 ? "Aprovado" : grade >=5 && grade < 7 ? "Recuperação" : "Reprovado";
        System.out.println(result);

    }
}
