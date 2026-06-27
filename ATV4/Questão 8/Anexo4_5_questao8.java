package anexo4_5_questao8;

public class Anexo4_5_questao8 {

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(8.5, 5.4);
        System.out.println("Area: " + retangulo1.calcularArea());
        System.out.println("Perimetro: " + retangulo1.calcularPerimetro());
        retangulo1.quadrado();
        
        Retangulo retangulo2 = new Retangulo(5, 5);
        System.out.println("Area: " + retangulo2.calcularArea());
        System.out.println("Perimetro: " + retangulo2.calcularPerimetro());
        retangulo2.quadrado();
        
    }
    
}
