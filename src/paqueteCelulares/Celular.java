package paqueteCelulares;

public abstract class Celular {
	// Atributos propios de un celular (pueden haber mas)
    private String marca;
    private String modelo;
    private int numeroTelefono;
    
    // Método constructor
    public Celular(String marca, String modelo, int numeroTelefono) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroTelefono = numeroTelefono;
    }

    // Métodos abstractos
    public abstract void asignarNumero();
    public abstract void instalarSistemaOperativo();
    public abstract void mostrarInfoCel();

    // Getters y setters 
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getNumeroTelefono() { return numeroTelefono; }
    public void setNumeroTelefono(int numeroTelefono) { this.numeroTelefono = numeroTelefono; }
}
