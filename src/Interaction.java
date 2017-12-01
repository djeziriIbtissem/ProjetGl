import java.util.Scanner;

public class Interaction {
    /**
     * les ecoles
     **/
    private Ecole ecole = new Ecole("http://www.univ-oran1.dz/", "IGMO");

    /**
     * les enseignants
     **/
    private Enseignent enseignent1 = new Enseignent("HAFFAF", "hafid", "00000000", "hafff@gmail.com", new Dates(1, 2, 1990), GradeEnseignant.PR);
    private Enseignent enseignent2 = new Enseignent("SAKHRI", "larbi", "00000000", "sakhri@gmail.com", new Dates(1, 2, 1995), GradeEnseignant.PR);
    private Enseignent enseignent3 = new Enseignent("LOUKIL", "Lakhdar", "00000000", "lakhder@gmail.com", new Dates(1, 2, 1990), GradeEnseignant.MCA);
    private Enseignent enseignent4 = new Enseignent("TAGHEZOUT", "Noria", "00000000", "noria@gmail.com", new Dates(1, 2, 2005), GradeEnseignant.MCA);
    private Enseignent enseignent5 = new Enseignent("ARRIBI", "Nordine", "00000000", "aribi@gmail.com", new Dates(1, 2, 2010), GradeEnseignant.MCB);
    private Enseignent enseignent6 = new Enseignent("BOUSMAHA", "Zineb", "00000000", "zineb@gmail.com", new Dates(1, 2, 2007), GradeEnseignant.MAA);
    private Enseignent enseignent7 = new Enseignent("AIBOUDI", "Mohamed", "00000000", "aiboudi@gmail.com", new Dates(1, 2, 1985), GradeEnseignant.PR);

    /**
     * les departements
     **/
    private Departement departement1 = new Departement("informatique", enseignent1);
    private Departement departement2 = new Departement("Mathematique", enseignent7);

    /**
     * les salles
     **/
    private Salle salle1 = new Salle(1, 20);
    private Salle salle2 = new Salle(2, 30);
    private Salle salle3 = new Salle(3, 15);
    private Salle salle4 = new Salle(4, 35);
    private Salle salle5 = new Salle(5, 40);
    private Salle salle6 = new Salle(6, 40);

    /**
     * les matieres
     **/
    private Matiere matiere1 = new Matiere("Prolog", salle1);
    private Matiere matiere2 = new Matiere("PL", salle2);
    private Matiere matiere3 = new Matiere("Gl", salle3);
    private Matiere matiere4 = new Matiere("SE", salle4);
    private Matiere matiere5 = new Matiere("POO", salle5);
    private Matiere matiere6 = new Matiere("IHM", salle6);


    /**
     * les etudiants
     **/
    private Etudiant etudiant1 = new Etudiant("CHOUIB", "Chawki", "0000000", "chouib@gmail.com", new Dates(27, 10, 2016));
    private Etudiant etudiant2 = new Etudiant("DJEZIRI", "Ibtissem", "1111000", "ibtissem@gamil.com", new Dates(27, 10, 2016));
    private Etudiant etudiant3 = new Etudiant("BENOTMANE", "Mohamed", "2222", "mohamed@gmail.com", new Dates(27, 10, 2016));
    private Etudiant etudiant4 = new Etudiant("RABAH", "Imed", "0000000", "imed@gmail.com", new Dates(27, 10, 2016));
    private Etudiant etudiant5 = new Etudiant("ZAAROUR", "Mehdi", "0000000", "mehdi@gamil.com", new Dates(27, 10, 2016));
    private Etudiant etudiant6 = new Etudiant("NIAR", "Isak", "0000000", "isak@gmail.com", new Dates(27, 10, 2016));


