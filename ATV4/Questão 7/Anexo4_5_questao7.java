package anexo4_5_questao7;

public class Anexo4_5_questao7 {

    public static void main(String[] args) {
        Livro livro = new Livro("Quarto de Despejos", "Carolina Maria de Jesus", 150, 'S');
        livro.emprestar();
        livro.exibir();
        System.out.println("------------------------------------");
        livro.devolver();
        livro.exibir();
    }
    
}
