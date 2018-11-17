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
public class Merge {

    public static int[] mergeSort(int v[], int inicio, int fim) {
        int meio;

        if (inicio == fim) { // tamanho = 1
            return v;
        } else {
            // encontra o meio
            meio = (inicio + fim) / 2;
            // ordena 1a metade
            mergeSort(v, inicio, meio);
            mergeSort(v, meio + 1, fim);
            // intercala
            merge(v, inicio, meio, fim);
        }
        return v;
    }

    public static void merge(int vetor[], int inicio, int meio, int fim) {
        int prim = inicio;
        int seg = meio + 1;
        int i = inicio;
        int[] aux = new int[fim+1];
        // enquanto tiver elementos nos dois conjuntos
        while ((prim <= meio) && (seg <= fim)) {
            // insere elemento do primeiro
            if (vetor[prim] <= vetor[seg]) {
                aux[i] = vetor[prim];
                prim++;
            } else { // insere elemento do segundo
                aux[i] = vetor[seg];
                seg++;
            }
            i++;
        }
        // sobrou elementos do segundo
        if (prim > meio) {
            while (seg <= fim) {
                aux[i] = vetor[seg];
                seg++;
                i++;
            }
            // sobrou elementos do primeiro
        } else {
            while (prim <= meio) {
                aux[i] = vetor[prim];
                prim++;
                i++;
            }
        }
        // copia o vetor auxiliar no vetor principal
        for (i = inicio; i <= fim; i++) {
            vetor[i] = aux[i];
        }
    }

    public int[] sort(int[] vector) {
        return mergeSort(vector, 0, vector.length - 1);
    }

    
    public String getName() {
        return "Merge sort";
    }

}
