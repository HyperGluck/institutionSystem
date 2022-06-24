import java.util.Arrays;

public class Maslol {
	protected int code;
	protected String name;
	protected MosadHinoh[] mosad;
	protected Student[] stud;
	
	public Maslol() {}
	public Maslol(int code,String name) {
		this.code=code;
		this.name=name;
		this.mosad= new MosadHinoh[1];
		this.stud= new Student[1];
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		if(code>0)this.code = code;
		else System.out.print("Not Valid Num");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MosadHinoh[] getMosad() {
		return mosad;
	}
	public void setMosad(MosadHinoh[] mosad) {
		this.mosad = mosad;
	}
	public Student[] getStud() {
		return stud;
	}
	public void setStud(Student[] stud) {
		this.stud = stud;
	}
	
	
	
	
	//יחיד לרבים מסלול - סטודנטים
	public void addStudent(Student s) {
      
		int index= findStudent(s);
		if(index==-1) {
			s.setMaslo(this);
			if(stud[0]!=null&&stud[stud.length-1]!=s) {
				stud=Arrays.copyOf(stud, stud.length+1);
			}
			stud[stud.length-1]=s;	
		}
	}
	public void removeStudent(Student s) {
		int index= findStudent(s);
		if(index==-1) {
			s.setMaslo(null);
			
		if(index!=stud.length)
			stud[index]=stud[stud.length-1];
			
		stud=Arrays.copyOf(stud, stud.length-1);
		}
	}
		
	public int findStudent(Student s) {
		for(int i=0;i<stud.length;i++) {
			if(stud[i]==s) return i;
		}
			return -1;
	}
	
	
	//רבים לרבים מסלול-מוסד
	public void addMosad (MosadHinoh m) {
		int index= findMosad(m);
		if(index==-1) {
			m.addMaslol(this);
			if(mosad[0]!=null&&mosad[mosad.length-1]!=m) {
				mosad=Arrays.copyOf(mosad, mosad.length+1);
			}
			mosad[mosad.length-1]=m;	
		}

	}
	public void removeMosad (MosadHinoh m) {
		int index= findMosad(m);
		if(index==-1) {
			m.removeMaslol(null);
			
		if(index!=mosad.length)
			mosad[index]=mosad[mosad.length-1];
			
		mosad=Arrays.copyOf(mosad, mosad.length-1);
		}

	}
	public int findMosad (MosadHinoh m) {
		for(int i=0;i<mosad.length;i++) {
			if(mosad[i]==m) return i;
		}
			return -1;	
			
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Maslol [code=" + code + ", name=" + name + ", mosad=" + Arrays.toString(mosad) + ", stud="
				+ Arrays.toString(stud) + "]";
	}
	
	
	

}
