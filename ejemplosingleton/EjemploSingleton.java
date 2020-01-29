package ejemplosingleton;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class EjemploSingleton {

    
    public static void main(String[] args) {
        // TODO code application logic here
    
    Persona alguien=Persona.getInstance();
    Persona alguien1=Persona.getInstance("miguel","costa", 2);
        System.out.println(alguien.toString());
        
    }
    
}
