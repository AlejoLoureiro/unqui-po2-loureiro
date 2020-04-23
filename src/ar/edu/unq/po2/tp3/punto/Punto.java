package ar.edu.unq.po2.tp3.punto;

public class Punto {
	
	private int x;
	private int y;
	
	//constructor
	public Punto(int x, int y) {
		this.setXY(x,y);
	}
	
	public Punto() {
		this.setXY(0,0);
	}
	
	private void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	private void setX(int x) {
		this.x = x;
	}
	
	private void setY(int y) {
		this.y = y;
	}
	
	// Sumo x a la x del punto
	public void sumX(int x) {
		this.x = this.x + x;
	}
	
	// Sumo y a la y del punto
	public void sumY(int y) {
		this.y = this.y + y;
	}
	
	// Resto x a la x del punto 
	public void subX(int x) {
		this.x = this.x - x;
	}
	
	// Resto y a la y del punto
	public void subY(int y) {
		this.y = this.y - y;
	}

	public boolean isEqualTo(Punto punto) {
		return ((this.getX() == punto.getX()) && (this.getY() == punto.getY()));
	}
	
	public Punto copy() {
		Punto punto = new Punto(x,y);
		return punto;
	}
	
	public void moverPunto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public Punto sumarPunto(Punto punto) {
		Punto puntoRes = new Punto(this.getX() + punto.getX(), this.getY() + punto.getY());
		return puntoRes;
	}
}
