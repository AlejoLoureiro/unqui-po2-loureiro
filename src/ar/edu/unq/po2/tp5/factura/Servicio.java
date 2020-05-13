package ar.edu.unq.po2.tp5.factura;

public class Servicio implements Factura {
	
	private Double montoPorUnidad;
	private Integer unidadesConsumidas;

	public Servicio(Double montoPorUnidad, Integer unidadesConsumidas) {
		this.montoPorUnidad = montoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	@Override
	public Double montoAPagar() {
		return montoPorUnidad * unidadesConsumidas;
	}

}
