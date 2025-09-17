package paqueteCelulares;

import interfaces.Conectable;
import interfaces.Encendible;
import interfaces.Recargable;

public class Motorola extends Celular implements Conectable, Encendible, Recargable {

	public Motorola(String modelo, int numeroTelefono) {
		super("Motorola", modelo, numeroTelefono);
	}

	@Override
	public void asignarNumero() {
		System.out.println("El número asignado al Motorola es: " + getNumeroTelefono());
	}

	@Override
	public void instalarSistemaOperativo() {
		System.out.println("Se ha instalado Android en el Motorola.");
	}

	@Override
	public void mostrarInfoCel() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Número: " + getNumeroTelefono());
	}

	// Métodos de las interfaces
	@Override
	public void cargarBateria() {
		System.out.println("El Motorola" + getModelo() + " está cargando la batería...");
	}

	@Override
	public void encender() {
		System.out.println("El Motorola" + getModelo() + " se está encendiendo...");
	}

	@Override
	public void conectarWifi() {
		System.out.println("El Motorola" + getModelo() + " se ha conectado a una red WiFi.");
	}
}
