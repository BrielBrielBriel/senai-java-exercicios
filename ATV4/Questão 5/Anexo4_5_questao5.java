package anexo4_5_questao5;

public class Anexo4_5_questao5 {

    public static void main(String[] args) {
        Aluno joao = new Aluno("Joao", "545487", 7.5, 8.9);
        System.out.println("Media: " + joao.media());
        joao.situacao();
        Aluno felipe = new Aluno("Felipe", "727233", 4.5, 3.6);
        System.out.println("Media: " + felipe.media());
        felipe.situacao();

    }
    
}