    public void menuInteraction() {
        boolean run = true;
        init();
        while (run) {
            System.out.println("\nBienvenu dans l'ecole " + ecole.getNomEcole());
            System.out.println("\n    1- Affichage des enseignants par grade(a la demande)");
            System.out.println("    2- Affichage des departements");
            System.out.println("    3- Affichage du chef de departement");
            System.out.println("    4- Affichage des cours d'un enseigant");
            System.out.println("    5- Affichage des enseingants du plus encien au plus recent");
            System.out.println("    6- Affichage des salles par ordre decroissant de leurs capacités");
            System.out.println("    7- Affichage des notes d'un etudiant et sa moyenne");
            System.out.println("    8- Affichage des etudiants par classement de leur moyenne ");
            System.out.println("    9- Affichage de la moyenne des matieres");
            System.out.println("    10- Affichage des matiere sans note d'un etudiant");
            System.out.println("    11- Faire une reservation");
            System.out.println("    12- Annuler une reservation");
            System.out.println("    13- Affichage des reservations");
            System.out.println("    14- Affichage fiche enseignants");
            System.out.println("    15- Affichage fiche  etudiants");
            System.out.println("    16- Quitter");


            System.out.print("\nChoix : ");


            Scanner scanner = new Scanner(System.in);
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    int choixGrade;
                    System.out.println("Quel grade ? :");
                    System.out.println("1- " + GradeEnseignant.PR);
                    System.out.println("2- " + GradeEnseignant.MCA);
                    System.out.println("3- " + GradeEnseignant.MCB);
                    System.out.println("4- " + GradeEnseignant.MAA);
                    System.out.println("5- " + GradeEnseignant.MAB);
                    System.out.println("6- ALL");
                    System.out.print("choix: ");
                    choixGrade = scanner.nextInt();
                    switch (choixGrade) {
                        case 1:
                            System.out.println("\ndepartement " + departement1.getNomDepartement());
                            departement1.affichageEnseignantParGrade(GradeEnseignant.PR);
                            System.out.println("\ndepartement " + departement2.getNomDepartement());
                            departement2.affichageEnseignantParGrade(GradeEnseignant.PR);
                            break;
                        case 2:
                            System.out.println("\ndepartement " + departement1.getNomDepartement());
                            departement1.affichageEnseignantParGrade(GradeEnseignant.MCA);
                            System.out.println("\ndepartement " + departement2.getNomDepartement());
                            departement2.affichageEnseignantParGrade(GradeEnseignant.MCA);
                            break;
                        case 3:
                            System.out.println("\ndepartement " + departement1.getNomDepartement());
                            departement1.affichageEnseignantParGrade(GradeEnseignant.MCB);
                            System.out.println("\ndepartement " + departement2.getNomDepartement());
                            departement2.affichageEnseignantParGrade(GradeEnseignant.MCB);
                            break;
                        case 4:
                            System.out.println("\ndepartement " + departement1.getNomDepartement());
                            departement1.affichageEnseignantParGrade(GradeEnseignant.MAA);
                            System.out.println("\ndepartement " + departement2.getNomDepartement());
                            departement2.affichageEnseignantParGrade(GradeEnseignant.MAA);
                            break;
                        case 5:
                            System.out.println("\ndepartement " + departement1.getNomDepartement());
                            departement1.affichageEnseignantParGrade(GradeEnseignant.MAB);
                            System.out.println("\ndepartement " + departement2.getNomDepartement());
                            departement2.affichageEnseignantParGrade(GradeEnseignant.MAB);
                            break;
                        case 6:
                            System.out.println("\ndepartement " + departement1.getNomDepartement());
                            departement1.affichageEnseignantParGrade();
                            System.out.println("\ndepartement " + departement2.getNomDepartement());
                            departement2.affichageEnseignantParGrade();
                            break;
                    }
                    break;
                case 2:
                    ecole.affichageDepartement();
                    break;
                case 3:
                    departement1.afficherResponsable();
                    departement2.afficherResponsable();
                    break;
                case 4:
                    enseignent1.affichageMatiereEnseignant();
                    enseignent2.affichageMatiereEnseignant();
                    enseignent3.affichageMatiereEnseignant();
                    enseignent4.affichageMatiereEnseignant();
                    enseignent5.affichageMatiereEnseignant();
                    enseignent6.affichageMatiereEnseignant();
                    break;
                case 5:
                    System.out.println("AVANT:");
                    departement1.affichageListEnseignant();
                    System.out.println("APRES:");
                    departement1.affichageTrieEnseignant();
                    break;
                case 6:
                    System.out.println("AVANT:");
                    departement1.affichageSalles();
                    System.out.println("APRES:");
                    departement1.affichageTrieSalle();
                    break;
                case 7:
                    etudiant1.affichageNoteParMatiereEtMoyenne();
                    etudiant2.affichageNoteParMatiereEtMoyenne();
                    etudiant3.affichageNoteParMatiereEtMoyenne();
                    etudiant4.affichageNoteParMatiereEtMoyenne();
                    etudiant5.affichageNoteParMatiereEtMoyenne();
                    etudiant6.affichageNoteParMatiereEtMoyenne();
                    break;
                case 8:
                    System.out.println("AVANT:");
                    departement1.affichageListEtudiants();
                    System.out.println("APRES:");
                    departement1.affichageClassementListEtudiant();
                    break;
                case 9:
                    matiere1.affichageMoyenneMatiere();
                    matiere2.affichageMoyenneMatiere();
                    matiere3.affichageMoyenneMatiere();
                    matiere5.affichageMoyenneMatiere();
                    matiere6.affichageMoyenneMatiere();
                    break;
                case 10:
                    etudiant1.afficherMatiereSansNote();
                    etudiant2.afficherMatiereSansNote();
                    etudiant3.afficherMatiereSansNote();
                    etudiant4.afficherMatiereSansNote();
                    etudiant5.afficherMatiereSansNote();
                    etudiant6.afficherMatiereSansNote();
                    break;
                case 11:
                    int choixEnsaignant, choixSalle;
                    int jour, mois, annee;

                    System.out.println("qui veut reserver ? ");
                    departement1.affichageListEnseignant();
                    System.out.print("choix: ");
                    choixEnsaignant = scanner.nextInt();

                    System.out.println("Dans quelle salle:");
                    departement1.affichageSalles();
                    System.out.print("choix: ");
                    choixSalle = scanner.nextInt();

                    System.out.println("reserver pour le ");
                    System.out.print("  jour: ");
                    jour = scanner.nextInt();
                    System.out.print("  mois: ");
                    mois = scanner.nextInt();
                    System.out.print("  annee: ");
                    annee = scanner.nextInt();

                    departement1.getListSalle().get(choixSalle - 1).ajouterReservation(departement1.getListEnseignents().get(choixEnsaignant - 1), new Dates(jour, mois, annee));
                    System.out.println("Reserver!");
                    break;
                case 12:
                    System.out.println("qui veut annuller sa reservation ? ");

                    departement1.afficherReservationSalle();

                    System.out.print("Dans quelle salle:");
                    choixSalle = scanner.nextInt();

                    departement1.getListSalle().get(choixSalle - 1).affichageReservation();

                    int choixDate;
                    System.out.print("la date : ");
                    choixDate = scanner.nextInt();


                    System.out.print("Qui annuler ? :");
                    choixEnsaignant = scanner.nextInt();


                    departement1.getListSalle().get(choixSalle - 1).annulerReservation(departement1.getListSalle().get(choixSalle - 1).getReservationSalles().get(choixDate - 1).getListReservation().get(choixEnsaignant - 1));
                    System.out.println("Reservation annuler!");
                    break;

                case 13:
                    departement1.afficherReservationSalle();
                    break;

                case 14:
                    System.out.println("\nFiche des enseignants:");
                    departement1.affichageListEnseignant();
                    break;

                case 15:
                    System.out.println("\nFiche des etudiants:");
                    departement1.affichageListEtudiants();
                    break;

                case 16:
                    run = false;
                    break;

                default:
                    System.out.println("erreur de saisi");
                    break;
            }
        }
    }


    private void init() {
        ecole.addDepartement(departement1);
        ecole.addDepartement(departement2);

        departement1.addSalle(salle1);
        departement1.addSalle(salle2);
        departement1.addSalle(salle3);
        departement1.addSalle(salle4);
        departement1.addSalle(salle5);
        departement1.addSalle(salle6);

        departement1.addEnseignant(enseignent1);
        departement1.addEnseignant(enseignent2);
        departement1.addEnseignant(enseignent3);
        departement1.addEnseignant(enseignent4);
        departement1.addEnseignant(enseignent5);
        departement1.addEnseignant(enseignent6);

        departement2.addEnseignant(enseignent7);


        departement1.addEtudiant(etudiant1);
        departement1.addEtudiant(etudiant2);
        departement1.addEtudiant(etudiant3);
        departement1.addEtudiant(etudiant4);
        departement1.addEtudiant(etudiant5);
        departement1.addEtudiant(etudiant6);

        enseignent1.addMatiere(matiere1);
        enseignent2.addMatiere(matiere3);
        enseignent3.addMatiere(matiere4);
        enseignent3.addMatiere(matiere2);
        enseignent4.addMatiere(matiere6);
        enseignent5.addMatiere(matiere2);
        enseignent5.addMatiere(matiere5);
        enseignent6.addMatiere(matiere3);


        etudiant1.addMatiere(matiere1);
        etudiant1.addMatiere(matiere2);
        etudiant1.addMatiere(matiere3);
        etudiant1.addMatiere(matiere4);
        etudiant1.addMatiere(matiere6);

        etudiant2.addMatiere(matiere1);
        etudiant2.addMatiere(matiere2);
        etudiant2.addMatiere(matiere3);
        etudiant2.addMatiere(matiere4);
        etudiant2.addMatiere(matiere6);

        etudiant3.addMatiere(matiere1);
        etudiant3.addMatiere(matiere2);
        etudiant3.addMatiere(matiere3);
        etudiant3.addMatiere(matiere4);
        etudiant3.addMatiere(matiere6);

        etudiant4.addMatiere(matiere1);
        etudiant4.addMatiere(matiere2);
        etudiant4.addMatiere(matiere3);
        etudiant4.addMatiere(matiere4);
        etudiant4.addMatiere(matiere6);

        etudiant5.addMatiere(matiere1);
        etudiant5.addMatiere(matiere2);
        etudiant5.addMatiere(matiere3);
        etudiant5.addMatiere(matiere4);
        etudiant5.addMatiere(matiere6);

        etudiant6.addMatiere(matiere3);
        etudiant6.addMatiere(matiere4);
        etudiant6.addMatiere(matiere5);

        etudiant1.addNote(new Note(15, matiere1));
        etudiant1.addNote(new Note(13, matiere2));
        etudiant1.addNote(new Note(14, matiere3));
        etudiant1.addNote(new Note(16, matiere4));
        etudiant1.addNote(new Note(18, matiere6));

        etudiant2.addNote(new Note(16, matiere1));
        etudiant2.addNote(new Note(13, matiere2));
        etudiant2.addNote(new Note(13, matiere3));
        etudiant2.addNote(new Note(15, matiere4));
        etudiant2.addNote(new Note(17, matiere6));

        etudiant3.addNote(new Note(12, matiere1));
        etudiant3.addNote(new Note(10, matiere2));
        etudiant3.addNote(new Note(11, matiere3));
        etudiant3.addNote(new Note(11, matiere6));


        etudiant4.addNote(new Note(13, matiere4));
        etudiant4.addNote(new Note(15, matiere6));


        etudiant5.addNote(new Note(13, matiere3));
        etudiant5.addNote(new Note(15, matiere4));
        etudiant5.addNote(new Note(11, matiere6));

        etudiant6.addNote(new Note(16, matiere3));
        etudiant6.addNote(new Note(13, matiere4));
        etudiant6.addNote(new Note(17, matiere5));


        salle1.ajouterReservation(enseignent1, new Dates(10, 4, 2017));
        salle1.ajouterReservation(enseignent2, new Dates(10, 4, 2017));
        salle1.ajouterReservation(enseignent3, new Dates(10, 4, 2017));
        salle1.ajouterReservation(enseignent4, new Dates(10, 4, 2017));
        salle1.ajouterReservation(enseignent5, new Dates(10, 4, 2017));


        salle2.ajouterReservation(enseignent2, new Dates(10, 4, 2017));
        salle2.ajouterReservation(enseignent3, new Dates(10, 4, 2017));
        salle2.ajouterReservation(enseignent4, new Dates(10, 4, 2017));
        salle2.ajouterReservation(enseignent5, new Dates(10, 4, 2017));
        salle2.ajouterReservation(enseignent6, new Dates(11, 4, 2017));


    }

}
