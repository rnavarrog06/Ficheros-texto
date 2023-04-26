package maestredam;

import java.io.*;

public class FichBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isPNG(String filename) {

		boolean resultado = false;
		final int CAB_BYTES = 3;
		StringBuffer conjunto = new StringBuffer("");

		try (FileInputStream fuente = new FileInputStream(filename)) {

			fuente.skip(1);

			for (int i = 0; i < CAB_BYTES; i++) {
				char unByte = (char) fuente.read();

				conjunto.append(unByte);

			}

			if (conjunto.charAt(0) == 'P' && conjunto.charAt(1) == 'N' && conjunto.charAt(2) == 'G') {
				resultado = true;
			}

		} catch (IOException e) {
			System.out.println("ERROR: " + e);

		} finally {
			return resultado;
		}
	}

	public static boolean isGif89(String fichImage) {
			boolean resultado = false;
			final int CAB_BYTES = 5;
			StringBuffer conjunto = new StringBuffer("");
			
			try (FileInputStream imagen = new FileInputStream(fichImage)) {
				
				for (int i=0; i< CAB_BYTES; i++) {
					char unByte = (char) imagen.read();
					
					conjunto.append(unByte);
				}
				
				if (conjunto.charAt(0) == 'G' && conjunto.charAt(1) == 'I' && conjunto.charAt(2) == 'F'
						&& conjunto.charAt(4) == '8' && conjunto.charAt(4) == '9') {
					resultado = true;
				}
				
			}catch(IOException e) {
				System.out.println("ERROR: "+ e);
			}finally {
				return resultado;
			}
			
	}

	public static boolean isGif87(String fichImage) {
		boolean resultado = false;
		final int CAB_BYTES = 5;
		StringBuffer conjunto = new StringBuffer("");
		
		try (FileInputStream imagen = new FileInputStream(fichImage)) {
			
			for (int i=0; i< CAB_BYTES; i++) {
				char unByte = (char) imagen.read();
				
				conjunto.append(unByte);
			}
			
			if (conjunto.charAt(0) == 'G' && conjunto.charAt(1) == 'I' && conjunto.charAt(2) == 'F'
					&& conjunto.charAt(4) == '8' && conjunto.charAt(4) == '7') {
				resultado = true;
			}
			
		}catch(IOException e) {
			System.out.println("ERROR: "+ e);
		}finally {
			return resultado;
		}
		
}

	public static boolean exists(String fichImage) {

	}

}
