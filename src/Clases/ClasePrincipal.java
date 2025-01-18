package Clases;

import java.util.Scanner;

class Cliente{
    String nombreCliente;

    public Cliente(String nombre) {
        this.nombreCliente = nombre;
    }

    String dimeNombre(){
        return nombreCliente;
    }
}

class Prestamo{
    double cuota;

    public Prestamo(double cuota){
        this.cuota = cuota;
    }

    void analizaCuota(){
        if (cuota >= 10000) System.out.println("Deuda Cancelada");
        else {
            double pendiente = 10000 - cuota;
            System.out.println("Abono a deuda: " + cuota);
            System.out.println("Pendiente para saldo: " + pendiente);
        }
    }
}

class ClasePrincipal {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        Cliente c1 = new Cliente(en.next());

        System.out.println("Ingrese Cuota: ");
        Prestamo p1 = new Prestamo(en.nextDouble());

        System.out.println(c1.dimeNombre());
        p1.analizaCuota();
    }
}
