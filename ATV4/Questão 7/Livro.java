package anexo4_5_questao7;

public class Livro {
    private String nome;
    private String autor;
    private int n_paginas;
    private char emprestado;
    
    public Livro(String nome, String autor, int n_paginas, char emprestado) {
        this.nome = nome;
        this.autor = autor;
        this.n_paginas = n_paginas;
        this.emprestado = emprestado;
    }
    
    public void emprestar() {
        this.emprestado = 'S'; 
    }
    
    public void devolver() {
        this.emprestado = 'N';
    }
    
    public void exibir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero de paginas: " + this.n_paginas);
        System.out.println("Emprestado: " + this.emprestado);
    }

}
