package anexo4;

public class ContaCorrente {
    private String numeroDaConta;
    private String nomeDoTitular;
    private double saldo = 0;
    
    public ContaCorrente(String numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("Voce depositou R$" + deposito);
    }
    
    public void sacar(double saque) {
        saldo -= saque;
        System.out.println("Voce sacou R$" + saque);
    }
}
