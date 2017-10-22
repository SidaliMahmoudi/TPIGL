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
  
  /**
     *
     * @param vect1 tableau d'entiers qlq de meme taille que vect2
     * @param vect2 tableau d'entier qlq
     * @return tableau de meme taille que vect1 et vect2 tq chaque case contient la somme des deux cases de vect1 et vect2 
     * @throws TailleDeferentExcepton généré au cas où vect1 et vect2 ont des tailles différentes
     */
    public static int [] sommeDeuxVect(int vect1[], int vect2[]) throws TailleDeferentExcepton{
        
        if ((vect1.length < vect2.length) || (vect1.length > vect2.length)) 
            throw new TailleDeferentExcepton();
            
        int sum [] = new int [vect1.length];
        for(int i= 0 ; i < vect1.length ; i++)
            sum[i] = vect1[i] + vect2[i];
        
        return sum;
    }
    
    /**
     *
     * @param vect tableau d'entiers qlq
     * @return l'inverse du tableau donné en entré i,e le premier élément devient le dernier dans le vecteur résultat
     */
    public static int [] reverse(int vect[]){
        int result [] = new int [vect.length];
    
        for(int i = vect.length-1 ,j=0; i>= 0;i--,j++)
            result[j] = vect[i];
        
        return result;
    }
    
    /**
     *
     * @param vect tableau d'entiers qlq
     * @return tableau de taille = 02 tq tab[0] contient le minimum du vecteur et tab[1] conteint le maximum 
     */
    public static int [] minMaxVect(int vect[]){
        int result [] = new int [2];
        result[0] = vect[0];
        result[1] = vect[0];
        
        for(int i =1 ; i < vect.length;i++){
         if(vect[i] < result[0])
             result[0] = vect[i];
         if(vect[i] > result[1])
             result[1] = vect[i];
        }
        return result;
    }
    
    /**
     *
     * @param vect tableau d'entiers qlq
     * @param in le taux d'incrémentation qu'on veut l'ajout à chaque élément
     * @return un tableau incrémenté à partir le tableau d'entré
     */
    public static int [] increamentVect(int vect[],int in){
        int result[] = new int [vect.length];
        for(int i =0 ; i < vect.length;i++)
            result[i] = vect[i] + in;
        return result;
    }
    //public 

    /**
     *
     * @param args
     */
    
    public static void main(String[] args) {
    
        
    
    }




}

