package AC3;

import java.util.Scanner;

public class AC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		
		//Ejercicio1
		System.out.println("Escribe la cantidad de euros, tiene que ser múltiplo de 5: ");
		int cantidad = reader.nextInt();
		
		int billete5 = 0;
		int billete10 = 0;
		int billete20 = 0;
		int billete50 = 0;
		int billete100 = 0;
		int billete200 = 0;
		int billete500 = 0;
		int cantidadrestante;
		
		if (cantidad > 0) {
				if (cantidad % 5 == 0 )
				{
					if (cantidad >= 500) {
						cantidad = 500 - cantidad;
						billete500 ++ ;
					}
					else if (cantidad >= 200) {
						cantidad = 200 - cantidad;
						billete200 ++ ;
					}
					else if (cantidad >= 100) {
						cantidad = 100 - cantidad;
						billete100 ++ ;
					}
					else if ( cantidad >= 50) {
						cantidad = 50 - cantidad;
						billete50 ++ ;
					}
					else if ( cantidad >= 20) {
						cantidad = 20 - cantidad;
						billete20 ++ ;
					}
					else if ( cantidad >= 10) {
						cantidad = 10 - cantidad;
						billete10 ++ ;
					}
					else if ( cantidad >= 5) {
						cantidad = 5 - cantidad;
						billete5 ++ ;
					}
			}
	
				System.out.println("La cantidad de billetes de 5 es, " + billete5 + " billete/s.");
				System.out.println("La cantidad de billetes de 10 es, " + billete10 + " billete/s.");
				System.out.println("La cantidad de billetes de 20 es, " + billete20 + " billete/s.");
				System.out.println("La cantidad de billetes de 50 es, " + billete50 + " billete/s.");
				System.out.println("La cantidad de billetes de 100 es, " + billete100 + " billete/s.");
				System.out.println("La cantidad de billetes de 200 es, " + billete200 + " billete/s.");
				System.out.println("La cantidad de billetes de 500 es, " + billete500 + " billete/s.");


	}else {
		
	}

}
}
