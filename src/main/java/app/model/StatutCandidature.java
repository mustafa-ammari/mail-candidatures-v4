package app.model;


public enum StatutCandidature {

    TOUTES("Toutes"),
    EN_ATTENTE("En attente"),
    REFUS("Non retenu"),
    ENTRETIEN("Entretien");

    public String getLabel() {
        return label;
    }

    private final String label;

    StatutCandidature(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
