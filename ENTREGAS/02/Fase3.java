//FASE 3
//Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
//Almacenar en un Map tanto las letras de la lista como el número de veces que aparecen
//https://www.youtube.com/watch?v=P_x6l2oDm98
import java.util.*;
import javax.swing.JOptionPane;
public class Fase3 {
	public static void main(String[]args) {
		String name = new String();
		ArrayList <Character> chName = new ArrayList <Character>();
		char arrayCadena[];
		boolean enter=false;
		char character;
		int counter=0;
//		Uso un LinkedHashMap en vez de un HashMap porque HashMap desordena los elementos.
		LinkedHashMap<Character,Integer> listaLetras = new LinkedHashMap<Character,Integer>();
		do {
			name = JOptionPane.showInputDialog("Enter your name");
			for(int i=0;i<name.length();i++) {
				enter=true;
				chName.add(name.charAt(i));
//				System.out.print(chName.get(i)+" ");
			}
		}while(enter==false);
		for(int j=0;j<name.length();j++) {
			listaLetras.put(chName.get(j),j); // lleno el mapa
		}
		System.out.println();
//		System.out.println(listaLetras);
		System.out.println("Has ingresado "+name+". Tu nombre tiene una longitud de "+name.length()+" caracteres.");
		arrayCadena = name.toCharArray(); //mete el string en un array de caracteres
//		System.out.println(arrayCadena);
		for(int i=0;i<arrayCadena.length;i++) {
			character = arrayCadena[i];
			for(int j=0;j<arrayCadena.length;j++) {
				if(arrayCadena[j]==character) {
					counter++;
				}
				listaLetras.put(character, counter);
			}
//		System.out.println(arrayCadena[i]+" "+counter);
		counter=0;
		}
		System.out.println(listaLetras);
		System.out.println();
	}
}
