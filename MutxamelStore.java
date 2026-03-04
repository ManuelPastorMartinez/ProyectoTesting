package org.example;

public class MutxamelStore {

    static void main(String[] args) {

        System.out.println("Test 1: Introducir formato de fecha incorrecto");
        Videojuego BTS = new Videojuego("Beyond Two Souls", "Ps3", 19.99, 2013, "Quantic Dream", "Historia", 20);

        System.out.println("test 2: Precio negativo");
        Videojuego RDR2 = new Videojuego("Red Dead Redemption", "Ps4", -39.99, "2018/10/26", "Rockstar", "Acción", 45);

        System.out.println("test 3: Stock negativo en constructor");
        Videojuego ACNH = new Videojuego("Animal Crossing New Horizons", "Nintendo Switch", 59.99, "2020/04/23", "Nintendo", "Cozy", -85);
        System.out.println("Stock inicial: " + ACNH.getStock());
        System.out.println("Lista Videojuegos:");
        Videojuego.mostrarListaJuegos();

        System.out.println("test 4: Eliminación Videojuego con setStock negativo");
        v3.setStock(-1);
        System.out.println("Lista después de eliminar por stock <= 0:");
        Videojuego.mostrarListaJuegos();

        System.out.println("\n=== TEST 5: Nombre null ===");
        Videojuego v4 = new Videojuego(null, "Switch", 40.0, "2023-01-01", "EmpresaA", "Aventura", 5);
        System.out.println(v4);

        System.out.println("\n=== TEST 6: Eliminar dos veces por stock ===");
        Videojuego v5 = new Videojuego("JuegoPrueba", "Xbox", 30.0, "2023-01-01", "EmpresaB", "Shooter", 1);
        v5.setStock(0);   // se elimina
        v5.setStock(0);   // intentar eliminar otra vez
        System.out.println("Lista final:");
        Videojuego.mostrarListaJuegos();


    }

}
