import java.util.ArrayList;

public class Salle {

    private int numSalle;
    private int capacite;
    private ArrayList<Enseignent>fileAttente=new ArrayList<>();

    public Salle(int numSalle, int capacite) {
        this.numSalle = numSalle;
        this.capacite = capacite;
    }

    public int getNumSalle() {
        return numSalle;
    }

    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public ArrayList<Enseignent> getFileAttente() {
        return fileAttente;
    }


    @Override
    public String toString() {
        return "Salle{" +
                "numSalle=" + numSalle +
                ", capacite=" + capacite +
                '}';
    }

    public void setFileAttente(ArrayList<Enseignent> fileAttente) {
        this.fileAttente = fileAttente;
    }




}
