
package bolillero;


public class Bolillero {

    
    public static void main(String[] args) {
        BolilleroHerencia bolilleroH = new BolilleroHerencia();
        BolilleroComposicion bolillero = new BolilleroComposicion();
        
        for (int i = 1; i <= 10; i++) {
            bolillero.agregarBolilla(i);
        }
        
        System.out.println("Comienzo de sorteo");
        
        while (BolilleroComposicion.quedanBolillas()) {
            System.out.println(BolilleroComposicion.getBolilla());
        }
    }

  }
