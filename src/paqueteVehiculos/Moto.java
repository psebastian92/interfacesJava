package paqueteVehiculos;

public class Moto extends Vehiculo {

    public Moto(String marca, int anio) {
        super(marca, anio);
    }

    @Override
    public void encender() {
        System.out.println("La moto arranca con el pedal.");
    }
}