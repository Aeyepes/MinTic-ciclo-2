package wk02nominamain;

import javax.swing.JOptionPane;

public class Vista {
    //Modelo vista controlador
    private String nombreEmpleado;
    private int salarioBasico;
    private int horasExtrasDiurnas;
    private int horasExtrasNocturnas;
    private int horasExtrasFestivas;
    private int horasExtrasDominicales;
    private int diasNoTrabajados;
    private String cargo;
    private int bonificacion;
    
    public void datos(){
//        nombreEmpleado = "Andres";
//        salarioBasico = 1000000;
//        horasExtrasDiurnas = 10;
//        horasExtrasNocturnas = 10;
//        horasExtrasFestivas = 10;
//        horasExtrasDominicales = 10;
//        diasNoTrabajados = 1;
        
//        nombreEmpleado = JOptionPane.showInputDialog("Digite su nombre: ");
//        salarioBasico = Integer.parseInt(JOptionPane.showInputDialog("Digite su salario basico: "));
//        horasExtrasDiurnas = Integer.parseInt(JOptionPane.showInputDialog("Digite horas extras diurnas laboradas: "));
//        horasExtrasNocturnas = Integer.parseInt(JOptionPane.showInputDialog("Digite horas extras nocturnas laboradas: "));
//        horasExtrasFestivas = Integer.parseInt(JOptionPane.showInputDialog("Digite horas extras festivas laboradas: "));
//        horasExtrasDominicales = Integer.parseInt(JOptionPane.showInputDialog("Digite horas extras dominicales laboradas: "));
//        diasNoTrabajados = Integer.parseInt(JOptionPane.showInputDialog("Digite los días no trabajados: "));
//        
//        Nomina nm = new Nomina(nombreEmpleado, salarioBasico,horasExtrasDiurnas, 
//            horasExtrasNocturnas, horasExtrasFestivas, horasExtrasDominicales, 
//            diasNoTrabajados);
//        
//        nm.totalHorasExtras();
//        nm.ingresos();
//        nm.diasNoTrabajados();
//        nm.totalDescuento();
//        nm.totalPagar();
//        
//        System.out.println(nm.toString());
        
        //DATOS PARA LA NOMINA ADMINISTRATIVOS
//        cargo = "Gerente";
//        bonificacion = 10000000;
        nombreEmpleado = JOptionPane.showInputDialog("Digite su nombre: ");
        cargo = JOptionPane.showInputDialog("Digite su cargo: ");
        salarioBasico = Integer.parseInt(JOptionPane.showInputDialog("Digite su salario basico: "));
        bonificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite su bonificacion: "));
        diasNoTrabajados = Integer.parseInt(JOptionPane.showInputDialog("Digite sus dias no trabajados: "));
        
        NominaAdmin nadmin = new NominaAdmin(cargo, bonificacion, nombreEmpleado, salarioBasico, diasNoTrabajados);
        
        nadmin.diasNoTrabajados();
        nadmin.ingresos();
        nadmin.totalDescuento();
        nadmin.totalPagar();
        System.out.println("Nombre " + nadmin.getNombreEmpleado());
        System.out.println("Cargo " + nadmin.getCargo());
        System.out.println("Salario " + nadmin.getSalarioBasico());
        System.out.println("Descuentos " + nadmin.getDescuentos());
        System.out.println("Bonificacion " + nadmin.getBonificacion());
        System.out.println("Total Pago " + nadmin.getTotalPago());
    }
}