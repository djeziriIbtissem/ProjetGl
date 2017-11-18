public class Dates {

    private int jour;
    private int mois;
    private int annees;


    public Dates(int jour, int mois, int annees) {
        this.jour = jour;
        this.mois = mois;
        this.annees = annees;
    }


    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnees() {
        return annees;
    }

    public void setAnnees(int annees) {
        this.annees = annees;
    }


    @Override
    public String toString() {
        return "'" + jour + "/" + mois + "/" + annees + "'";
    }
}
