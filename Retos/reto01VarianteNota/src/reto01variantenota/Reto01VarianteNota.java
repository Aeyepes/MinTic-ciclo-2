package reto01variantenota;

import java.util.Arrays;

public class Reto01VarianteNota {

    public static void main(String[] args) {
        // TODO code application logic here

        double[] listaNotas = { 4.1, 4.8, 1.5, 2.3, 0.1,
                                0.9, 1.4, 1.8, 1.5, 3.0 };
        String ArrayReporte;
        
        double[] retorno = reporte(listaNotas);
        ArrayReporte = Arrays.toString(retorno);
        System.out.println(ArrayReporte);
    }
     
    public static double[] reporte(double[] listaNotas){
        double promedio, minimo, maximo;
        double acumulador = 0;
        
        minimo = listaNotas[0];
        maximo = listaNotas[0];
        
        for(int i = 0; i < listaNotas.length; i++){
            if(listaNotas[i] > maximo){
                maximo = listaNotas[i];
            }
            if(listaNotas[i] < minimo){
                minimo = listaNotas[i];
            }
            acumulador += listaNotas[i];
        }
    promedio = acumulador / listaNotas.length;
    double[] reporte = {promedio, minimo, maximo};
    return reporte;
        
    }
}


