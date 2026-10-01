package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.print("[");
		boolean første_verdi = true;
		boolean første_rad = true;
		int rad_nummer = 0;
		for (int[] rad: matrise) {
			rad_nummer += 1;
			if (første_rad) {
				System.out.print("[");
				første_rad = false;
			} else {
				System.out.print(" [");
			}
			for (int verdi: rad) {
				if (første_verdi){
					System.out.print(verdi);
					første_verdi = false;
				}
				System.out.print(", " + verdi);
			}
			if (rad_nummer == matrise.length) {
				System.out.println("]]");
			} else {
				System.out.println("]");
			}
			første_verdi = true;
		}
		// TODO
		//throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String string_to_return = "";
		for (int[] rad: matrise) {
			for (int verdi: rad) {
				string_to_return = string_to_return.concat(verdi + " ");
			}
			string_to_return = string_to_return.concat("\n");
		}
		return string_to_return;

		// TODO
		//throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int [][] matrise_to_return = new int[matrise.length][];
		int rad_nummer = 0;
		int kollone_nummer = 0;

		for (int i = 0; i < matrise.length; i++) {
			matrise_to_return[i] = new int[matrise[i].length];
		}

		for (int[] rad: matrise) {
			kollone_nummer = 0;
			for (int verdi: rad) {
				matrise_to_return[rad_nummer][kollone_nummer] = verdi * tall;
				kollone_nummer += 1;
			}

			rad_nummer += 1;
		}
		return matrise_to_return;

		// TODO
		//throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		//return Arrays.deepEquals(a,b);

		boolean matriser_er_like = true;
		if (a.length != b.length) {
			matriser_er_like = false;
			return matriser_er_like;
		}
		for (int i = 0; i < a.length; i++) {
			if (!Arrays.equals(a[i],b[i])) {
				matriser_er_like = false;
				return matriser_er_like;
			}
		}
		return matriser_er_like;

		// TODO
		//throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int [][] matrise_to_return = new int[matrise.length][];
		int rad_nummer = 0;
		int kollone_nummer = 0;

		for (int i = 0; i < matrise.length; i++) {
			matrise_to_return[i] = new int[matrise[i].length];
		}

		for (int[] rad: matrise) {
			kollone_nummer = 0;
			for (int verdi: rad) {
				matrise_to_return[kollone_nummer][rad_nummer] = verdi;
				kollone_nummer += 1;
			}

			rad_nummer += 1;
		}
		return matrise_to_return;

		// TODO
		//throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int a_lengde = a.length;
		int a_bredde = a[0].length;
		int b_lengde = b.length;
		int b_bredde = b[0].length;
		int[][] matrise_to_return;
		int matrise_antall_rader;
		int matrise_antall_kolloner;

		if (a_lengde == b_bredde) {
			matrise_to_return = new int[a_bredde][b_lengde];
			matrise_antall_kolloner = b_lengde;
			matrise_antall_rader = a_bredde;
			for (int rad = 0; rad < matrise_antall_rader; rad++) {
				for (int kollone = 0; kollone < matrise_antall_kolloner; kollone++) {
					for (int i = 0; i < a_lengde; i++) {
						matrise_to_return[rad][kollone] += a[rad][i] * b[i][kollone];
					}
				}
			}
		} else {
			matrise_to_return = new int[a_lengde][b_bredde];
			matrise_antall_kolloner = b_bredde;
			matrise_antall_rader = a_lengde;
			for (int rad = 0; rad < matrise_antall_rader; rad++) {
				for (int kollone = 0; kollone < matrise_antall_kolloner; kollone++) {
					for (int i = 0; i < a_bredde; i++) {
						matrise_to_return[rad][kollone] += a[rad][i] * b[i][kollone];
					}
				}
			}
		}

		return matrise_to_return;

		// TODO
		//throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
