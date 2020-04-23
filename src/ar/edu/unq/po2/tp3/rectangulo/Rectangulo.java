package ar.edu.unq.po2.tp3.rectangulo;

import ar.edu.unq.po2.tp3.punto.Punto;

public class Rectangulo {
	
	private Punto esquinaSuperiorIzquierda;
	private Punto esquinaInferiorIzquierda;
	private Punto esquinaSuperiorDerecha;
	private Punto esquinaInferiorDerecha;
	int base;
	int altura;
	
	public Rectangulo(Punto esqSupIzq, int base, int altura) {
		this.esquinaSuperiorIzquierda = esqSupIzq;
		this.base = base;
		this.altura = altura;
		this.esquinaInferiorIzquierda = new Punto(esqSupIzq.getX(), esqSupIzq.getY() - altura);
		this.esquinaSuperiorDerecha = new Punto(esqSupIzq.getX() + base, esqSupIzq.getY());
		this.esquinaInferiorDerecha = new Punto(esqSupIzq.getX() + base, esqSupIzq.getY() - altura);
	}
	
	public Punto getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda.copy();
	}
	
	public Punto getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda.copy();
	}
	
	public Punto getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha.copy();
	}
	
	public Punto getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha.copy();
	}
	
	public int area() {
		return (this.base * this.altura);
	}

	public int perimetro() {
		return ((this.base * 2) + (this.altura * 2));
	}

	public String orientacion() {
		String orientacion = new String();
		if (this.base > this.altura) {
			orientacion = "Horizontal";
		} 
		else if (this.base < this.altura) {
			orientacion = "Vertical";
		} else {
			orientacion = "Cuadrado";
		}
		return orientacion;
	}
	
	
}
