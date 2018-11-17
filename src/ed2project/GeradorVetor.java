/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2project;

import java.security.SecureRandom;

/**
 *
 * @author tulioaoki
 */
public class GeradorVetor {
    public int [] gerarVetor(int tamanho, int tipo){
        switch(tipo){
            case 1:
                return gerarOrdenado(tamanho);              
            case 2:
                return gerarReverso(tamanho);
            case 3:
                return gerarAleatorio(tamanho);
            default:
                System.out.println("Invalid");
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    } 

    private int[] gerarOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for(int i = 0; i < vetor.length;i++){
            vetor[i] = i;
        }
        return vetor;
    }

    private int[] gerarReverso(int tamanho) {
        int[] vetor = new int[tamanho];
        for(int i = 0; i < vetor.length;i++){
            vetor[i] = tamanho - i;
        }
        return vetor;
    }

    private int[] gerarAleatorio(int tamanho) {
        SecureRandom r = new SecureRandom();
        int[] vetor = new int[tamanho];
        for(int i = 0; i < vetor.length;i++){
            vetor[i] = r.nextInt();
        }
        return vetor;
    }
}
