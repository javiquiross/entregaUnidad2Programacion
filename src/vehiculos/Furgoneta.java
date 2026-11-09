package vehiculos;

public class Furgoneta extends Vehiculo {
    //1. Atributos
    private String fabricante;
    private double volumenCarga;

    //2. Constructores

    //2.1 Constructor completo
    public Furgoneta(String modelo, int numeroPlazas, double precioPorDias, String fabricante, double volumenCarga) {
        super(modelo, numeroPlazas, precioPorDias);
        this.fabricante = fabricante;
        this.volumenCarga = volumenCarga;
    }

    //2.2 Constructor vacío
    public Furgoneta() {
    }

    //3. Métodos

    //3.1 Getters y setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getVolumenCarga() {
        return volumenCarga;
    }

    public void setVolumenCarga(double volumenCarga) {
        this.volumenCarga = volumenCarga;
    }

    //3.2 Incluir el metodo esGrande() que devuelva true si el volumen es mayor o igual que 20
    public boolean esGrande() {
        return volumenCarga >= 20;
    }

    //3.3 Incluir el metodo cabeVolumen(volumen) que devuelva true si el volumen dado por parámetro es menor que el volumenCarga
    public boolean cabeVolumen(double volumen) {
        return volumen < volumenCarga;
    }

    //3.4 Incluir el metodo toString()
    public String toString() {
        return "[Furgoneta] " + modelo + ", de " + fabricante + " (" + precioPorDias + " €/día)";
    }
}
