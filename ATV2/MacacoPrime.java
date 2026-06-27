package atv2;

import java.util.Arrays;

public class MacacoPrime {
    private String nome;
    private String[] estomago;
    
    public MacacoPrime(String nome) {
        this.nome = nome;
        estomago = new String[3];
    }
    
    public String getNome() {
        return nome;
    }
    
    public void comer(String alimento) {
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