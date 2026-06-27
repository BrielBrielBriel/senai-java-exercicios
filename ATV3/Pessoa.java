package anexo4;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getnome() {
        return nome;
    }
    
    public int getidade() {
        return idade;
    }
    
    public double getaltura() {
        return altura;
    }
    
    public double getpeso() { 
        return peso;
    }
    
    public void envelhecer() {
        this.idade += 1;
        
        if (idade < 21) {
            altura += 0.5;
        }
        
        System.out.println("Feliz aniversario " + nome);
    }
    
    public void engordar(double peso) { 
        this.peso += peso;
    }
    
    public void emagrecer(double peso) { 
        this.peso -= peso;
    }
    
    public void crescer(double altura) {
        this.altura += altura;
    }
}
