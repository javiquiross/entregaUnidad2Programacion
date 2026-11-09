package usuarios;

import vehiculos.Vehiculo;

public class Cliente extends Usuario {
    //1. Atributos
    private Vehiculo vehiculo;
    private int numSocio;

    //2. Constructores

    //2.1 Constructor completo
    public Cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Vehiculo vehiculo, int numSocio) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.vehiculo = vehiculo;
        this.numSocio = numSocio;
    }

    //2.2 Constructor vacío
    public Cliente() {
    }

    //3. Métodos

    //3.1 Getters y setters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }


    //3.2 Incluir el metodo calcularPrecio(numVehiculos, dias) que devuelva el precio total para un número de vehículos y un número de días, teniendo en cuenta el vehículo concreto del cliente
    public double calcularPrecio(int numVehiculos, int dias) {
        return vehiculo.calcularPrecio(numVehiculos, dias);

    }

    //3.3 Incluir el metodo toString()
    public String toString() {
        return "Cliente " + nombreUsuario + " (" + id + ")";
    }

}
