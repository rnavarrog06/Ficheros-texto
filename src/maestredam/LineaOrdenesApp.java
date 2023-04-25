package maestredam;

public class LineaOrdenesApp {

	public static void main(String[] args) {

		// Esta aplicacion acepta argumentos en la linea de ordenes

		if (args.length == 0) {
			System.out.println("No has tecleado ningún parametro");
			System.out.println("Intenta poner LineaOrdenesApp <palabra>");
		} else {
			String param1 = args[0];
			System.out.println(param1);
			if (param1.equals("--help")) {
				System.out.println("La ayuda esta en camino...");
			} else {
			System.out.println("No lo entiendo");
			}

			
			
			
		}

	}

}
