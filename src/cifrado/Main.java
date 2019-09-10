package cifrado;

import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			System.out.println("Obteniendo generador de claves con cifrado AES");
			
			KeyGenerator keygen = KeyGenerator.getInstance("AES");
			
			System.out.println("Generando clave");
			SecretKey key = keygen.generateKey();
			
			
			System.out.println("Obteniendo objeto Cipher con cifrado AES");
			Cipher aesCipher = Cipher.getInstance("AES");
			
			aesCipher.init(Cipher.ENCRYPT_MODE, key);
			
			System.out.println("Introduzca el mensaje que quiere cifrar: ");
			Scanner sc = new Scanner(System.in);
			String mensaje = /*sc.nextLine();*/ "hola";
			
			String mensajeCifrado = new String(aesCipher.doFinal(mensaje.getBytes()));
			
			System.out.println("El mensaje cifrado es " + mensajeCifrado);
			
			
			aesCipher.init(Cipher.DECRYPT_MODE, key);
			
			String mensajeDescifrado = new String(aesCipher.doFinal(mensajeCifrado.getBytes()));
			
			System.out.println("Descifrando mensaje...");
			
			System.out.println("Mensaje descifrado: "+ mensajeDescifrado );
		}catch(Exception e){
		
		ejecutar();}
		
		
	}
	
	public static void ejecutar() {
try {
			
			
			KeyGenerator keygen = KeyGenerator.getInstance("AES");
			
			System.out.println("Generando clave");
			SecretKey key = keygen.generateKey();
			
			
			System.out.println("Obteniendo objeto Cipher con cifrado AES");
			Cipher aesCipher = Cipher.getInstance("AES");
			
			aesCipher.init(Cipher.ENCRYPT_MODE, key);
			
			System.out.println("Preparando mensaje");
			String mensaje = "Mensaje a cifrar";
			
			String mensajeCifrado = new String(aesCipher.doFinal(mensaje.getBytes()));
			
			System.out.println("El mensaje cifrado es " + mensajeCifrado);
			
			
			aesCipher.init(Cipher.DECRYPT_MODE, key);
			
			String mensajeDescifrado = new String(aesCipher.doFinal(mensajeCifrado.getBytes()));
			
			System.out.println("Mensaje descifrado: "+ mensajeDescifrado );
		}catch(Exception e){ejecutar();
		}
		
		
	}

}
