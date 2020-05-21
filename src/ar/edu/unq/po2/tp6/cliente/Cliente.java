package ar.edu.unq.po2.tp6.cliente;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp6.banco.Banco;
import ar.edu.unq.po2.tp6.propiedad.PropiedadInmobiliaria;
import ar.edu.unq.po2.tp6.solicitudDeCredito.CreditoHipotecario;
import ar.edu.unq.po2.tp6.solicitudDeCredito.CreditoPersonal;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Double sueldoNeto;
	private Banco banco;
	private List<PropiedadInmobiliaria> propiedades; 
	
	public Cliente(String nombre, String apellido, String direccion, Integer edad, Double sueldoNeto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNeto = sueldoNeto;
		this.propiedades = new ArrayList<PropiedadInmobiliaria>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public Double getSueldoNeto() {
		return sueldoNeto;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public Banco getBanco() {
		return banco;
	}
	
	public void agregarPropiedad(PropiedadInmobiliaria propiedad) {
		propiedades.add(propiedad);
	}
	
	public void serClienteDe(Banco banco) {
		this.banco = banco;
	}

	public void solicitarCreditoHipotecario(Double monto, Integer cantMeses, PropiedadInmobiliaria propiedad) {
		if (propiedades.contains(propiedad)) {
			CreditoHipotecario solicitudCredito = new CreditoHipotecario(this, monto, cantMeses, propiedad);
			banco.registrarSolicitudDeCredito(solicitudCredito);
		}
	}

	public void solicitarCreditoPersonal(double monto, int cantMeses) {
		CreditoPersonal solicitudCredito = new CreditoPersonal(this, monto, cantMeses);
		banco.registrarSolicitudDeCredito(solicitudCredito);
	}

	public double ingresosAnuales() {
		return sueldoNeto * 12;
	}

	public Integer cantidadDePropiedades() {
		return propiedades.size();
	}

	

	
}
