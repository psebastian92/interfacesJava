package paqueteCelulares;

import interfaces.Conectable;
import interfaces.Encendible;
import interfaces.Recargable;

public class Samsung extends Celular  implements Conectable, Encendible, Recargable{

	public Samsung(String modelo, int numeroTelefono) {
		super("Samsung", modelo, numeroTelefono); // Marca fija en el super
	}

	@Override
	public void asignarNumero() {
		System.out.println("El número ha sido asignado automáticamente: " + getNumeroTelefono());
	}

	@Override
	public void instalarSistemaOperativo() {
		System.out.println("Se ha instalado One UI (Android modificado por Samsung).");
	}

	@Override
	public void mostrarInfoCel() {

		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Número: " + getNumeroTelefono());
	}

	// Método exclusivo de Samsung
	public void usarSPen() {
		System.out.println("Usando el S-Pen exclusivo de Samsung.");
	}

	// Métodos de las interfaces
	@Override
	public void cargarBateria() {
		System.out.println("El Samsung" + getModelo() + " está cargando la batería...");
	}

	@Override
	public void encender() {
		System.out.println("El Samsung" + getModelo() + " se está encendiendo...");
	}

	@Override
	public void conectarWifi() {
		System.out.println("El Samsung" + getModelo() + " se ha conectado a una red WiFi.");
	}
}
