package ejercicio;

import java.util.ArrayList;
import java.util.Comparator;

public class ejercicio {

	public static void main(String[] args) {
		
		ArrayList<Vehiculo> vehiculos = generarVehiculos();
		vehiculos.forEach(System.out::println);
		
		Vehiculo vMasCaro=vehiculos.stream().max(Comparator.comparing(Vehiculo::getPrecio)).get();
		Vehiculo vMasBarato=vehiculos.stream().min(Comparator.comparing(Vehiculo::getPrecio)).get();
		Vehiculo vConY= vehiculos.stream().filter(v->v.getModelo().toLowerCase().contains("y")).findFirst().get();
		
		System.out.println("=============================");
		System.out.println("Vehículo más caro: " + vMasCaro.getMarcaModelo());
		System.out.println("Vehículo más barato: " + vMasBarato.getMarcaModelo());
		System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + vConY.getMarcaModelo() + " " + String.format("%,.2f",vConY.getPrecio()));
		System.out.println("=============================");
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		vehiculos.stream().sorted().forEach(v->System.out.println(v.getMarcaModelo()));
		
	}
	
	private static ArrayList<Vehiculo> generarVehiculos(){
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(new Auto(4,"Peugeot","206",200000.00));
		vehiculos.add(new Moto(125,"Honda","Titan",60000.00));
		vehiculos.add(new Auto(5,"Peugeot","208",250000.00));
		vehiculos.add(new Moto(160,"Yamaha","YBR",85500.50));
		return vehiculos;
	}

	
}
