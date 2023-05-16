package z091_matrices;

import model.Persona;


public class Z091_matrices {

   
    public static void main(String[] args) {
        
        String matriz1[][] = {{"Naranja", "Limón"}, {"Peras", "Manzanas"}, {"Yuca", "Plátano"}};
        imprimir(matriz1);
        
        Persona personas[][] = new Persona[3][7];    
        personas[0][0] = new Persona("César", 47);
        personas[0][1] = new Persona("César1", 478);
        personas[1][1] = new Persona("César1", 78);
        personas[2][6] = new Persona("César1", 7);
        
        imprimir (personas);

}
    
    
    public static void imprimir(Object mat[][]){
        for (int ren = 0; ren < mat.length; ren++) {
            for (int col = 0; col < mat[ren].length; col++) {
                System.out.println("matriz " + ren + "-" + col + " : " + mat[ren][col]);                
            }            
        }
    }

}

    

