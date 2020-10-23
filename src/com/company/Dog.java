package com.company;
//nom de la classe mes els atributs a continuació//

public class Dog {
    private String nom;
    private int edat;
    private String raza;
    private int numvacunes;
    private boolean pedigri;

    //constructors: com seran els objectes//
    public Dog (String nom, int edat, String raza, int numvacunes, boolean pedigri) {
        this.nom = nom;
        this.edat = edat;
        this.raza = raza;
        this.numvacunes = numvacunes;
        this.pedigri = pedigri;
    }
    //get//
    public String getnom() {
        return this.nom;
    }

    public int getedat() {
        return this.edat;
    }

    public String getraça() {
        return this.raza;
    }
    public int getnumvacunes () {
        return this.numvacunes;
    }

    public boolean getpedigri() {
        return this.pedigri;
    }

    //set//
    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setedat(int edat) {
        this.edat = edat;
    }

    public void setraza(String raza) {
        this.raza = raza;
    }

    public void setnumvacunes(int numvacunes) {
        this.numvacunes = numvacunes + 2000;
    }
    public void setpedigri (boolean pedigri) {
        this.pedigri = pedigri;
    }
    //IMPRIMIR PER MAIN//
    public void Print () {
        System.out.println("El nombre de tu puto perro: " + nom);
        System.out.println("Cuanto tiempo tiene la chorra del perro: " + edat);
        System.out.println("Etnia: " + raza);
        System.out.println("Numero de chutes: " + numvacunes);
        System.out.println("Mestizo o no: " + pedigri);
    }
}



