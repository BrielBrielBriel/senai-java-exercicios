package ExerciciosPOOPt1;

public class Quadrado {
    private int lado;
    
    public int getLado() {
        return lado;
    }
    
    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int calcularArea() {
        return lado * lado;
    }
}
