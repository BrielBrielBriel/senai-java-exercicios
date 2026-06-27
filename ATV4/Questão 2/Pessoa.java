package anexo4_5_questao2;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "cm");
    }
    
    public void maiorIdade() {
        if (this.idade < 18) {
            System.out.println(this.nome + " e menor de idade.");
            return;
        }
        System.out.println(this.nome + " e maior de idade");
    }

}
