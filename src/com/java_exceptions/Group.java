package com.java_exceptions;

public class Group extends Facultity {
    String nameGroup;

    public Group(String nameFaculty, int basedOnPhilosophy, int basedOnLogical, String nameGroup) {
        super(nameFaculty, basedOnPhilosophy, basedOnLogical);
        this.nameGroup = nameGroup;
    }
}
