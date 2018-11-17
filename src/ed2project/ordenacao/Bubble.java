/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2project.ordenacao;

/**
 *
 * @author tulioaoki
 */
public class Bubble {

    public int[] sort(int[] v){
        int fim = v.length - 2;
        int pos = 0;
        boolean troca = true;
        int chave;
        int i;
        while (troca) {
            troca = false;
            for (i = 0; i <= fim; i++) {
                if (v[i] > v[i+1]) {
                    chave = v[i];
                    v[i] = v[i+1];
                    v[i+1] = chave;
                    pos = i;
                    troca = true;
                }
            }
            fim = pos-1;
        }
        return v;
    }

}
