package wk05junit;

public class Rectangulo extends Figura{
    private double largo, ancho;
    
    public Rectangulo() {
        this.largo = 0;
        this.ancho = 0;
    }
    
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double getLargo() {
        return largo;
    }
    
    public double getAncho() {
        return ancho;
    }
    
    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    @Override
    public double getArea() {
        return this.ancho * this.largo;
    }
    
    @Override
    public double getPerimetro() {
        return (this.ancho + this.largo) * 2;
    }
}

