public class Main {

    public static void main(String[] args) {

        Ecole ecole1 = new Ecole("site internet", "IGMO");

        Enseignent enseignent = new Enseignent("haffaf", "hafid", "00000", "hafff@gmail.com", 1990, "PR");
        Enseignent enseignent1 = new Enseignent("sakhri1", "larbi", "00000", "sakhri@gmail.com", 1999, "PR");
        Enseignent enseignent2 = new Enseignent("sakhri2", "larbi", "00000", "sakhri@gmail.com", 2010, "MCA");
        Enseignent enseignent3 = new Enseignent("sakhri3", "larbi", "00000", "sakhri@gmail.com", 2005, "PR");
        Enseignent enseignent4 = new Enseignent("sakhri4", "larbi", "00000", "sakhri@gmail.com", 2001, "MCB");

        Departement departement1 = new Departement("info", enseignent);

        Etudiant etudiant1 = new Etudiant("CHOUIB", "Chawki", "00000", "chouib@gmail.com", "2010");
        Etudiant etudiant2 = new Etudiant("DJEZIRI", "Ibtissem", "1111", "ibtissem@gamil.com", "2010");
        Etudiant etudiant3 = new Etudiant("BENOTMANE", "Mohamed", "2222", "mohamed@gmail.com", "2010");


        Salle salle1 = new Salle(1, 20);
        Salle salle2 = new Salle(2, 30);
        Salle salle3 = new Salle(3, 15);
        Salle salle4 = new Salle(4, 35);


        Matiere matiere1 = new Matiere("probabilité", salle2);
        Matiere matiere2 = new Matiere("compilation", salle3);
        Matiere matiere3 = new Matiere("Gl", salle1);
        Matiere matiere4 = new Matiere("probabilité", salle4);

        Note note1 = new Note(15, matiere1);
        Note note5 = new Note(10, matiere1);

        Note note2 = new Note(10, matiere2);
        Note note3 = new Note(6, matiere3);
        Note note4= new Note(9, matiere4);



        etudiant1.addMatiere(matiere1);
        etudiant1.addMatiere(matiere2);
        etudiant1.addNote(note1);
        etudiant1.addNote(note2);

        etudiant2.addMatiere(matiere1);
        etudiant2.addMatiere(matiere4);
        etudiant2.addNote(note5);
        etudiant2.addNote(note4);





        enseignent.addMatiere(matiere1);
        enseignent.addMatiere(matiere2);

        departement1.addEnseignant(enseignent);
        departement1.addEnseignant(enseignent1);
        departement1.addEnseignant(enseignent2);
        departement1.addEnseignant(enseignent3);
        departement1.addEnseignant(enseignent4);


        departement1.addEtudiant(etudiant1);
        departement1.addEtudiant(etudiant2);
        departement1.addEtudiant(etudiant3);


        ecole1.addDepartement(departement1);

        departement1.addSalle(salle1);
        departement1.addSalle(salle2);
        departement1.addSalle(salle3);
        departement1.addSalle(salle4);


        matiere1.addEtudiant(etudiant1);
        matiere1.addEtudiant(etudiant2);

        matiere1.affichageMoyenneMatiere();




    }
}
