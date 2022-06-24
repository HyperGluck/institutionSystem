
public class Worker extends Person {
	
	protected int salary;
	protected MosadHinoh mosad;
	public Worker() {}
	public Worker(String name, int id, String gender,int salary) {
		super(name, id, gender);
	    this.salary=salary;
}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary>0) this.salary = salary;
		else System.out.print("Not Valid Num");
	}
	public MosadHinoh getMosad() {
		return mosad;
	}
	
	//יחיד לרבים מוסד- עובדים

	public void setMosad(MosadHinoh m) {
		if(this.mosad!=m) {
			this.mosad=m;
			if(this.mosad.findWorker(this)!=-1) 
				this.mosad.removeWorker(this);
			if(this.mosad!=null) this.mosad.addWorker(this);

		}
	
	}
	@Override
	public String toString() {
		String mosadSt=null;
		if(mosad!=null) mosadSt=mosad.getName();
		return super.toString() + "Worker [salary=" + salary + ", mosad=" + mosadSt + "]";
	}

	
	
	
	
	
	
	
	

}