package wk02nominamain;
public class NominaAdmin extends Nomina{
    private String cargo;
    private int bonificacion;

    public NominaAdmin(String cargo, int bonificacion, String nombreEmpleado, float salarioBasico, int diasNoTrabajados) {
        super(nombreEmpleado, salarioBasico, diasNoTrabajados);
        this.cargo = cargo;
        this.bonificacion = bonificacion;
    }
    
    public NominaAdmin() {        
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public int getBonificacion() {
        return bonificacion;
    }
    
    @Override
    public void totalPagar(){
        totalPago = ingresos - descuentos + bonificacion;
    }

    @Override
    public String toString() {
        return super.toString()+"\nNominaAdmin{" + "cargo=" + cargo + ", bonificacion=" + bonificacion + '}';
    }
    
}
