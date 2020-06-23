/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mutante;

/**
 *
 * @author guidorauber
 */
public class Mutante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean mutante;
	boolean mutante1;
        isMutant ejemplo = new isMutant();
        String dna[]={"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
	String dna1[]={"ATGCGA","CAGTGC","TTATTT","AGACGG","GCGTCA","TCACTG"};
        mutante=ejemplo.isMutant(dna);
		
        if (mutante == true){
        
        System.out.println("EL INDIVIDUO ES MUTANTE");}
        else {
            System.out.println("EL INDIVIDUO NO ES MUTANTE");
        }
        
        /*mutante1=ejemplo.isMutant(dna1);
        
		if (mutante1 == true){
        
        System.out.println("EL INDIVIDUO ES MUTANTE");}
        else {
            System.out.println("EL INDIVIDUO NO ES MUTANTE");
        }*/
        
         
}
}
