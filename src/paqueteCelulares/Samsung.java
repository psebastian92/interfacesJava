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
		System.out.println("El n�mero ha sido asignado autom�ticamente: " + getNumeroTelefono());
	}

	@Override
	public void instalarSistemaOperativo() {
		System.out.println("Se ha instalado One UI (Android modificado por Samsung).");
	}

	@Override
	public void mostrarInfoCel() {

		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("N�mero: " + getNumeroTelefono());
	}

	// M�todo exclusivo de Samsung
	public void usarSPen() {
		System.out.println("Usando el S-Pen exclusivo de Samsung.");
	}

	// M�todos de las interfaces
	@Override
	public void cargarBateria() {
		System.out.println("El Samsung" + getModelo() + " est� cargando la bater�a...");
	}

	@Override
	public void encender() {
		System.out.println("El Samsung" + getModelo() + " se est� encendiendo...");
	}

	@Override
	public void conectarWifi() {
		System.out.println("El Samsung" + getModelo() + " se ha conectado a una red WiFi.");
	}
}
