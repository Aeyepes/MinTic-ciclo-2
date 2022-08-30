
package wk01edades;

import java.util.Scanner;

public class Wk01Edades {

    public static void main(String[] args) {
        // 0 a 5 - Niños pequeños
        // 6 a 12 - Niños grandes
        // 13 a 17 - Adolecentes
        // 18 a 65 - Adultos
        // 66 a 100 - Adultos mayores
        Scanner opc = new Scanner(System.in);
        float edad;
        String genero;
        System.out.println("Ingrese la edad de la persona: ");
        edad = opc.nextFloat();
        
        
        if(edad>0){
            System.out.println("Ingrese el genero de la persona: ");
            genero = opc.next();
            if(edad <= 5){   
                System.out.println("Es un niño pequeño.");
            }
            else if(edad <= 12){   
                System.out.println("Es un niño grande.");
            }
            else if(edad <= 17){   
                System.out.println("Es un adolecente");
            }
            else if(edad <= 65){   
                System.out.println("Es un adulto.");
            }
            else {   
                System.out.println("Es un adulto mayor.");
            }
        }
        else{
            System.out.println("El dato de la edad es incorrecto.");
        }
    }
}
