package societe;

public class Manager extends Employe {
	private int nombreDeSubordonnes;
	public Manager(String nom, int salaire, int nombreDeSubordonnes) {
        super(nom, salaire);
        this.nombreDeSubordonnes = nombreDeSubordonnes;
    }
	@Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Nombre de subordonnés: " + nombreDeSubordonnes);
    }
	public void gererEquipe() {
        System.out.println("Gestion de l'équipe en cours...");
    }
}
