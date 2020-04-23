package ar.edu.unq.po2.tp3.rectangulo;

import ar.edu.unq.po2.tp3.punto.Punto;

/**
 *	Implemente cuadrado como una clase propia porque interprete que la consigna pedia
 *	eso porque decia "implemente la clase cuadrado reutilizando lo anterior", pero yo 
 *	lo hubiese implementado como una subclase de rectangulo.

**/
public class Cuadrado {

	private Punto esquinaSuperiorIzquierda;
	private Punto esquinaInferiorIzquierda;
	private Punto esquinaSuperiorDerecha;
	private Punto esquinaInferiorDerecha;
	int lado;
	
	public Cuadrado(Punto esqSupIzq, int lado) {
		this.esquinaSuperiorIzquierda = esqSupIzq;
		this.lado = lado;
		this.esquinaInferiorIzquierda = new Punto(esqSupIzq.getX(), esqSupIzq.getY() - lado);
		this.esquinaSuperiorDerecha = new Punto(esqSupIzq.getX() + lado, esqSupIzq.getY());
		this.esquinaInferiorDerecha = new Punto(esqSupIzq.getX() + lado, esqSupIzq.getY() - lado);
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
		return (this.lado * this.lado);
	}

	public int perimetro() {
		return (this.lado * 4);
	}
	
}
