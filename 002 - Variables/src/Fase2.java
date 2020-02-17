public class Fase2 {
	public static void main(String[]args) {
		final int year1 = 1948;
		int leapYear = 4;
		final int myBornYear = 1975;
		int quantity = 0;
		for (int i = year1; i<=myBornYear; i+=leapYear) {
			quantity = quantity + 1;
		}
		System.out.println("La cantidad de años bisiestos entre 1948 y el año de mi nacimiento es: "+ quantity);
	}
}