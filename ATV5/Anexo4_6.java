package anexo4_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anexo4_6 {
    
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Menu menu = new Menu();
        int opc = 0;
        
        while (opc != 5) { 
            Scanner scanner = new Scanner(System.in);
            menu.iniciarMenu();
            opc = scanner.nextInt();
            scanner.nextLine();
        
            switch (opc) {
                case 1:
                    System.out.print("Informe o ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Informe o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe o preco: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Informe a quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    produtos.add(new Produto(id, nome, preco, quantidade));
                    break;
                case 2:
                    for (Produto p : produtos) {
                        System.out.println("------------------");
                        System.out.println("Nome: " + p.getNome());
                        System.out.println("ID: " + p.getId());
                        System.out.println("Preco: R$" + p.getPreco());
                        System.out.println("Quantidade: " + p.getQuantidade());
                        System.out.println("Valor de estoque: " + p.getPreco()*p.getQuantidade());
                        System.out.println("------------------");
                    }
                    break;
                case 3:
                    System.out.print("Insira o ID do produto: ");
                    String inputId = scanner.nextLine();
                    for (Produto p : produtos) {
                        if (p.getId().equals(inputId)) {
                            System.out.println("Produto encontrado");
                            System.out.print("Nome: ");
                            String mudarNome = scanner.nextLine();
                            System.out.print("Preco: ");
                            double mudarPreco = scanner.nextDouble();
                            System.out.print("Quantidade: ");
                            int mudarQuantidade = scanner.nextInt();
                            scanner.nextLine();
                            p.setNome(mudarNome);
                            p.setPreco(mudarPreco);
                            p.setQuantidade(mudarQuantidade);
                            break;
                        } 
                    }
                    System.out.println("Produto nao encontrado.");
                    break;
                case 4:
                    System.out.print("Insira o ID do produto: ");
                    String scanId = scanner.nextLine();
                    for (Produto p : produtos) {
                        if (p.getId().equals(scanId)) {
                            System.out.println("Produto encontrado.");
                            produtos.remove(p);
                            System.out.println("Produto removido.");
                            break;
                        }
                    }
                    System.out.println("Produto nao encontrado.");
                    break;
            }
        }
    }
}
