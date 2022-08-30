package wk02metodosjava;

public class Datos {
    
    public boolean datosLogin(String usuario, String clave) {
        boolean x = false;
        if(usuario.equals("pepe") && clave.equals("123")){
           x = true;
        }    
        return x;
    }
}
