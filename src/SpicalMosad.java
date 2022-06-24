
public class SpicalMosad extends MosadHinoh {
	
protected String activity;
	
	public SpicalMosad() {}
	public SpicalMosad(int num,String name,String activity) {
		this.num=num;
		this.name=name;
		this.activity=activity;
		
		this.maslo=new Maslol[1];
		this.worke=new Worker[1];
		
		
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	@Override
	public String toString() {
		return super.toString()+"SpicalMosad [activity=" + activity + "]";
	}
	
	
	
	
	

}
