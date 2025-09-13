package clases;

import interfaces.Conectable;
import interfaces.Recargable;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Auto("Tesla", 2023);
        Vehiculo v2 = new Moto("Yamaha", 2019);
       // Vehiculo v3 = new Vehiculo("Yamaha", 2019);
        // NO se puede!!! Las clases abstractas no son instanciables 
        
        v1.mostrarInfo();
        v1.encender();

        System.out.println("\n----------\n");
        
        v2.mostrarInfo();
        v2.encender();

        System.out.println("\n----------\n");


        // Usando las interfaces
        if (v1 instanceof Conectable) {
            ((Conectable)v1).conectarWifi();
        }

        if (v1 instanceof Recargable) {
            ((Recargable)v1).cargarBateria();
        }
    }
}

