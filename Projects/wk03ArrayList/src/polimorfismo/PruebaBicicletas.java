package polimorfismo;

public class PruebaBicicletas {

    public static void main(String[] args) {
        // TODO code application logic here
        Bicicleta cicla1,cicla2,cicla3;
        
        cicla1 = new Bicicleta();
        cicla2 = new BicicletaMontania(5, "Trek", "Rojo", 0, "SRAM");
        cicla3 = new BicicletaRuta(32, "Specialized", "Azul", 0, "shimano");
        
        System.out.println(cicla1.getDescripcion());
        System.out.println(cicla2.getDescripcion());
        System.out.println(cicla3.getDescripcion());
    }
    
}
