package javaparcial;


public class Charla extends Actividad  {
    private final int minutosPreguntas;
    private int cupos;

    public Charla(int minutosPreguntas, String codigo, String titulo, FranjaHoraria franja, FranjaHoraria franja) {
        super(codigo, titulo, franja, duracionBase);
        if (minutosPreguntas < 0) {
            throw new IllegalArgumentException("Los minutos no pueden ser menor a 0"); 
        }
        if (cupos < 0) {
            throw new IllegalArgumentException("Los cupos no pueden ser menor a 0 ");
            
        }
        this.minutosPreguntas = minutosPreguntas;
        this.cupos = cupos;
    }

    @Override
    public int getDuracionTotal() {
        return getDuracionBase() + minutosPreguntas;
    }
    @Override
    public String reservarLugar() {
        if (cupos == 0) {
            throw new IllegalArgumentException("No quedaron lugares en" + getTitulo() + ".");
        }
        cupos--;
        return "Reserva confirmada para: " + getTitulo() + ". Cupos restantes: " + cupos + ".";
        }
    @Override
    public String presentar() {
        return "Presentacion de charla: " + getTitulo() + ".";

    }
    public int getMinutos preguntas() { return minutosPreguntas; }
    
    @Override
    public String toString() {
        return "Charla codigo=" + getCodigo() + ", titulo=" + getTitulo()
                + ", franja=" + getFranja() + ", duracionBase=" + getDuracionBase()
                + ", minutosPreguntas=" + minutosPreguntas + cupos;
    }
}
