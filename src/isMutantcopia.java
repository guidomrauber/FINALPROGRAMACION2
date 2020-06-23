/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mutante;

/**
 *
 * @author grauber
 */
public class isMutant {
  String prueba;  
 private final char[][] tablero;
  
 
 boolean Mutante = true;

    public String getPrueba() {
        return prueba;
    }

    public isMutant(String prueba, char[][] tablero, char[] ejemplo) {
        this.prueba = prueba;
        this.tablero = tablero;
        this.ejemplo = ejemplo;
    }

    
 

    public isMutant(char[][] tablero, char[] ejemplo) {
        this.tablero = tablero;
        this.ejemplo = ejemplo;
    }

    

    public boolean isMutante() {
        return Mutante;
    }

    public void setMutante(boolean Mutante) {
        this.Mutante = Mutante;
    }

    public String getsCadena() {
        return sCadena;
    }

    public void setsCadena(String sCadena) {
        this.sCadena = sCadena;
    }

    public char[] getEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(char[] ejemplo) {
        this.ejemplo = ejemplo;
    }

    public isMutant() {
        this.tablero = new  char[6][6];
    }
   

String sCadena = "Esto es una cadena de texto";
 
private char[] ejemplo ;

public boolean isMutant(String[] dna){

int cuenta=0;

	//rellenamos la matriz con los adn

        rellenarMatriz(tablero,dna);
	
	//muestro el tablero
        
	mostrarMatriz(tablero);
    
        // compara la fila 
        
        cuenta=cuenta+coincidenciaLinea(tablero);
           
        System.out.println("la coincidencia en linea es   "+cuenta);
        
        // compara columna
        
        cuenta=cuenta+coincidenciaColumna(tablero);
        System.out.println("la coincidencia lleva   "+cuenta);

        // compara diagonal principal
        
        cuenta=cuenta+coincidenciaDiagonal(tablero);
        System.out.println("la coincidencia lleva   "+cuenta);
        
        // compara diagonal inversa
        
        cuenta=cuenta+coincidenciaInversa(tablero);
        System.out.println("la coincidencia lleva   "+cuenta);
        
        if(cuenta >1 )
        {
            Mutante = true;
        }
        else
        {
            Mutante = false;
        }
        return Mutante;
    }


    public static void mostrarMatriz(char[][] matriz) {
 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
 
    }

    private void rellenarMatriz(char[][] tablero, String[] dna) {
        for (int i = 0; i < tablero.length; i++) {
            for(int j=0;j<tablero.length;j++){
                      
                    prueba =dna[i];
                    ejemplo =prueba.toCharArray();
                    tablero[i][j]=ejemplo[j];

        } 
    }
 
    }
    public static int coincidenciaLinea(char[][] matriz) {
        int contador=0;
        char simbolo;
        int  coincidencia=0;
 
        for (int i = 0; i < matriz.length; i++) {
 
            //Reiniciamos la coincidencia
            
            //Cogemos el simbolo de la fila
            simbolo = matriz[i][0];
            
                    //sino coincide ya no habra semimutante  en esta fila
                    if (simbolo == matriz[i][1]&& simbolo == matriz[i][2] && simbolo == matriz[i][3]) {
                        contador = contador + 1;
                        System.out.println("hay un posible mutante   "+ contador);
                        return contador;
                    }
                    else 
                    {
                        simbolo = matriz[i][1];
                            if (simbolo == matriz[i][2]&& simbolo == matriz[i][3] && simbolo == matriz[i][4]) {
                                contador = contador + 1;
                                System.out.println("hay un posible mutante");
                                return contador;
                            } 
                            
                            else {
                                simbolo = matriz[i][2];
                                if (simbolo == matriz[i][3]&& simbolo == matriz[i][4] && simbolo == matriz[i][5]) {
                                contador = contador + 1;
                                System.out.println("hay un posible mutante");
                                return contador;
                            }   
                            
                                
                            }
                    
                          }
 
        }
   return coincidencia;
    }

public static int coincidenciaColumna(char[][] matriz) {
        
        int contador=0;
        char simbolo;
        int coincidencia=0;
 
        for (int i = 0; i < matriz.length; i++) {
 
            //Reiniciamos la coincidencia
            
            //Cogemos el simbolo de la fila
            simbolo = matriz[0][i];
            
                    //sino coincide ya no habra semimutante  en esta fila
                    if (simbolo == matriz[1][i]&& simbolo == matriz[2][i] && simbolo == matriz[3][i]) {
                        contador = contador + 1;
                        System.out.println("hay un posible mutante   "+ contador);
                        return contador;
                    }
                    else 
                    {
                        simbolo = matriz[1][i];
                            if (simbolo == matriz[2][1]&& simbolo == matriz[3][i] && simbolo == matriz[4][i]) {
                                contador = contador + 1;
                                System.out.println("hay un posible mutante");
                                return contador;
                            } 
                            
                            else {
                                simbolo = matriz[2][i];
                                if (simbolo == matriz[3][i]&& simbolo == matriz[4][i] && simbolo == matriz[5][i]) {
                                contador = contador + 1;
                                System.out.println("hay un posible mutante");
                                return contador;
                            }   
                            
                                
                            }
                    
                          }
 
        }
   return coincidencia;
    }

 
    public static int coincidenciaDiagonal(char[][] matriz) {
 
        char simbolo;
        int contador=0;
	int cont=1;
        int coincidencia=0;
        //Diagonal principal
        
	simbolo = matriz[0][0];
        
                           //sino coincide ya no habra mutante en esta fila

                if (simbolo == matriz[1][1] && simbolo == matriz[2][2] && simbolo == matriz[3][3]) {
                    
			
					contador = contador + 1;
					return contador;
				  

                }
                else {
                    
			simbolo = matriz[1][1];
                    
			
                        
					if (simbolo == matriz[2][2] && simbolo == matriz[3][3] && simbolo == matriz[4][4]) {
                            			
						contador = contador + 1;
					
                                                return contador;
				  
						
                    }
                        else{

                            simbolo = matriz[2][2];

                            	if (simbolo == matriz[3][3] && simbolo == matriz[4][4] && simbolo == matriz[5][5]) {
                            				
							contador = contador + 1;
					                return contador;
				  
                        }
                    }
                     
            
 
        }
 return coincidencia;
     
        }
 
              
private int coincidenciaInversa(char[][] matriz) {
       
        char simbolo;
        int contador=0;
	int cont=1;
        int coincidencia=0;
        //Diagonal principal
        
	simbolo = matriz[0][5];
        
               //sino coincide ya no habra mutante en esta fila

                if (simbolo == matriz[1][4]&& simbolo == matriz[2][3]&& simbolo == matriz[3][2]) {
                    
			contador = contador + 1;
			return contador;
				  }

                 else {
                    
			simbolo = matriz[1][4];
                    	                     
					if (simbolo == matriz[2][3]&& simbolo == matriz[3][2]&& simbolo == matriz[4][1]) {
                            			
						contador = contador + 1;
					        return contador;
				  
						
                    }
                        else{

                            simbolo = matriz[2][3];

                            

                        			if (simbolo == matriz[3][2]&& simbolo == matriz[4][1]&& simbolo == matriz[5][0]) {
                            				
							contador = contador + 1;
					                return contador;
				  
                        
                    
         
 
     
        }
 
              
 
    }
        
            }
            return coincidencia;
    }
  
            }
 
    
   

        




