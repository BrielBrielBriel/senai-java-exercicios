package anexo4;

public class Anexo4 {

    public static void main(String[] args) {
        System.out.println("### QUESTAO 1 ###");
        
        Pessoa pessoa1 = new Pessoa("Gabriel", 19, 50.3, 1.60);
        
        System.out.println("Nome: " + pessoa1.getnome());
        System.out.println("Idade: " + pessoa1.getidade());
        System.out.println("Peso: " + pessoa1.getpeso());
        System.out.println("Altura: " + pessoa1.getaltura());
        
        pessoa1.envelhecer();
        
        System.out.println("Nome: " + pessoa1.getnome());
        System.out.println("Idade: " + pessoa1.getidade());
        System.out.println("Peso: " + pessoa1.getpeso());
        System.out.println("Altura: " + pessoa1.getaltura());
        
        pessoa1.emagrecer(10.1);
        
        System.out.println("Nome: " + pessoa1.getnome());
        System.out.println("Idade: " + pessoa1.getidade());
        System.out.println("Peso: " + pessoa1.getpeso());
        System.out.println("Altura: " + pessoa1.getaltura());
        
        pessoa1.engordar(25.8);
        
        System.out.println("Nome: " + pessoa1.getnome());
        System.out.println("Idade: " + pessoa1.getidade());
        System.out.println("Peso: " + pessoa1.getpeso());
        System.out.println("Altura: " + pessoa1.getaltura());
        
        pessoa1.crescer(1.5);
        
        System.out.println("Nome: " + pessoa1.getnome());
        System.out.println("Idade: " + pessoa1.getidade());
        System.out.println("Peso: " + pessoa1.getpeso());
        System.out.println("Altura: " + pessoa1.getaltura());
        
        System.out.println("### QUESTAO 2 ###");
        
        ContaCorrente conta1 = new ContaCorrente("72754", "Gabriel Santos");
        
        conta1.getSaldo();
        conta1.depositar(100.50);
        conta1.getSaldo();
        conta1.sacar(50.50);
        conta1.getSaldo();
        
        System.out.println("### QUESTAO 3 ###");
        
        ContaInvestimento conta2 = new ContaInvestimento("85823", "Fernando Fernandes", 10);
        
        System.out.println("Saldo atual: " + conta2.getSaldo());
        conta2.adicioneJuros();
        conta2.adicioneJuros();
        conta2.adicioneJuros();
        conta2.adicioneJuros();
        conta2.adicioneJuros();
        System.out.println("Saldo atual: " + conta2.getSaldo());
        
        System.out.println("### QUESTAO 4 ###");
        
        Carro carro = new Carro();
        
        carro.setCombustivel(10);
        carro.setConsumo(12);
        
        System.out.println("Combustivel: " + carro.getCombustivel());
        System.out.println("Consumo: " + carro.getConsumo());
        
        carro.abastecer(10);
        carro.andar(36);
        
        System.out.println("Combustivel: " + carro.getCombustivel());
        System.out.println("Consumo: " + carro.getConsumo());
        
    }
    
}
