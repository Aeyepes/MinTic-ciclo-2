package wk03pooherencia;

public class Wk03PooHerencia {

    public static void main(String[] args) {
        Perro pe = new Perro("Bulldog", "Corto", "Macho", "Canino", "Omnivoro", 15);
        
        System.out.println("Datos del Perro: \n" + pe.toString());
        pe.comer();
    }
    
}
