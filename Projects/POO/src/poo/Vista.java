package poo;

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
    
    public void datos(){
        nombreEmpleado = JOptionPane.showInputDialog("Digite su nombre: ");
        salarioBasico = Integer.parseInt(JOptionPane.showInputDialog("Digite su salario basico: "));
        horasExtrasDiurnas = Integer.parseInt(JOptionPane.showInputDialog("Digite horas extras diurnas laboradas: "));
        horasExtrasNocturnas = Integer.parseInt(JOptionPane.showInputDialog("Digite horas extras nocturnas laboradas: "));
        horasExtrasFestivas = Integer.parseInt(JOptionPane.showInputDialog("Digite horas extras festivas laboradas: "));
        horasExtrasDominicales = Integer.parseInt(JOptionPane.showInputDialog("Digite horas extras dominicales laboradas: "));
        diasNoTrabajados = Integer.parseInt(JOptionPane.showInputDialog("Digite los días no trabajados: "));
        
        Nomina nm = new Nomina(nombreEmpleado, salarioBasico,horasExtrasDiurnas, 
            horasExtrasNocturnas, horasExtrasFestivas, horasExtrasDominicales, 
            diasNoTrabajados);
        
        
    }
}
