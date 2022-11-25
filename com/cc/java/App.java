package com.cc.java;

public class App {

    public static void main(String[] args) {
        Mitarbeiter kollege1 = new Mitarbeiter("Müller", "Peter", "Professor", 1993);
        Mitarbeiter kollege2 = new Mitarbeiter("Svenson", "Hannelore", "StudentIn", 2021);
        Mitarbeiter kollege3 = new Mitarbeiter("Brecht", "David", "Assistenz", 2010);

        showMA(kollege1);
        showMA(kollege2);
        showMA(kollege3);
    }

    private static void showMA(Mitarbeiter ma) {
        output(ma.getInfo("#name"));
        output(ma.getInfo("#funktion"));
        output(ma.getInfo("#eintrittsjahr"));
        output("------------------------------");
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
