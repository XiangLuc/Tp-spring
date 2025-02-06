package tp1;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DemandeConge {

    private Collaborateur collaborateur;
    private Periode periode;

    public DemandeConge(Collaborateur collaborateur, Periode periode) {
        this.collaborateur = collaborateur;
        this.periode = periode;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    public Periode getPeriode() {
        return periode;
    }

    public void setPeriode(Periode periode) {
        this.periode = periode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("Collaborateur", collaborateur)
                .append("Période", periode)
                .toString();
    }
}
