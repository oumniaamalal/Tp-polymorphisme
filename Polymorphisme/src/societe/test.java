package societe;

public class test {

    public static void main(String[] args) {
        
        Employe[] employes = new Employe[2];
        employes[0] = new Developpeur("Alice", 50000, "Java");
        employes[1] = new Manager("Bob", 70000, 5);

        
        for (Employe e : employes) {
            e.afficherInfos();
            System.out.println(); 
        }

       
        Employe employe1 = new Developpeur("Charlie", 60000, "Python");
        employe1.afficherInfos();    

        
        if (employe1 instanceof Developpeur) {
            ((Developpeur) employe1).afficherLangage();
        }

        
        Employe employe2 = new Manager("David", 80000, 10);

     // Vérification et downcasting pour appeler une méthode spécifique de Manager
     if (employe2 instanceof Manager) {
         ((Manager) employe2).gererEquipe(); // Appel de la méthode gererEquipe() propre à Manager
     }
    }
}
