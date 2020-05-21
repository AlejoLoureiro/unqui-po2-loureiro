package ar.edu.unq.po2.tp6.solicitudDeCredito;

import ar.edu.unq.po2.tp6.cliente.Cliente;

public class CreditoPersonal extends SolicitudDeCredito {

	public CreditoPersonal(Cliente cliente, Double monto, Integer plazoEnMeses) {
		super(cliente, monto, plazoEnMeses);
	}

	@Override
	public boolean esAceptable() {
		return ((this.getCliente().ingresosAnuales()>= 15000d) && (this.montoDeLaCuota() < this.getCliente().getSueldoNeto() * 0.7));
	}
}
