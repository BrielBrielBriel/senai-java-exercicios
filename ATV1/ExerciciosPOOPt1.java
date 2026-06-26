package ExerciciosPOOPt1;

public class ExerciciosPOOPt1 {

    public static void main(String[] args) {
        Bola bola = new Bola();
        Bola bola2 = new Bola();
        
        bola.setCor("Azul");
        bola2.setCor("Vermelho");
        
        System.out.println("Cor da bola: " + bola.getCor());
        System.out.println("Cor da bola: " + bola2.getCor());
        
        System.out.println("### QUESTAO 2 ###");
        
        Quadrado q1 = new Quadrado();
        
        q1.setLado(5);
        System.out.println("Lado: " + q1.getLado());
        System.out.println("Area: " + q1.calcularArea());
        
        System.out.println("### QUESTAO 3 ###");
        
        Retangulo r1 = new Retangulo();
        
        r1.setBase(5);
        r1.setAltura(8);
        
        System.out.println("Base: " + r1.getBase() + "\nAltura: " + r1.getAltura());
        System.out.println("Area: " + r1.calcularArea() + "\nPerimetro: " + r1.calcularPerimetro());
        
        System.out.println("### QUESTAO 4 ###");
        
        ControleTV ct1 = new ControleTV(120, 120);
        
        System.out.println("Volume: " + ct1.getVolume() + "\nCanal: " + ct1.getCanal());
        
        ct1.reduzirVolume();
        ct1.setCanal(120);
        
        System.out.println("Volume: " + ct1.getVolume() + "\nCanal: " + ct1.getCanal());
        
        
    }
    
}
