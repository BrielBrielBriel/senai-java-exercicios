package atv2;

public class ATV2 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Cerrissete da Silva");
        
        funcionario.setSalario(1000);
        
        System.out.println("Salario atual: " + funcionario.getSalario());
        
        funcionario.aumentarSalario(20);
        
        System.out.println("Novo salario: " + funcionario.getSalario());;
        
        System.out.println("### QUESTAO 2 #### \n");
        
        Macaco king = new Macaco("King");
        Macaco kong = new Macaco("Kong");
        
        System.out.println("Macaco " + king.getNome() + ":");
        king.comer("Banana");
        king.verEstomago();
        king.comer("Manga");
        king.verEstomago();
        king.comer("Goiaba");
        king.verEstomago();
        
        System.out.println("Macaco " + kong.getNome() + ":");
        kong.comer("Pastel de flango");
        kong.verEstomago();
        kong.comer("Lasanha");
        kong.verEstomago();
        kong.comer("Cajivis");
        kong.verEstomago();
        
        kong.comer(king.getNome());
        kong.verEstomago();
        
        kong.digerir();
        kong.verEstomago();
        kong.digerir();
        kong.verEstomago();
        
        king.verEstomago();
        
        System.out.println("### QUESTAO 3 #### \n");
        
        MacacoPrime cezar = new MacacoPrime("cezar");
        
        cezar.comer("Coxinha");
        
        cezar.verEstomago();
        
        System.out.println("### QUESTAO 4 #### \n");
        
        MacacoPremium macaco = new MacacoPremium("Macaco");
        
        macaco.comer("Pastel de flango", 100);
        macaco.verEstomago();
    }
}
