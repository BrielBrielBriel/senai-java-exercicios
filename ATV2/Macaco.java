package atv2;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    private String nome;
    private List<String> estomago;
    
    public Macaco(String nome) {
        this.nome = nome;
        estomago = new ArrayList<String>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void comer(String alimento) {
        estomago.add(alimento);
    }
    
    public void verEstomago() {
        System.out.println(estomago);
    }
    
    public void digerir() {
        estomago.remove(0);
    }
}