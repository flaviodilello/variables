import java.awt.*;

import javax.swing.JOptionPane;
public class Fase1 {
	public static void main (String[]args) {
		String name = new String();
		char charactersName[] = new char [20];
		name = JOptionPane.showInputDialog("Ingresa tu nombre");
		System.out.println("Tu nombre es "+name);
		for(int i=0;i<name.length();i++) {
			charactersName[i] = name.charAt(i);
			System.out.print(charactersName[i]+" ");
		}
	}
}