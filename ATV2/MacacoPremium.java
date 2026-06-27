package atv2;

import java.util.Arrays;

public class MacacoPremium {
    private String nome;
    private Alimento[] estomago;
    
    public MacacoPremium(String nome) {
        this.nome = nome;
        estomago = new Alimento[3];
    }
    
    public String getNome() {
        return nome;
    }
    
    public void comer(String nome, double kcal) {
        Alimento alimento = new Alimento(nome, kcal);
        
        for (int i = 0; i < estomago.length; i++) {
            if(estomago[i] == null) {
                estomago[i] = alimento;
                return;
            }
        }
        
        System.out.println("Estomago cheio!!!");
    }
    
    public void verEstomago() {
        System.out.println(Arrays.toString(estomago));
    }
    
    public void digerir() {
        for (int i = 0; i < estomago.length; i++) {
            if(estomago[i] != null) {
                estomago[i] = null;
                return;
            }
        }
        
        System.out.println("Estomago vazio");
    }
}
