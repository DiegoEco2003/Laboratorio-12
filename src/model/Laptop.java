package model;

public abstract class Laptop {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private String tipoProcesador;
    private double tamanoPantalla;

    public Laptop(String marca, String modelo, int anio, String procesador, double pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anio;
        this.tipoProcesador = procesador;
        this.tamanoPantalla = pantalla;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAnioFabricacion() { return anioFabricacion; }
    public void setAnioFabricacion(int anio) { this.anioFabricacion = anio; }
    public String getTipoProcesador() { return tipoProcesador; }
    public void setTipoProcesador(String procesador) { this.tipoProcesador = procesador; }
    public double getTamanoPantalla() { return tamanoPantalla; }
    public void setTamanoPantalla(double pantalla) { this.tamanoPantalla = pantalla; }

    public abstract void ejecutarPrueba();

    @Override
    public String toString() {
        return "Marca y Modelo: " + marca + " " + modelo + "\n" +
                "Año de Fabricacion: " + anioFabricacion + "\n" +
                "Procesador: " + tipoProcesador + "\n" +
                "Tamaño de la Pantalla: " + tamanoPantalla;
    }
}