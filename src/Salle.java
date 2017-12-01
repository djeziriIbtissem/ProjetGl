import java.util.ArrayList;

public class Salle {

    private int numSalle;
    private int capacite;
    private ArrayList<ReservationSalle> reservationSalles = new ArrayList<>();

    public Salle(int numSalle, int capacite) {
        this.numSalle = numSalle;
        this.capacite = capacite;
    }

    /**
     * Getters ans Setters
     **/
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

    public ArrayList<ReservationSalle> getReservationSalles() {
        return reservationSalles;
    }

    public void setReservationSalles(ArrayList<ReservationSalle> reservationSalles) {
        this.reservationSalles = reservationSalles;
    }

    /**
     * Methode
     **/

    //methode de rervation d'une salle par un enseignant
    public void ajouterReservation(Enseignent enseignent, Dates datesReservation) {
        boolean reserver = false;
        for (int i = 0; i < reservationSalles.size(); i++) {
            if (reservationSalles.get(i).getDateReservation().getJour() == (datesReservation.getJour())
                    && reservationSalles.get(i).getDateReservation().getMois() == (datesReservation.getMois())
                    && reservationSalles.get(i).getDateReservation().getAnnees() == (datesReservation.getAnnees())) {
                reservationSalles.get(i).ajouterReservation(enseignent);
                reserver = true;
                break;
            }
        }
        if (!reserver) {
            reservationSalles.add(new ReservationSalle(datesReservation, this, enseignent));
        }
    }

    //annuler une reservation d'un enseignant
    public void annulerReservation(Enseignent enseignent) {
        for (int i = 0; i < reservationSalles.size(); i++) {
            reservationSalles.get(i).annulerReservation(enseignent);
        }
    }

    public void affichageReservation() {
        System.out.println("\nSalle " + numSalle + " ==============================================");
        for (int i = 0; i < reservationSalles.size(); i++) {
            System.out.print("\n" + (i + 1) + "- ");
            reservationSalles.get(i).afficheReservationSalle();
        }
        if (reservationSalles.isEmpty()) {
            System.out.println("Aucune reservation !");
        }
    }

    @Override
    public String toString() {
        return "Salle{" +
                "numSalle=" + numSalle +
                ", capacite=" + capacite +
                '}';
    }


}
