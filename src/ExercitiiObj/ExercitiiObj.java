package ExercitiiObj;
import java.util.Scanner;

public class ExercitiiObj {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Cati ani are Maria?");
		int varsta = keyboard.nextInt();
		System.out.println("Ce culoare are parul Mariei?");
		String culPar = keyboard.next();
		
		Maria maria1 = new Maria(varsta,culPar);
		maria1.mancarePreferata();
		maria1.afisareStare();
		
		subMaria maria2 = new subMaria(22,"Galben");
		maria2.mancarePreferata();
		maria2.afisareStare();
		

	}

}
