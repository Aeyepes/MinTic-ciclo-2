package wk03pooherencia;
//Indicar herencia con el extends
public class Perro extends Animal{
    private String raza;
    private String tipoPelo;
    private String genero;
    
    //Se crea el constructor con los atributos de la Superclase heradada
    public Perro(String raza, String tipoPelo, String genero, String especie, String tipoAlimentacion, int edad) {
        super(especie, tipoAlimentacion, edad);
        this.raza = raza;
        this.tipoPelo = tipoPelo;
        this.genero = genero;
    }
    
    @Override
    public void comer(){
        super.comer();
        System.out.println("Tres veces al día");
    }

    @Override
    public String toString() {
        return super.toString() + " \nraza=" + raza + "\n tipoPelo=" + tipoPelo + "\n genero=" + genero;
    }
     
}
