package Clases;

class Alumnos {
    String nombre, asignatura;
    int nota;

    //Constructor por defecto
    //Un constructor no tiene tipo de retorno, se llaman automaticamente al crear una nueva instancia de la clase
    public Alumnos(String nombre, String asignatura, int nota) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public static void main(String[] args) {
        Alumnos p1 = new Alumnos("Oscar","ISC",20);
    }
}
