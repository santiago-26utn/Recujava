
package relaciones;


public class Auto {
    
    private String patente;
    private String marca;
    private String color;
    private int modelo;
    private Motor motor;
    private Propietario duenio;

    public Auto(String patente, String marca, String color, int modelo, double cilindrada, int nroSerie, String combustible) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.motor = new Motor(cilindrada, nroSerie, combustible);
        
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", nroSerie=" + nroSerie + ", combustible=" + combustible + ", rpm=" + rpm + '}';
    }
    
    
    
}
    
    
}
