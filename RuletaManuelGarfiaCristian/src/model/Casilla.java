package model;

public class Casilla {

	private int color;
	private int num;
	private int seccion;
	private boolean parImpar;
	
	public Casilla(int color, int num, int seccion, boolean parImpar) {
		super();
		this.color = color;
		this.num = num;
		this.seccion = seccion;
		this.parImpar = parImpar;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	public boolean isParImpar() {
		return parImpar;
	}

	public void setParImpar(boolean parImpar) {
		this.parImpar = parImpar;
	}



	public String toString() {
		return "Casilla [color=" + color + ", num=" + num + ", seccion=" + seccion + ", parImpar=" + parImpar + "]";
	}
	
	
	
	
	
}
