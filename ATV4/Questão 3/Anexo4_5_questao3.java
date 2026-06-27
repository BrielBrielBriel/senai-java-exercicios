package anexo4_5_questao3;

public class Anexo4_5_questao3 {

    public static void main(String[] args) {
        Produto pao = new Produto("Pao", 3.5, 8);
        System.out.println("Nome: " + pao.getNome());
        System.out.println("Preco: R$" + pao.getPreco());
        System.out.println("Estoque: " + pao.getEstoque() + " unidades");
        System.out.println("Valor em estoque: R$" + pao.calcularPreco());
    }
    
}
