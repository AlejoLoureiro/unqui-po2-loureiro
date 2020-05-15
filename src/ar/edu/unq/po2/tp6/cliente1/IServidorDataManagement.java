package ar.edu.unq.po2.tp6.cliente1;

import java.util.List;

public interface IServidorDataManagement {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void enviar(Correo correo);

}
