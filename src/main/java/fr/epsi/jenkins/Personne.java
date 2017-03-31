package fr.epsi.jenkins;

public class Personne {
	
	private String prenom;
	private String nom;
	private String v_env;
	
	
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
		this.v_env = System.getenv("jenkins_work");
	}

	public String getV_env() {
		return v_env;
	}

	public void setV_env(String v_env) {
		this.v_env = v_env;
	}



	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNomPrenom(){
		return nom + " " + prenom;
	}

}
