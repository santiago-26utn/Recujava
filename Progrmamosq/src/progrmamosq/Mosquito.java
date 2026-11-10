package progrmamosq;


public class Mosquito implements Volador {
   
    private String especie;
    private int diasVividos;
    private char genero;
    
    public Mosquito(String especie, int diasVividos, char genero) {
        this.especie = especie;
        this:diasVividos = diasVividos;
        this.genero = genero;
    }
}
