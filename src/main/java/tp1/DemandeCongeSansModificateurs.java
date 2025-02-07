package tp1;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DemandeCongeSansModificateurs {

    private Collaborateur c;
    private Periode p;

    public Collaborateur getCollaborateur() {
        return c;
    }

    public Periode getPeriode() {
        return p;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("Collaborateur", c)
                .append("Période", p)
                .toString();
    }
}
