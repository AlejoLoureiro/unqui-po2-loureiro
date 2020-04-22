package ar.edu.unq.po2.tp3.rectangulo;

import ar.edu.unq.po2.tp3.punto.Punto;

public class Rectangulo {
	
	Punto esquinaSuperiorIzquierda;
	Punto esquinaInferiorIzquierda;
	Punto esquinaSuperiorDerecha;
	Punto esquinaInferiorDerecha;
	int alto;
	int ancho;
	
	public Rectangulo(Punto esqSupIzq, int alto, int ancho) {
		this.esquinaSuperiorIzquierda = esqSupIzq;
		this.esquinaInferiorIzquierda = new Punto(esqSupIzq.getX(), esqSupIzq.getY() - alto);
		this.esquinaSuperiorDerecha = new Punto(esqSupIzq.getX() + ancho, esqSupIzq.getY());
		this.esquinaInferiorDerecha = new Punto(esqSupIzq.getX() + ancho, esqSupIzq.getY() - alto);
	}
}
