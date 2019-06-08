
import java.awt.Color;
import java.util.Date;

public class Platillos {
    private int tiempoPrep;
    private int ID;
    private Date fechaElab;
    private Color color;

    public Platillos(int tiempoPrep, int ID, Date fechaElab, Color color) {
        this.tiempoPrep = tiempoPrep;
        this.ID = ID;
        this.fechaElab = fechaElab;
        this.color = color;
    }

    public int getTiempoPrep() {
        return tiempoPrep;
    }

    public void setTiempoPrep(int tiempoPrep) {
        this.tiempoPrep = tiempoPrep;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getFechaElab() {
        return fechaElab;
    }

    public void setFechaElab(Date fechaElab) {
        this.fechaElab = fechaElab;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
    @Override
    public String toString() {
        return "Platillos{" + "tiempoPrep=" + tiempoPrep + ", ID=" + ID + ", fechaElab=" + fechaElab + ", color=" + color + '}';
    }
    
}

