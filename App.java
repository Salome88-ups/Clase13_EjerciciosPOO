System.out.println("Ejercicios Clase 13 POO");
public class App {

    public static void main(String[] args) {


        // EJERCICIO 1

        mascota mascota1 = new mascota("Firulais", "Perro", 3);

        mascota mascota2 = new mascota("Michi", "Gato", 2);


        System.out.println("DATOS DE MASCOTAS");

        mascota1.mostrarInfo();

        mascota2.mostrarInfo();



        // EJERCICIO 2


        Telefono telefono1 = new Telefono("Samsung", "A15", 250);


        System.out.println("DATOS DEL TELEFONO");

        telefono1.mostrarInfo();



        // Cambiar datos con setters

        telefono1.setModelo("A25");

        telefono1.setPrecio(300);


        System.out.println("DATOS ACTUALIZADOS");

        telefono1.mostrarInfo();



        // Prueba precio negativo

        telefono1.setPrecio(-50);


    }

}