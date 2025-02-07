package tp1;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Collaborateur {

    private String nom;
    private String prenom;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("Nom", nom)
                .append("Prenom", prenom)
                .toString();
    }
}
