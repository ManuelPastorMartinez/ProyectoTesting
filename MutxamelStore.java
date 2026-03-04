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

        System.out.println("test 4: Eliminación Videojuego");
        ACNH.setStock(-1);
        System.out.println("Lista actualizada: ");
        Videojuego.mostrarListaJuegos();

        System.out.println("test 5: Nombre null");
        Videojuego RDR2 = new Videojuego(null, "Ps4", 39.99, "2018/10/26", "Rockstar", "Acción", 45);
        System.out.println(RDR2);

        System.out.println("test 6: Eliminar dos veces un Videojuego mediante el stock");
        Videojuego GOW = new Videojuego("God of War", "Xbox", 30.0, "2023-01-01", "EmpresaB", "Shooter", 1);
        GOW.setStock(0);
        GOW.setStock(0);
        System.out.println("Lista actualizada:");
        Videojuego.mostrarListaJuegos();


    }

}
