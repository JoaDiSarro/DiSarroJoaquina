package excepciones;

@SuppressWarnings("serial")
public class NombreInvalidoException extends Exception{

	public NombreInvalidoException(String nombre) {
		super(nombre);
	}

}
