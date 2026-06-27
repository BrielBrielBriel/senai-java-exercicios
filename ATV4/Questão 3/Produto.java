package anexo4_5_questao3;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public String getNome() { 
        return this.nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public int getEstoque() {
        return this.estoque;
    }
    
    public double calcularPreco() {
        return this.preco * this.estoque;
    }
    
}
