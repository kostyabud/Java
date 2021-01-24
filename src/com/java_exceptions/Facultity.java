package com.java_exceptions;

public class Facultity  {
     String nameFaculty;
    private int basedOnPhilosophy;
    private int basedOnLogical;




    public Facultity(String nameFaculty, int basedOnPhilosophy, int basedOnLogical) {
        this.nameFaculty = nameFaculty;
        this.basedOnPhilosophy = basedOnPhilosophy;
        this.basedOnLogical = basedOnLogical;
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

