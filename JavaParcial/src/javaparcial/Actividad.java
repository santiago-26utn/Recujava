
package javaparcial;

import java.util.Objects;

public abstract class Actividad {
   private final String codigo;
   private final String titulo;
   private final FranjaHoraria franja;
   private final int duracionBase;
   
   protected Actividad(String codigo, String titulo, FranjaHoraria franja, int duracionBase) {
    if (codigo == null || codigo.isBlank()) {
        throw new IllegalArgumentException("El codigo no debe ser nulo ni estar en blanco");
    }
    if (titulo == null || titulo.isBlank()) {
        throw new IllegalArgumentException("El titulo no debe ser nulo ni estar en blanco");
    }
    if (franja == null) {
        throw new IllegalArgumentException("La franja es obligatoria");
    }
    if (duracionBase <= 0) {
        throw new IllegalArgumentException("La duracion debe ser mayor de 0");
    }
    this.codigo = codigo;
    this.titulo = titulo;
    this.franja = franja;
    this.duracionBase = duracionBase;
   }
   
   public abstract int getDuracionTotal();
   
   public String getCodigo() { return codigo; }
   public String getTitulo() { return titulo; }
   public FranjaHoraria getFranja() { return franja;}
   public int getDuracionBase() { return duracionBase; }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, titulo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Actividad)) return false,
        Actividad otra = (Actividad) obj;
        return codigo.equals(otra.codigo) && titulo.equals(otra.titulo)
                }
}
        
        

   