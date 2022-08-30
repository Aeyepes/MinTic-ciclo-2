package wk03ArrayList;

import java.util.ArrayList;

public class ClasePrincipal {

    public static void main(String[] args) {
        // TODO code application logic here
        //ejemplo1();
        ArrayList<Integer> numeros = new ArrayList<>(); 
        numeros.add(8);
        numeros.add(427);
        numeros.add(-75);  
        System.out.println(numeros.size());  
        System.out.println(numeros.get(1)); 
        
        numeros.remove(2);
        System.out.println(numeros.size()); 
    }
    
    private static void ejemplo1() {
        
        ArrayList<Figura> lista;        
        Circulo unCirculo = new Circulo(2.5);
        Cuadrado unCuadrado = new Cuadrado(2);
        Circulo otroCirculo = new Circulo(10.1);
        
        lista = new ArrayList<>();
        
        lista.add(unCirculo);
        lista.add(unCuadrado);
        lista.add(otroCirculo);
        
        System.out.println("Tamanio inicial: " + lista.size());
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).descripcion());
            System.out.println(lista.get(i).getArea());
            System.out.println(lista.get(i).getPerimetro());
            System.out.println("----");
        }
        
        lista.remove(1);
        System.out.println("Tamanio final: " + lista.size());
    }
    
}