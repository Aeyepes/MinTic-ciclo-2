package reto03partido;

//NO ELIMINAR ESTA IMPORTACIÓN. SE REQUIERE
//PARA LA EJECUCIÓN DEL MÉTODO generarCredenciales()
import java.util.Random;


public class Asistente {
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    //Y SU MÉTODO CONSTRUCTOR
    
    protected String idTiquete, nombreCompleto, direccionResidencia, credenciales = "";

    public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia) {
        this.idTiquete = idTiquete;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia;
    }


    
    
    
    //NO DEBE PREOCUPARSE POR LA ESCRITURA DEL
    //MÉTODO A CONTINUACIÓN. ESTE REQUIERE DE LA 
    //IMPORTACIÓN DE LA LIBRERÍA Random PARA SU 
    //FUNCIONAMIENTO
    public void generarCredenciales() {
        if(credenciales.isEmpty()){ 
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencial = String.valueOf(x);
            credenciales = credencial;
        }
    }
    
    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO
    public String getIdTiquete() {
        return idTiquete;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }

    @Override
    public String toString() {
        return "ID del Tiquete:\n" + idTiquete + 
                "\nNombre del cliente:\n" + nombreCompleto + 
                "\nDireccion del cliente:\n" + direccionResidencia + 
                "\nCredenciales del cliente:\n" + credenciales;
    }
    
 }
