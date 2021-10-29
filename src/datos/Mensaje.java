package datos;

public class Mensaje {
	
	private String destinatario;
	private String mensaje;
	
	public Mensaje(String destinatario, String mensaje) {
		if (destinatario == null || destinatario.isEmpty())
			throw new IllegalArgumentException("destinatario es null o vacío");
		if (mensaje == null || mensaje.isEmpty()) {
			throw new IllegalArgumentException("mensaje es null o vacío");
		}
		this.destinatario = destinatario;
		this.mensaje = mensaje;
	}
	
	public String destinatario() {
		return destinatario;
	}
	
	public String mensaje() {
		return mensaje;
	}
	
	@Override
	public String toString() {
		return "Para: " + destinatario + "\nMensaje: " + mensaje;
	}
	
	@Override
	public boolean equals(Object otro) {
		if (otro == null)
			return false;
		if (!(otro instanceof Mensaje))
			return false;
		if (otro == this)
			return true;
		Mensaje otroComoMensaje = (Mensaje) otro;
		if (!destinatario.equals(otroComoMensaje.destinatario))
			return false;
		return mensaje.equals(otroComoMensaje.mensaje);
	}

}
