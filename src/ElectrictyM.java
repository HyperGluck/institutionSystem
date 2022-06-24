
public class ElectrictyM extends Maslol {
	
	protected String specialization;
	
	public ElectrictyM() {}
	public ElectrictyM(int code,String name,String specialization) {
		this.code=code;
		this.name=name;
		this.specialization=specialization;
		this.mosad= new MosadHinoh[1];
		this.stud= new Student[1];
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return super.toString()+"ElectrictyM [specialization=" + specialization + "]";
	}
	
	


}
