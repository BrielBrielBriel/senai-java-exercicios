package anexo4_5_questao6;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidade;
    
    public String getMarca() {
        return this.marca;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade);
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setVelocidade(double velocidade) {
        if (velocidade > 0) {
            this.velocidade = velocidade;
            return;
        }
        System.out.println("Velocidade nao pode ser menor que 0");
    }
    
    public void acelerar(double valor) {
        if (valor > 0) {
            this.velocidade += valor;
            return;
        }
        System.out.println("A velocidade nao pode ser negativa");
    }
    
    public void frear(double valor) {
        if (this.velocidade > valor) {
            this.velocidade -= valor;
            return;
        }
        System.out.println("A velocidade nao pode ser negativa");
    }

}
