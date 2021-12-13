package mx.com.gm.peliculas.datos;

import java.io.IOException;
import java.util.List;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

public interface AccesoDatos {
	
	public boolean existe(String nombre);
	
	public List<Pelicula> listar(String nombre) throws IOException;
	
	public void escribir(Pelicula pelicula, String archivo, boolean anexar) throws IOException;
	
	public boolean buscar(String archivo, String buscar) throws IOException;
	
	public void crear(String archivo) throws AccesoDatosEx, IOException;
	
	public void borrar(String archivo) throws IOException;
	
	
}
