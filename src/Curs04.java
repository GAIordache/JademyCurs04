
public class Curs04 {

	public static void main(String[] args) {
		/* functii (metode): 2 tipuri - pure (se folosesc doar parametrii ei)  
									  - impure (depinde de factori externi metodei)

		 	Metode de tip varargs trebuie sa aibe ca ultim parametru varArgs
		*/
		System.out.println("0:" + concatVarargs());
		System.out.println("1:" + concatVarargs("Ala"));
		System.out.println("2:" + concatVarargs("Ala","Bala"));
		System.out.println("3:" + concatVarargs("Ala","Bala","Portocala"));
		String s = "Pufi" + String.valueOf(33);
		String[] str = {"Ala","Bala","Portocala"};
		System.out.println(concatVarargs(str));
		
	}
		
	static String concatVarargs(String... strings) {
			String result = "";
			for(String s : strings) {
				result += s + " ";
			}
			return result;
		}
		
	
	

}
