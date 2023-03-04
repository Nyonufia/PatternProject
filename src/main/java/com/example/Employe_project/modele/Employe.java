package com.example.Employe_project.modele;

import java.util.Observable;
import java.util.Observer;

public class Employe implements Observer {
    private  long id;
    private String nom;
    private String email;

    public Employe(Long id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    @Override
    public void update(Observable observable, Object arg) {
        if(arg instanceof Project){
            Project project = (Project) arg;
            System.out.println("Notification envoyée à l'employé " + nom + " pour le projet " + project.getNom());
        }

    }
    // Getters et setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
