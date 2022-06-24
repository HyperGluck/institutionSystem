
public class NotFormalMosad extends MosadHinoh{
	
	protected String teenOrganization;
	
	public NotFormalMosad() {}
	public NotFormalMosad(int num,String name,String teenOrganization) {
		this.num=num;
		this.name=name;
		this.teenOrganization=teenOrganization;
		
		this.maslo=new Maslol[1];
		this.worke=new Worker[1];
		
		
	}
	public String getTeenOrganization() {
		return teenOrganization;
	}
	public void setTeenOrganization(String teenOrganization) {
		this.teenOrganization = teenOrganization;
	}
	@Override
	public String toString() {
		return super.toString()+"NotFormalMosad [teenOrganization=" + teenOrganization + "]";
	}
	
	
	
	

}
