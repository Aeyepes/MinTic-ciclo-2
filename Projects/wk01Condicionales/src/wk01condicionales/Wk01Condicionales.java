package wk01condicionales;

import java.util.Scanner;

public class Wk01Condicionales {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int edad;
        System.out.println("Digite su edad");
        edad = cap.nextInt();
        if(edad < 18){
            System.out.println("Usted es menor de edad");
        }
        else{
            System.out.println("Usted es mayor de edad");
        }
    }
    
}
