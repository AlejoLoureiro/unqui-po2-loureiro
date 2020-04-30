package ar.edu.unq.po2.tp4.trabajador;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp4.ingreso.Ingreso;

public class Trabajador {

	private List<Ingreso> ingresos;
	
	public Trabajador() {
		ingresos = new ArrayList<Ingreso>();
	}
	
	public Double getTotalPercibido() {
		Double totalPercibido = 0.0;
		for (Ingreso ingreso:ingresos) {
			totalPercibido += ingreso.getMonto();
		}
		totalPercibido -= this.getImpuestoAPagar();
		return totalPercibido;
	}
	
	public Double getMontoImponible() {
		Double montoImponible = 0.0;
		for (Ingreso ingreso:ingresos) {
			if (ingreso.getEsImponible()) {
				montoImponible += ingreso.getMonto();
			}
		}
		return montoImponible;
	}
	
	public Double getImpuestoAPagar() {
		// calculo el 2% a pagar por impuesto al tabajador
		return (this.getMontoImponible() * 0.02);
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
}
