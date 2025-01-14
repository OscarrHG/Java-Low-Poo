package Clases;

//Creacion de una clase
public class Automoviles {
    //Atributos de una clase
    String marca = "Honda";
    String modelo = "CRV";
    int año = 2025;
    int cant_ruedas = 4;
    boolean camara = true;


    public static void main(String[] args) {
        //Declaración de un objeto
        //Instanciar una clase
        Automoviles auto1 = new Automoviles();
        Automoviles auto2 = new Automoviles();

        //Valores de los atributos de objetos
        System.out.println("Marca: " + auto1.marca);
        System.out.println("Modelo: " + auto1.modelo );
        System.out.println("Año: " + auto1.año);
        System.out.println("Ruedas: " + auto1.cant_ruedas);
        System.out.println("Camara: " + auto1.camara);
    }
}
