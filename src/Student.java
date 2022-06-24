public class Student extends Person {
	
	protected int average;
	protected Maslol maslo;
	
	
	
	// constructor
	public Student() {}
	public Student(String name, int id, String gender, int average) {
		super(name, id, gender);
		this.average = average;

	}
	//getters and setters
	public int getAverage() {
		return average;
		
	} 
	public boolean setAverage(int average) { if (average < 0 ) return false;
	if(average>100) this.average=100;
	this.average = average; return true;
	}
	
	public Maslol getMaslo() {
		return maslo;
	}
	
	//יחיד לרבים מסלול- סטודנטים
	public void setMaslo(Maslol m) {
		if(this.maslo!=m) {
			this.maslo=m;
			if(this.maslo.findStudent(this)!=-1) this.maslo.removeStudent(this);
			if(this.maslo!=null) this.maslo.addStudent(this);

		}

	}
	@Override
	public String toString() {
		String maslolSt=null;
		if(maslo!=null) maslolSt=maslo.getName();
		return super.toString() +"Student [average=" + average + ", maslo=" + maslolSt + "]";
	}
	

	
}