package poo;

public class Login {
    //Clase con primer caracter en Mayuscula
    //Se declaran los atributos de la clase
    //Encapsular es garantizar que los atributos sean privados dentro de la clase
    private String usuario;
    private String clave;
    private String rol;
    
    //Metodo para inicializar la clase
    //Se hace a traves de un metodo constructor, debe ser publico
    //Se usa para para instanciar las variables
    //Debe tener el mismo nombre de la clase
    public Login(){
        
    }
    //Sobrecarga del metodo:
    // Se pueden nombrar varios metodos de igual manera siempre y cuando el 
    // numero o el tipo de atributos sean diferentes.
    public Login(String usuario, String clave, String rol){
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }
    //clic, insertar codigo, constructor alt + insert
    
    //Getter: Se usa para obtener el valor de los variables
    public boolean getUsuario(){
        boolean x = false;
        if(usuario.equals("pepe")){
            x = true;
        }
        return x;
    }
    
    public boolean getClave(){
        boolean x = false;
        if(clave.equals("123")){
            x = true;
        }
        return x;
    }
    
    public String getRol(){
        return rol;
    }
    
    //Setter: Se usa para modificar el valor de las variables

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
