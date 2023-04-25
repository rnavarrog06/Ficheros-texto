package maestredam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Jwc {

	public static void main(String[] args) {

		int contador = 0;
		int contador_lineas =0;
		try (BufferedReader fuente = new BufferedReader(new FileReader("src/maestredam/Jtype.java"));) {
			// MOSTRAR EL ARCHIVO EN CONSOLA
			
			int car = fuente.read();
			while (car != -1) {
				
				System.out.printf("%c", car);
				car = fuente.read();
				String caract = (String) car;
				contador++;
				
				
				
				
			}

			int primerCaracter = fuente.read(); // i de importar

			fuente.close();

			System.out.println((char) primerCaracter);

		} catch (FileNotFoundException fnfe) {
			System.out.println("Capturada! No está el fichero (?)");
			System.out.println(fnfe);

		} catch (IOException ioe) {
			System.out.println(ioe);

		}finally {
			System.out.println("Hay un total de: "+contador + " caracteres");
		}

	}
}
