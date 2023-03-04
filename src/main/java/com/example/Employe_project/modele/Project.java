package com.example.Employe_project.modele;

import java.util.Observable;

public class Project extends Observable {
    private Long id;
    private String nom;
    private String description;

    public Project(Long id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }
    public void addEmploy(Employe employe){
        addObserver(employe);
    }

    public void add(){
        setChanged();
        notifyObservers(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
