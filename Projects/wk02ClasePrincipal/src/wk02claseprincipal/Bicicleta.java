package wk02claseprincipal;

public class Bicicleta {
    //atributos
    private String marca;
    private String color;
    private double velocidad;
    
    //constructor
    public Bicicleta() {
        this.marca = "GW";
        this.color = "gris";
        this.velocidad = 0;
    }
    
    public Bicicleta(String marca, String color, double velocidadInicial) {
        this.marca = marca;
        this.color = color;
        velocidad = velocidadInicial;
    }
    //metodos - setter y getter
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getVelocidad() {
        return velocidad;
    }
    
    //metodos accionar
    public void pedalear(double aceleracion) {
        this.velocidad = this.velocidad + aceleracion;
    }
    
    public void frenar() {
        if (this.velocidad > 0) {
            this.velocidad--;
        }
    }
    //sobrecarga
    public void frenar(double aceleracionNegativa) {
        if (this.velocidad > aceleracionNegativa) {
            this.velocidad = this.velocidad - aceleracionNegativa;
        }
    }
    
    public void frenar(String intensidad) {
        if (intensidad.equals("fuerte")) {
            if (this.velocidad > 10) {
                this.velocidad = this.velocidad - 10;
            }
        } else {
            if (this.velocidad > 0) {
                this.velocidad--;
            }
        }
    }
}
