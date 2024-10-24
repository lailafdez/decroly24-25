package AC6;

public class AC6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio1
		        int[][] matriz = new int[5][5];
		        int contador = 1;
		        
		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 5; j++) {
		                matriz[i][j] = contador;
		                contador++;
		            }
		        }

		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 5; j++) {
		                System.out.print(matriz[i] [j]);
		            }
		            System.out.println();
		        }
		        
		//Ejercicio2
		     int [][] matriz1 = new int[10][10];
		     
		     for (int i = 0; i < 10; i++) {
		    	 for (int j = 0; j < 10; i++) {
		    		 matriz1[i][j] = (i + 1) * (j + 1);
		    	 }
		     }
		     for (int i = 0; i < 10; i++) {
		    	 for (int j = 0; j < 10; j++) {
		    	 System.out.print(matriz1[i][j]); 
		    	 }
		    	 System.out.println(); 		    	        
		     }
		    
		        

}
}
