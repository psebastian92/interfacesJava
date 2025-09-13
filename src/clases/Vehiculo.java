package clases;

abstract class Vehiculo {
    String marca;
    int anio;

    Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca + " - A�o: " + anio);
    }

    // M�todo abstracto (obliga a cada subclase a definirlo)
    abstract void encender();
}