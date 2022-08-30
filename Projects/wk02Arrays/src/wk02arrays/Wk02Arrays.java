package wk02arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Wk02Arrays {

    public static void main(String[] args) {
        //estructuraArray();
        declaracion();
    }
    public static void declaracion(){
        int[] edades;
        double[] promedios = {4.5, 3.0, 3.7};
        edades = new int[3];
        String[] nombres = new String[3];
        edades[0] = 25;
        edades[1] = 30;
        edades[2] = 21;
        nombres[0] = "Hugo";
        nombres[1] = "Paco";
        nombres[2] = "Luis";
        
        for (int i = 0; i<3; i++) {
            System.out.println("Nombre: \t" + nombres[i]);
            System.out.println("Edad: \t\t" + edades[i]);
            System.out.println("Promedio: \t" + promedios[i]);
            System.out.println("--------------------------");
            }
    }
    public static void estructuraArray(){
        Scanner dat = new Scanner(System.in);
        int numero;
        int sum = 0;
        
        System.out.println("Digite el tamaño del array: ");
        int arreglo[] = new int[dat.nextInt()];
        
        System.out.println("Tamaño del arreglo: " + arreglo.length);
        for(int i = 0; i < arreglo.length; i++){
            System.out.print("Digite un numero:\t");
            numero = dat.nextInt();
            arreglo[i]=numero;
        }
        
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]%2 == 0){
                sum += arreglo[i];
            }
            //System.out.print(arreglo[i] + "\t");
        }
        System.out.println(Arrays.toString(arreglo));
        System.out.println("\nLa suma de valores pares del array es: " + sum);
        
        System.out.println("Ingrese el numero a buscar en el arreglo");
        int datoBuscado = dat.nextInt();
        boolean estaDato = false;
        
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]== datoBuscado){
                System.out.println("El dato buscado " + datoBuscado + " esta en la posición " + i);
                estaDato = true;
            }
        }
        if(estaDato == false){
            System.out.println("El dato buscado " + datoBuscado + "no esta en el arreglo\t" + Arrays.toString(arreglo));
        }
        
        
    }
    
    
}
