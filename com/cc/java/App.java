package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        Mitarbeiter kollege1 =  new Mitarbeiter("Peter", "Müller", "Professor", 1993);
        Mitarbeiter kollege2 =  new Mitarbeiter("Hannelore", "Svenson", "StudentIn", 2021);
        Mitarbeiter kollege3 =  new Mitarbeiter("David", "Brecht", "Assistenz", 2010);

        output(kollege2.getInfo("#eintrittsjahr"));
        output(kollege1.getInfo("#vorname"));
        output(kollege3.getInfo("asdf"));

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

