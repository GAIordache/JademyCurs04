package ExercitiiObj;

public class Maria {
	private int age;
	private String culoarePar;
	
	void mancarePreferata () {
		System.out.println("Mancarea preferata a lui Maria sunt cartofii prajiti.");
	}
	
	void afisareStare () {
		System.out.println("Maria are " + age + " ani" + " si are parul de culoarea " + 
							culoarePar + ".");
	}
	
	public Maria(int pAge, String pCuloarePar) {		
		this.age = pAge;
		this.culoarePar = pCuloarePar;
	}

	public void setAge(int pAge) {
		this.age = pAge;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setCuloarePar (String pCuloarePar) {
		this.culoarePar = pCuloarePar;
	}
	
	public String getCuloarePar () {
		return this.culoarePar;
	}
}
