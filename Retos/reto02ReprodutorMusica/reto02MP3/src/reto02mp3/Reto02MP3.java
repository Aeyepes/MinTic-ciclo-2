
package reto02mp3;

import java.util.Arrays;

public class Reto02MP3 {

    public static void main(String[] args) {
        // TODO code application logic here
        ventana1();
        //ventana2();

    }
    public static void ventana1(){
                String [] cancionesEscogidas = new String [] {
            "Mil horas",
            "Por ese hombre",
            "A esa",
            "Algo de mi",
            "Si me dejas ahora",
            "¿Quieres ser mi amante?",
            "Quel sorriso in volto",
            "Per una notte insieme",
            "Como un pintor",
            "Sencillamente",
            "Un segundo",
            "Enciéndeme",
            "Cuando me enamoro",
            "Tu eres mi tesoro",
            "Piccola anima",
            "Solo a ti pertenezco",
            "Todos por todos"
        };
        
        ReproductorMusica ventana1 =new ReproductorMusica(cancionesEscogidas);
        
        System.out.println("Canciones Favoritas: " + Arrays.toString(ventana1.getCancionesFavoritas()) + 
                "\nPausado: " + ventana1.isPausado() + 
                "\nCancion en reproduccion: " + ventana1.getCancionReproduciendo());        
        
        ventana1.devolverCancion();
        ventana1.devolverCancion();
        ventana1.devolverCancion();
        ventana1.devolverCancion();

        System.out.println("Canciones Favoritas: " + Arrays.toString(ventana1.getCancionesFavoritas()) + 
                "\nPausado: " + ventana1.isPausado() + 
                "\nCancion en reproduccion: " + ventana1.getCancionReproduciendo());
        
        ventana1.agregarCancionesFavoritas();
        ventana1.proximaCancion();
        ventana1.agregarCancionesFavoritas();
        ventana1.devolverCancion();
        ventana1.agregarCancionesFavoritas();
        
        System.out.println("Canciones Favoritas: " + Arrays.toString(ventana1.getCancionesFavoritas()) + 
                "\nPausado: " + ventana1.isPausado() + 
                "\nCancion en reproduccion: " + ventana1.getCancionReproduciendo());

        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();

        System.out.println("Canciones Favoritas: " + Arrays.toString(ventana1.getCancionesFavoritas()) + 
                "\nPausado: " + ventana1.isPausado() + 
                "\nCancion en reproduccion: " + ventana1.getCancionReproduciendo());
    }
    
    public static void ventana2(){
        String [] cancionesElegidas = new String [] {                                   
            "Quel sorriso in volto",                                                
            "Per una notte insieme",                                                
            "Sencillamente",                                                        
            "Un segundo",                                                           
            "Tu eres mi tesoro"                                                     
        };
        ReproductorMusica ventana2 = new ReproductorMusica(cancionesElegidas);  
        ventana2.proximaCancion();                                              
        ventana2.proximaCancion();                                              
        ventana2.proximaCancion();                                              
        ventana2.proximaCancion();                                              
        ventana2.proximaCancion();                                              
        ventana2.proximaCancion();                                              
        ventana2.proximaCancion();                                              
        ventana2.proximaCancion(); 
        
        System.out.println("Canciones Favoritas: " + Arrays.toString(ventana2.getCancionesFavoritas()) + 
                "\nPausado: " + ventana2.isPausado() + 
                "\nCancion en reproduccion: " + ventana2.getCancionReproduciendo());
        
    }
}
