package main.java.models;

import javafx.beans.property.SimpleStringProperty;

public class Clients {
    private SimpleStringProperty id, a1, a2, nom, dir, telf;

    public Clients(String id, String a1, String a2, String nom, String dir, String telf) {
        this.id = new SimpleStringProperty(id);
        this.a1 = new SimpleStringProperty(a1);
        this.a2 = new SimpleStringProperty(a2);
        this.nom = new SimpleStringProperty(nom);
        this.dir = new SimpleStringProperty(dir);
        this.telf = new SimpleStringProperty(telf);
    }

    public String getId() {
        return id.get();
    }

    public void setId(String p) {
        id.set(p);
    }

    public String getA1() {
        return a1.get();
    }

    public void setA1(String p) {
        a1.set(p);
    }

    public String getA2() {
        return a2.get();
    }

    public void setA2(String p) {
        a2.set(p);
    }

    public String getNom() {
        return nom.get();
    }

    public void setNom(String p) {
        nom.set(p);
    }

    public String getDir() {
        return dir.get();
    }

    public void setDir(String p) {
        dir.set(p);
    }

    public String getTelf() {
        return telf.get();
    }

    public void setTelf(String p) {
        telf.set(p);
    }
}
