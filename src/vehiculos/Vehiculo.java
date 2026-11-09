package vehiculos;

public class Vehiculo {
    //1. Atributos
    protected String modelo;
    protected int numeroPlazas;
    protected double precioPorDias;

    //2. Constructores

    //2.1 Constructor completo
    public Vehiculo(String modelo, int numeroPlazas, double precioPorDias) {
        this.modelo = modelo;
        this.numeroPlazas = numeroPlazas;
        this.precioPorDias = precioPorDias;
    }

    //2.2 Constructor vacío
    public Vehiculo() {
    }

    //3. Métodos

    //3.1 Getters y setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public double getPrecioPorDias() {
        return precioPorDias;
    }


    public void setPrecioPorDias(double precioPorDias) {
        this.precioPorDias = precioPorDias;
    }

    //3.2 Incluir el metodo precio por días
    public double calcularPrecio (int numVehiculos, int dias) {
        return numVehiculos * precioPorDias * dias;
    }

    //3.3 Incluir el metodo toString()
    public String toString() {
        return "[Vehículo] " + modelo + " (" + precioPorDias + " €/día)";
    }
}
