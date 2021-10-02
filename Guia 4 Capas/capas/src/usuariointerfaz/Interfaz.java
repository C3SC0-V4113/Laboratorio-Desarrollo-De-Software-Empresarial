package usuariointerfaz;

import java.util.Scanner;
import datos.contacto;
import negocios.Agenda;

public class Interfaz {
	static Scanner entrada = new Scanner(System.in);
	static Agenda libro = new Agenda();

	public static void lectura() {
		System.out.println("Bienvenido");
		System.out.println("Elija una opción");
		imprimirMenu();
	}

	private static void validar() {
		System.out.println("Ingresar nuevo contacto");
		System.out.println("Ingrese la información del contacto");
		System.out.println("El nombre debe contener máximo 10 caracteres");
		System.out.println("El celular contiene 8 digitos");
		contacto contacto = new contacto();
		System.out.println("Nombre: ");
		contacto.setNombre(entrada.next());
		System.out.println("Teléfono: ");
		contacto.setCelular(entrada.nextLong());
		if (libro.add(contacto) == true) {
			System.out.println("El contacto ha sido agregado");
		} else {
			System.out.println("Error al ingresar los datos");
			System.out.println("Si desea agregar un contacto elija la opción 1");
		}
		imprimirMenu();
	}

	private static void mostrarContactos() {
		System.out.println(libro);
		imprimirMenu();
	}

	private static void salir() {
		System.out.println("Fin de la ejecución");
		System.exit(0);
	}

	private static void imprimirMenu() {
		System.out.println("Bienvenido");
		System.out.println("Elija una opción");
		System.out.println("1. Nuevo contacto");
		System.out.println("2.Contactos");
		System.out.println("3.Salir");
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			validar();
			break;
		case 2:
			mostrarContactos();
			break;
		case 3:
			salir();
			break;
		default:
			System.out.println("Opción inválida");
			break;
		}
	}
}