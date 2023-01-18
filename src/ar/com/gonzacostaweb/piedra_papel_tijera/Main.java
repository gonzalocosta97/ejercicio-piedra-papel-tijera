package ar.com.gonzacostaweb.piedra_papel_tijera;
import java.util.*;

public class Main {

	public static void main(String[] args) {
				
		System.out.println("----- Piedra, papel o tijera ----- \n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("(Jugador 1) \n");
		
		System.out.println("1 = Piedra | 2 = Papel | 3 = Tijera \n");
				
		String seleccionJ1 = entrada.nextLine();
		
		while (!seleccionJ1.equals("1") && !seleccionJ1.equals("2")  && !seleccionJ1.equals("3") ) {
			
			System.out.println("\nNo elegiste una opción válida, intentalo nuevamente.\n");
			
			seleccionJ1 = entrada.nextLine();
			
			
		}
		
		System.out.println("\n(Jugador 2) \n");
		
		System.out.println("1 = Piedra | 2 = Papel | 3 = Tijera \n");
		
		String seleccionJ2 = entrada.nextLine();
		
		while (!seleccionJ2.equals("1") && !seleccionJ2.equals("2")  && !seleccionJ2.equals("3") ) {
			
			System.out.println("\nNo elegiste una opción válida, intentalo nuevamente.\n");
			
			seleccionJ2 = entrada.nextLine();
			
			
		}
		
		
		if (seleccionJ1.equals("1") && seleccionJ2.equals("1")) {
			
			System.out.println("\n¡Empate!");
			
		}
		
		if (seleccionJ1.equals("1") && seleccionJ2.equals("2")) {
			
			System.out.println("\n¡Ganó Jugador 2!");
			
		}
		
		if (seleccionJ1.equals("1") && seleccionJ2.equals("3")) {
			
			System.out.println("\n¡Ganó Jugador 1!");
			
		}
		
		if (seleccionJ1.equals("2") && seleccionJ2.equals("1")) {
			
			System.out.println("\n¡Ganó Jugador 1!");
			
		}
		
		if (seleccionJ1.equals("2") && seleccionJ2.equals("2")) {
			                                                       
			System.out.println("\n¡Empate!");                        
			                                                       
        }
		
		if (seleccionJ1.equals("2") && seleccionJ2.equals("3")) {
	    	                                                       
			System.out.println("\n¡Ganó Jugador 2!");                        
      	                                                       
        } 
	
		if (seleccionJ1.equals("3") && seleccionJ2.equals("1")) {
        	                                                       
			System.out.println("\n¡Ganó Jugador 2!");                        
        	                                                       
        }
		
		if (seleccionJ1.equals("3") && seleccionJ2.equals("2")) {  

			System.out.println("\n¡Ganó Jugador 1!");                          
			                                                         
		}                                                         
		
		if (seleccionJ1.equals("3") && seleccionJ2.equals("3")) {  
			                                                         
			System.out.println("\n¡Empate!");                         
			                                                         
		}
		
		entrada.close();
		
	}		
		
}	
		

                                            