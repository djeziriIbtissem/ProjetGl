import java.util.ArrayList;

public class Ecole {

    private String nomEcole;
    private String siteInternet;
    private ArrayList<Departement> listDepartements = new ArrayList<>();

    public Ecole(String siteInternet, String nomEcole) {
        this.siteInternet = siteInternet;
        this.nomEcole = nomEcole;
    }

    public String getSiteInternet() {
        return siteInternet;
    }

    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
    }

    public ArrayList<Departement> getListDepartements() {
        return listDepartements;
    }

    public void setListDepartements(ArrayList<Departement> listDepartements) {
        this.listDepartements = listDepartements;
    }

    public String getNomEcole() {
        return nomEcole;
    }

    public void setNomEcole(String nomEcole) {
        this.nomEcole = nomEcole;
    }


    //affichage des departement
    public void affichageDepartement() {
        System.out.println("Les departements de " + nomEcole + " sont :");
        for (int i = 0; i < listDepartements.size(); i++) {
            System.out.println(i + 1 + "- " + listDepartements.get(i).getNomDepartement());
        }
    }

    //ajouter un departement
    public void addDepartement(Departement departement) {
        listDepartements.add(departement);
    }


    @Override
    public String toString() {
        return "Ecole{" +
                "nomEcole='" + nomEcole + '\'' +
                ", siteInternet='" + siteInternet + '\'' +
                ", listDepartements=" + listDepartements +
                '}';
    }
}
