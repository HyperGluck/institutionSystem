public class Person {
	protected String name;
	protected int id;
	protected String gender;
	public Person() {}
	public Person(String name, int id, String gender) {
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>0) this.id = id;
		else System.out.print("ID not vaild");
	}
	public String getGender() {
		return gender;
	}
	public boolean setGender(String gender) {
		if(gender != "M" && gender !="F")
			return false;
		this.gender = gender;
		return true;
	}
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", gender=" + gender+ "]";
	}
}