package ExerciciosPOOPt1;

public class ControleTV {
    private int canal;
    private int volume;
    
    public ControleTV(){};
    
    public ControleTV(int canal, int volume) {
        if (valorPermitido(canal)) {
            this.canal = canal;
        }
        
        if (valorPermitido(volume)) {
            this.volume = volume;
        } 
    }
    
    public int getCanal() {
        return canal;
    }
    
    public void setCanal(int canal) {
        if (valorPermitido(canal)) {
            this.canal = canal;
        }
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void aumentarVolume() {
        if (valorPermitido(volume)) {
            this.volume += 5;
        }
    }
    
    public void reduzirVolume() {
        if (valorPermitido(volume)) {
            this.volume -= 5;
        }
    }
    
    private boolean valorPermitido(int valor){
        if (valor >= 0 && valor <= 100) {
            return true;
        }
        
        System.out.println("Informe um valor entre 0 e 100");
        return false;
    }
    
}
