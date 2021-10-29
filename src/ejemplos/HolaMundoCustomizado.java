package ejemplos;

import datos.Mensaje;

public class HolaMundoCustomizado {


	//ejecutar javac ejemplos/HolaMundoCustomizado.java (desde la carpeta src)
	//ejecutar java ejemplos.HolaMundoCustomizado <mensaje> (desde la carpeta src)
	//por ejemplo: java ejemplos.HolaMundoCustomizado "Hola Mundo!"
	public static void main(String[] args) {
		if (args == null || args.length != 1) {
			System.err.println("Se espera un solo argumento");
			System.exit(1); //Termina el programa con un código de salida que denota un error
		}
		Mensaje mensaje = new Mensaje("El usuario", args[0]);
		System.out.println(mensaje);
	}

}
