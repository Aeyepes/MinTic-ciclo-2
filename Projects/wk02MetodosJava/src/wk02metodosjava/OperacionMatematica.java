package wk02metodosjava;

public class OperacionMatematica {
    
    public void suma(float x,float y){
        float r;
        r = x + y;
        System.out.println("La suma es de: " + r);
    }
    
    public void resta(){
        float x = 10, y = 20, r;
        r = x - y;
        System.out.println("La resta es de: " + r);
    }
    
    public float suma(){
        float num1 = 50, num2 = 30;
        return num1 + num2;
    }
}
