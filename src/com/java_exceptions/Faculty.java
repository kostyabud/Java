package com.java_exceptions;

public class Faculty {
     String nameFaculty;
    private int basedOnPhilosophy;
    private int basedOnLogical;

    public Faculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public Faculty(String nameFaculty, int basedOnPhilosophy, int basedOnLogical) {
        this.nameFaculty = nameFaculty;
        this.basedOnPhilosophy = basedOnPhilosophy;
        this.basedOnLogical = basedOnLogical;
    }

    public void setBasedOnLogical(int basedOnLogical) {
        this.basedOnLogical = basedOnLogical;
    }

    public void setBasedOnPhilosophy(int basedOnPhilosophy) {
        this.basedOnPhilosophy = basedOnPhilosophy;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public int getBasedOnPhilosophy() {
        return basedOnPhilosophy;
    }

    public int getBasedOnLogical() {
        return basedOnLogical;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "nameFaculty='" + nameFaculty + '\'' +
                '}';
    }
}

