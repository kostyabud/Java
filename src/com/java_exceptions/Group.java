package com.java_exceptions;

public class Group extends Faculty {
    String nameGroup;

    public Group(String nameFaculty, int basedOnPhilosophy, int basedOnLogical, String nameGroup) {
        super(nameFaculty, basedOnPhilosophy, basedOnLogical);
        this.nameGroup = nameGroup;
    }

    public Group(String nameFaculty, String nameGroup) {
        super(nameFaculty);
        this.nameGroup = nameGroup;
    }
}
