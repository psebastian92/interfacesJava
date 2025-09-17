package paqueteVehiculos;

import interfaces.Encendible;

public class Moto extends Vehiculo implements Encendible {

    public Moto(String marca, int anio) {
        super(marca, anio);
    }

    @Override
    public void encender() {
        System.out.println("La moto arranca con el pedal.");
    }
}