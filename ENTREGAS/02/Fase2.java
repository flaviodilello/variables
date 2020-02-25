import java.util.*;

import javax.swing.JOptionPane;

import java.awt.*;
public class Fase2 {
	public static void main (String[]args) {
		String name = new String();
		ArrayList <Character> chName = new ArrayList <Character>();
		name = JOptionPane.showInputDialog("Ingresa tu nombre");
		System.out.println("Has ingresado "+name+". Tu nombre tiene una logintud de "+name.length()+" caracteres.");
		for(int i=0;i<name.length();i++) {
			chName.add(name.charAt(i));
			System.out.print(chName.get(i));
			if((chName.get(i) == '1') || (chName.get(i) == '2') || (chName.get(i) == '3') || (chName.get(i) == '4') || (chName.get(i) == '5') || (chName.get(i) == '6') || (chName.get(i) == '7') || (chName.get(i) == '8') || (chName.get(i) == '9') || (chName.get(i) == '0')) {
				System.out.println(" ¡Los nombres de personas no contienen números!");
			} else if ((chName.get(i) == 'a') || (chName.get(i) == 'e') || (chName.get(i) == 'i') || (chName.get(i) == 'o') || (chName.get(i) == 'u')) {
					System.out.println(" Es una vocal");
			} else {
				System.out.println(" Es una consonante");
			}
		}
		System.out.println();
		System.out.print("La longitud de la lista es: "+chName.size());
	}
}
