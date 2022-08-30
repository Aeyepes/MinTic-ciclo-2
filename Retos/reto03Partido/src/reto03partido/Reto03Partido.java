package reto03partido;

public class Reto03Partido {

    public static void main(String[] args) {
        // TODO code application logic here
        Preferencial tiq_pref1 = new Preferencial(
                "0123",
                "Juan Perez",
                "CL 01 CR 02-03"
        );
        
        VIP tiq_vip1 = new VIP(
                "5434",
                "Maria Lopez",
                "CR 29 CL 28-27"
        );
        
        
        tiq_pref1.participarSorteo();
        tiq_pref1.generarCredenciales();
        tiq_pref1.setDireccionResidencia("CL 04 CR 05-06");
        tiq_vip1.generarCredenciales();
        tiq_vip1.generarCredencialesPrevia();
        tiq_vip1.asignarPantalla(1);
        tiq_vip1.asignarPantalla(2);
        tiq_vip1.asignarPantalla(3);
        tiq_vip1.asignarPantalla(3);
        
        //System.out.println(tiq_vip1.toString());
        
        System.out.println(tiq_pref1.toString());
        
    }
    
}
