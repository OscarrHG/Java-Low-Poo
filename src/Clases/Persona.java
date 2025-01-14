package Clases;

class Persona {
    String nombre = "Oscar";
    int edad = 21;
    double peso = 120.0;
    boolean soltero = true;

    //Esto es un metodo get
    String dimeNombre(){
        return  nombre + " está aprendiendo Java";
    }

    int dimeEdad(){
        return edad;
    }

    //Esto es un metodo set
    void dimePeso(){
        if (peso > 70 && edad > 20){
            System.out.println("Debe ahcer ejercicio");
        } else {
            System.out.println("Estas en tu peso correcto");
        }
    }

    public static void main(String[] args) {
        Persona  p1 = new Persona();

        System.out.println("Nombre: " + p1.nombre);
        System.out.println(p1.dimeNombre() + ", Edad: " + p1.dimeEdad());
        p1.dimePeso();
    }
}
