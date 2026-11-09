package vehiculos;

public class Coche extends Vehiculo {
    //1. Atributos
    private String marca;
    private int caballos;
    public enum Motor {GASOLINA, DIESEL, HIBRIDO, ELECTRICO};
    private Motor motor;

    //2. Constructores

    //2.1 Constructor completo
    public Coche(String modelo, int numeroPlazas, double precioPorDias, String marca, int caballos, Motor motor) {
        super(modelo, numeroPlazas, precioPorDias);
        this.marca = marca;
        this.caballos = caballos;
        this.motor = motor;
    }

    //2.2 Constructor vacío
    public Coche() {
    }

    //2.3 Constructor con modelo, numeroPlazas, precioPorDia, marca y motor, que ponga caballos a 100
    public Coche(String modelo, int numeroPlazas, double precioPorDias, String marca, Motor motor) {
        super(modelo, numeroPlazas, precioPorDias);
        this.marca = marca;
        this.motor = motor;
        this.caballos = 100;
    }

    //3.Métodos

    //3.1 Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    //3.2Incluir el metodo esPotente() que devuelva true si tiene más de 200 caballos
    public boolean esPotente () {
        return caballos > 200 ;
    }

    //3.3 Incluir el metodo toString()
    public String toString() {
        return "[Coche] " + modelo + ", de " + marca + " (" + precioPorDias + " €/día)";
    }

}
