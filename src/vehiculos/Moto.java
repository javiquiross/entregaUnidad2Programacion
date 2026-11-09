package vehiculos;

public class Moto extends Vehiculo {
    //1. Atributos
    private String fabricante;
    private int cilindrada;

    //2. Constructores

    //2.1 Constructor completo
    public Moto(String modelo, int numeroPlazas, double precioPorDias, String fabricante, int cilindrada) {
        super(modelo, numeroPlazas, precioPorDias);
        this.fabricante = fabricante;
        this.cilindrada = cilindrada;
    }

    //2.2 Constructor vacío
    public Moto() {
    }

    //3. Métodos

    //3.1 Getters y setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    //3.2 Incluir el metodo getCilindradaLitros() que devuelva la cilindrada en litros
    public double getCilindradaLitros() {
        //como la cilindrada es un int, dividimos entre 1000.0 (double) para que el resultado no sea 0 (por ser una división de un int)
        return cilindrada / 1000.0;
    }


    /*3.3 Incluir el metodo getEquivalenciaCilindrada() que devuelva una cadena de texto
    con el formato “<cilindrada en cc> cc equivale a <cilindrada en litros> litros” */
    public String getEquivalenciaCilindrada() {
        return cilindrada + " cc equivale a " + getCilindradaLitros() + " litros";
    }

    //3.4. Incluir el metodo toString()
    public String toString() {
        return "[Moto] " + modelo + ", de " + fabricante + " (" + precioPorDias + " €/día)";
    }
}
