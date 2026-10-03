package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + ", ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tekst = "[";
		int i = 0;

		for (i = 0; i < tabell.length; i++) {
			tekst = tekst + tabell[i];
			if (i < tabell.length - 1) {
				tekst = tekst + ",";
			}
		}
		tekst = tekst + "]";
		return tekst;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				finnes = true;
			}
		}
		return finnes;
	}


	//e
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}

		}
		return -1;
	}

		// TODO
		//throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");

	//f
	public static int[] reverser(int[] tabell) {

		int[] reverser = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
		reverser[i] = tabell[tabell.length - i - 1];
		}
		return reverser;
	}
		// TODO
		//throw new UnsupportedOperationException("Metoden reverser ikke implementert");

	//g
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length; i++) {

			if (tabell[i] < tabell[i - 1]) {
			return false;
			}
		}
		return true;
	}

		// TODO
		//throw new UnsupportedOperationException("Metoden erSortert ikke implementert");

	//h
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] resultat = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
		resultat[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++) {
		resultat[tabell1.length + i] = tabell2[i];
		}

		return resultat;
	}
}
