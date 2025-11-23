package com.topdogs.training.model.enumerations;

public enum EnergyLabel {
    A4Plus("A++++"),
    A3Plus("A3++"),
    A2Plus("A2++"),
    APlus("A+"),
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F"),
    G("G");

    private final String name;

    EnergyLabel(String name) {
        this.name = name;
    }
}
