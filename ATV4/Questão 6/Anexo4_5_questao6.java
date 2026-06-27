package anexo4_5_questao6;

public class Anexo4_5_questao6 {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Chevrolet");
        carro.setModelo("SUV");
        carro.setVelocidade(-5);
        carro.exibirVelocidade();
        carro.setVelocidade(40);
        carro.exibirVelocidade();
        carro.acelerar(-5);
        carro.exibirVelocidade();
        carro.acelerar(20);
        carro.exibirVelocidade();
        carro.frear(100);
        carro.exibirVelocidade();
        carro.frear(30);
        carro.exibirVelocidade();

    }
    
}
