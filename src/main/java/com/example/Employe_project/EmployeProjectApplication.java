package com.example.Employe_project;

import com.example.Employe_project.modele.Employe;
import com.example.Employe_project.modele.Project;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeProjectApplication.class, args);
	}
	@Override
	public void run(String... args){
		Employe employe1;
		employe1= new Employe(1L, "Alice", "alice@gmail.com");
		Employe employe2 = new Employe(2L, "Bob", "bob@entreprise.com");

		Project project = new Project(1L, "Projet A", "Description du projet A");
		project.addEmploy(employe1);
		project.addEmploy(employe2);

		project.add();
	}

}
