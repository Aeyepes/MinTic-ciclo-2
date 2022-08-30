/*
En un estacionamiento cobran $ 1.500 por hora o fracción. Diseñe un algoritmo que 
determine cuanto debe pagar un cliente por el estacionamiento de su vehículo, 
conociendo el tiempo de estacionamiento en horas y minutos

 */
package wk01estacionamiento;

import java.util.Scanner;

public class Wk01Estacionamiento {

    public static void main(String[] args) {
        Scanner auxMin = new Scanner(System.in);
        Scanner auxHora = new Scanner(System.in);
        double valorHora = 1500;
        double tarifa = 0;
        int horas;
        int minutos;

        System.out.println("Ingrese la cantidad de horas ");
        horas = auxHora.nextInt();
        System.out.println("Ingrese la cantidad de minutos ");
        minutos = auxMin.nextInt();

        if (minutos > 0) {
            horas += 1;
        }
        tarifa = horas * valorHora;
        System.out.println("El valor de la tarifa final del estacionamiento por "
                + horas + ":" + minutos + " es: \n" + tarifa);
    }
}
