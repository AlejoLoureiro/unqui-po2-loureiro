package ar.edu.unq.po2.tp6.solicitudDeCredito;

import ar.edu.unq.po2.tp6.cliente.Cliente;

public abstract class SolicitudDeCredito {

	private Cliente cliente;
	private Double montoSolicitado;
	private Integer plazoEnMeses;
	
	public SolicitudDeCredito(Cliente cliente, Double monto, Integer plazoEnMeses) {
		this.cliente = cliente;
		this.montoSolicitado = monto;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public Double getMontoSolicitado() {
		return montoSolicitado;
	}

	public Integer getPlazoEnMeses() {
		return plazoEnMeses;
	}
	
	public Double montoDeLaCuota() {
		return montoSolicitado/plazoEnMeses;
	}
	
	public abstract boolean esAceptable();

	
}
