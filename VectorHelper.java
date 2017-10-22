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
