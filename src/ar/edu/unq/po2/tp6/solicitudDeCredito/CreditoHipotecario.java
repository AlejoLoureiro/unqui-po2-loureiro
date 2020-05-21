package ar.edu.unq.po2.tp6.solicitudDeCredito;

import ar.edu.unq.po2.tp6.cliente.Cliente;
import ar.edu.unq.po2.tp6.propiedad.PropiedadInmobiliaria;

public class CreditoHipotecario extends SolicitudDeCredito {
	
	private PropiedadInmobiliaria propiedad;

	public CreditoHipotecario(Cliente cliente, Double monto, Integer plazoEnMeses, PropiedadInmobiliaria propiedad) {
		super(cliente, monto, plazoEnMeses);
		this.propiedad = propiedad;
	}

	@Override
	public boolean esAceptable() {
		return (this.montoDeLaCuota() < this.getCliente().getSueldoNeto() * 0.5) && 
				(this.getMontoSolicitado() <= propiedad.getValorFiscal() * 0.7) &&
				(this.getCliente().getEdad() + (this.getPlazoEnMeses()/12) < 65);
	}

}
