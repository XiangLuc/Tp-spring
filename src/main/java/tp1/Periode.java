package tp1;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Periode {

    private String dateDebut;
    private int nbJours;

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getNbJours() {
        return nbJours;
    }

    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("Date début", dateDebut)
                .append("Nombre jour(s)", nbJours)
                .toString();
    }
}
