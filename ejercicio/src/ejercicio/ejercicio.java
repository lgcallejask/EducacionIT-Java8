package ejercicio;

import java.util.ArrayList;

public class ejercicio {

	public static void main(String[] args) {
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(new Auto(4,"Peugeot","206 ",200000.00));
		vehiculos.add(new Moto(160,"Honda","Titan",60000.00));
		vehiculos.add(new Auto(5,"Peugeot","208  ",250000.00));
		vehiculos.add(new Moto(160,"Yamaha ","YBR  ",85500.50));
		
		vehiculos.forEach(System.out::println);
		
		//vehiculos.stream().
	}

	
}
