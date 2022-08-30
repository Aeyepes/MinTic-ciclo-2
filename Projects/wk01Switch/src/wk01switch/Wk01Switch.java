package wk01switch;

public class Wk01Switch {

    public static void main(String[] args) {
        // TODO code application logic here
        dia();
        calendario();
    }
    public static void dia(){
        int dia = 3;
        String nombreDia;
        nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        System.out.println(nombreDia);
    }
    
    public static void calendario(){
        int mes = 2;
        int anio = 2000;
        int numeroDias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (((anio % 4 == 0)
                        && !(anio % 100 == 0))
                        || (anio % 400 == 0)) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("Mes inválido");
                break;
        }
        System.out.println("Número de días = " + numeroDias);
    }
}
    
