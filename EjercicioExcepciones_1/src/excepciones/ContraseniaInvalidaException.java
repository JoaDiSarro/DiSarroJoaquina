package excepciones;

@SuppressWarnings("serial")
public class ContraseniaInvalidaException extends Exception{

	public ContraseniaInvalidaException(String contrasenia) {
		super(contrasenia);
	}

}
