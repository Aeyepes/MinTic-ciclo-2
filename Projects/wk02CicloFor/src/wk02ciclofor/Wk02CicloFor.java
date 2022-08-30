package wk02ciclofor;

import java.util.Scanner;

public class Wk02CicloFor {

    public static void main(String[] args) {
        tablaMult(); //estructura del ciclo for, tabla de multiplicar
    }
    
    public static void cicloFor( int tablaIni, int tablaFin,int multIni, int multFin){
        for(int i = tablaIni; i <= tablaFin; i++){
            System.out.println("\nTabla del "+ i);
            for(int j = multIni; j <= multFin; j++){
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }  
    }
    
    public static void tablaMult(){
        Scanner opc = new Scanner(System.in);
        int tablaIni, tablaFin, multIni, multFin;
        String respuesta = "si";
        while(respuesta.equals("si")){
            System.out.println("Ingrese la tabla inicial que desea multiplicar.");
            tablaIni = opc.nextInt();
            do{
                System.out.println("Ingrese la tabla final de multiplicacion");
                tablaFin = opc.nextInt();
            } while(tablaFin < tablaIni);
            
            System.out.println("Ingrese el multiplicando menor");
            multIni = opc.nextInt();
            do{
                System.out.println("Ingrese el multiplicando mayor");
                multFin = opc.nextInt();
            } while(multFin<multIni);
            
            cicloFor(multIni, multFin, tablaIni, tablaFin);
            
            System.out.println("Desea volver a realizar el calculo? Si/No");
            respuesta = opc.next();
        }
            
        
        
    }
}
