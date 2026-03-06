package Main;

import java.util.Scanner;

import Dominio.VideoJuegos;
import Implementacion.Implementar;

public class Principal {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner lectura;
		VideoJuegos juegoEncontrado = null;
		String nombre, genero;
		int indice, menu;
		float precio;
		boolean estatus; 
		
		Implementar imp = new Implementar();
		
		do {
			//Opciones de videojuegos
			System.out.println("MENU VIDEOJUEGOS");
			System.out.println("1--ALTA");
			System.out.println("2--MOSTRAR");
			System.out.println("3--BUSCAR");
			System.out.println("4--EDITAR");
			System.out.println("5--ELIMINAR");
			System.out.println("6--SALIR");
			
			lectura = new Scanner(System.in);
			menu = lectura.nextInt();
			
			//Se agrega el menu
			switch (menu) {
			case 1:
				try {
					System.out.println("Ingrese el nombre del videojuego");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();
					
					System.out.println("Ingrese el precio del videojuego");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					System.out.println("Ingrese el genero del videojuego");
					lectura = new Scanner(System.in);
					genero = lectura.nextLine();
					
					System.out.println("Ingrese el estatus del videojuego");
					lectura = new Scanner(System.in);
					estatus = lectura.nextBoolean();
					
					juegoEncontrado = new VideoJuegos(nombre, precio, genero, estatus);
					imp.agregar(juegoEncontrado);
					
					System.out.println("Se agrego correctamente");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No se pudo guaradr");
				}
				break;

			case 2:
				if(imp.mostar().size() > 0) {
					System.out.println(imp.mostar());	
				}else
					System.out.println("No hay registros");
				break;
				
			case 3:
				if (imp.mostar().size() > 0) {
					try {
						//Buscar el valor
						System.out.println("Ingrese el valor a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						
						System.out.println("Valor encontrado" + imp.buscar(indice));
						
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("No se encuentra esa registro");
					}
					
				}else 
					System.out.println("No hay registros");
				break;
				
			case 4:
				if (imp.mostrar().size() > 0) {
					try {
						// Buscar el valor
						System.out.println("Ingrese el valor a actualizar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						juegoEncontrado = imp.buscar(indice);

						// Actualizar el dato
						System.out.println("Ingrese el nuevo valor del genero");
						lectura = new Scanner(System.in);
						genero = lectura.nextLine();
						juegoEncontrado.setGenero(genero);

						imp.editar(indice, juegoEncontrado);
						System.out.println("Dato actualizado correctamente");

					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("No existe ese registro");
					}
				} else
					System.out.println("No hay registros");
				break;
				
			case 5:
				if (imp.mostrar().size() > 0) {
					try {
						// Eliminar el dato
						System.out.println("Ingrese el dato a eliminar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						imp.eliminar(indice);
						System.out.println("Dato eliminado coorectamente");
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("No existe ese registro");
					}
				} else
					System.out.println("No hay registros");
				break;
				
			case 6:
				break;
			}
			
		}while (menu <6);
		
	}
	

}
