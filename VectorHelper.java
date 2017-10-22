/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;



 *
 * @author Sid Ali Mahmoudi
 * @author Merwan Hellal
 * @version 1.0.0
 * cette classe sert à effectuer qlq opérations sur les vecteurs comme le trie, la somme le minimum, le maximum ... 
 */

//cette classe sert à effectuer qlq opérations sur les vecteurs comme le trie, la somme le minimum, le maximum ... 
public class VecteurHelper {
  /**

     * @param vect c'est un tableau d'entiers non trié
     * @return tableau d'entiers trié
     */
   /* public int[] lireVect(int taille){
        int [] vect = new int[taille];
        
        return vect;
    }*/
    
    
    public static int [] trierVect(int vect[] ){
    
    int [] result = vect;
    int i=0,j=0,temp=0;
    
    for(i = 0; i < result.length -1;i++)
    {
        j =i ; 
        while((result[j]>result[j+1]) && (j>0)){
            temp = result[j];
            result[j] = result[j+1];
            result[j+1]=temp;
            j--;
        }
    }
    
    return result;

    }




}

