package com.example.javier.listapaises;

public class Pais {

    private int icono;
    private String nombre;
    private String dominio;

    public Pais(int icono, String nombre, String dominio) {
        this.icono = icono;
        this.nombre = nombre;
        this.dominio = dominio;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
}
