package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Videojuego {
    private String id_videojuego;
    private String nombre;
    private String plataforma;
    private double precio;
    private Date fecha_creacion;
    private String empresa;
    private String tipo_videojuego;
    private int stock;
    private ArrayList<String>listaVideojuegos;

    public Videojuego(String id_videojuego, String nombre, String plataforma, double precio, Date fecha_creacion, String empresa, String tipo_videojuego, int stock) {
        this.id_videojuego = id_videojuego;
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.precio = precio;
        this.fecha_creacion = fecha_creacion;
        this.empresa = empresa;
        this.tipo_videojuego = tipo_videojuego;
        this.stock = stock;
        listaVideojuegos=new ArrayList<>();
    }

    public String getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(String id_videojuego) {
        this.id_videojuego = id_videojuego;
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
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
    }

    public ArrayList<String> getListaVideojuegos() {
        return listaVideojuegos;
    }

    public void setListaVideojuegos(ArrayList<String> listaVideojuegos) {
        this.listaVideojuegos = listaVideojuegos;
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
                ", listaVideojuegos=" + listaVideojuegos +
                '}';
    }
}
