package vehiculos;

public class Patinete extends Vehiculo {
    //1. Atributos
    private String marca;
    private int capacidadBateria;
    private boolean tieneLuces;

    //2. Constructores

    //2.1 Constructor completo
    public Patinete(String modelo, int numeroPlazas, double precioPorDias, String marca, int capacidadBateria, boolean tieneLuces) {
        super(modelo, numeroPlazas, precioPorDias);
        this.marca = marca;
        this.capacidadBateria = capacidadBateria;
        this.tieneLuces = tieneLuces;
    }

    //2.2 Constructor vacío
    public Patinete() {
    }

    //3. Métodos

    //3.1 Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isTieneLuces() {
        return tieneLuces;
    }

    public void setTieneLuces(boolean tieneLuces) {
        this.tieneLuces = tieneLuces;
    }

    //3.2 Incluir el metodo getAutonomia(consumo) que, dado un consumo estimado en Ah/km, devuelva la autonomía total en km
    public double getAutonomia(double consumo) {
        return capacidadBateria / consumo;
    }

    //3.3 Incluir el metodo toString()
    public String toString() {
        return "[Patinete] " + modelo + ", de " + marca + " (" + precioPorDias + " €/día)";
    }

}
