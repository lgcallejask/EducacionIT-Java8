package ejercicio;

public class Auto extends Vehiculo {

	int puertas;

	public Auto(int puertas, String marca, String modelo, Double precio) {
		super(marca,modelo,precio);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "Auto [puertas=" + puertas + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", getPuertas()=" + getPuertas() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getPrecio()=" + getPrecio() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}	

}
