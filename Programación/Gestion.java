public class Gestion {
    public static void main(String[] args) throws Exception {

        final String patronCif = "[A-Z]{1}[0-9]{8}"; //Patron para el CIF
		final String patronDNI = "[0-9]{8}[A-Z]{1}"; //Patron para el DNI

	do{
		entrada = new Scanner(System.in);

		System.out.println("1 - Crear y Registrar Videoclub");
		System.out.println("2 - Registrar pelicula en videoclub");
		System.out.println("3 - Crear y registrar cliente en videoclub");
		System.out.println("4 - Alquilar pelicula");
		System.out.println("5 - Devolver pelicula");
		System.out.println("6 - Dar de baja cliente");
		System.out.println("7 - Dar de baja pelicula");
		System.out.println("8 - Salir");

		opcion = entrada.nextLine();

			switch (opcion) {

				case "1": 
				
					break;

				case "2": 
				
					break;

                case "3": 
				
			    	break;
                
                case "4": 
				
					break;

				case "5": 

                    break;

			//DAR DE BAJA CLIENTE
				case "6": 
				
					break;

			//DAR DE BAJA PELICULA
				case "7": 
				
					break;

			//SALIR
				case "8":
					System.out.println("Cerrando el programa");
					break;
			
			}
		}
		while(!opcion.equals("8"));
		entrada.close();
	}

}
    