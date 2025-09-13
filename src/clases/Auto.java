package clases;

import interfaces.Conectable;
import interfaces.Recargable;

class Auto extends Vehiculo implements Conectable, Recargable {

    Auto(String marca, int anio) {
        super(marca, anio);
    }

    @Override
    void encender() {
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


