import java.util.ArrayList;

public class Etudiant {

    private String nom;
    private String prenom;
    private String numTel;
    private String email;
    private Dates dateEntre;

    private ArrayList<Note> listNotes = new ArrayList<>();
    private ArrayList<Matiere> listMatieres = new ArrayList<>();

    public Etudiant(String nom, String prenom, String numTel, String email, Dates dateEntre) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
        this.email = email;
        this.dateEntre = dateEntre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dates getDateEntre() {
        return dateEntre;
    }

    public void setDateEntre(Dates dateEntre) {
        this.dateEntre = dateEntre;
    }

    public ArrayList<Note> getListNotes() {
        return listNotes;
    }

    public void setListNotes(ArrayList<Note> listNotes) {
        this.listNotes = listNotes;
    }

    public ArrayList<Matiere> getListMatieres() {
        return listMatieres;
    }

    public void setListMatieres(ArrayList<Matiere> listMatieres) {
        this.listMatieres = listMatieres;
    }


    //affichage fiche de l'etudiant
    public void afficheFicheEtudiant() {
        System.out.println(this);
    }


    //calculer la moyenne de l'etudiant
    public double calculerMoyenneGeneral() {
        double moyenne = 0;
        for (int i = 0; i < listNotes.size(); i++) {
            moyenne = listNotes.get(i).getNote() + moyenne;
        }
        return (moyenne / listMatieres.size());
    }

    //afficher la moyenne general de l'etudiant
    public void affichageMoyenneGeneral() {
        System.out.println("la moyenne est : " + calculerMoyenneGeneral());
    }


    //get une note d'une matiere donnée
    public float getNoteUneMatiere(Matiere NomMatiere) {
        for (int i = 0; i < listNotes.size(); i++) {
            if (listNotes.get(i).getMatiere().equals(NomMatiere)) {
                return listNotes.get(i).getNote();
            }
        }
        return 0;
    }


    //liste des matiere sans note de l'etudiant
    public void afficherMatiereSansNote() {
        ArrayList<Matiere> matiereSansNote = new ArrayList<>();

        for (int i = 0; i < listMatieres.size(); i++) {

            int indice = 0;
            boolean existe = false;

            while (!existe && indice < listNotes.size()) {
                if (listMatieres.get(i).equals(listNotes.get(indice).getMatiere())) {
                    existe = true;
                } else
                    indice++;
            }

            if (!existe) {
                matiereSansNote.add(listMatieres.get(i));
            }
        }
        if (matiereSansNote.isEmpty())
            System.out.println("l'étudiant " + nom + " est noté sur toutes les Matieres");
        else {
            System.out.println("les Matieres sans note de " + nom);
            for (int i = 0; i < matiereSansNote.size(); i++) {
                System.out.println(matiereSansNote.get(i).getNom());
            }
        }
    }

    //affichage des listNotes et moyenne general
    public void affichageNoteParMatiereEtMoyenne() {
        System.out.println("\nEtudiant " + nom + " " + prenom);
        for (int i = 0; i < listNotes.size(); i++) {
            System.out.println("la note de la matiere " + listNotes.get(i).getMatiere().getNom() + " est " + listNotes.get(i).getNote());
        }
        afficherMatiereSansNote();
        affichageMoyenneGeneral();
    }

    //ajouter une note
    public void addNote(Note note) {
        listNotes.add(note);
    }

    //ajouter matiere
    public void addMatiere(Matiere matiere) {
        listMatieres.add(matiere);
        matiere.addEtudiant(this);
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numTel='" + numTel + '\'' +
                ", email='" + email + '\'' +
                ", dateEntre='" + dateEntre + '\'' +
                '}';
    }

}
