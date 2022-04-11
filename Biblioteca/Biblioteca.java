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
public class Biblioteca extends Livro{
    float multa;
    public void checarMulta(int dataSaida, int dataRetorno){
        int diasAlugados = dataRetorno - dataSaida;
        float taxaMulta = 3;
        if (diasAlugados > 7) {
            multa = taxaMulta * (diasAlugados - 7);
            System.out.println("Você está com multa de " + multa + " reais");
        }
        else {
            System.out.println("Você não está com multa");
        }
    }

    public void pagarMulta(){
        if (multa == 0){
            System.out.println("Você não possui multas a serem pagas");
        } else {
            multa = 0;
            System.out.println("Você pagou a multa");
        }
    }

    public static void main(String[] args){
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.checarMulta(1,20);
        biblioteca1.pagarMulta();

        Biblioteca biblioteca2 = new Biblioteca();
        biblioteca2.checarMulta(5, 10);
        biblioteca2.pagarMulta();
    }
}




