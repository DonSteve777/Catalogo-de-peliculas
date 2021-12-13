package mx.com.gm.peliculas.negocio;

import java.io.IOException;

import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

public interface CatalogoPeliculas {
	
	public void agregarPelicula(String pelicula, String archivo) throws IOException;
	
	void listarPeliculas(String archivo) throws IOException;
	
	void buscarPelicula(String archivo, String buscar) throws IOException;
	
	void iniciarArchivo(String archivo) throws AccesoDatosEx, IOException;

}
