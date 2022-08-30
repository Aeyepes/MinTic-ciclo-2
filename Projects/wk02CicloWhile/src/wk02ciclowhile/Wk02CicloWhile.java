package wk02ciclowhile;

import java.util.Scanner;

public class Wk02CicloWhile {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        System.out.print("""
                           Ingrese segun desea consultar:
                           1 - tablas de multiplicar
                           2 - acumulador hasta 100
                           3 - validador de contraseña
                           4 - estructura while
                           Aqui: \t""");
        int menu = opc.nextInt();
        switch (menu) {
            case 1: tablaMult();    break;
            case 2: acumulador();    break;
            case 3: userPass();    break;
            case 4: condicion();    break;
            default:
                System.out.println("Opcion no valida"); 
        }
    }
    public static void condicion(){
        int numero = 3;
        int i = 0;
        while (i <= 10) {
            System.out.println(numero + " * " + i + " = " + numero*i);
            i = i+1;
        }
    }
    public static void acumulador(){
        Scanner opc = new Scanner(System.in);
        
        int acum = 0;
        System.out.println("ciclo while, acumulador <100");
        while(acum < 100){
            System.out.println("Ingrese numero: Acumulado = " + acum);
                acum += opc.nextInt();
        }
        
        System.out.println("El acumulado de los numeros fue = " + acum);
    }
    
    public static void userPass(){
        Scanner opc = new Scanner(System.in);
        
        String user = "Andres";
        String password = "123";
        String auxPwd;
        int intentoContrasena = 0;
        boolean validador = false;
        
        while(validador == false){
            System.out.println("Ingrese el password del usuario :" + user);
            auxPwd = opc.next(); 
            if(password.equals(auxPwd)){
                System.out.println("Ingreso exitoso.");
                validador = true;
            }
            else{
                intentoContrasena++;
                System.out.println("Password errado!\nIntento Restantes "+ (3 - intentoContrasena));
            }
            if(intentoContrasena == 3){
                validador = true;
                System.out.println("Intentos agotados, por favor intente mañana.");
            }
            
        }
        System.out.println("Fin del ciclo."); 
    }
    
    public static void tablaMult(){
        Scanner opc = new Scanner(System.in);
        float multiplicando, multiplicador, producto;
        int sw;
        String controlador = "si";
        
        while(controlador.equalsIgnoreCase("si")){
            sw = 0;
            System.out.println("Ingrese el multiplicando maximo de la tabla:");
            multiplicando = opc.nextFloat(); 
            System.out.println("Ingrese el multiplicador de la tabla:");
            multiplicador = opc.nextFloat();
                while(sw <= multiplicando){
                    producto = sw * multiplicador;
                    System.out.println(multiplicador + " x " + sw + " = " + producto);
                    sw++;
                }
            
            System.out.println("Desea realizar otra tabla? :");
            controlador = opc.next();
            if(!controlador.equalsIgnoreCase("si")){
                System.out.println("Gracias, hasta la proxima.");
            }
        }
    }
}
