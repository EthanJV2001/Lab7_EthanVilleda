
import java.awt.Color;
import java.util.Date;

public class Entradas extends Platillos{
    private String nombre;
    
    public Entradas(String nombre, int tiempoPrep, int ID, Date fechaElab, Color color) {
        super(tiempoPrep, ID, fechaElab, color);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Sopas{" + "nombre=" + nombre + super.toString() + '}';
    }
}
