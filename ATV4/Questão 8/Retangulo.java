package anexo4_5_questao8;

public class Retangulo {
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public double calcularArea() {
        return this.largura * this.altura;
    }
    
    public double calcularPerimetro() {
        return this.largura * 2 + this.altura * 2;
    }
    
    public void quadrado() {
        if (this.largura == this.altura) {
            System.out.println("Esse retangulo e um quadrado");
            return;
        }
        
        System.out.println("Esse retangulo nao e um quadrado");
    }
}
