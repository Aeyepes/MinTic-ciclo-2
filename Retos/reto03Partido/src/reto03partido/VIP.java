package reto03partido;
//NO ELIMINAR ESTA IMPORTACIÓN. SE REQUIERE
//PARA LA EJECUCIÓN DEL MÉTODO 
//generarCredencialesPrevia()
import java.util.Arrays;
import java.util.Random;

public class VIP extends Asistente{
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    //Y SU MÉTODO CONSTRUCTOR
    
    private boolean[] pantallas = new boolean[]{false, false, false};
    private String credencialesPrevia = "";

    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
    }
    
    //NO DEBE PREOCUPARSE POR LA ESCRITURA DEL
    //MÉTODO A CONTINUACIÓN. ESTE REQUIERE DE LA 
    //IMPORTACIÓN DE LA LIBRERÍA Random PARA SU 
    //FUNCIONAMIENTO
    public void generarCredencialesPrevia() {
        if(credencialesPrevia.isEmpty()){
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }
    
    public void asignarPantalla(int pantalla){
        
        //ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        //asignarPantalla()
        if(pantalla > 0 && pantalla <= 3){
            this.pantallas[pantalla - 1] = !this.pantallas[pantalla - 1];
        }
    }

    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO

    public boolean[] isPantallas() {
        return pantallas;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nEstado de las pantallas del cliente:\n" + Arrays.toString(pantallas) + 
                "\nCredenciales del cliente para la previa:\n" + credencialesPrevia;
    }
    
    
}
