package ExerciciosPOOPt1;

public class Retangulo {
    private int base;
    private int altura;
    
    public int getBase() {
        return base;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int calcularArea() {
        return base * altura;
    }
    
    public int calcularPerimetro() {
        return base * 2 + altura * 2;
    }
}
