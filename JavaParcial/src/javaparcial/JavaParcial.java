
package javaparcial;
import java.util.List;


public class JavaParcial {
    
    public static void main(String[] args) { 
        Festival festival = new Festival("Ciencia Abierta"); 
         
        festival.agregarActividad(new Charla("C01", "IA Creativa", 
                    FranjaHoraria.MATUTINA, 40, 10, 2)); 
        festival.agregarActividad(new Taller("T02", "Robotica", 
                    FranjaHoraria.VESPERTINA, 60, 30, 1)); 
        festival.agregarActividad(new MuestraInteractiva("M03", "Ciencia Viva", 
                    FranjaHoraria.MATUTINA, 25, 4)); 
        festival.agregarActividad(new Charla("C04", "Astronomia", 
                    FranjaHoraria.NOCTURNA, 35, 15, 1));         
        festival.agregarActividad(new Taller("C01", "IA Creativa", 
                    FranjaHoraria.NOCTURNA, 20, 5, 3)); 
 
        System.out.println("ACTIVIDADES"); 
        mostrarActividades(festival.obtenerActividades()); 
        System.out.println("DURACIONES"); 
        mostrarDuraciones(festival.obtenerActividades()); 
        System.out.println("PRESENTACIONES"); 
        realizarPresentaciones(festival.obtenerActividades()); 
        System.out.println("RESERVAS"); 
        reservarActividades(festival.obtenerActividades()); 
        System.out.println("MATUTINA"); 
        mostrarActividades(festival.filtrarPorFranja(FranjaHoraria.MATUTINA)); 
        System.out.println("HASTA 50 MINUTOS"); 
        mostrarActividades(festival.obtenerActividadesDeDuracionMaxima(50)); 
    } 
    private static void mostrarActividades(List<Actividad> actividades) { 
        // Completar 
    } 
  
    private static void mostrarDuraciones(List<Actividad> actividades) { 
        // Completar: titulo + ": " + duracionTotal + " minutos" 
    } 
  
    private static void realizarPresentaciones(List<Actividad> actividades) { 
        // Completar: ejecutar presentar() cuando corresponda; 
        // en otro caso imprimir "<titulo> no realiza presentacion." 
    } 
  
    private static void reservarActividades(List<Actividad> actividades) { 
        // Completar: reservar un lugar cuando corresponda; 
        // en otro caso imprimir "<titulo> no admite reservas." 
    } 
}  
}