package tp1;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class DemandeCongeSansModificateurs {

    private Collaborateur collaborateur;
    private Periode periode;

    @Autowired
    public DemandeCongeSansModificateurs(Collaborateur collaborateur, Periode periode) {
        this.collaborateur = collaborateur;
        this.periode = periode;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public Periode getPeriode() {
        return periode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("Collaborateur", collaborateur)
                .append("Période", periode)
                .toString();
    }
}
