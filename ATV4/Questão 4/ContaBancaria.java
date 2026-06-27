package anexo4_5_questao4;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;
    
    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void depositar(double deposito) {
        this.saldo += deposito;
        System.out.println("Foram depositados R$" + deposito);
    }
    
    public void sacar(double valor) {
        if (valor < this.saldo) {
            this.saldo -= valor;
            System.out.println("Foram sacados " + valor);
            return;
        }
        System.out.println("Saldo insuficiente");
    }

}
