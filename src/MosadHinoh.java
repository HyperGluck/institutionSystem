import java.util.Arrays;
public class MosadHinoh {
	
	protected int num;
	protected String name;
	protected Manager manag;
	protected Worker worke[];
	protected Maslol maslo[];
	
	public MosadHinoh() {}
	public MosadHinoh(int num,String name) {
		this.num=num;
		this.name=name;
		this.maslo=new Maslol[1];
		this.worke=new Worker[1];
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num>0)this.num = num;
		else System.out.print("Not Valid Num");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manager getManag() {
		return manag;
	}
	
	public Worker[] getWorke() {
		return worke;
	}
	
	public void setWorke(Worker[] worke) {

		this.worke = worke;
	}
	public Maslol[] getMaslo() {
		return maslo;
	}
	public void setMaslo(Maslol[] maslo) {
		this.maslo = maslo;
	}
	
	
	//יחיד ליחיד  מוסד - מנהל
	public void setManag(Manager m) {
		if(manag!=m) {
		   manag = m;
		   if(manag!=null) manag.setMosad(this);
		}

	}
	
	//יחיד לרבים  מוסד - עובדים
	public void addWorker (Worker w) {
		int index= findWorker(w);
		if(index==-1) {
			w.setMosad(this);
			if(worke[0]!=null&&worke[worke.length-1]!=w) {
				worke=Arrays.copyOf(worke, worke.length+1);
			}
			worke[worke.length-1]=w;	
		}

	}
	public void removeWorker (Worker w) {
		int index= findWorker(w);
		if(index==-1) {
			w.setMosad(null);
			
		if(index!=worke.length)
			worke[index]=worke[worke.length-1];
			
		worke=Arrays.copyOf(worke, worke.length-1);
		}

	}
	public int findWorker (Worker w) {
		for(int i=0;i<worke.length;i++) {
			if(worke[i]==w) return i;
		}
			return -1;	
			
	}
	
	
	
	//רבים לרבים מסלול-מוסד
	public void addMaslol (Maslol m) {
		int index= findMaslol(m);
		if(index==-1) {
			m.addMosad(this);
			if(maslo[0]!=null&&maslo[maslo.length-1]!=m) {
				maslo=Arrays.copyOf(maslo, maslo.length+1);
			}
			maslo[maslo.length-1]=m;	
		}

	}
	public void removeMaslol (Maslol m) {
		int index= findMaslol(m);
		if(index==-1) {
			m.removeMosad(null);
			
		if(index!=maslo.length)
			maslo[index]=maslo[maslo.length-1];
			
		maslo=Arrays.copyOf(maslo, maslo.length-1);
		}

	}
	public int findMaslol (Maslol m) {
		for(int i=0;i<maslo.length;i++) {
			if(maslo[i]==m) return i;
		}
			return -1;	
			
	}
	@Override
	public String toString() {
		return "MosadHinoh [num=" + num + ", name=" + name + ", worke=" + Arrays.toString(worke)
				+ ", maslo=" + Arrays.toString(maslo) + "]";
	}
	
	
	
	
	
	
	

	
	
	

}
