
public class Main {

	public static void main(String[] args) {
		Labyrinthe l = new Labyrinthe();
		if(l.existeChemin(3, 1))
			System.out.println("Sortie Trouv�e");
		else
			System.out.println("Sortie pas trouv�e");
		l.afficherLabyrinthe();

	}

}
