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
		return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + this.getPuertas() + " // Precio: $" + String.format("%,.2f", this.getPrecio());
	}

	@Override
	public int compareTo(Vehiculo vehiculo) {
		int cPrecio = vehiculo.getPrecio().compareTo(this.getPrecio());
		if (cPrecio > 0) {
    		return 1;
    	} if (cPrecio < 0) {
    		return -1;
    	}
    	int cMarca = vehiculo.getMarca().compareTo(this.getMarca());
		if (cMarca > 0) {
    		return 1;
    	} if (cMarca < 0) {
    		return -1;
    	}
    	int cModelo = vehiculo.getModelo().compareTo(this.getModelo());
		if (cModelo > 0) {
    		return 1;
    	} if (cModelo < 0) {
    		return -1;
    	}
		return 0;
	}

}
