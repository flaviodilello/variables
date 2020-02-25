//FASE 4
//Crea otra lista con tu apellido donde cada posición corresponda a una letra.
//Combinar las dos listas en una sola. Además, añade una posición con un espacio vacío entre la primera y la segunda. Es decir, partimos de la lista name y surname y al terminar la ejecución sólo tendremos una que se llamará fullname.
//Fullname: [ 'N', 'A', 'M', 'E', '', 'S', 'U', 'R', 'N', 'A', 'M', 'E']
//FASE 4
//Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
//Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
//FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
import java.util.*;

import javax.swing.JOptionPane;
public class Fase4 {
	public static void main(String[]args) {
		String name = new String();
		String surname = new String();
		ArrayList <Character> listaName = new ArrayList <Character>();
		ArrayList <Character> listaSurname = new ArrayList <Character>();
		ArrayList <Character> listaNameSurname = new ArrayList <Character>();
		int cantChars;
		boolean enter = false; //lo uso para saber si entra a un bucle o no
		do {
			name = JOptionPane.showInputDialog("Enter your Name");
			for(int i=0;i<name.length();i++) {
				listaName.add(name.charAt(i)); //lleno la lista name con lo ingresado
				enter = true; //entró al bucle
			}
		}while (enter==false);
		
		enter = false;
		System.out.println("Your name: "+listaName);
		do {
			surname = JOptionPane.showInputDialog("Enter your surname");
			for(int i=0;i<surname.length();i++){
				listaSurname.add(surname.charAt(i)); //lleno la lista surname con lo ingresado
				enter = true; //entró al bucle
			}
		}while(enter==false);
		System.out.println("Your surname: "+listaSurname);
		cantChars = listaName.size()+listaSurname.size()+1; //le agrego 1 para meter un espacio
//		System.out.println("Suma de caracteres de apellido mas nombre (y espacio): "+cantChars);
		for(int j=0;j<listaName.size();j++) {
			listaNameSurname.add(listaName.get(j));
		}
		listaNameSurname.add(' ');
		for(int k=0;k<listaSurname.size();k++) {
			listaNameSurname.add(listaSurname.get(k));
		}
		System.out.println(listaNameSurname);
		System.out.println("Nombre y Apellido: "+listaNameSurname);
	}
}
