package anexo4_5_questao5;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    
    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public double media() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    public void situacao() {
        if (media() > 7) {
            System.out.println(this.nome + " esta aprovado");
            return;
        }
        System.out.println(this.nome + " esta reprovado");
    }

}
