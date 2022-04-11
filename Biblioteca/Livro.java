/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author 1131312
 */
public class Livro {
    public String nome;
    public String genero;
    public int ano;
    public int codigo;
    public String editora;
    public boolean estaAlugado;

    public void criarLivro(String nome, String genero, int ano, int codigo, String editora, boolean estaAlugado){
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.codigo = codigo;
        this.editora = editora;
        this.estaAlugado = estaAlugado;
    }

    public void mostrarLivro(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Ano: " + this.ano);
        System.out.println("Código: " + this.codigo);
        System.out.println("Editora: " + this.editora);
        System.out.println("Está alugado: " + this.estaAlugado);
        System.out.println("                ");
    }

    public void alugarLivro(){
        if(this.estaAlugado) {
            System.out.println("Este livro já foi alugado");
            System.out.println("                ");
        }
        else {
            this.estaAlugado = true;
        }
    }

    public void devolverLivro(){
        if(this.estaAlugado) {
            this.estaAlugado = false;
            System.out.println("O livro foi devolvido");
        }
        else {
            System.out.println("Este livro não está alugado");
            System.out.println("                ");
        }
    }


    public static void main(String[] args) {
        LivroLocal livroL = new LivroLocal();
        livroL.criarLivro("Duna", "Sci-fi", 2018, 1, "Aleph", false);
        livroL.mostrarLivro();
        livroL.alugarLivro();

        LivroAlugar livroA = new LivroAlugar();
        livroA.criarLivro("Neuromancer", "Cyberpunk", 2017, 2, "Aleph", false);
        livroA.mostrarLivro();
        livroA.alugarLivro();
        livroA.devolverLivro();


    }
}


 class LivroLocal extends Livro {
     @Override
     public void alugarLivro() {
         System.out.println("Este livro só pode ser lido na biblioteca e não pode ser alugado");
         System.out.println("                ");
     }
 }

 class LivroAlugar extends Livro {
     @Override
     public void alugarLivro() {
         super.alugarLivro();
         System.out.println("O livro foi alugado");
         System.out.println("                ");
     }
 }


