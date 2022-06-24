
public class SoftwareM extends Maslol{
	
	protected int numberOfCourses;
	
	public SoftwareM() {}
	public SoftwareM(int code,String name,int numberOfCourses) {
		this.code=code;
		this.name=name;
		this.numberOfCourses=numberOfCourses;
		this.mosad= new MosadHinoh[1];
		this.stud= new Student[1];
	}
	public int getNumberOfCourses() {
		return numberOfCourses;
	}
	public void setNumberOfCourses(int numberOfCourses) {
		if(numberOfCourses>0&&numberOfCourses<15) this.numberOfCourses = numberOfCourses;
		else System.out.print("Not Valid");
	}
	@Override
	public String toString() {
		return super.toString()+"SoftwareM [numberOfCourses=" + numberOfCourses + "]";
	}
	
	
	
	

}
