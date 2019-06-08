
import java.awt.Color;
import java.util.Date;

public class Postre extends Platillos{
    private String nombre;

    public Postre(String nombre, int tiempoPrep, int ID, Date fechaElab, Color color) {
        super(tiempoPrep, ID, fechaElab, color);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Postre{" + "nombre=" + nombre + super.toString() + '}';
    }
}
