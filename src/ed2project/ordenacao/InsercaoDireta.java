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
public class InsercaoDireta {
    
    public int[] sort(int[] vector){

        int i, j;
        int chave;
        int fim = vector.length - 1;
        for (i = 1; i <= fim; i++) {
            chave = vector[i];
            j = i - 1;
            while (j >= 0 && vector[j] > chave) {
                vector[j+1] = vector[j];
                j = j - 1;
            }
            vector[j+1] = chave;
        }

        return vector;
    }


}
