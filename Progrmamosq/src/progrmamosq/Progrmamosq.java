package progrmamosq;

public class Progrmamosq {

    
    public static void main(String[] args) {
     
        Mosquito mosquito = new Mosquito("Aeres aeyyli", 3, 'h');
        Avion avion = new Avion("Ducing", 3000, 500);
        
        
        volador v = mosquito;
        v = avion;
    }
    
}


        mosquito.comer();
        
        mosquito.zumbar();

        avion.hacerMantenimiento();

        // mosquito.volar();
        hacerVolarMosquito(mosquito);

        hscerVolarAvion(avion);

        hacerVolar(avion);
        hacerVolar(mosquito); 

        // hacerVolar("Juancito");


        
/*    public static void hacerVolar(Object o) {
        if (o instanceof Avion a) {
            a.volar();
        } else if (o instanceof Mosquito m) {
            m.volar(); 
        }
    }