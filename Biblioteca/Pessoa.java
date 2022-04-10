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
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private int livrosAlugados;
    private boolean possuiMulta;
    private float valorMulta;
    
    
    public void criarPessoa(){
        this.setNome("João da Silva");
        this.setCpf("132.121.122-89");
        this.setIdade(26);
        this.setLivrosAlugados(2);
        this.setPossuiMulta(false);
        this.setValorMulta(0);
    }

    public void mostrarPessoa(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("N. de livros alugados: " + this.getLivrosAlugados());
        System.out.println("Possui multa: " + this.isPossuiMulta());
        System.out.println("Valor da multa: " + this.getValorMulta());
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the livrosAlugados
     */
    public int getLivrosAlugados() {
        return livrosAlugados;
    }

    /**
     * @param livrosAlugados the livrosAlugados to set
     */
    public void setLivrosAlugados(int livrosAlugados) {
        this.livrosAlugados = livrosAlugados;
    }

    /**
     * @return the possuiMulta
     */
    public boolean isPossuiMulta() {
        return possuiMulta;
    }

    /**
     * @param possuiMulta the possuiMulta to set
     */
    public void setPossuiMulta(boolean possuiMulta) {
        this.possuiMulta = possuiMulta;
    }

    /**
     * @return the valorMulta
     */
    public float getValorMulta() {
        return valorMulta;
    }

    /**
     * @param valorMulta the valorMulta to set
     */
    public void setValorMulta(float valorMulta) {
        this.valorMulta = valorMulta;
    }
    
    
    
    
    public static void main(String[] args){ 
        Pessoa pessoa1 = new Pessoa();
        pessoa1.criarPessoa();
        pessoa1.mostrarPessoa();
    }
}



