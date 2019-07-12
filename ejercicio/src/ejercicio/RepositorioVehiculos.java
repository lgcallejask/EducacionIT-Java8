package ejercicio;

import java.util.ArrayList;
import java.util.Comparator;

public static class RepositorioVehiculos {

	static public Vehiculo getMasCaro(ArrayList<Vehiculo> vehiculos ){
		return vehiculos.stream().max(Comparator.comparing(Vehiculo::getPrecio)).get();
	}
	
	static public Vehiculo getMasBarato(ArrayList<Vehiculo> vehiculos ){		
		return vehiculos.stream().min(Comparator.comparing(Vehiculo::getPrecio)).get();
	}
	
	static public ArrayList<Vehiculo> getFiltroModelo(ArrayList<Vehiculo> vehiculos, String input ){
		return vehiculos.stream().filter(v->v.getModelo().contains(input))).to;
	}
	
}
