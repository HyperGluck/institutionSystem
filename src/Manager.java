
public class Manager extends Person{
	
	protected int expyears;
	protected MosadHinoh mosad;
	
	public Manager() {}
	public Manager(String name, int id, String gender,int expyears) {
		super(name, id, gender);
	    this.expyears=expyears;
}
	public int getExpyears() {
		return expyears;
	}
	public void setExpyears(int expyears) {
		if(expyears>0&&expyears<35)this.expyears = expyears;
	else System.out.print("Not Vaild nuber");
		
	}
	public MosadHinoh getMosad() {
		return mosad;
	}
	
	//יחיד ליחיד  מוסד - מנהל
	public void setMosad(MosadHinoh m) {
		if(this.mosad!=m) {
			this.mosad=m;
			if(this.mosad!=null) this.mosad.setManag(this);		
		}
	
	}
	@Override
	public String toString() {
		String mosadSt=null;
		if(mosad!=null) mosadSt=mosad.getName();
		 return super.toString() + "Manager [expyears=" + expyears + ", mosad=" + mosadSt+ "]";
	}
	
	
	
	

}
