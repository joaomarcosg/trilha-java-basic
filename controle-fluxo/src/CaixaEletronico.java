public class CaixaEletronico {
    public static void main(String[] args) {
        
        double balance = 25.0;
        double withdrawalAmount = 26.0;

        if (withdrawalAmount < balance)
            balance = balance - withdrawalAmount;
        
        System.out.println(balance);



    }
}
