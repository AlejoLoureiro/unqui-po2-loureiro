package ar.edu.unq.po2.tp4.ingreso;

public class IngresoHorasExtra extends Ingreso {
	
	public Double cantidadDeHoras;
	
	public IngresoHorasExtra(String mes, String concepto, Double monto, Double horas) {
		super(mes,concepto,monto);
		this.esImponible = false;
		this.cantidadDeHoras = horas;
	}
}
