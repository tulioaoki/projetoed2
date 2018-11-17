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
public class Shellsort {

    public int[] sort(int[] v){
        int i , j , h = 1, value ;
        do {
            h = 3 * h + 1;
        } while ( h < v.length );
        do {
            h = h / 3;
            for ( i = h; i < v.length; i++) {
                value = v [ i ];
                j = i - h;
                while (j >= 0 && value < v [ j ]) {
                    v [ j + h ] = v [ j ];
                    j = j - h;
                }
                v[ j + h ] = value;
            }
        } while ( h > 1 );
        return v;
    }


}
