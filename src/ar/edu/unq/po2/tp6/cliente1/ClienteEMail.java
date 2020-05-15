package ar.edu.unq.po2.tp6.cliente1;

public class ClienteEMail {
	
	 ServidorPop servidor;
	 CuentaClienteEMail cuenta;
	 String nombreUsuario;
	 String passusuario;
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.cuenta = new CuentaClienteEMail(servidor);
		this.conectar();
	}
	
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
	
	public String getPassusuario() {
		return this.passusuario;
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.cuenta.borrarCorreo(correo);
	}
	
	public int borrados(){
		return this.cuenta.contarBorrados();
	}
	
	public int cantInbox(){
		return this.cuenta.contarInbox();
	}
	
	public void eliminarBorrado(Correo correo){
		this.cuenta.borrarCorreo(correo);
	}
	
	public void recibirNuevos(){
		this.cuenta.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.cuenta.enviarCorreo(correo);
	}

}
