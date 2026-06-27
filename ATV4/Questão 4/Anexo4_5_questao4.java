package anexo4_5_questao4;

public class Anexo4_5_questao4 {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Luis", "2572768", 1000);
        
        conta.depositar(500);
        System.out.println("Saldo da conta: " + conta.getSaldo());
        conta.sacar(2500);
        conta.sacar(300);
        System.out.println("Saldo da conta: " + conta.getSaldo());

    }
    
}
