package ar.edu.unq.po2.tp6.cliente1;

import java.util.ArrayList;
import java.util.List;

public class CuentaClienteEMail {

	private ServidorPop servidor;
	private List<Correo> inbox;
	private List<Correo> borrados;
	
	public CuentaClienteEMail(ServidorPop servidor) {
		this.servidor = servidor;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
	}
	
	public void borrarCorreo(Correo correo) {
		this.inbox.remove(correo);
		this.eliminarBorrado(correo);
	}
	
	public int contarBorrados() {
		return this.borrados.size();
	}
	
	public int contarInbox() {
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo) {
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(String nombreUsuario, String passUsuario) {
		this.servidor.recibirNuevos(nombreUsuario, passUsuario);
	}
	
	public void enviarCorreo(Correo correo) {
		this.servidor.enviar(correo);
	}
	
}
