package alquilerVehiculos;

public class exceptionAlquilerVehiculos extends Exception {

	public exceptionAlquilerVehiculos() {
	}

	public exceptionAlquilerVehiculos(String message) {
		super(message);
	}

	public exceptionAlquilerVehiculos(Throwable cause) {
		super(cause);
	}

	public exceptionAlquilerVehiculos(String message, Throwable cause) {
		super(message, cause);
	}

	public exceptionAlquilerVehiculos(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
