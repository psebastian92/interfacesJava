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
		System.err.println("-----VEHICULOS-----\n");
		ejecutarVehiculo();
		System.err.println("\n-----CELULARES-----\n");
		ejecutarCelular();
	}

	public static void ejecutarVehiculo() {
		Auto a1 = new Auto("Tesla", 2023);
		Moto m1 = new Moto("Yamaha", 2019);
		// Vehiculo v3 = new Vehiculo("Yamaha", 2019);
		// NO se puede!!! Las clases abstractas no son instanciables

		a1.mostrarInfoVehiculo();
		a1.cargarBateria();
		a1.encender();
		a1.conectarWifi();

		System.out.println("\n----------\n");

		m1.mostrarInfoVehiculo();
		m1.encender();

		System.out.println("\n----------\n");

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
			// celular.encender(); NO se puede! Pues la clase "Celular" NO implementa las
			// interfaces
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
