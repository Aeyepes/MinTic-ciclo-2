package wk02claseprincipal;
import java.util.ArrayList;


public class Wk02ClasePrincipal {

    public static void main(String[] args) {
        //Circulo();
        //Herencia();
        //PruebaHerencia();
        PruebaOtroArrayList();
    }
    private static void Herencia(){
        
        //declaracion
        Bicicleta miBicicleta;
        Estudiante inscrito;
        
        //instanciacion
        miBicicleta = new Bicicleta();
        inscrito = new Estudiante("Pepito", "Perez", 17, 3.5);
        
        //inicializacion
        System.out.println(miBicicleta.getMarca());
        miBicicleta.setMarca("Specialized");
        System.out.println("La marca de mi bicicleta es " + miBicicleta.getMarca());
        System.out.println("Velocidad inicial: " + miBicicleta.getVelocidad());
        miBicicleta.pedalear(5);
        miBicicleta.pedalear(2);
        System.out.println("Velocidad actual: " + miBicicleta.getVelocidad());
        miBicicleta.frenar(6);
        System.out.println("Velocidad actual: " + miBicicleta.getVelocidad());
        System.out.println("----------------------------------");
        
        System.out.println("Me llamo " + inscrito.getNombres() + " " + inscrito.getApellidos());
        System.out.println(inscrito.getEdad());
        System.out.println("Promedio: " + inscrito.getPromedio());
        inscrito.setPromedio(4.7);
        System.out.println("Nuevo promedio: " + inscrito.getPromedio());
        System.out.println("Operacion loca... velocidad mas promedio: " + 
                (miBicicleta.getVelocidad() + inscrito.getPromedio()));
    }
    private static void Circulo() {
        Circulo miCirculo;
        Circulo otroCirculo;
        Circulo nuevoCirculo;
        miCirculo = new Circulo();
        otroCirculo = new Circulo(10.8);
        nuevoCirculo = new Circulo();
        
        nuevoCirculo.setRadio(7.8);
        
        System.out.println("Radio: " + miCirculo.getRadio());
        System.out.println("Area: " + miCirculo.getArea());
        System.out.println("Perimetro: " + miCirculo.getPerimetro());
        System.out.println("-----------------------------------");
        
        System.out.println("Radio: " + otroCirculo.getRadio());
        System.out.println("Area: " + otroCirculo.getArea());
        System.out.println("Perimetro: " + otroCirculo.getPerimetro());
        System.out.println("-----------------------------------");
        
        System.out.println("Radio: " + nuevoCirculo.getRadio());
        System.out.println("Area: " + nuevoCirculo.getArea());
        System.out.println("Perimetro: " + nuevoCirculo.getPerimetro());
        System.out.println("-----------------------------------");
    }
  
    private static void PruebaHerencia(){
        BicicletaMontania miTrochera = new BicicletaMontania();
        System.out.println("Mi bicicleta es de marca " + miTrochera.getMarca()
                + ", de color " + miTrochera.getColor()
                + ", con una velocidad de " + miTrochera.getVelocidad()
                + " y está en el cambio " + miTrochera.getCambio());
        miTrochera.setMarca("Specialized");
        miTrochera.setColor("Rojo");
        miTrochera.subirCambio();
        miTrochera.subirCambio();
        miTrochera.subirCambio();
        miTrochera.pedalear(5);
        miTrochera.pedalear(5);
        System.out.println("Mi bicicleta es de marca " + miTrochera.getMarca()
                + ", de color " + miTrochera.getColor()
                + ", con una velocidad de " + miTrochera.getVelocidad()
                + " y está en el cambio " + miTrochera.getCambio());
    }  
    
    private static void PruebaOtroArrayList() {

        //Se declara e instancia un ArrayList de estudiantes
        ArrayList<Estudiante> inscritos = new ArrayList<>();
        //Se declaran e instancian los estudiantes de la clase existente
        Estudiante primero = new Estudiante("Juan", "Pérez", 16, 4.5);
        Estudiante segundo = new Estudiante("Pedro", "Cañas", 19, 3.5);
        Estudiante tercero = new Estudiante("Lucas", "Ruiz", 18, 3.9);
        Estudiante cuarto = new Estudiante("Tomás", "Álvarez", 21, 4.1);
        //Se agregan los estudiantes al ArrayList
        inscritos.add(primero);
        inscritos.add(segundo);
        inscritos.add(tercero);
        inscritos.add(cuarto);
        //Se verifica el tamaño del ArrayList
        System.out.println(inscritos.size());
        //Se elimina un elemento (el segundo)
        inscritos.remove(1);
        //Obtenemos el nombre del primer inscrito
        System.out.println(inscritos.get(0).getNombres());
        //Obtenemos el promedio del tercer inscrito
        System.out.println(inscritos.get(2).getPromedio());
    }
}
    

