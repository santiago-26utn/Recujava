package relaciones;


public class Relaciones {

    
    public static void main(String[] args) {
        
        Motor m1 = new Motor(1.6, 12345678, "Nafta");
        
        Auto a1 = new Auto("AN123BC", "FORD", "azul", 2024, m1);
        Auto a2 = new Auto("AN123BC", "FORD", "azul", 2024, m1);
        
        
        m1.rpm = 1000;
        
        System.out.println(a1);
        System.out.println(a2);
    }
    
}
