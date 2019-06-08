
import java.awt.Color;
import java.util.Date;

public class PlatoFuerte extends Platillos{
    private String nombre;

    public PlatoFuerte(String nombre, int tiempoPrep, int ID, Date fechaElab, Color color) {
        super(tiempoPrep, ID, fechaElab, color);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PlatoFuerte{" + "nombre=" + nombre + super.toString() + '}';
    }
    
}
