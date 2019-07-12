package ejercicio;

public class Moto extends Vehiculo{

	Integer cilindrada;

	public Moto(Integer cilindrada, String marca, String modelo, Double precio) {
		super(marca,modelo,precio);
		this.cilindrada = cilindrada;
	}

	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", getCilindrada()=" + getCilindrada() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getPrecio()=" + getPrecio() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
