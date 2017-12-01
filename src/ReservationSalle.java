import java.util.ArrayList;

public class ReservationSalle {

    private Dates dateReservation;
    private Salle salle;
    private ArrayList<Enseignent> listReservation = new ArrayList<>();

    public ReservationSalle(Dates dateReservation, Salle salle, Enseignent enseignent) {
        this.dateReservation = dateReservation;
        this.salle = salle;
        this.listReservation.add(enseignent);
    }

    /**
     * Getters ans Setters
     **/

    public Dates getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Dates dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public ArrayList<Enseignent> getListReservation() {
        return listReservation;
    }

    public void setListReservation(ArrayList<Enseignent> listReservation) {
        this.listReservation = listReservation;
    }


    /**
     * Methode
     **/

    //ajouter reservation d'une salle par un enseignant
    public void ajouterReservation(Enseignent enseignent) {
        if (listReservation.size() < 5) {
            listReservation.add(enseignent);
        } else
            System.out.println("impossible de reserver cette salle (complet!)");
    }

    //annuler une reservation d'un enseignant
    public void annulerReservation(Enseignent enseignent) {
        if (!listReservation.isEmpty()) {
            listReservation.remove(enseignent);
        } else {
            System.out.println("pas de reservation pour cet enseignant " + enseignent.getNom());
        }
    }

    //pour afficher toute les reservation de la salle
    public void afficheReservationSalle() {
        System.out.println(dateReservation + " :");
        for (int i = 0; i < listReservation.size(); i++) {
            System.out.println("   " + (i + 1) + "- " + listReservation.get(i).getNom() + " a reserver cette salle  ");
        }
    }


    @Override
    public String toString() {
        return "ReservationSalle{" +
                "dateReservation=" + dateReservation +
                ", salle=" + salle +
                ", listReservation=" + listReservation +
                '}';
    }
}
