package wk02nominamain;

public class Nomina {
    private String nombreEmpleado;
    private float salarioBasico;
    private int horasExtrasDiurnas;
    private int horasExtrasNocturnas;
    private int horasExtrasFestivas;
    private int horasExtrasDominicales;
    private int diasNoTrabajados;
    private float totalHorasExtras;
    protected float descuentos;
    protected float ingresos;
    protected float totalPago;

    public Nomina(){
        
    }

    public Nomina(String nombreEmpleado, float salarioBasico, int diasNoTrabajados) {
        this.nombreEmpleado = nombreEmpleado;
        this.salarioBasico = salarioBasico;
        this.diasNoTrabajados = diasNoTrabajados;
    }

    public Nomina(String nombreEmpleado, float salarioBasico, float descuentos, float ingresos, float totalPago) {
        this.nombreEmpleado = nombreEmpleado;
        this.salarioBasico = salarioBasico;
        this.descuentos = descuentos;
        this.ingresos = ingresos;
        this.totalPago = totalPago;
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
    
    //Creación de metodos para hacer los cálculos de la nómina
    public void ingresos(){
        ingresos = salarioBasico + totalHorasExtras - diasNoTrabajados();
    }
    
    public void totalHorasExtras(){
        float vht, vhed, vhen, vhef, vhedo;
        vht = salarioBasico / 240;
        vhed = vht * 1.25f * horasExtrasDiurnas;
        vhen = vht * 1.35f * horasExtrasNocturnas;
        vhef = vht * 1.75f * horasExtrasFestivas;
        vhedo = vht * 2 * horasExtrasDominicales;
        totalHorasExtras = vhed + vhen + vhef + vhedo;
    }
    
    public float diasNoTrabajados(){
        float vd;
        vd = salarioBasico / 30;
        return vd * diasNoTrabajados;
    }
    
    public void totalDescuento(){
        float salud, pension;
        salud = (ingresos - descuentos)* 0.04f;
        pension = (ingresos - descuentos) * 0.04f;
        descuentos += salud + pension;
    }
    
    public void totalPagar(){
        totalPago = ingresos - descuentos;
    }

    @Override
    public String toString() {
        return "nombreEmpleado=\t" + nombreEmpleado + "\n salarioBasico=\t" + salarioBasico + 
                "\n horasExtrasDiurnas=\t" + horasExtrasDiurnas + "\n horasExtrasNocturnas=\t" + horasExtrasNocturnas + 
                "\n horasExtrasFestivas=\t" + horasExtrasFestivas + "\n horasExtrasDominicales=\t" + horasExtrasDominicales + 
                "\n diasNoTrabajados=\t" + diasNoTrabajados + "\n totalHorasExtras=\t" + totalHorasExtras + 
                "\n descuentos=\t" + descuentos + "\n ingresos=\t" + ingresos + "\n totalPago=\t" + totalPago;
    }
    
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public float getSalarioBasico() {
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
