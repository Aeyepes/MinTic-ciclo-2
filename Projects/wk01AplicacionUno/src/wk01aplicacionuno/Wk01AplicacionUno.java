
package wk01aplicacionuno;

import java.util.*;
public class Wk01AplicacionUno {

    public static void main(String[] args) {
        
    /*
        int numero1 = 10, numero2=20;
        float num1 = 50, num2 = 20.5f;
        double n1 = 1.233333333;
        String nombre = "Pepe";
        char caracter = 'f';
        boolean dato = true;
        boolean dato2 = false;
        System.out.println(numero1 + " " + numero2);
        System.out.println(num1 + num2);
        System.out.println("El número es " + n1);
        System.out.println("Su nombre es: " + nombre);
        System.out.println(nombre.equals("pepe"));
        System.out.println(nombre.equalsIgnoreCase("pepe"));//ignora mayusculas
    */
        Scanner captura = new Scanner(System.in);
        int n1, n2, r;
        String nombre;
        System.out.println("Digite su nombre ");
        nombre = captura.next();
        System.out.println("Digite un primer numero ");
        n1 = captura.nextInt();
        System.out.println("Digite un segundo numero ");
        n2 = captura.nextInt();
        r = n1 + n2;
        System.out.println("El resultado es de " + r);
        System.out.println("Su nombre es " + nombre);
    }
}
