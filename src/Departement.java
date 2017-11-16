import java.util.ArrayList;
import java.util.Comparator;

public class Departement {

    private String nomDepartement;
    private Enseignent responsable;
    private ArrayList<Enseignent> enseignents = new ArrayList<>();
    private ArrayList<Etudiant> etudiants = new ArrayList<>();
    private ArrayList<Salle> listSalle = new ArrayList<>();

    public Departement(String nomDepartement, Enseignent responsable) {
        this.nomDepartement = nomDepartement;
        this.responsable = responsable;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public Enseignent getResponsable() {
        return responsable;
    }

    public void setResponsable(Enseignent responsable) {
        this.responsable = responsable;
    }

    public ArrayList<Enseignent> getEnseignents() {
        return enseignents;
    }

    public void setEnseignents(ArrayList<Enseignent> enseignents) {
        this.enseignents = enseignents;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }


    public ArrayList<Salle> getListSalle() {
        return listSalle;
    }

    public void setListSalle(ArrayList<Salle> listSalle) {
        this.listSalle = listSalle;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "nomDepartement='" + nomDepartement + '\'' +
                ", responsable=" + responsable +
                '}';
    }

    public void calculerMoyenneDepartement() {
        double moyenne = 0;
        for (int i = 0; i < etudiants.size(); i++) {
            moyenne = etudiants.get(i).getMoyenneGeneral() + moyenne;

        }
        moyenne = moyenne / etudiants.size();
        System.out.println("la moyenne general du departement est" + moyenne);
    }

    public void affichageEnseignantParGrade(String grade) {
        for (int i = 0; i < enseignents.size(); i++) {
            if (enseignents.get(i).getGrade().equals(grade))
                enseignents.get(i).afficheFiche();

        }
    }

    public void afficherResponsable() {
        System.out.println("le responsabe de " + getNomDepartement() + " est " + getResponsable().getNom());
    }


    //Methode pour trier la liste des enseignant par date
    Comparator<Enseignent> comparerDate = new Comparator<Enseignent>() {
        @Override
        public int compare(Enseignent o1, Enseignent o2) {
            if (o1.getDateFonction() == o2.getDateFonction())
                return 0;
            else if (o1.getDateFonction() < o2.getDateFonction())
                return -1;
            else
                return 1;
        }
    };

    public void affichagetrieEnseignant() {
        enseignents.sort(comparerDate);
        for (int i = 0; i < enseignents.size(); i++) {
            System.out.println(enseignents.get(i));

        }
    }


    // Methode pour trier les salles par capacité
    Comparator<Salle> comparerSalle = new Comparator<Salle>() {
        @Override
        public int compare(Salle o1, Salle o2) {
            if (o1.getCapacite() == o2.getCapacite())
                return 0;
            else if (o1.getCapacite() > o2.getCapacite())
                return -1;
            else
                return 1;
        }
    };

    public void affichagetrieSalle() {
        listSalle.sort(comparerSalle);
        for (int i = 0; i < listSalle.size(); i++) {
            System.out.println(listSalle.get(i));

        }
    }


    // Methode pour trier les etudiants par classement
    Comparator<Etudiant> comparerEtudiant = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant o1, Etudiant o2) {
            if (o1.getMoyenneGeneral() == o2.getMoyenneGeneral())
                return 0;
            else if (o1.getMoyenneGeneral() > o2.getMoyenneGeneral())
                return -1;
            else
                return 1;
        }
    };

    public void affichagetrieEtudiant() {
        etudiants.sort(comparerEtudiant);
        for (int i = 0; i < etudiants.size(); i++) {
            System.out.println(etudiants.get(i)+" moyenne : "+etudiants.get(i).getMoyenneGeneral());

        }
    }


    public void addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public void addEnseignant(Enseignent enseignent) {
        enseignents.add(enseignent);
    }

    public void addSalle(Salle salle) {
        listSalle.add(salle);
    }


}
