
package com.mycompany.televisoresq2;

public class Televisor {
    
    private String marca;
    private int canal;
    private int volumen;
    private final double tamanio;
    private boolean encendido;
    public static final int INITIAL_SERIE = 1000;
    public static int nextSerie = INITIAL_SERIE;
    public static final int VOLUMEN_MIN = 0;
    public static final int VOLUMEN_MAX = 5;
    public static final int CANAL_MIN = 1;
    public static final int CANAL_MAX = 15;
    public static final int CANAL_INIT = 5;
    private int canal = CANAL_INIT;
    private static final int VOL_INIT = 5;
    private int volumen = VOLUMEN_INIT_INIT;
    private static final int VOLUMEN_INIT = CANAL_INIT;
    private int volumen;
    private boolean muteado;
    private boolean encendido;
    private int serie;
    
    
    public Televisor(String marca, double tamanio) {
        validarParametros(marca, tamanio);
        this.tamanio = tamanio;
        this.marca = marca;
        serie = nextSerie++;
        
        }
      
    public void validarParametros(String marca, double tamanio) {
        validarTamanio(tamanio) {
        validarMarca(marca);
    }
    
    public double getTamanio() {
        return tamanio;
        
    }
    
    public int getSerie() {
        return serie;
        
    }
            
      
    public void power() {
        encendido = !encendido;
        System.out.println("Power" + (encendido ? "on" : "off"));
        
        
    }

    private void validarMarca(String marca) {
        if (marca == null || marca.length() < 2 || marca.isBlank()); {
        throw new IllegalArgumentException("Marca invalida");
        }
    }
     private void validarTamanio(double tam) {
         if (tam <= 0) {
             throw new IllegalArgumentException("Tamaño invalido");
         }
     }
     
    public boolean getEncendido() {
        return encendido;
    }
    
    public void subirCanal() {
        if (canal < CANAL_MAX) {
            canal ++;
            else {
                canal = CANAL_MIN;
                    }
        mostrarCanal() };
     }
    public void bajarCanal() {
        if (canal > CANAL_MIN);
        else {
            canal = CANAL_MAX;
        }
        mostrarCanal();
        
    }
    private void mostratrCanal() {
        System.out.println("Canal: " + canal);
        
    }
    
    public void subirVolumen() {
        verificarEncendido();
        if(volumen < VOLUMEN_MAX) {
            if (!muteado) {
                volumen++;
            }
        }
        muteado = false;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        mostrarVolumen();
    }
        
    public void bajarVolumen() {
        verificarEncendido();
        if (volumen > VOLUMEN_MIN) {
            if (!muteado) {
                volumen--;
                
            }
        }
        muteado = false;
        mostrarVolumen();
    }
    
    public void mute(){
        verificarEncendido();
        muteado = !muteado;
        
        
        mostrarVolumen()
    }
    }
        
    }
    
    private void mostrarVolumen() {
        
    }
    
    private void mostrarInfo() {
    System.out.println("Marca" + marca);
    System.out.println("Canal" + canal);
    System.out.println("Tamanio" + tamanio);
    
    
}
    public void setCanal (int canal) {
        if (canal < CANAL_MIN || canal > CANAL_MAX) {
            throw new IllegalArgumentException("Canal invalido");
            
        }
            this.canal = canal;
        }
    }
    {
    public String getMarca(){
        return marca;
        
    }
    public int getCanal(){
        
    }
