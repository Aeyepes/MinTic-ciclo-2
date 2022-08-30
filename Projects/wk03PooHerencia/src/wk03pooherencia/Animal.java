package wk03pooherencia;
//Super clase o clase principal.
public class Animal {
    //Propiedad - en lugar de encapsularlas (private)se pone protected para herencia
    protected String especie;
    protected String tipoAlimentacion;
    protected int edad;

    public Animal(String especie, String tipoAlimentacion, int edad) {
        this.especie = especie;
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
    }
    
    public void comer(){
        System.out.print("Se alimenta ");
    }

    @Override
    public String toString() {
        return "especie=" + especie + "\n tipoAlimentacion=" + tipoAlimentacion + "\n edad=" + edad;
    }
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
