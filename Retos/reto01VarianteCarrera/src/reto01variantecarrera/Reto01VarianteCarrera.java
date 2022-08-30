package reto01variantecarrera;

import java.util.Arrays;

public class Reto01VarianteCarrera {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] resultados = { 19, 22, 21, 25, 32, 38, 16, 31, 30, 26, 19, 17, 23};
        
        String ArrayReporte;
        
        int[] retorno = reporte(resultados);
        ArrayReporte = Arrays.toString(retorno);
        System.out.println(ArrayReporte);
    }
    public static int[] reporte(int[] participantes){
        int minimo, maximo;
        int contador = 0;
        
        minimo = participantes[0];
        maximo = participantes[0];
        
        for(int i = 0; i < participantes.length; i++){
            if(participantes[i] > maximo){
                maximo = participantes[i];
            }
            if(participantes[i] < minimo){
                minimo = participantes[i];
            }
            contador ++;
        }
        int[] reporte = {contador, minimo, maximo};
        return reporte;
    }
}
