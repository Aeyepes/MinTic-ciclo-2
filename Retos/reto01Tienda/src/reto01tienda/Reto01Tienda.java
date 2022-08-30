package reto01tienda;

import java.util.Arrays;

public class Reto01Tienda {

    public static void main(String[] args) {
        int[] compra = { 2700, 9500, 300, 15000,
                                1800, 10000, 400, 3000, 400};
        int[] compra2 = {6700};
        
        String ArrayReporte;
        
        int[] retorno = reporte(compra2);
        ArrayReporte = Arrays.toString(retorno);
        System.out.println(ArrayReporte);
    }
    public static int[] reporte(int[] compra){
        int minimo, maximo;
        int acumulador = 0;
        
        minimo = compra[0];
        maximo = compra[0];
        
        for(int i = 0; i < compra.length; i++){
            if(compra[i] > maximo){
                maximo = compra[i];
            }
            if(compra[i] < minimo){
                minimo = compra[i];
            }
            acumulador += compra[i];
        }
        int[] reporte = {acumulador, minimo, maximo};
        return reporte;
    }
}
