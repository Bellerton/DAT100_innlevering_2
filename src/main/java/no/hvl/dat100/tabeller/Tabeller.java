package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print ("[");
		for (int i = 0; i < tabell.length - 1; i++) {
			System.out.print(tabell[i]);
			System.out.print(", ");
		}
		if (tabell.length > 0) {
			System.out.print(tabell[tabell.length - 1]);
		}
		System.out.print("]");
		// TODO
		//throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String string_to_return = "[";
		for (int i = 0; i < tabell.length - 1; i++){
			string_to_return = string_to_return.concat(tabell[i] + ",");
		}
		if (tabell.length > 0) {
			string_to_return = string_to_return.concat(tabell[tabell.length-1] + "");
		}
		string_to_return = string_to_return.concat("]");
		return string_to_return;
			// TODO
		//throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int verdi: tabell) {
			sum += verdi;
		}
		return sum;
		// TODO
		//throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean tallet_finnes = false;
		for (int verdi: tabell) {
			if (verdi == tall) {
				tallet_finnes = true;
				return tallet_finnes;
			}
		}
		return tallet_finnes;
		// TODO
		//throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

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
