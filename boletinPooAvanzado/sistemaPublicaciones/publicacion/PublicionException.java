package sistemaPublicaciones.publicacion;

public class PublicionException extends Exception {

	public PublicionException() {
	}

	public PublicionException(String message) {
		super(message);
	}

	public PublicionException(Throwable cause) {
		super(cause);
	}

	public PublicionException(String message, Throwable cause) {
		super(message, cause);
	}

	public PublicionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
