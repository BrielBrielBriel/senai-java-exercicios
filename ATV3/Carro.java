package anexo4;

public class Carro {
    private double combustivel;
    private double consumo;
    
    public double getCombustivel() {
        return combustivel;
    }
    
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    
    public double getConsumo() {
        return consumo;
    }
    
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    public void andar(double distancia) {
        combustivel -= distancia / consumo;
    }
    
    public void abastecer(double quantidade) {
        combustivel += quantidade;
    }
}
