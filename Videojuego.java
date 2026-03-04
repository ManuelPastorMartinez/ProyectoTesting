package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Videojuego {
    private static int contadorId = 1;

    private String id_videojuego;
    private String nombre;
    private String plataforma;
    private double precio;
    private LocalDate fecha_creacion;
    private String empresa;
    private String tipo_videojuego;
    private int stock;
    protected static ArrayList<Videojuego>listaVideojuegos = new ArrayList<>();

    public Videojuego(String nombre, String plataforma, double precio, String fecha_creacion, String empresa, String tipo_videojuego, int stock) {
        setId_videojuego();
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.precio = precio;
        this.fecha_creacion = LocalDate.parse(fecha_creacion);
        this.empresa = empresa;
        this.tipo_videojuego = tipo_videojuego;
        this.stock = stock;
        listaVideojuegos.add(this);
    }

    public void setId_videojuego() {
        this.id_videojuego = "GAME" + contadorId++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipo_videojuego() {
        return tipo_videojuego;
    }

    public void setTipo_videojuego(String tipo_videojuego) {
        this.tipo_videojuego = tipo_videojuego;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        if (this.stock <= 0) {
            listaVideojuegos.remove(this);
            System.out.println("Videojuego " + nombre + " eliminado del catálogo por falta de stock.");
        }
    }

    public static ArrayList<Videojuego> getListaVideojuegos() {
        return listaVideojuegos;
    }

    public static void mostrarListaJuegos() {
        for (Videojuego juego : listaVideojuegos) {
            System.out.println("[*]" + juego);
        }
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "id_videojuego='" + id_videojuego + '\'' +
                ", nombre='" + nombre + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", precio=" + precio +
                ", fecha_creacion=" + fecha_creacion +
                ", empresa='" + empresa + '\'' +
                ", tipo_videojuego='" + tipo_videojuego + '\'' +
                ", stock=" + stock +
                '}';
    }
}
