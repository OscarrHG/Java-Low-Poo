package Clases;
import Clases.Alumnos.*;

import java.util.Scanner;

class Auto {
    String marca, modelo;
    int anio;

    public Auto() {
        marca = "toyota";
        modelo = "corolla";
        anio = 2025;
    }

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    public static void main(String[] args) {
        Auto a1 = new Auto();

        a1.mostrarInfo();
        Alumnos al1 = new Alumnos();
        al1.nombre = "Manuel";
        System.out.println("Nombre: " + al1.nombre);
    }
}
