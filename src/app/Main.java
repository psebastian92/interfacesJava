package app;

import java.util.ArrayList;

import interfaces.Conectable;
import interfaces.Recargable;
import interfaces.Encendible;
import paqueteCelulares.Celular;
import paqueteCelulares.Motorola;
import paqueteCelulares.Samsung;
import paqueteVehiculos.Auto;
import paqueteVehiculos.Moto;
import paqueteVehiculos.Vehiculo;

public class Main {
	public static void main(String[] args) {
		ejecutarVehiculo();
		System.out.println("\n----------\n");
		ejecutarCelular();
	}

	public static void ejecutarVehiculo() {
		Vehiculo v1 = new Auto("Tesla", 2023);
		Vehiculo v2 = new Moto("Yamaha", 2019);
		// Vehiculo v3 = new Vehiculo("Yamaha", 2019);
		// NO se puede!!! Las clases abstractas no son instanciables

		v1.mostrarInfoVehiculo();
		v1.encender();

		System.out.println("\n----------\n");

		v2.mostrarInfoVehiculo();
		v2.encender();

		System.out.println("\n----------\n");

		// Usando las interfaces
		if (v1 instanceof Vehiculo) {
			((Conectable) v1).conectarWifi();
		}

		if (v1 instanceof Vehiculo) {
			((Recargable) v1).cargarBateria();
		}
	}

	public static void ejecutarCelular() {

		Motorola m1 = new Motorola("G15", 564654);

		System.out.println("\n----------\n");

		Samsung s1 = new Samsung("S24 FE", 544548);

		ArrayList<Celular> listaCelulares = new ArrayList<>();

		listaCelulares.add(m1);
		listaCelulares.add(s1);

		// Mostrar info de cada celular
		for (Celular celular : listaCelulares) {
			celular.mostrarInfoCel();
			//celular.encender(); NO se puede! Pues la clase "Celular" NO implementa las interfaces
			System.out.println("-----");
		}
		
		s1.encender();
		s1.cargarBateria();
		s1.conectarWifi();
		s1.usarSPen();
		
		System.out.println("\n----------\n");
		
		m1.encender();
		m1.cargarBateria();
		m1.conectarWifi();
		
	}

}
