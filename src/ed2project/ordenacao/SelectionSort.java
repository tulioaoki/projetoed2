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
public class SelectionSort {

    public int[] sort(int[] v) {
        int i, j, menor;
        int aux;
        int fim = v.length - 1;
        for (i = 0; i < fim; i++)  {
            menor = i;
            for (j = i + 1; j <= fim ; j++) {
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }
            aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;
        }
        return v;
    }

}
