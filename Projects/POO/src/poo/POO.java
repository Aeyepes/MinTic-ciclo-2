package poo;

import javax.swing.JOptionPane;

public class POO {

    public static void main(String[] args) {
        // TODO code application logic here
        //ejemploLogin();Login
        
    }
    
    
    
    
    public static void ejemploLogin(){
        //Con el objeto se pueden ver los atributos de la clase
        capturaAtributo();
    }
    
    public static void capturaAtributo(){
        String usuario;
        String clave;
        String rol;
        usuario = JOptionPane.showInputDialog("Digite su usuario");
        clave = JOptionPane.showInputDialog("Digite su clave");
        rol = JOptionPane.showInputDialog("Digite su rol");
        
        Login lo = new Login(usuario,clave,rol);

        if(lo.getUsuario()
                && lo.getClave()){
            if(lo.getRol().equals("cliente")){
                JOptionPane.showMessageDialog(null,"Usuario cliente ingreso correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "El Usuario no es un cliente.");
            }            
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario o Clave son incorrectas.");
        }
            
            
        
    }
}