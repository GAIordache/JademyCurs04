package ExercitiiObj;

public class Caine {
	
	private String mRasa;
	private String mNume;
	private int mVarsta;
	private String mCuloare;
	private String mTalie;
	
	public Caine (String pRasa, String pNume, int pVarsta, String pCuloare, String pTalie) {
		mRasa = pRasa;
		mNume = pNume;
		mVarsta = pVarsta;
		mCuloare = pCuloare;
		mTalie = pTalie;
	}
	
	public void afisareInfoCaine() {
		System.out.println(mRasa + " " + mNume + " " + mVarsta + " " + mCuloare + " " + mTalie);
	}

	public void setmRasa (String pRasa) {
		mRasa = pRasa;
	}
	
	public String getmRasa () {
		return mRasa;
	}

	public String getmNume() {
		return mNume;
	}

	public void setmNume(String mNume) {
		this.mNume = mNume;
	}

	public int getmVarsta() {
		return mVarsta;
	}

	public void setmVarsta(int mVarsta) {
		this.mVarsta = mVarsta;
	}

	public String getmCuloare() {
		return mCuloare;
	}

	public void setmCuloare(String mCuloare) {
		this.mCuloare = mCuloare;
	}

	public String getmTalie() {
		return mTalie;
	}

	public void setmTalie(String mTalie) {
		this.mTalie = mTalie;
	}
	

}
