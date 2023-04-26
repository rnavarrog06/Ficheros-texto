package maestredam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FUtil {

	public static void main(String[] args) {

		boolean valor = existe();

		if (valor == false) {
			System.out.println("No se ha encontrado el fichero");
		} else {

		}
		
		metodoprueba();

	}

	public static boolean existe() {

		try (FileReader fuente = new FileReader("src/maestredam/alumnos.dam")) {

			return true;

		} catch (FileNotFoundException fnfe) {
			return false;

		} catch (IOException e) {
			System.out.println("Error: " + e);
			return false;
		}

	}
	
	public static void metodoprueba() {
		System.out.println("Hola");
	}

}
