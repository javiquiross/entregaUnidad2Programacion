package usuarios;

import vehiculos.Vehiculo;

public class Administrador extends Usuario {
    //1. Atributos
    public enum Rol {JEFE, VENDEDOR};
    private Rol rol;

    //2.Constructores

    //2.1 Constructor completo
    public Administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Rol rol) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.rol = rol;
    }

    //2.2 Constructor vacío
    public Administrador() {
    }

    //3. Métodos

    //3.1 Getters y setters
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    //3.2 Incluir el metodo asignarVehiculo(cliente, vehiculo) que asigne un vehículo a un usuario
    public void asignarVehiculo(Cliente cliente, Vehiculo vehiculo){
        cliente.setVehiculo(vehiculo);
    }


    //3.3 Incluir el metodo retirarVehiculo(cliente) que elimine el vehículo del usuario (es decir, que lo ponga a null)
    public void retirarVehiculo(Cliente cliente){
        cliente.setVehiculo(null);
    }

    //3.4 Incluir el metodo toString()
    public String toString() {
        return "Administrador " + nombreUsuario + " (" + id + ")";
    }

}
