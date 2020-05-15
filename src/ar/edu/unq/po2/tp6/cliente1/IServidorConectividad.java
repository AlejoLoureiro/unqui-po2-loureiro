package ar.edu.unq.po2.tp6.cliente1;


public interface IServidorConectividad {

	public void conectar(String nombreUsuario, String passusuario);
	
	public float tazaDeTransferencia();
	
}
