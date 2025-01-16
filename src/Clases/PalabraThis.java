package Clases;

class PalabraThis {
    String nombre = "María";

    String dimeNombre(String nombre){
        return nombre;
    }

    void muestraNombre(){
        System.out.println("Nombre: " + nombre);
    }

    public static void main(String[] args) {
        PalabraThis p = new PalabraThis();
        String a = p.dimeNombre("Pedro");
        System.out.println(a);
        p.muestraNombre();
    }
}
