package reto03partido;

public class Preferencial extends Asistente {
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    //Y SU MÉTODO CONSTRUCTOR
    private boolean participaSorteo;

    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.participaSorteo = false;
    }
    
    public void participarSorteo(){
        
        //ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        //participarSorteo()
        setParticipaSorteo(!participaSorteo);
    }
    
    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO

    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n ¿Participa en el sorteo?\n" + participaSorteo;
    }
    
}
