public class Fase3 {
	public static void main(String[]args) {
		final int year1 = 1948;
		final int myBornYear = 1975;
		boolean isOrNot = false;
		String [] frases = new String[100];
		int x=0;
		for (int i = year1; i<=myBornYear; i++) {
			x++;
			if (i % 4 == 0) {
				isOrNot = true;
				System.out.println("El a�o "+i+" es bisiesto.");
				frases[x] = "Variable verdadera";
				System.out.println(frases[x]);
				}
			else {
				isOrNot = false;
				System.out.println("El a�o "+i+" no es bisiesto");
				frases[x] = "variable falsa";
				System.out.println(frases[x]);
			}
		}
	}
}