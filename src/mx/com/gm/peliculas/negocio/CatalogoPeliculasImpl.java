package mx.com.gm.peliculas.negocio;

import java.io.IOException;

import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
	
	private AccesoDatos datos;
	
	public CatalogoPeliculasImpl() {
		super();
	}

	@Override
	public void agregarPelicula(String pelicula, String archivo) throws IOException {
		// TODO Auto-generated method stub
		Pelicula p = new Pelicula(pelicula);
		datos.escribir(p, archivo, true); 	
	}

	@Override
	public void listarPeliculas(String archivo) throws IOException {
		// TODO Auto-generated method stub
		datos.listar(archivo);
	}

	@Override
	public void buscarPelicula(String archivo, String buscar) throws IOException {
		// TODO Auto-generated method stub
		datos.buscar(archivo, buscar);
	}

	@Override
	public void iniciarArchivo(String archivo) throws IOException {
		// TODO Auto-generated method stub
		datos.crear(archivo);
	}

}
