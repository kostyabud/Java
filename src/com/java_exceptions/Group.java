package com.java_exceptions;

public class Group extends Facultity  {
    String nameGroup;

    public Group(String nameFacult, String nameGroup) {
        super(nameFacult);
        this.nameGroup = nameGroup;
    }

    @Override
    public String toString() {
        return super. toString() + "Group{" +
                "nameGroup='" + nameGroup + '\'' +
                '}';
    }
}
