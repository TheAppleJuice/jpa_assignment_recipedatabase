package se.lexicon.jpa_assignment.entity;

public enum Measurement {
    ML("ml"), CL("cl"), DL("dl"), KG("kg"), TESKED("tesked"), MATSKED("matsked"), GRAM("gr");

    private String type;

    Measurement(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
