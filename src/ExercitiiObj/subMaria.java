package ExercitiiObj;

public class subMaria extends Maria {
	
	private String newVar;
	
	public subMaria(int pAge, String pCuloarePar) {
		super(pAge, pCuloarePar);
		
	}
	
	@Override
	void afisareStare() {
		System.out.println("Maria are " + getAge() + " ani" + " si are parul de culoarea " + 
				getCuloarePar() + ". " + newVar);
	}
	
	public void setNewVar  (String pNewVar) {
		this.newVar = pNewVar;
	}	
	
	public String getNewVar () {
		return this.newVar;
	}
}
