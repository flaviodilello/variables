import java.util.ArrayList;
import java.util.Scanner;

//FASE 2 (3 puntos)
//Con un bucle for deberemos rellenar los dos arrays anteriormente creados. Añadiremos el nombre del plato y luego el precio. (1 punto)
//Una vez llenos los dos arrays tendremos que mostrarles y preguntar que se quiere para comer, guardaremos la información en una List usando un bucle while. (1 punto)
//Tendremos que preguntar si se quiere seguir pidiendo comida. Puede utilizar el sistema (1: Si / 0: No), por lo tanto deberá crear otro variable int para guardar la información. (1 punto)
//FASE 3 (5 puntos)
//Una vez hemos acabado de pedir la comida, tendremos que comparar la lista con el array que hemos hecho al principio. En caso de que la información que hemos introducido en la List coincida con la del array, tendremos que sumar el precio del producto solicitado; en el caso contrario tendremos que mostrar un mensaje que diga que el producto que hemos pedido no existe.
public class Fase2 {
	public static void main(String[]args) {
		
		int cinco, diez, veinte, cincuenta, cien, doscientos, quinientos;
		String menu[]=new String[5];
		Float precioPorPlato[]=new Float[5];
		Scanner sc = new Scanner(System.in);
		int answer=1;
		ArrayList <String> order = new ArrayList <String>(); //para guardar la orden
		int j=0; //para guardar las vueltas del while que toma la orden
		String item = new String(); //para tomar el valor del array de menu en base al numero que elija
		int itemInt;
		float bill=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the menu item number "+(i+1));
			menu[i]=sc.next();
			System.out.println("Enter the price number "+(i+1));
			precioPorPlato[i]=sc.nextFloat();
			System.out.println("Menu item: "+(i+1)+": "+menu[i]+": $"+ precioPorPlato[i]);
		}
		while (answer==1) {
			do {
				System.out.println("What do you want to order? ");
				for(int i=0;i<menu.length;i++) {
					System.out.println((i+1)+": "+menu[i]);
				}
				item=sc.next();
				itemInt=(Integer.parseInt(item)-1);
				if(itemInt>=5) {
					System.out.println("It doesn't exists");
					System.out.println("Please enter a number between 1 and 5");
				}
			}while(itemInt>=5);
			
			order.add(j, menu[itemInt]);
			bill=bill+precioPorPlato[itemInt];
			System.out.println("Do you want order something more? (1=yes, 0=no)");
			answer=sc.nextInt();
			j++;
		}
		System.out.println("Your order was: "+order+" and the total's bill is: $"+bill);
	}
}
