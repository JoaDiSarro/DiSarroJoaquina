package clases;

import excepciones.ContraseniaInvalidaException;
import excepciones.NombreInvalidoException;

public class Usuario {
	
	private String nombre;
	private String contrasenia;

	public Usuario(String nombre,String contrasenia) {
		try {
			setNombre(nombre);
			setContrasenia(contrasenia);
		} 
		catch (ContraseniaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		catch (NombreInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreInvalidoException {
		
		this.nombre=null;
		
		if (nombre!=null && nombre!="") 
				this.nombre=nombre;
		else
			throw new NombreInvalidoException("El nombre no debe estar vacio");
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) throws ContraseniaInvalidaException {
		
		this.contrasenia=null;
		
		if (contrasenia!=null && contrasenia.length()>6 && contrasenia.charAt(0)>='a' && contrasenia.charAt(0)<='z')
			this.contrasenia = contrasenia;
		else
			throw new ContraseniaInvalidaException("La contraseña debe tener mas de 6 caracteres y su primer caracter debe ser una letra");
	}

	@Override
	public String toString() {
		
		return "\nUsuario: "+this.nombre+"\nContraseña: "+this.contrasenia;
	}
	
	
	

}
