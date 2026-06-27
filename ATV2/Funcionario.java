package atv2;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void aumentarSalario(double percentualDeAumento) {
        this.salario += this.salario * (percentualDeAumento / 100);
    }
}