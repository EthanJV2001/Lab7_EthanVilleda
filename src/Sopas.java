
import java.awt.Color;
import java.util.Date;

public class Sopas extends Platillos {

    private String nombre;

    public Sopas(String nombre, int tiempoPrep, int ID, Date fechaElab, Color color) {
        super(tiempoPrep, ID, fechaElab, color);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Sopas{" + "nombre=" + nombre + super.toString() + '}';
    }
}
