package mx.com.gm.peliculas.datos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mx.com.gm.peliculas.domain.Pelicula;

public class AccesoDatosImpl implements AccesoDatos {

	@Override
	public boolean existe(String nombre) {
		// TODO Auto-generated method stub
		Path path = Paths.get("c:\\users\\alvaro\\Desktop\\" + nombre);
		return Files.exists(path);
	}

	@Override
	public List<Pelicula> listar(String nombre) throws IOException {
		// TODO Auto-generated method stub
	     List<Pelicula> result = new ArrayList<Pelicula>();
	    Scanner scanner = new Scanner(new File(nombre)); 

	     while(scanner.hasNext()) {
	    	result.add(new Pelicula(scanner.nextLine()));
	     }
	    
	    return result;
	}

	@Override
	public void escribir(Pelicula pelicula, String archivo, boolean anexar) throws IOException {
		// TODO Auto-generated method stub
		String str = pelicula.getNombre();
	    Path path = Paths.get(archivo);
	    byte[] strToBytes = str.getBytes();
	    Files.write(path, strToBytes);
	}

	@Override
	public boolean buscar(String archivo, String buscar) throws IOException {
		// TODO Auto-generated method stub
		List<Pelicula> result = new ArrayList<Pelicula>();
	    Scanner scanner = new Scanner(new File(archivo)); 
	    boolean found = false;

	     while(scanner.hasNext() && !found) {
	    	String current = scanner.nextLine();
	    	found = current.equals(buscar);
	     }
	    
	    return found;
	}

	@Override
	public void crear(String archivo) throws IOException {
		// TODO Auto-generated method stub
		Path newFilePath = Paths.get(archivo);
	    Files.createFile(newFilePath);
	}

	@Override
	public void borrar(String archivo) throws IOException {
		// TODO Auto-generated method stub
	    File fileToDelete = new File(archivo);
	    fileToDelete.delete();	
	}

}
