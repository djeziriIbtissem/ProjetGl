import java.util.ArrayList;
import java.util.Comparator;

public class Departement {

    private String nomDepartement;
    private Enseignent responsable;

    private ArrayList<Enseignent> listEnseignents = new ArrayList<>();
    private ArrayList<Etudiant> listEtudiants = new ArrayList<>();
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

    public ArrayList<Enseignent> getListEnseignents() {
        return listEnseignents;
    }

    public void setListEnseignents(ArrayList<Enseignent> listEnseignents) {
        this.listEnseignents = listEnseignents;
    }

    public ArrayList<Etudiant> getListEtudiants() {
        return listEtudiants;
    }

    public void setListEtudiants(ArrayList<Etudiant> listEtudiants) {
        this.listEtudiants = listEtudiants;
    }


    public ArrayList<Salle> getListSalle() {
        return listSalle;
    }

    public void setListSalle(ArrayList<Salle> listSalle) {
        this.listSalle = listSalle;
    }


    //calculer la moyenne general du departement
    public double calculerMoyenneDepartement() {
        double moyenne = 0;
        for (int i = 0; i < listEtudiants.size(); i++) {
            moyenne = listEtudiants.get(i).calculerMoyenneGeneral() + moyenne;
        }
        return moyenne / listEtudiants.size();
    }

    //affichage moyenne general du departement
    public void affichageMoyenneDepartement() {
        System.out.println("la moyenne general du departement est : " + calculerMoyenneDepartement());
    }

    //affichage des enseingant
    public void affichageListEnseignant() {
        for (int i = 0; i < listEnseignents.size(); i++) {
            System.out.print((i + 1) + "- ");
            listEnseignents.get(i).afficheFiche();
        }
    }

    //affichage de tous les enseignanant par grad
    public void affichageEnseignantParGrade() {

        for (int i = 0; i < listEnseignents.size(); i++) {
            if (listEnseignents.get(i).getGrade().equals(GradeEnseignant.PR)) {
                listEnseignents.get(i).afficheFiche();
            }
        }
        for (int i = 0; i < listEnseignents.size(); i++) {
            if (listEnseignents.get(i).getGrade().equals(GradeEnseignant.MCA)) {
                listEnseignents.get(i).afficheFiche();
            }
        }
        for (int i = 0; i < listEnseignents.size(); i++) {
            if (listEnseignents.get(i).getGrade().equals(GradeEnseignant.MCB)) {
                listEnseignents.get(i).afficheFiche();
            }
        }
        for (int i = 0; i < listEnseignents.size(); i++) {
            if (listEnseignents.get(i).getGrade().equals(GradeEnseignant.MAA)) {
                listEnseignents.get(i).afficheFiche();
            }
        }
        for (int i = 0; i < listEnseignents.size(); i++) {
            if (listEnseignents.get(i).getGrade().equals(GradeEnseignant.MAB)) {
                listEnseignents.get(i).afficheFiche();
            }
        }
    }

    //affichage des enseiagnt par un grad
    public void affichageEnseignantParGrade(GradeEnseignant grade) {
        for (int i = 0; i < listEnseignents.size(); i++) {
            if (listEnseignents.get(i).getGrade().equals(grade))
                listEnseignents.get(i).afficheFiche();

        }
    }


    //affichage du responsable du departement
    public void afficherResponsable() {
        System.out.println("le responsabe du departement " + getNomDepartement() + " est : " + getResponsable().getNom());
    }

    //affichage des salles
    public void affichageSalles() {
        for (int i = 0; i < listSalle.size(); i++) {
            System.out.println((i + 1) + "- " + listSalle.get(i));
        }
    }

    //Methode pour trier la liste des enseignant par date
    private Comparator<Enseignent> comparerDate = new Comparator<Enseignent>() {
        @Override
        public int compare(Enseignent o1, Enseignent o2) {
            if (o1.getDateFonction() == o2.getDateFonction())
                return 0;
            else if (o1.getDateFonction().getAnnees() < o2.getDateFonction().getAnnees())
                return -1;
            else
                return 1;
        }
    };

    public void affichageTrieEnseignant() {
        listEnseignents.sort(comparerDate);
        for (int i = 0; i < listEnseignents.size(); i++) {
            System.out.println(listEnseignents.get(i));

        }
    }


    // Methode pour trier les salles par capacité
    private Comparator<Salle> comparerSalle = new Comparator<Salle>() {
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

    //affichage des salle par ordre de capaciter
    public void affichageTrieSalle() {
        listSalle.sort(comparerSalle);
        for (int i = 0; i < listSalle.size(); i++) {
            System.out.println(listSalle.get(i));

        }
    }


    // Methode pour trier les listEtudiants par classement
    private Comparator<Etudiant> comparerEtudiant = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant o1, Etudiant o2) {
            if (o1.calculerMoyenneGeneral() == o2.calculerMoyenneGeneral())
                return 0;
            else if (o1.calculerMoyenneGeneral() > o2.calculerMoyenneGeneral())
                return -1;
            else
                return 1;
        }
    };

    public void affichageClassementListEtudiant() {
        listEtudiants.sort(comparerEtudiant);
        for (int i = 0; i < listEtudiants.size(); i++) {
            System.out.println(listEtudiants.get(i) + " moyenne : " + listEtudiants.get(i).calculerMoyenneGeneral());

        }
    }

    //pour afficher la liste des etudiant
    public void affichageListEtudiant() {
        for (int i = 0; i < listEtudiants.size(); i++) {
            listEtudiants.get(i).afficheFicheEtudiant();
        }
    }

    //pour afficher toutes les reservation de toutes les salles
    public void afficherReservationSalle() {
        for (int i = 0; i < listSalle.size(); i++) {
            listSalle.get(i).affichageReservation();
        }
    }

    //ajouter etudiant
    public void addEtudiant(Etudiant etudiant) {
        listEtudiants.add(etudiant);
    }

    //ajouter enseigant
    public void addEnseignant(Enseignent enseignent) {
        listEnseignents.add(enseignent);
    }

    //ajouter sale
    public void addSalle(Salle salle) {
        listSalle.add(salle);
    }


    @Override
    public String toString() {
        return "Departement{" +
                "nomDepartement='" + nomDepartement + '\'' +
                ", responsable=" + responsable +
                '}';
    }
}
