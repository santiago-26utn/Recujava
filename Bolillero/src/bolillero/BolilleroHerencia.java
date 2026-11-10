
package bolillero;
import java.util.ArrayList;
import java.util.Random;


public class BolilleroHerencia {
    
    private Random aleatorio;
    
    private void validarBolillas() {
        
    }
            
            
    public BolilleroHerencia() {
        aleatorio = new Random();
        
    }
    
    public Integer getBolillaRepo() {
     return get (aleatorio.nextInt(size()));   
    }
     

    public Integer getBolilleroSinRepo() {
        
        return remove(aleatorio)
    }
