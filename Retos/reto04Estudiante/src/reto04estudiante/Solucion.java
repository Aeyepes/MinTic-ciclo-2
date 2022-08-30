package reto04estudiante;

import java.util.ArrayList;
public class Solucion {
    //ESTA CLASE NO TIENE MAIN
    
    public static Object[] reportes(ArrayList<Estudiante> grupo) {
        //EN ESTE ESPACIO PONER SU LÓGICA
        double promedio;
        double suma = 0;
        String nombreMenorNota = grupo.get(0).getNombreCompleto();
        double menorNota = grupo.get(0).getNota();
        String nombreMayorNota = grupo.get(0).getNombreCompleto();
        double mayorNota = grupo.get(0).getNota();
         
        for (Estudiante estudiante : grupo) {
            suma += estudiante.getNota();
            
            if(menorNota > estudiante.getNota()){
                nombreMenorNota = estudiante.getNombreCompleto();
                menorNota = estudiante.getNota();
            }
            
            if(mayorNota < estudiante.getNota()){
                nombreMayorNota = estudiante.getNombreCompleto();
                mayorNota = estudiante.getNota();
            }
        }
        
        promedio = suma / grupo.size();
        
        Object[] retorno = {
            promedio,
            nombreMenorNota,
            menorNota,
            nombreMayorNota,
            mayorNota
        };
        
        return retorno;
    }
}
