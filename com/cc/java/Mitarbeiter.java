package com.cc.java;

public class Mitarbeiter {
    
    private String name;
    private String vorname;
    private String funktion;
    private int eintrittsjahr;



    public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
        this.name = name;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }



public String getInfo(String flag){
    switch (flag) {
        case "#name":
            return name;

        case "#vorname":
            return vorname;

        case "#funktion":
            return funktion;

        case "#eintrittsjahr":
            return Integer.toString(eintrittsjahr);
    
        default:
            return "§$%&/ ERROR!";
    }
}
}
