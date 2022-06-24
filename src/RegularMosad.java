
public class RegularMosad extends MosadHinoh{
	
	protected int totalclass;
	
	public RegularMosad() {}
	public RegularMosad(int num,String name,int totalclass) {
		this.num=num;
		this.name=name;
		this.totalclass=totalclass;
		
		this.maslo=new Maslol[1];
		this.worke=new Worker[1];
		
		
	}
	public int getTotalclass() {
		return totalclass;
	}
	public void setTotalclass(int totalclass) {
		if(totalclass>0&&totalclass<100) this.totalclass = totalclass;
		else System.out.print("Not Valid Num");
	}
	@Override
	public String toString() {
		return super.toString()+"RegularMosad [totalclass=" + totalclass + "]";
	}
	
	
	
	

}
