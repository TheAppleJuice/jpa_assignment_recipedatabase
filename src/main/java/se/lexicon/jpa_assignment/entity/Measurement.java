package se.lexicon.jpa_assignment.entity;

public enum Measurement {
    ML(1), CL(2), DL(3), KG(4), TESKED(5), MATSKED(6), GRAM(7);

    //TODO: Can change int to String!. type -measurement
    private int type;

    Measurement(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
    //TODO: Setter not mandatory. You set it from the constructor
    public void setType(int type) {
        this.type = type;
    }

}
