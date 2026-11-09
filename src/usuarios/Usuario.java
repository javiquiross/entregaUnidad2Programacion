package usuarios;

public class Usuario {
    //1. Atributos
    protected String nombreUsuario;
    protected String contrasenya;
    protected int id;
    protected int anyoNacimiento;

    //2. Constructores

    //2.1 Constructor completo
    public Usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }

    //2.2 Constructor vacío
    public Usuario() {
    }

    //3. Métodos

    //3.1 Getters y setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    //3.2 Incluir el metodo esAdulto() que devuelva true si tiene 18 años o más (tomando 2026 como año actual)
    public boolean esAdulto() {
        return (2026 - anyoNacimiento) >= 18;
    }

    //3.3 Incluir el metodo contrasenyaSegura() que devuelva true si la contraseña tiene más de 10 caracteres
    public boolean contrasenyaSegura() {
        return contrasenya.length() > 10;
    }

    //3.4 Incluir el metodo toString()
    public String toString (){
        return nombreUsuario + " (" + id + ")";
    }

}
