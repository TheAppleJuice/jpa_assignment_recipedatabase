package se.lexicon.jpa_assignment.entity;

public enum Measurement {
    ML(1), CL(2), DL(3), KG(4), TESKED(5), MATSKED(6), GRAM(7);

    private int type;

    Measurement(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
