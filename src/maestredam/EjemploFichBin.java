package maestredam;

import java.io.*;

public class EjemploFichBin {

	public static void main(String[] args) {
		String nombres[] = { "Jaime", "Javier", "Raúl" };
		double numeros[] = new double[3];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Math.random();
			System.out.printf("%s - %f%n", nombres[i], numeros[i]);
		}

		// Escribo los datos de los tres alumnos en un fichero
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("alumnos.dam"))) {
			// Escribo solo a Jaime

			for (int i = 0; i < numeros.length; i++) {
				dos.writeUTF(nombres[i]);
				dos.writeDouble(numeros[i]);
			}

		} catch (IOException e) {
			System.out.println("ERROR: " + e);
		}

		// Ahora leemos desde el fichero
		try (DataInputStream tres = new DataInputStream(new FileInputStream("alumnos.dam"))) {

			
			for (int i = 0; i < numeros.length; i++) {
				String num1 = tres.readUTF();
				double num12 = tres.readDouble();
				System.out.println("Ahora es " + num1 + " y " + num12);
			}
			// Al llegar a EOF, lanza EOFException, esa es la forma de saber que he
			// terminado, se haría diferente:
			
			/* Usamos while(true) para que sea un bucle infinito, ya que el fin del bucle lo indica la excepcion EOFException
			 * 
			 * 	while (true) {
			 * 	nombre = dos.readUTF();
			 * 	numero = tres.reaDouble();
			 * 	System.out.printf ("%s - %f%n", nombre, numero);
			 * 
			 * 	}
			 */
			
			
		} catch (EOFException eof) {
			System.out.println("ERROR: " + eof);
			
		} catch (IOException e) {
			System.out.println("ERROR: " + e);

		}

	}

}
