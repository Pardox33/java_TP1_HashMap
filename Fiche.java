public class Fiche {
    String nom;
    int numero;
    String adresse;

    public Fiche(String nom, int numero, String adresse) {
        this.nom = nom;
        this.numero = numero;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public double getNumero() {
        return numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Nom: " + nom +
                " | Tel: " + numero +
                " | Adresse: " + adresse;
    }
}
