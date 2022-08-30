package poo;
public class Nomina {
    private String nombreEmpleado;
    private int salarioBasico;
    private int horasExtrasDiurnas;
    private int horasExtrasNocturnas;
    private int horasExtrasFestivas;
    private int horasExtrasDominicales;
    private int diasNoTrabajados;
    private float totalHorasExtras;
    private float descuentos;
    private float ingresos;
    private float totalPago;

    
    public Nomina(){
        
    }
    
    public Nomina(String nombreEmpleado, int salarioBasico,int horasExtrasDiurnas, 
            int horasExtrasNocturnas, int horasExtrasFestivas, int horasExtrasDominicales, 
            int diasNoTrabajados) {
        
        this.nombreEmpleado = nombreEmpleado;
        this.salarioBasico = salarioBasico;
        this.horasExtrasDiurnas = horasExtrasDiurnas;
        this.horasExtrasNocturnas = horasExtrasNocturnas;
        this.horasExtrasFestivas = horasExtrasFestivas;
        this.horasExtrasDominicales = horasExtrasDominicales;
        this.diasNoTrabajados = diasNoTrabajados;
    }
    
    public void ingresos(){
        
    }
    
    public void totalHorasExtras(){
        
    }
    
    public void diasNoTrabajados(){
        
    }
    
    public void totalDescuento(){
        
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(int salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getHorasExtrasDiurnas() {
        return horasExtrasDiurnas;
    }

    public void setHorasExtrasDiurnas(int horasExtrasDiurnas) {
        this.horasExtrasDiurnas = horasExtrasDiurnas;
    }

    public int getHorasExtrasNocturnas() {
        return horasExtrasNocturnas;
    }

    public void setHorasExtrasNocturnas(int horasExtrasNocturnas) {
        this.horasExtrasNocturnas = horasExtrasNocturnas;
    }

    public int getHorasExtrasFestivas() {
        return horasExtrasFestivas;
    }

    public void setHorasExtrasFestivas(int horasExtrasFestivas) {
        this.horasExtrasFestivas = horasExtrasFestivas;
    }

    public int getHorasExtrasDominicales() {
        return horasExtrasDominicales;
    }

    public void setHorasExtrasDominicales(int horasExtrasDominicales) {
        this.horasExtrasDominicales = horasExtrasDominicales;
    }

    public int getDiasNoTrabajados() {
        return diasNoTrabajados;
    }

    public void setDiasNoTrabajados(int diasNoTrabajados) {
        this.diasNoTrabajados = diasNoTrabajados;
    }

    public float getTotalHorasExtras() {
        return totalHorasExtras;
    }

    public void setTotalHorasExtras(float totalHorasExtras) {
        this.totalHorasExtras = totalHorasExtras;
    }

    public float getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(float descuentos) {
        this.descuentos = descuentos;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    public float getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(float totalPago) {
        this.totalPago = totalPago;
    }
    

}
