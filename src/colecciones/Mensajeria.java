package colecciones;

import datos.Mensaje;
import java.util.List;
import java.util.LinkedList;
import java.util.Set; //conjuntos
import java.util.TreeSet; //implementación de conjuntos para elementos comparables (en este caso se va a usar para String)

public class Mensajeria {

	private Nodo<Mensaje> primerElemento;
	private Nodo<Mensaje> ultimoElemento;
	private int mensajes;
	
	public Mensajeria() {
		mensajes = 0;
		primerElemento = null;
		ultimoElemento = null;
	}
	
	//agrego un nuevo mensaje
	public void agregarMensaje(Mensaje mensaje) {
		Nodo<Mensaje> nuevoNodo = new Nodo<>(mensaje);
		if (sinMensajes()) { //No hay mensajes, ambos primerElemento y ultimoElemento apuntan a null
			ultimoElemento = nuevoNodo;
			primerElemento = nuevoNodo;
		} else { //Hay al menos un mensaje, ultimoElemento apunta al último
			ultimoElemento.siguiente(nuevoNodo);
			ultimoElemento = nuevoNodo;
		}
		mensajes++;
	}
	
	//Elimino un mensaje, y si existe lo retorno, sino retorno null
	public Mensaje eliminarMensaje(Mensaje mensaje) {
		if (mensaje == null)
			throw new IllegalArgumentException("El mensaje es null");
		if (sinMensajes())
			throw new IllegalStateException("No hay mensajes");
		Nodo<Mensaje> corriente = primerElemento; //empiezo desde el primerElemento
		Nodo<Mensaje> anterior = null; //me guardo una referencia al anterior, inicialmente es null
		boolean encontrado = false;
		Mensaje mensajeEliminado = null;
		while (corriente != null) {
			Mensaje mensajeCorriente = corriente.dato();
			if (mensajeCorriente.equals(mensaje)) { //lo encontré, tengo que borrar el nodo corriente
				encontrado = true;
				mensajeEliminado = mensajeCorriente;
				if (anterior == null) { //el mensaje lo encontré en el primerElemento
					primerElemento = corriente.siguiente();
				} else { //El mensaje está en un nodo que está después de primerElemento
					anterior.siguiente(corriente.siguiente()); //tengo anterior -> corriente -> siguiente de corriente, tengo que unir el anterior al siguiente de corriente
				}
				break; //salgo del while
			}
		}
		if (encontrado) {
			mensajes--;
			if (sinMensajes()) {
				ultimoElemento = null; //si me quedé sin mensajes, primerElemento seguro es null
			}
		}
		return mensajeEliminado;
	}
	
	public List<Mensaje> obtenerMensajesPara(String destinatario) {
		if (destinatario == null || destinatario.isEmpty())
			throw new IllegalArgumentException("destinatario es null o vacío");
		List<Mensaje> mensajes = new LinkedList<>();
		Nodo<Mensaje> corriente = primerElemento;
		while (corriente != null) { //recorro los nodos desde primerElemento, mediante siguiente(), hasta que llegue a null
			Mensaje mensajeCorriente = corriente.dato();
			if (mensajeCorriente.destinatario().equals(destinatario))
				mensajes.add(mensajeCorriente);
			corriente = corriente.siguiente(); //avanzo al siguiente nodo
		}
		return mensajes;
	}
	
	public int mensajesPara(String destinatario) {
		throw new UnsupportedOperationException("Falta completar"); //TODO: completar este método
	}
	
	public Set<String> destinatarios() {
		Set<String> destinatarios = new TreeSet<>();
		Nodo<Mensaje> corriente = primerElemento;
		while (corriente != null) {
			Mensaje mensajeCorriente = corriente.dato();
			String destinatarioCorriente = mensajeCorriente.destinatario();
			destinatarios.add(destinatarioCorriente);
		}
		return destinatarios;
	}
	
	public int mensajes() {
		return mensajes;
	}
	
	public boolean sinMensajes() {
		return mensajes == 0;
	}
	
	@Override
	public String toString() {
		throw new UnsupportedOperationException("Falta completar"); //TODO: completar este métod
	}

}
