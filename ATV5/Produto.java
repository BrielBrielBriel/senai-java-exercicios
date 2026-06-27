package anexo4_6;

public class Produto {
    private String id;
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getNome() { 
        return this.nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void exibirProduto() {
        System.out.println("Nome: " + getNome());
        System.out.println("ID: " + getId());
        System.out.println("Preco: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
    }
    
    
}
