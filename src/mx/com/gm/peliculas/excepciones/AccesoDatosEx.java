package mx.com.gm.peliculas.excepciones;

import java.io.IOException;

public class AccesoDatosEx extends IOException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccesoDatosEx(String errorMsg) {
		super("Acceso datos excepcion:" + errorMsg);
	}
	

}
