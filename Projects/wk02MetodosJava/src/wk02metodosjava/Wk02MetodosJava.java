package wk02metodosjava;

import javax.swing.JOptionPane;

public class Wk02MetodosJava {

    public static void main(String[] args) {
        /*
        OperacionMatematica om = new OperacionMatematica();
        int num1 = 10;
        int num2 = 20;
        om.suma(num1, num2);
        om.resta();
        float res = om.suma();
        System.out.println("La suma es: " + res);
        */
        
        Datos dt = new Datos();
        
        String usu, cla;
        usu = JOptionPane.showInputDialog("Digite su usuario");
        cla = JOptionPane.showInputDialog("Digite su contraseña");
        
        boolean y;
        y = dt.datosLogin(usu, cla);
        
        if (y == true) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
        }
        else {
            JOptionPane.showMessageDialog(null, "Sus datos son incorretos");
        }
    }
    
}
