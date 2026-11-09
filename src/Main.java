import usuarios.Administrador;
import usuarios.Cliente;
import vehiculos.*;

public class Main {
    public static void main(String[] args) {

        //A. Crear 2 vehículos de cada tipo
        Coche c1 = new Coche ("Fabia", 5, 20.5, "Skoda", 95, Coche.Motor.GASOLINA);
        Coche c2 = new Coche ("Focus", 5, 18.5, "Ford", 80, Coche.Motor.DIESEL);
        Furgoneta f1 = new Furgoneta ("Citan", 7, 30.5, "Mercedes", 3660.75);
        Furgoneta f2 = new Furgoneta ("Berlingo", 5, 23.5, "Citroen", 1050.50 );
        Moto m1 = new Moto("Primavera", 2, 10.5, "Vespa", 125);
        Moto m2 = new Moto("Ninja", 2, 18.75, "Kawasaki", 650);
        Patinete p1 = new Patinete("Electric Scooter 5", 1, 6.5, "Xiaomi", 477, false);
        Patinete p2 = new Patinete("Ninebot", 1, 8.5, "Segway", 750, true);

        //B. Crear 2 clientes
        Cliente cliente1 = new Cliente("Pablo Ramírez", "password123", 55581, 1996, p1, 1485);
        Cliente cliente2 = new Cliente("Paula García", "password2223", 55813, 1995, c2, 5287);


        //C. Crear 1 administrador y asignar un vehículo a un cliente
        Administrador admin1 = new Administrador("Paco Gómez", "password2233", 55482, 1984, Administrador.Rol.VENDEDOR);
        admin1.asignarVehiculo(cliente1, p2);

        //Impresión por consola
        System.out.println("=== Vehículos ===");
        System.out.println(c1);
        System.out.println(c2 + " | ¿potente? " + c2.esPotente());
        System.out.println(c1 + " | caballos: " + c1.getCaballos());
        System.out.println(m1);
        System.out.println(m2 + " | " + m2.getEquivalenciaCilindrada());
        System.out.println(p1 + " | autonomía (0,5 Ah/km): " + p1.getAutonomia(0.5) + " km");
        System.out.println(p2);
        System.out.println(f1 + " | ¿grande? " + f1.esGrande());
        System.out.println(f2 + " | ¿cabe 10 l? " + f2.cabeVolumen(10));

        System.out.println("=== Usuarios ===");
        System.out.println(cliente1 + " | adulto: " + cliente1.esAdulto()
                + " | contraseña segura: " + cliente1.contrasenyaSegura());
        System.out.println(cliente2 + " | adulto: " + cliente2.esAdulto()
                + " | contraseña segura: " + cliente2.contrasenyaSegura());
        System.out.println(admin1);

        System.out.println("=== Asignación de vehículo ===");
        System.out.println(cliente1 + " tiene: " + cliente1.getVehiculo());
        System.out.println("Precio 2 vehículos x 3 días: " + cliente1.calcularPrecio(2, 3) + " €");

    }


}