package paqueteVehiculos;

import interfaces.Conectable;
import interfaces.Encendible;
import interfaces.Recargable;

public class Auto extends Vehiculo implements Encendible, Conectable, Recargable {

    public Auto(String marca, int anio) {
        super(marca, anio);
    }

    @Override
    public void encender() {
        System.out.println("El auto arranca con bot�n de encendido.");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando el auto al WiFi...");
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando la bater�a del auto el�ctrico...");
    }
}


