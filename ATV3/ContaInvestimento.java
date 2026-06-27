package anexo4;

public class ContaInvestimento {
    private String numeroDaConta;
    private String nomeDoTitular;
    private double saldo = 1000;
    private double taxaJuros;
    
    public ContaInvestimento(String numeroDaConta, String nomeDoTitular, double taxaJuros) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        //this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void adicioneJuros() {
        saldo += (taxaJuros/100) * saldo; 
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
