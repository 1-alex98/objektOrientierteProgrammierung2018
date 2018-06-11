package Blatt5.Aufgabe3;

public class Sortierer {
	public static void main(String[] args) {

		double[] unsortiert = { 4.6, 3.324, 54, -3.32, 5, 7 };
		double[] sortiert = sortieren(unsortiert);


		for (int i = 0; i < sortiert.length; i++) {
			System.out.print(sortiert[i] + ", ");
		}

	}

	public static double[] sortieren(double[] sortieren) {
		for (int i = 0; i < sortieren.length - 1; i++) {
			for (int j = i + 1; j < sortieren.length; j++) {
				if (sortieren[i] > sortieren[j]) {
					double temp = sortieren[i];
					sortieren[i] = sortieren[j];
					sortieren[j] = temp;
				}
			}
		}

		return sortieren;
	}
}
