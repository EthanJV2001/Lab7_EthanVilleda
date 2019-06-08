
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class administrarBarra extends Thread{
    private JProgressBar progBar;
    private JTable tabla;
    private boolean avanzar;
    private boolean vive;
    private DefaultTableModel modelo;
    private ArrayList plati=new ArrayList();
    Cliente c=new Cliente();

    public administrarBarra(JProgressBar progBar, JTable tabla) {
        this.progBar = progBar;
        this.tabla=tabla;
        avanzar=true;
        vive=true;
        modelo=(DefaultTableModel)tabla.getModel();
    }

    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public ArrayList getPlati() {
        return plati;
    }

    public void setPlati(ArrayList plati) {
        this.plati = plati;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
    
    public void run() {
        int tiempo=1;
        while(vive){
            if(avanzar){
                if(plati.size()>0){
                    tiempo=((Platillos)plati.get(0)).getTiempoPrep()*10;
                    progBar.setMaximum(((Platillos)plati.get(0)).getTiempoPrep());
                    progBar.setValue(progBar.getValue()+1);
                    if(progBar.getValue()==progBar.getMaximum()){
                        modelo.addRow(new Object[]{((Platillos)plati.get(0)).getID(), ((Platillos)c.getPlatillos().get(0)).getTiempoPrep()});
                        if(plati.size()==1){
                            avanzar=false;
                        }
                        plati.remove(0);
                        progBar.setValue(0);
                    }
                }
            }
            try{
                Thread.sleep(tiempo);
            }catch(InterruptedException ex){}
        }
    }
}
