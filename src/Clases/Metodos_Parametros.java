package Clases;

public class Metodos_Parametros {
    int sumar(int a, int b){
        return a + b;
    }

    int restar(int a, int b){
        return a - b;
    }

    double potenica(int b, int e){
        return Math.pow(b,e);
    }

    public static void main(String[] args) {
        Metodos_Parametros op = new Metodos_Parametros();
        System.out.println(op.sumar(5,4));
        System.out.println(op.restar(5,4));
        System.out.println(op.potenica(2,3));
    }
}
