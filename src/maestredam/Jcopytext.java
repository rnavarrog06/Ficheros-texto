package maestredam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Jcopytext {

	public static void main(String[] args) {

		try (FileReader fuente = new FileReader("src/maestredam/Jtype.java");
				FileWriter fw = new FileWriter("Jtype_copy")) {
			// MOSTRAR EL ARCHIVO EN CONSOLA
			int car = fuente.read();
			
			while (car != -1) {
				fw.write(car);
				System.out.printf("%c", car);
				car = fuente.read();
			}

			int primerCaracter = fuente.read(); // i de importar

			fuente.close();

			System.out.println((char) primerCaracter);

		} catch (FileNotFoundException fnfe) {
			System.out.println("Capturada! No está el fichero (?)");
			System.out.println(fnfe);

		} catch (IOException ioe) {
			System.out.println(ioe);

		}

	}
}