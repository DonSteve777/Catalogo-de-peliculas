package main;

import java.util.Scanner;

import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

public class Main {
	
	private static Scanner in;
	private static int opcion;
	private static final String FILE_NAME =  "c:\\users\\alvaro\\Desktop\\peliculas.txt“\r\n";
	private static CatalogoPeliculas catalogo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		catalogo = new CatalogoPeliculasImpl();
		opcion = -1;
		
		
		while(opcion != 0) {
			System.out.print(
					"1.- Iniciar catalogo peliculas" +
					"2.- Agregar pelicula" + 
					"3.- Listar peliculas" + 
					"4.- Buscar pelicula" + 
					"0.- salir \n");
			opcion = in.nextInt();
			
			
			switch (opcion) {
			case 1:
				catalogo.iniciarArchivo(FILE_NAME);
				break;
			case 2:
				System.out.print("nombre para la peli: \n");
				String pelicula = in.nextLine();
				catalogo.agregarPelicula(pelicula, FILE_NAME);
				break;
			case 3:
				catalogo.listarPeliculas(FILE_NAME);
				break;
			case 4:
				System.out.print("nombre para la peli: \n");
				String peliculaSearch = in.nextLine();
				
				catalogo.buscarPelicula(FILE_NAME, peliculaSearch);
				break;
			case 0:
				System.out.print("Saliendo de la aplicacion \n");
				break;

			default:
				
				break;
			}
	
		}		
	}

}
