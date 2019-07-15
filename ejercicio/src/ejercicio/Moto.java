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
		return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindrada: " + String.format("%dc", this.getCilindrada()) + " // Precio: $" + String.format("%,.2f", this.getPrecio());
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
