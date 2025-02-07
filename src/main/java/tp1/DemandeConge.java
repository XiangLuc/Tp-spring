package tp1;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DemandeConge {

    private Collaborateur c;
    private Periode p;

    public Collaborateur getC() {
        return c;
    }

    public void setC(Collaborateur c) {
        this.c = c;
    }

    public Periode getP() {
        return p;
    }

    public void setP(Periode p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("Collaborateur", c)
                .append("Période", p)
                .toString();
    }
}
