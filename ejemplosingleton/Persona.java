package ejemplosingleton;

/**
 *
 * @author mmartinezcosta
 */
public class Persona {

    public String nome;
    public String apellido;
    public int edad;
    
    private static Persona laUnica;

    private Persona() {
        
    }

    private Persona(String nome, String apellido, int edad) {
        this.nome = nome;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    static Persona getInstance(){
     laUnica=new Persona();
        return laUnica;
    }
      
     static Persona getInstance(String nome,String apellido, int edad){
        laUnica=new Persona();
        return laUnica;
    }
    
    @Override
    public String toString() {
        String mensaje="Persona se llama: "+nome+" "+apellido+" y edad: "+edad; 
        return mensaje;
    }
      
}