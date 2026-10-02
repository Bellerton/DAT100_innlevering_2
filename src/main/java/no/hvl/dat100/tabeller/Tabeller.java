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

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int posisijon = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				posisijon = i;
				return posisijon;
			}
		}
		return posisijon;
		// TODO
		//throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int tabell_lengde = tabell.length;
		int [] tabell_for_retur = new int[tabell_lengde];
		for (int i = 0; i < tabell_lengde; i++) {
			tabell_for_retur[tabell_lengde - i - 1] = tabell[i];
		}
		return tabell_for_retur;
		// TODO
		//throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		int tabell_lengde = tabell.length;
		for (int i = 0; i < tabell_lengde - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
				return sortert;
			}
		}
		return sortert;

		// TODO
		//throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int tabell1_lengde = tabell1.length;
		int tabell2_lengde = tabell2.length;
		int [] tabell_for_retur = new int[tabell1_lengde + tabell2_lengde];
		for (int i = 0; i < tabell1_lengde; i++) {
			tabell_for_retur[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2_lengde; i++) {
			tabell_for_retur[i + tabell1_lengde] = tabell2[i];
		}
		return tabell_for_retur;
		// TODO
		//throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
