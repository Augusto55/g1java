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
    public String Editora;
    public boolean estaAlugado;

    public void criarLivro(String nome, String genero, int ano, int codigo, String editora, boolean estaAlugado){
        this.setNome(nome);
        this.setGenero(genero);
        this.setAno(ano);
        this.setCodigo(codigo);
        this.setEditora(editora);
        this.setEstaAlugado(false);
        
        
    }
  
}


 class LivroLocal extends Livro {
        
    }
